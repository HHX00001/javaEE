package com.hhx05.dao;

import org.springframework.stereotype.Repository;

/**
 * @author hhxStellar
 * @date 2021/9/13-19:52
 */

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void update() {
        System.out.println("userDao的update方法。。。");
    }
}
