package com.hhx05.service;

import com.hhx05.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;//不是Spring提供的，推荐使用autowired和qualifier注解

/**
 * @author hhxStellar
 * @date 2021/9/13-20:34
 */
@Service
public class UserService1 {
    //    @Resource根据类型注入，也可以根据名称注入
    @Resource(name = "userDao1")
    private UserDao userDao;

    @Value("惠恒星的服务")
    private String USName;

    public void add() {
        System.out.println("名字为" + USName + "的service1的add方法...");
        userDao.update();
    }
}
