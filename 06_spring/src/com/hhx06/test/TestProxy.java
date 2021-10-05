package com.hhx06.test;

import com.hhx06.dao.UserDao;
import com.hhx06.dao.UserDaoImpl;
import com.hhx06.proxy.ProxyFactory;
import org.junit.Test;

/**
 * @author hhxStellar
 * @date 2021/9/13-23:31
 */
public class TestProxy {
    @Test
    public void test1() {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        UserDao proxyInstance = (UserDao) ProxyFactory.getProxyInstance(userDaoImpl);
        System.out.println(proxyInstance.add(1, 2));
        System.out.println("-------------");
        System.out.println(proxyInstance.update("惠恒星yyds"));
    }
}
