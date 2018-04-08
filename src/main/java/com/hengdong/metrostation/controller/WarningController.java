package com.hengdong.metrostation.controller;

import com.hengdong.metrostation.dto.warning.WarningDetail;
import com.hengdong.metrostation.dto.warning.WarningInfo;
import com.hengdong.metrostation.service.WarningService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author wyy
 * @date 18-1-2
 */
@RestController
@EnableScheduling
@RequestMapping("/warning")
@Slf4j
public class WarningController {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;
    @Autowired
    private WarningService warningService;

    @Scheduled(fixedRate = 10 * 1000L)
    public void warningInfo() {
        List<WarningInfo> warningInfoList = warningService.findWarningInfo();
        List<WarningInfo> nowWarningInfoList = warningService.findNowWarningInfo();
        if (nowWarningInfoList.size() > 0) {
            simpMessagingTemplate.convertAndSend("/topic/warning.today", nowWarningInfoList);
        }
        if (warningInfoList.size() > 0) {
            List<Long> ids = warningInfoList.stream().map(WarningInfo::getId).collect(Collectors.toList());
            simpMessagingTemplate.convertAndSend("/topic/warning", warningInfoList);
            warningService.updateReadFlag(ids);
        }
    }

    @MessageMapping("/today")
    @SendTo("/topic/warning.today")
    public List<WarningInfo> today() {
        return warningService.findNowWarningInfo();
    }

    @GetMapping("/detail")
    public WarningDetail detail(Long id, String bjly) {
        return warningService.findWarningDetail(id, bjly);
    }

    @PostMapping("/update-today")
    public void updateNow(@RequestBody Map<String, Long> map) {
        warningService.updateNowReadFlag(map.get("id"));
    }
}
