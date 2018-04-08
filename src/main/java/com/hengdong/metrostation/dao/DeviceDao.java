package com.hengdong.metrostation.dao;

import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.model.DeviceModel;
import com.hengdong.metrostation.model.DevicePositionModel;
import com.hengdong.metrostation.model.DeviceTypeModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by QZH on 2018/1/4.
 */
@Mapper
public interface DeviceDao {
    /**
     * 获取设备信息（分页）
     * @param dataGrid
     * @return
     */
    public List<DeviceModel> getDevices(DataGrid dataGrid);
    /**
     * 获取设备总数
     * @param dataGrid
     * @return
     */
    public int getDevicesCount(DataGrid dataGrid);

    /**
     * 修改设备
     * @param deviceModel
     */
    public void updateDevices(DeviceModel deviceModel);

    /**
     * 新增设备
     * @param deviceModel
     */
    public void insertDevices(DeviceModel deviceModel);

    /**
     * 获取设备类型
     * @return
     */
    public List<DeviceTypeModel> getDeviceTypes();

    /**
     * 获取设备部署位置
     * @return
     */
    public List<DevicePositionModel> getDevicePositions();
    /**
     * 获取设备类型编号信息
     * @return
     */
    public List<String> getDevNum(@Param("deviceType") String devType);
    /**
     * 获取人像比对设备
     * @return
     */
    public List<DeviceModel> getFaceCompareDevices();
}
