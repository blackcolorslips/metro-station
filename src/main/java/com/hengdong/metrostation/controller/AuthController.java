package com.hengdong.metrostation.controller;

import com.hengdong.metrostation.dto.LoginDto;
import com.hengdong.metrostation.dto.LoginResultDto;
import com.hengdong.metrostation.model.UserModel;
import com.hengdong.metrostation.security.JwtTokenUtil;
import com.hengdong.metrostation.service.UserService;
import com.hengdong.metrostation.utils.MD5Util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * Created by QZH on 2018/1/2.
 */
@Slf4j
@RestController
public class AuthController {
    @Autowired
    private UserService userService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @PostMapping("/login")
    public LoginResultDto getToken(@RequestBody LoginDto loginDto){
            return VerificationUser(loginDto);
    }
    //用户验证
    private LoginResultDto VerificationUser(LoginDto loginDto){
        String token=null;
        String msg;
        UserModel userModel=userService.getUserByUserName(loginDto.getUsername());
        if(null!=userModel){
            String pwd=MD5Util.MD5Encryption(loginDto.getPassword());
            if(userModel.getMM().equals(pwd)){
                token=jwtTokenUtil.generateToken(userModel);
                log.info("token:"+token);
                msg="登录成功";
            }else{
                log.info("密码错误");
                msg="密码错误";
                userModel=null;
            }
        }else{
            log.info("用户不存在");
            msg="用户不存在";
        }
        return new LoginResultDto(token,msg,userModel);
    }
}
