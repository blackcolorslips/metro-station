package com.hengdong.metrostation.service.Impl;

import com.hengdong.metrostation.dao.UserDao;
import com.hengdong.metrostation.dto.DataGrid;
import com.hengdong.metrostation.model.UserModel;
import com.hengdong.metrostation.service.UserService;
import com.hengdong.metrostation.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QZH on 2018/1/2.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public UserModel getUserByUserName(String username) {
        return userDao.getUserByUserName(username);
    }

    @Override
    public List<UserModel> getUsers(DataGrid dataGrid) {
        return userDao.getUsers(dataGrid);
    }

    @Override
    public int getUsersCount(DataGrid dataGrid) {
        return userDao.getUsersCount(dataGrid);
    }

    @Override
    public void updateUsers(UserModel userModel) {
        userDao.updateUsers(userModel);
    }

    @Override
    public void insertUsers(UserModel userModel) {
        userModel.setMM(MD5Util.MD5Encryption(userModel.getMM()));
        userDao.insertUsers(userModel);
    }
}
