package com.hhx06.dao;

/**
 * @author hhxStellar
 * @date 2021/9/13-22:45
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了");
        return a + b;
    }

    @Override
    public String update(String str) {
        System.out.println("update方法执行了");
        return str;
    }
}
