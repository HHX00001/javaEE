package com.hhx08.service;

import com.hhx08.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author hhxStellar
 * @date 2021/9/14-15:00
 */
@Transactional()
@Service(value = "userService")
public class UserService {
    @Autowired
    @Qualifier(value = "userDao")
    private UserDao userDao;

    public void transAccount() {
        userDao.reduceMoney();
//        int i = 1 / 0;
        userDao.addMoney();
    }
}
