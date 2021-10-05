package com.hhx04.beanfactory;

import com.hhx04.bean.Book;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author hhxStellar
 * @date 2021/9/13-10:39
 */
public class MyBeanFactory implements FactoryBean<Book> {
    //bean工厂
    @Override
    public Book getObject() throws Exception {
        return new Book();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
