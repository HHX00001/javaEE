package com.hhx06.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author hhxStellar
 * @date 2021/9/14-0:10
 */

//增强类
@Component
@Aspect
@Order(2)//增强类级别
public class UserServiceProxy {
    //相同切入点抽取
    @Pointcut(value = "execution(* com.hhx06.service.UserService.add())")
    public void pointDemo() {
    }

    //前置通知
    @Before(value = "pointDemo()")
    public void before() {
        System.out.println("前置通知。。。");
    }

    //最终通知
    @After(value = "pointDemo()")
    public void after() {
        System.out.println("最终通知。。。");
    }

    //方法返回结果之后执行,返回通知，后置通知
    @AfterReturning(value = "pointDemo()")
    public void afterReturning() {
        System.out.println("后置通知。。。");
    }

    //异常通知
    @AfterThrowing(value = "pointDemo()")
    public void afterThrowing() {
        System.out.println("异常通知。。。");
    }

    //返回通知
    @Around(value = "pointDemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前。。。");
        //被增强方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后。。。");
    }

}
