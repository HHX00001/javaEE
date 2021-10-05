package com.hhx07.test;

import com.hhx07.bean.Boy;
import com.hhx07.service.BoyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hhxStellar
 * @date 2021/9/14-11:51
 */
public class TestJdbcTemp {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BoyService boyService = context.getBean("boyService", BoyService.class);
        Boy boy = new Boy();
        boy.setBoyName("惠恒星");
        boy.setUserCP(100);
        boyService.addBoy(boy);
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BoyService boyService = context.getBean("boyService", BoyService.class);
        System.out.println(boyService.selectCount());
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BoyService boyService = context.getBean("boyService", BoyService.class);
        System.out.println(boyService.findOneBoy(Integer.valueOf(2)));
    }

    @Test
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BoyService boyService = context.getBean("boyService", BoyService.class);
        System.out.println(boyService.findAll());
    }

    @Test
    public void test5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BoyService boyService = context.getBean("boyService", BoyService.class);
        Object[] o1 = {"牛昱浩", "94"};
        Object[] o2 = {"俊宏", "89"};
        List<Object[]> batchArgs = new ArrayList<>();
        batchArgs.add(o1);
        batchArgs.add(o2);
        boyService.addBoyList(batchArgs);
    }

    @Test
    public void test6() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BoyService boyService = context.getBean("boyService", BoyService.class);
        Object[] o1 = {"将卓成", "99", 1};
        Object[] o2 = {"尚宇", "88", 2};
        Object[] o3 = {"胡炳强", "93", 3};
        List<Object[]> batchArgs = new ArrayList<>();
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        boyService.updateBoyList(batchArgs);
    }
}
