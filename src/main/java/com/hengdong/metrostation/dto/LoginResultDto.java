package com.hengdong.metrostation.dto;

import com.hengdong.metrostation.model.UserModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by QZH on 2018/1/3.
 */
@Data
@AllArgsConstructor
public class LoginResultDto implements Serializable{
    private String token;//token
    private String msg;//验证结果
    private UserModel user;//用户信息
}
