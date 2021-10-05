package com.hhx06.service;

import org.springframework.stereotype.Component;

/**
 * @author hhxStellar
 * @date 2021/9/14-0:09
 */

//被增强的类
@Component
public class UserService {
    public void add() throws Exception {
        System.out.println("add方法......");
//        throw new Exception("异常");
    }
}
