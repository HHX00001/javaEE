package com.hhx09.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


/**
 * @author hhxStellar
 * @date 2021/9/14-17:24
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    @Qualifier(value = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public void plus() {
        String sql = "update user set userAccount = userAccount + ? where userId = ?";
        int update = jdbcTemplate.update(sql, 1000, 1);
        System.out.println(update);
    }

    @Override
    public void minus() {
        String sql = "update user set userAccount = userAccount - ? where userId = ?";
        int update = jdbcTemplate.update(sql, 1000, 2);
        System.out.println(update);
    }
}
