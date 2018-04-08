package com.hengdong.metrostation.dto;

/**
 * 登录数据参数
 * Created by QZH on 2018/1/3.
 */
public class LoginDto {

    private String username;//用户名
    private String password;//密码

    public String getUsername(){
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
