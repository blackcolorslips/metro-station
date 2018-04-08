package com.hengdong.metrostation.controller;

import com.hengdong.metrostation.dao.UserDao;
import com.hengdong.metrostation.dto.CustomResponseBody;
import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.dto.PageResult;
import com.hengdong.metrostation.model.UserModel;
import com.hengdong.metrostation.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 用户管理
 * Created by QZH on 2017/12/22.
 */
@Slf4j
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * 获取用户信息（分页）
     * @param dataGrid
     * @return
     */
    @PostMapping("/users")
    @ResponseBody
    public PageResult getUsers(@RequestBody DataGrid dataGrid){
        List<UserModel> list=userService.getUsers(dataGrid);
        int count=userService.getUsersCount(dataGrid);
        return new PageResult(count,0,0,list);
    }

    /**
     * 修改用戶
     * @param userModel
     * @return
     */
    @PostMapping("/users/update")
    @ResponseBody
    public String updateUsers(@RequestBody UserModel userModel){
        String result="0";
        try {
            userService.updateUsers(userModel);
        }catch (Exception e){
            result="1";
        }
        return result;
    }

    /**
     * 新增用戶
     * @param userModel
     * @return
     */
    @PostMapping("/users/insert")
    @ResponseBody
    public String insertUsers(@RequestBody UserModel userModel){
        String result="0";
        try {
            userService.insertUsers(userModel);
        }catch (Exception e){
            log.info(e.getMessage());
            result="1";
        }
        return result;
    }


}
