package com.hengdong.metrostation.controller;

import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.dto.PageResult;
import com.hengdong.metrostation.model.DeviceModel;
import com.hengdong.metrostation.model.DevicePositionModel;
import com.hengdong.metrostation.model.DeviceTypeModel;
import com.hengdong.metrostation.service.DeviceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 设备管理
 * Created by QZH on 2018/1/4.
 */
@Slf4j
@RestController
public class DeviceController{
    @Autowired
    private DeviceService deviceService;

    /**
     * 获取设备信息（分页）
     * @param dataGrid
     * @return
     */
    @PostMapping("devices")
    @ResponseBody
    public PageResult getDevices(@RequestBody DataGrid dataGrid){
        List<DeviceModel> list=deviceService.getDevices(dataGrid);
        int count=deviceService.getDevicesCount(dataGrid);
        return  new PageResult(count,0,0,list);
    }
    /**
     * 修改设备
     * @param deviceModel
     * @return
     */
    @PostMapping("/devices/update")
    @ResponseBody
    public String updateDevices(@RequestBody DeviceModel deviceModel){
        String result="0";
        try {
            deviceService.updateDevices(deviceModel);
        }catch (Exception e){
            log.info("修改设备:"+e.getMessage());
            result="1";
        }
        return result;
    }
    /**
     * 新增设备
     * @param deviceModel
     * @return
     */
    @PostMapping("/devices/insert")
    @ResponseBody
    public String insertDevices(@RequestBody DeviceModel deviceModel){
        String result="0";
        try {
            deviceService.insertDevices(deviceModel);
        }catch (Exception e){
            log.info("新增设备:"+e.getMessage());
            result="1";
        }
        return result;
    }

    /**
     * 获取设备类型
     * @return
     */
    @PostMapping("/devices/types")
    @ResponseBody
    public List<DeviceTypeModel> getDeviceTypes(){
        return deviceService.getDeviceTypes();
    }

    /**
     * 获取设备部署位置
     * @return
     */
    @PostMapping("/devices/positions")
    @ResponseBody
    public List<DevicePositionModel> getDevicePositions(){
        return deviceService.getDevicePositions();
    }

    /**
     * 获通过设备类型获取设备编号
     * @return
     */
    @GetMapping("/devices/getDevNum")
    @ResponseBody
    public List<String> getDevNum(HttpServletRequest request, String devType){
        return deviceService.getDevNum(devType);
    }
}
