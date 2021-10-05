package com.hhx06.test;

import com.hhx06.config.MyConfig;
import com.hhx06.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hhxStellar
 * @date 2021/9/14-0:27
 */
public class TestAop {
    @Test
    public void test1() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void test2() throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
