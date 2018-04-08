package com.hengdong.metrostation.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * WIFI实体类
 * Created by QZH on 2018/1/30.
 */
@Data
public class WifiModel {
    private Integer ID;//主键
    private String MAC;//mac地址
    private Timestamp CJSJ;//采集时间
    private String SBXH;//被采设备型号
    private Integer SBXXID;//采集设备
}
