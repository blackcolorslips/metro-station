package com.hengdong.metrostation.controller;

import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.dto.PageResult;
import com.hengdong.metrostation.model.WifiModel;
import com.hengdong.metrostation.service.WifiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * wifi采集
 * Created by QZH on 2018/1/30.
 */
@Slf4j
@RestController
public class WifiController {
    @Autowired
    private WifiService wifiService;

    /**
     * 获取wifi采集信息（分页）
     * @param dataGrid
     * @return
     */
    @PostMapping("/wifis")
    @ResponseBody
    public PageResult getWifis(@RequestBody DataGrid dataGrid){
        List<WifiModel> list=wifiService.getWifis(dataGrid);
        int count=wifiService.getWifisCount(dataGrid);
        return new PageResult(count,0,0,list);
    }
}
