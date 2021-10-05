package com.hhx05.test;

import com.hhx05.config.Myconfig;
import com.hhx05.service.UserService;
import com.hhx05.service.UserService1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hhxStellar
 * @date 2021/9/13-17:59
 */
public class TestService {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService1 userService1 = context.getBean("userService1", UserService1.class);
        System.out.println(userService1);
        userService1.add();
    }

    @Test
    public void test3() {
        //加载配置类以实现完全注解开发
        ApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
        UserService1 userService1 = context.getBean("userService1", UserService1.class);
        System.out.println(userService1);
        userService1.add();
    }
}
