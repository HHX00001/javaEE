package com.hh03.service;

import com.hh03.dao.UserDao;
import com.hh03.dao.UserDaoImpl;

/**
 * @author hhxStellar
 * @date 2021/9/11-16:10
 */
public class UserService {
    //创建userdao类型属性，生产set方法
    private UserDao userDao;


    public void add() {
        System.out.println("service add ...");
//        原始方法调用update
//        UserDao userDao = new UserDaoImpl();
//        userDao.update();
        userDao.update();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
