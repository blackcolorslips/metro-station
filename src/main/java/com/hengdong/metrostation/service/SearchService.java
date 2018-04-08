package com.hengdong.metrostation.service;

import com.hengdong.metrostation.dto.DataGrid;

import java.util.List;

/**
 * 数据查询
 * Created by QZH on 2018/1/5.
 */
public interface SearchService {


    /**
     * 获取自助核验采集记录总数
     * @param dataGrid
     * @return
     */
    public int getZZHYJLsCount(DataGrid dataGrid);


    /**
     * 获取购票记录记录总数
     * @param dataGrid
     * @return
     */
    public int getGPJLsCount(DataGrid dataGrid);


    /**
     * 获取检票记录记录总数
     * @param dataGrid
     * @return
     */
    public int getJPJLsCount(DataGrid dataGrid);
}
