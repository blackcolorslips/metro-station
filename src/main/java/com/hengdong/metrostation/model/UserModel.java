package com.hengdong.metrostation.model;

import org.springframework.security.core.GrantedAuthority;

import java.sql.Timestamp;
import java.util.Collection;

/**
 * 用户信息
 * Created by QZH on 2017/12/25.
 */
public class UserModel {
    private Integer ID;//主键
    private String YHM;//用户名
    private String JYXM;//警员姓名
    private Long JYBH;//警员编号
    private Integer YHXB;//用户性别
    private String MM;//密码
    private Integer QYZT;//启用状态
    private String SFZH;//身份证号
    private Integer CJR;//创建人
    private Timestamp CJSJ;//创建时间
    private Integer XGR;//修改人
    private Timestamp XGSJ;//修改时间
    private Integer YHJSID;//用户角色
    private String SJHM;//手机号码
    private Timestamp DLSJ;//登录时间
    private String YHJS;//用户角色
    private Collection<? extends GrantedAuthority> authorities;

    public String getYHJS() {
        return YHJS;
    }

    public void setYHJS(String YHJS) {
        this.YHJS = YHJS;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getYHM() {
        return YHM;
    }

    public void setYHM(String YHM) {
        this.YHM = YHM;
    }

    public String getJYXM() {
        return JYXM;
    }

    public void setJYXM(String JYXM) {
        this.JYXM = JYXM;
    }

    public Long getJYBH() {
        return JYBH;
    }

    public void setJYBH(Long JYBH) {
        this.JYBH = JYBH;
    }

    public Integer getYHXB() {
        return YHXB;
    }

    public void setYHXB(Integer YHXB) {
        this.YHXB = YHXB;
    }

    public String getMM() {
        return MM;
    }

    public void setMM(String MM) {
        this.MM = MM;
    }

    public Integer getQYZT() {
        return QYZT;
    }

    public void setQYZT(Integer QYZT) {
        this.QYZT = QYZT;
    }

    public String getSFZH() {
        return SFZH;
    }

    public void setSFZH(String SFZH) {
        this.SFZH = SFZH;
    }

    public Integer getCJR() {
        return CJR;
    }

    public void setCJR(Integer CJR) {
        this.CJR = CJR;
    }

    public Timestamp getCJSJ() {
        return CJSJ;
    }

    public void setCJSJ(Timestamp CJSJ) {
        this.CJSJ = CJSJ;
    }

    public Integer getXGR() {
        return XGR;
    }

    public void setXGR(Integer XGR) {
        this.XGR = XGR;
    }

    public Timestamp getXGSJ() {
        return XGSJ;
    }

    public void setXGSJ(Timestamp XGSJ) {
        this.XGSJ = XGSJ;
    }

    public Integer getYHJSID() {
        return YHJSID;
    }

    public void setYHJSID(Integer YHJSID) {
        this.YHJSID = YHJSID;
    }

    public String getSJHM() {
        return SJHM;
    }

    public void setSJHM(String SJHM) {
        this.SJHM = SJHM;
    }

    public Timestamp getDLSJ() {
        return DLSJ;
    }

    public void setDLSJ(Timestamp DLSJ) {
        this.DLSJ = DLSJ;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
}
