package com.hengdong.metrostation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 日志记录
 * Created by QZH on 2017/12/26.
 */
@Aspect
@Component
public class LogInterceptor {
    //@Pointcut("execution(* com.hengdong.metrostation.controller ..*(..))")
    public void controllerPointCut(){}
    //@After("controllerPointCut()")
    public void RecordLog(JoinPoint joinPoint){
        for (int i=0; i <joinPoint.getArgs().length;i++){
            System.out.println("参数："+joinPoint.getArgs()[i]);
        }
        System.out.println(joinPoint.getSignature().getName());

    }

}
