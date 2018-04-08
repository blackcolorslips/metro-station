package com.hengdong.metrostation.service.Impl;

import com.hengdong.metrostation.dao.WifiDao;
import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.model.WifiModel;
import com.hengdong.metrostation.service.WifiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QZH on 2018/1/30.
 */
@Service
public class WifiServiceImpl implements WifiService{
    @Autowired
    private WifiDao wifiDao;
    @Override
    public List<WifiModel> getWifis(DataGrid dataGrid) {
        return wifiDao.getWifis(dataGrid);
    }

    @Override
    public int getWifisCount(DataGrid dataGrid) {
        return wifiDao.getWifisCount(dataGrid);
    }
}
