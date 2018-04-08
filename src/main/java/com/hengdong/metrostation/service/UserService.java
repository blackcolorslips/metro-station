package com.hengdong.metrostation.service;

import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.model.UserModel;

import java.util.List;

/**
 * Created by QZH on 2017/12/25.
 */
public interface UserService {

    /**
     * 用户名查询用户
     * @param username
     * @return
     */
    public UserModel getUserByUserName(String username);

    /**
     * 获取用户信息（分页）
     * @param dataGrid
     * @return
     */
    public List<UserModel> getUsers(DataGrid dataGrid);

    /**
     * 获取用户总数
     * @param dataGrid
     * @return
     */
    public int getUsersCount(DataGrid dataGrid);

    /**
     * 修改用戶
     * @param userModel
     */
    public void updateUsers(UserModel userModel);

    /**
     * 新增用戶
     * @param userModel
     */
    public void insertUsers(UserModel userModel);
}
