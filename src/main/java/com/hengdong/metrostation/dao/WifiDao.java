package com.hengdong.metrostation.dao;

import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.model.WifiModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by QZH on 2018/1/30.
 */
@Mapper
public interface WifiDao {
    public List<WifiModel> getWifis(DataGrid dataGrid);
    public int getWifisCount(DataGrid dataGrid);
}
