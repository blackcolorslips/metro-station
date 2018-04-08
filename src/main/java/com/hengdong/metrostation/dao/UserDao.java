package com.hengdong.metrostation.dao;

import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by QZH on 2017/12/25.
 */
@Mapper
public interface UserDao {
    public UserModel getUserByUserName(@Param("username") String username);
    public List<UserModel> getUsers(DataGrid dataGrid);
    public int getUsersCount(DataGrid dataGrid);
    public void updateUsers(UserModel userModel);
    public void insertUsers(UserModel userModel);
}
