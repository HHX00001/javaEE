package com.hhx04.test;

import com.hhx04.bean.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hhxStellar
 * @date 2021/9/11-19:17
 */
public class TestStu {
    @Test
    public void testShowInfo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu student = context.getBean("student", Stu.class);
        System.out.println(student);
    }
}
