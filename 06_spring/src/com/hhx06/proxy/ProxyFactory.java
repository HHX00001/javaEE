package com.hhx06.proxy;

import java.lang.reflect.Proxy;

/**
 * @author hhxStellar
 * @date 2021/9/13-22:48
 */
public class ProxyFactory {
    public static Object getProxyInstance(Object o) {//接受被代理类对象

        MyInvocationHandler handler = new MyInvocationHandler(o);

        //返回一个代理类的对象
        return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), handler);
    }
}
