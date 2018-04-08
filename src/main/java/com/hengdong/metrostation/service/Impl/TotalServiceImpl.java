package com.hengdong.metrostation.service.Impl;

import com.hengdong.metrostation.dao.CtrlTypeDao;
import com.hengdong.metrostation.dao.DeviceDao;
import com.hengdong.metrostation.dao.TotalDao;
import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.model.DeviceModel;
import com.hengdong.metrostation.model.DeviceTypeModel;
import com.hengdong.metrostation.model.JKLXModel;
import com.hengdong.metrostation.model.TotalInfoModel;
import com.hengdong.metrostation.service.DeviceService;
import com.hengdong.metrostation.service.TotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QZH on 2018/1/4.
 */
@Service
public class TotalServiceImpl implements TotalService {
    @Autowired
    private TotalDao totalDao;
    @Autowired
    private CtrlTypeDao ctrlTypeDao;

    @Override
    public int getTotalInfosZZHY(String startTime, String endTime) {
        return totalDao.getTotalInfosZZHY(startTime,endTime);
    }

    @Override
    public int getTotalInfosJPJL(String startTime, String endTime) {
        return totalDao.getTotalInfosJPJL(startTime,endTime);
    }

    @Override
    public int getTotalInfosGPJL(String startTime, String endTime) {
        return totalDao.getTotalInfosGPJL(startTime,endTime);
    }

    @Override
    public int getAlltypeCtrl(String id,String devType, String startTime, String endTime) {
        return totalDao.getAlltypeCtrl(id,devType,startTime,endTime);
    }

    @Override
    public List<JKLXModel> getJKLXModel() {
        return ctrlTypeDao.getJKLXModels();
    }
}
