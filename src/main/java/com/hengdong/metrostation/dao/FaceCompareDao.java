package com.hengdong.metrostation.dao;

import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.model.FaceCompareModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by QZH on 2018/1/30.
 */
@Mapper
public interface FaceCompareDao {
    /**
     * 获取人像比对结果信息
     * @param dataGrid
     * @return
     */
    public List<FaceCompareModel> getFaceCompares(DataGrid dataGrid);
}
