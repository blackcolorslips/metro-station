package com.hengdong.metrostation.dao;

import com.hengdong.metrostation.model.JKLXModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by QZH on 2018/1/4.
 */
@Mapper
public interface CtrlTypeDao {
    /**
     * 统获取所有缉控类型
     * @param
     * @return
     */
    public List<JKLXModel> getJKLXModels();

}
