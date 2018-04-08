package com.hengdong.metrostation.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 捕获异常
 * Created by QZH on 2017/12/25.
 */
public class ExceptionHandlers {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map exceptions(Exception e){
        Map map=new HashMap();
        map.put("msg",e.getMessage());
        String code= e.getClass().getName().toString();
        if(null!=code().get(code) && !code().get(code).equals("")){
            map.put("tip",code().get(e.getClass().getName()));
        }else{
            map.put("tip","未知异常");
        }
        return map;
    }
  public Map code(){
        Map<String,String> map=new HashMap<String, String>();
        map.put("java.lang.ArithmeticException","算数异常");
        map.put("java.lang.NullPointerException","空指针异常");
        map.put("java.lang.ClassCastException","类型强制转换异常");
        map.put("java.lang.NegativeArrayException","数组负下标异常");
        map.put("java.lang.ArrayIndexOutOfBoundsException","数组下标越界异常");
        map.put("java.lang.NumberFormatException","字符串转换为数字异常");
        map.put("java.lang.NoSuchFieldException","方法未找到异常");
        map.put("java.io.IOException","输入输出异常");
        map.put("java.sql.SQLException","操作数据库异常");
        return map;
  }

}
