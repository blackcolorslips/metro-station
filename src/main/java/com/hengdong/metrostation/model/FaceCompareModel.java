package com.hengdong.metrostation.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * 人像比对实体类
 * Created by QZH on 2018 /1/30.
 */
@Data
public class FaceCompareModel {
    private Integer ID;//主键
    private String ZPRXZP;//抓拍人像照片
    private String BZRXZP;//比中人像照片
    private String XSD;//相似度
    private String XM;//姓名
    private String XB;//性别
    private String SFZH;//身份证号
    private String JKBDJG;//缉控比对结果
    private Timestamp CJSJ;//采集时间
    private Integer SBXXID;//采集设备

    private String SBBH;//设备名称
}
