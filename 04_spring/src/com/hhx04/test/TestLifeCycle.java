package com.hhx04.test;

import com.hhx04.bean.Book1;
import com.hhx04.bean.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean生命周期
 * @author hhxStellar
 * @date 2021/9/13-14:22
 */
public class TestLifeCycle {

    @Test
    public void Test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        System.out.println("4、getbean实例");
        Orders lifeCycleBean = context.getBean("lifeCycleBean", Orders.class);

        System.out.println(lifeCycleBean);
        context.close();//销毁
    }

    @Test
    public void Test2() {
        //此时如果配置文件中的其他bean是单例模式，会立刻初始化
        //但如果是多例模式，只有在getBean方法调用的时候才会初始化
        //这个测试可以说明多例和单例的区别，可以在bean4.xml中修改为了直观说明声明周期而在各步骤打印信息的bean,那个bean的id为lifeCycleBean

        //当配置文件中含有继承了BeanPostProcessor的后置处理器类的bean，会对其他所有bean初始化前后进行前置后置处理
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Book1 book1 = context.getBean("book1", Book1.class);
        System.out.println(book1);
    }
}
