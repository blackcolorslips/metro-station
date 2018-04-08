package com.hengdong.metrostation.dao;

import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.model.DeviceModel;
import com.hengdong.metrostation.model.DeviceTypeModel;
import com.hengdong.metrostation.model.TotalInfoModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by QZH on 2018/1/4.
 */
@Mapper
public interface TotalDao {
    /**
     * 统计自助核验机的采集总人数
     * @param
     * @return
     */
    public int getTotalInfosZZHY(@Param("startTime") String startTime, @Param("endTime") String endTime);
    /**
     * 统计人证票闸机检票的采集总人数
     * @param
     * @return
     */
    public int getTotalInfosJPJL(@Param("startTime") String startTime, @Param("endTime") String endTime);

    /**
     * 统计购票的采集总人数
     * @param
     */
    public int getTotalInfosGPJL(@Param("startTime") String startTime, @Param("endTime") String endTime);

    /**
     * 统计各设备违法人员数的采集总人数
     * @param
     */
    public int getAlltypeCtrl(@Param("id") String id, @Param("devType") String devType, @Param("startTime") String startTime, @Param("endTime") String endTime);
}
