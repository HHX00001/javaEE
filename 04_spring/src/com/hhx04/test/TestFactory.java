package com.hhx04.test;

import com.hhx04.bean.Book;
import com.hhx04.bean.Book1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hhxStellar
 * @date 2021/9/13-10:41
 */
public class TestFactory {

    @Test
    public void test1() {
        //bean工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Book book = context.getBean("myBeanFactory", Book.class);
        System.out.println(book);
    }

    @Test
    public void test2() {
        //单例，在加载配置文件时就已经创建好了对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Book1 singleTonBook = context.getBean("singleTonBook", Book1.class);
        Book1 singleTonBook1 = context.getBean("singleTonBook", Book1.class);

        //两次打印同一个对象
        System.out.println(singleTonBook);
        System.out.println(singleTonBook1);
    }

    @Test
    public void test3() {
        //多实例，在使用get方法时才去创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Book1 prototypeBook = context.getBean("prototypeBook", Book1.class);
        Book1 prototypeBook1 = context.getBean("prototypeBook", Book1.class);

        //两次打印不同对象
        System.out.println(prototypeBook);
        System.out.println(prototypeBook1);
    }
}
