package com.hhx08.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author hhxStellar
 * @date 2021/9/14-15:00
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    @Qualifier(value = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update user set userAccount = userAccount + ? where userId =? ";
        jdbcTemplate.update(sql, 100, 1);
    }

    @Override
    public void reduceMoney() {
        String sql = "update user set userAccount = userAccount - ? where userId =? ";
        jdbcTemplate.update(sql, 100, 2);
    }
}
