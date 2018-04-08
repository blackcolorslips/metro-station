package com.hengdong.metrostation.controller;

import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.dto.PageResult;
import com.hengdong.metrostation.service.SearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * 数据查询
 * Created by QZH on 2018/1/5.
 */
@Slf4j
@RestController
public class SearchController {
    @Autowired
    private SearchService searchService;
    /**
     * 获取自助核验记录（分页）
     * @param dataGrid
     * @return
     */
    @PostMapping("/search/ZZHYJLs")
    @ResponseBody
    public PageResult getZZHYJLs(@RequestBody DataGrid dataGrid){
        log.info("自助核验查询参数："+dataGrid.toString());
        setParamsTimes(dataGrid);
        //List<ZZHYJLModel> list= searchService.getZZHYJLs(dataGrid);
        int count=searchService.getZZHYJLsCount(dataGrid);
        return new PageResult(count,0,0,null);
    }

    /**
     * 获取购票记录（分页）
     * @param dataGrid
     * @return
     */
    @PostMapping("/search/GPJLs")
    @ResponseBody
    public PageResult getGPJLs(@RequestBody DataGrid dataGrid){
        setParamsTimes(dataGrid);
       //List<GPJLModel> list=searchService.getGPJLs(dataGrid);
        int count=searchService.getGPJLsCount(dataGrid);
        return new PageResult(count,0,0,null);
    }
    /**
     * 获取检票记录（分页）
     * @param dataGrid
     * @return
     */
    @PostMapping("/search/JPJLs")
    @ResponseBody
    public PageResult getJPJLs(@RequestBody DataGrid dataGrid){
        setParamsTimes(dataGrid);
       // List<JPJLModel> list=searchService.getJPJLs(dataGrid);
        int count=searchService.getJPJLsCount(dataGrid);
        return new PageResult(count,0,0,null);
    }

    //处理times  "timeCollect:2018-1-1 13:23:34,2018-1-2 13:12:34"处理为"startTime:2018-1-1 13:23:34 endTime:2018-1-2 13:12:34"
    public void setParamsTimes(DataGrid dataGrid){
        if(null!=dataGrid.getParams().get("timeCollect") && !dataGrid.getParams().get("timeCollect").equals("")){
            log.info("采集时间："+dataGrid.getParams().get("timeCollect").toString());
            List list=(ArrayList)dataGrid.getParams().get("timeCollect");
            if(list.size()>0 && null!=list.get(0)&&!"null".equals(list.get(0))){
                Map map=new HashMap();
                map.put("startTime",list.get(0));
                map.put("endTime",list.get(1));
                log.info("timeCollect:"+map.toString());
                dataGrid.setParams(map);
            }
        }
        if(null!=dataGrid.getParams().get("timeRide") && !dataGrid.getParams().get("timeRide").equals("")){
            log.info("检票时间："+dataGrid.getParams().get("timeRide").toString());
            List list=(ArrayList)dataGrid.getParams().get("timeRide");
            if(list.size()>0 && null!=list.get(0)&&!"null".equals(list.get(0))){
                Map map=new HashMap();
                map.put("startRideTime",list.get(0));
                map.put("endRideTime",list.get(1));
                log.info("timeRide:"+map.toString());
                dataGrid.setParams(map);
            }
        }

    }
}
