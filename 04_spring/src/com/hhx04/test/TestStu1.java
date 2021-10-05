package com.hhx04.test;

import com.hhx04.bean.Stu1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hhxStellar
 * @date 2021/9/11-19:58
 */
public class TestStu1 {
    @Test
    public void TestShowInfo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Stu1 student = context.getBean("student", Stu1.class);
        System.out.println(student);
    }
}
