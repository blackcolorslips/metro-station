package com.hengdong.metrostation.service;

import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.model.WifiModel;

import java.util.List;

/**
 * Created by QZH on 2018/1/30.
 */
public interface WifiService {
    /**
     * 获取wifi信息（分页）
     * @param dataGrid
     * @return
     */
    public List<WifiModel> getWifis(DataGrid dataGrid);

    /**
     * 获取wifi数据总数
     * @param dataGrid
     * @return
     */
    public int getWifisCount(DataGrid dataGrid);
}
