package com.hengdong.metrostation.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * 设备信息
 * Created by QZH on 2018/1/4.
 */
@Data
public class DeviceModel {
    private Integer ID;//主键
    private String SBIP;//设备ip
    private Integer SBLXID;//设备类型id(t_dtz_Sblx_ID)
    private String SBBH;//设备编号
    private Integer BSDZ;//部署地址
    private Integer QYZT;//启用状态(1：启用，2：停用)
    private Integer CJR;//创建人（T_DTZ_YHXX_ID）
    private Timestamp CJSJ;//创建时间
    private Integer XGR;//修改人（T_DTZ_YHXX_ID）
    private Timestamp XGSJ;//修改时间
    private Integer ZXZT;//在线状态（1：在线 2：下线）

    private String WZ;//位置
}
