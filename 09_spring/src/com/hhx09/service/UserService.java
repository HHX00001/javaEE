package com.hhx09.service;

import com.hhx09.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author hhxStellar
 * @date 2021/9/14-17:24
 */
@Service(value = "userService")
@Transactional
public class UserService {
    @Autowired
    @Qualifier(value = "userDao")
    private UserDao userDao;

    public void trans() {
        userDao.plus();
//        System.out.println(1 / 0);
        userDao.minus();
    }
}
