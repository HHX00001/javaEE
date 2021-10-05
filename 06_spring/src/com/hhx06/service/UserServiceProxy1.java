package com.hhx06.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author hhxStellar
 * @date 2021/9/14-1:19
 */
@Component
@Aspect
@Order(1)
public class UserServiceProxy1 {
    @Before(value = "execution(* com.hhx06.service.UserService.add())")
    public void before1() {
        System.out.println("另一个增强。。。");
    }
}
