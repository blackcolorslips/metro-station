package com.hengdong.metrostation.utils;

import org.springframework.stereotype.Component;

import java.security.MessageDigest;

/**
 * MD5加密
 * Created by QZH on 2017/12/27.
 */
@Component
    public class MD5Util {
    public static String MD5Encryption(String str){
        String md5str = null;
        try {
            MessageDigest md5= MessageDigest.getInstance("MD5");
            byte[] md5Bytes=md5.digest(str.getBytes("utf-8"));
            StringBuffer hexValue = new StringBuffer();
            for (int i = 0; i < md5Bytes.length; i++) {
                int val = ((int) md5Bytes[i]) & 0xff;
                if (val < 16)
                    hexValue.append("0");
                hexValue.append(Integer.toHexString(val));
                md5str=hexValue.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return md5str;
    }
}
