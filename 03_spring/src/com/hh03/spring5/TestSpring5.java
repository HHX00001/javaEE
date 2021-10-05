package com.hh03.spring5;

import com.hh03.bean.Person;
import com.hh03.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hhxStellar
 * @date 2021/9/11-13:26
 */
public class TestSpring5 {
    @Test
    public void testAdd() {
        //1、加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2、获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();

    }

    @Test
    public void testAdd1() {
        //1、加载配置文件,此方式加载配置文件时不会创建对象，只有在使用时才去创建对象
        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");//此时不创建对象

        //2、获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();

    }

    @Test
    public void testAdd2() {
        //1、加载配置文件,此方式一配置好就创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2、获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();

    }

    @Test
    public void testConstruct1() {
        //1、加载配置文件,此方式一配置好就创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2、获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        System.out.println(user.getUsername() + "已经" + user.getAge() + "岁了");
    }

    @Test
    public void testConstruct2() {
        //1、加载配置文件,此方式一配置好就创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2、获取配置创建的对象
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
        System.out.println(person.getName() + "已经" + person.getAge() + "岁了");
    }

    @Test
    public void testShowInfo() {
        //1、加载配置文件,此方式一配置好就创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2、获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        System.out.println(user.showInfo());

    }
}
