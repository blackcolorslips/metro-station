package com.hengdong.metrostation.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 分页数据参数
 * Created by QZH on 2018/1/3.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DataGrid implements Serializable{

    private int page = 1; //当前页,名字必须为page
    private int start = 0;//起始行
    private int rows = 10; //每页大小,名字必须为rows
    private String sort = "id"; //排序字段
    private String order = "asc"; //排序规则
    private Map<String,Object> params = new HashMap<String,Object>(0);

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "DataGrid{" +
                "page=" + page +
                ", start=" + start +
                ", rows=" + rows +
                ", sort='" + sort + '\'' +
                ", order='" + order + '\'' +
                ", params=" + params +
                '}';
    }
}
