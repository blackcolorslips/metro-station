package com.hengdong.metrostation.service;

import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.model.FaceCompareModel;

import java.util.List;

/**
 * Created by QZH on 2018/1/30.
 */
public interface FaceCompareService {

    /**
     * 获取人像比对结果信息
     * @param dataGrid
     * @return
     */
    public List<FaceCompareModel> getFaceCompares(DataGrid dataGrid);
}
