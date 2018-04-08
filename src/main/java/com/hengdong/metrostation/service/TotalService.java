package com.hengdong.metrostation.service;

import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.model.DeviceModel;
import com.hengdong.metrostation.model.DeviceTypeModel;
import com.hengdong.metrostation.model.JKLXModel;
import com.hengdong.metrostation.model.TotalInfoModel;

import java.util.List;

/**
 * Created by QZH on 2018/1/4.
 */
public interface TotalService {
    /**
     * 统计自助核验机的采集总人数
     * @param
     * @return
     */
    public int getTotalInfosZZHY(String startTime, String endTime);
    /**
     * 统计人证票闸机检票的采集总人数
     * @param
     * @return
     */
    public int getTotalInfosJPJL(String startTime, String endTime);

    /**
     * 统计购票的采集总人数
     * @param
     */
    public int getTotalInfosGPJL(String startTime, String endTime);

    /**
     * 统计各设备违法人员数的采集总人数
     * @param
     */
    public int getAlltypeCtrl(String id, String devType, String startTime, String endTime);

    /**
     * 获取缉控类型信息
     * @param
     */
    public List<JKLXModel> getJKLXModel();

}
