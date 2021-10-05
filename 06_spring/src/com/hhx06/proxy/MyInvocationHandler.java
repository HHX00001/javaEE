package com.hhx06.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author hhxStellar
 * @date 2021/9/13-23:20
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object o;

    public MyInvocationHandler(Object o) {
        this.o = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //代理类对象调用的方法，此方法就是被代理类的增强方法
        //o为被代理类

        System.out.println("方法之前执行,方法名为" + method.getName() + "，:" + "方法参数:" + Arrays.toString(args));
        Object returnValue = method.invoke(o, args);
        System.out.println("方法执行之后");
        return returnValue;
    }
}
