package com.hhx05.service;

import com.hhx05.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author hhxStellar
 * @date 2021/9/13-17:43
 */

//注解里面value属性值可以不写，默认id为类名称且首字母小写
@Service(value = "userService") //value与id同一概念，类似于在配置文件中写上<bean id="userService" class="com...."></bean>
public class UserService {

    //单独使用时，直接找与属性类型相同接口的实现类
    //如果有多个实现类，则按属性名找组件装配
    //如果属性名称瞎写，还可以用@Qualifier指定组件名，且必须与autowired一起使用
    @Autowired
    @Qualifier(value = "userDao")
    UserDao userDao;

    public void add() {
        System.out.println("userService的add方法.......");
        userDao.update();
    }
}
