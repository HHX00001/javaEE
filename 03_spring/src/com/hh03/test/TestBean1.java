package com.hh03.test;

import com.hh03.bean.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hhxStellar
 * @date 2021/9/11-18:20
 */
public class TestBean1 {
    @Test
    public void TestShowInfo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }

    @Test
    public void TestShowInfo1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }

    @Test
    public void TestShowInfo2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
