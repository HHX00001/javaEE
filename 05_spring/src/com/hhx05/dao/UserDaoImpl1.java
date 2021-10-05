package com.hhx05.dao;

import org.springframework.stereotype.Repository;

/**
 * @author hhxStellar
 * @date 2021/9/13-20:05
 */
@Repository(value = "userDao1")
public class UserDaoImpl1 implements UserDao{
    @Override
    public void update() {
        System.out.println("userDaoimpl1的update");
    }
}
