package com.hengdong.metrostation.controller;

import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.model.DeviceModel;
import com.hengdong.metrostation.model.FaceCompareModel;
import com.hengdong.metrostation.service.DeviceService;
import com.hengdong.metrostation.service.FaceCompareService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 人像比对
 * Created by QZH on 2018/1/30.
 */
@Slf4j
@RestController
public class FaceCompareController {
    @Autowired
    private DeviceService deviceService;
    @Autowired
    private FaceCompareService faceCompareService;
    /**
     * 获取人像比对设备
     * @return
     */
    @PostMapping("/faces/devices")
    @ResponseBody
    public List<DeviceModel> getFaceCompareDevices(){
        return deviceService.getFaceCompareDevices();
    }

    /**
     * 获取人像比对结果信息
     * @param dataGrid
     * @return
     */
    @PostMapping("/faces/facecompares")
    @ResponseBody
    public List<FaceCompareModel> getFaceCompares(@RequestBody DataGrid dataGrid){
        return faceCompareService.getFaceCompares(dataGrid);
    }
}
