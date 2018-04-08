package com.hengdong.metrostation.service.Impl;

import com.hengdong.metrostation.dao.FaceCompareDao;
import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.model.FaceCompareModel;
import com.hengdong.metrostation.service.FaceCompareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QZH on 2018/1/30.
 */
@Service
public class FaceCompareServiceImpl implements FaceCompareService{

    @Autowired
    private FaceCompareDao faceCompareDao;

    @Override
    public List<FaceCompareModel> getFaceCompares(DataGrid dataGrid) {
        return faceCompareDao.getFaceCompares(dataGrid);
    }
}
