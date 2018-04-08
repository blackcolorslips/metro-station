package com.hengdong.metrostation.service.Impl;

import com.hengdong.metrostation.dao.SearchDao;
import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QZH on 2018/1/5.
 */
@Service
public class SearchServiceImpl implements SearchService{
    @Autowired
    private SearchDao searchDao;

    @Override
    public int getZZHYJLsCount(DataGrid dataGrid) {
        return searchDao.getZZHYJLsCount(dataGrid);
    }


    @Override
    public int getGPJLsCount(DataGrid dataGrid) {
        return searchDao.getGPJLsCount(dataGrid);
    }


    @Override
    public int getJPJLsCount(DataGrid dataGrid) {
        return searchDao.getJPJLsCount(dataGrid);
    }
}
