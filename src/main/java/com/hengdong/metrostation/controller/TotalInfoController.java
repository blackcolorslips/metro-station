package com.hengdong.metrostation.controller;

import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.dto.PageResult;
import com.hengdong.metrostation.model.DeviceModel;
import com.hengdong.metrostation.model.DeviceTypeModel;
import com.hengdong.metrostation.model.JKLXModel;
import com.hengdong.metrostation.model.TotalInfoModel;
import com.hengdong.metrostation.service.DeviceService;
import com.hengdong.metrostation.service.TotalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 设备管理
 * Created by QZH on 2018/1/4.
 */
@Slf4j
@RestController
public class TotalInfoController {
    @Autowired
    private TotalService totalService;

    /**
     * 获取统计结果
     * @param
     * @return
     */
    @GetMapping("/getTotalInfos")
    @ResponseBody
    public PageResult getTotalInfos(HttpServletRequest request){
        List<TotalInfoModel> data = new ArrayList<TotalInfoModel>();
        String startTime = request.getParameter("startTime");
        String endTime = request.getParameter("endTime");
        //购票人数统计
        int JPJL =  totalService.getTotalInfosJPJL(startTime,endTime);
        int GPJL =  totalService.getTotalInfosGPJL(startTime,endTime);
        int ZZHY =  totalService.getTotalInfosZZHY(startTime,endTime);
        TotalInfoModel date = new TotalInfoModel();
        date.setCmpNum(GPJL);
        date.setDevName("购票设备");
        date.setMonCtrlNum(totalService.getAlltypeCtrl("1","1",startTime,endTime));
        date.setOfenCtlNum(totalService.getAlltypeCtrl("2","1",startTime,endTime));
        date.setOutCtlNum(totalService.getAlltypeCtrl("3","1",startTime,endTime));
        data.add(date);
        //检票人数统计
        TotalInfoModel date1 = new TotalInfoModel();
        date1.setCmpNum(JPJL);
        date1.setDevName("人证票检票设备");
        date1.setMonCtrlNum(totalService.getAlltypeCtrl("1","2",startTime,endTime));
        date1.setOfenCtlNum(totalService.getAlltypeCtrl("2","2",startTime,endTime));
        date1.setOutCtlNum(totalService.getAlltypeCtrl("3","2",startTime,endTime));
        data.add(date1);
        //检票人数统计
        TotalInfoModel date2 = new TotalInfoModel();
        date2.setCmpNum(ZZHY);
        date2.setDevName("自助核验设备");
        date2.setMonCtrlNum(totalService.getAlltypeCtrl("1","3",startTime,endTime));
        date2.setOfenCtlNum(totalService.getAlltypeCtrl("2","3",startTime,endTime));
        date2.setOutCtlNum(totalService.getAlltypeCtrl("3","3",startTime,endTime));
        data.add(date2);
        return  new PageResult(0,0,0,data);
    }

    /**
     * 获取缉控类型
     * @param
     * @return
     */
    @GetMapping("/getCtrlTypeInfos")
    @ResponseBody
    public List<JKLXModel> getCtrlTypeInfos(HttpServletRequest request){
        return totalService.getJKLXModel();
    }

}
