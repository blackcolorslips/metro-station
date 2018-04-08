package com.hengdong.metrostation.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * 设备信息
 * Created by QZH on 2018/1/4.
 */
@Data
public class TotalInfoModel {
    private Integer cmpNum;//采集总人数
    private Integer ofenCtlNum;//常控总人数
    private Integer monCtrlNum;//临控总人数
    private Integer outCtlNum;//在逃总人数
    private String devName;//设备名称

}
