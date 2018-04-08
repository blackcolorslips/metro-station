package com.hengdong.metrostation.service.Impl;

import com.hengdong.metrostation.dao.DeviceDao;
import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.model.DeviceModel;
import com.hengdong.metrostation.model.DevicePositionModel;
import com.hengdong.metrostation.model.DeviceTypeModel;
import com.hengdong.metrostation.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QZH on 2018/1/4.
 */
@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    private DeviceDao deviceDao;
    @Override
    public List<DeviceModel> getDevices(DataGrid dataGrid) {
        return deviceDao.getDevices(dataGrid);
    }

    @Override
    public int getDevicesCount(DataGrid dataGrid) {
        return deviceDao.getDevicesCount(dataGrid);
    }

    @Override
    public void updateDevices(DeviceModel deviceModel) {
        deviceDao.updateDevices(deviceModel);
    }

    @Override
    public void insertDevices(DeviceModel deviceModel) {
        deviceDao.insertDevices(deviceModel);
    }

    @Override
    public List<DeviceTypeModel> getDeviceTypes() {
        return deviceDao.getDeviceTypes();
    }

    @Override
    public List<DevicePositionModel> getDevicePositions() {
        return deviceDao.getDevicePositions();
    }

    @Override
    public List<String> getDevNum(String typeName) {
        return deviceDao.getDevNum(typeName);
    }

    @Override
    public List<DeviceModel> getFaceCompareDevices() {
        return deviceDao.getFaceCompareDevices();
    }
}
