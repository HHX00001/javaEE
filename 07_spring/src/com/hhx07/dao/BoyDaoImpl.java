package com.hhx07.dao;

import com.hhx07.bean.Boy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;


/**
 * @author hhxStellar
 * @date 2021/9/14-10:06
 */
@Repository(value = "boyDao")
public class BoyDaoImpl implements BoyDao {

    @Autowired
    @Qualifier(value = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Boy boy) {
        String sql = "insert into boys(boyName,userCP) values(?,?)";
        Object[] args = {boy.getBoyName(), boy.getUserCP()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public int count() {
        String sql = "select count(*) from boys";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Boy selectById(int id) {
        String sql = "select * from boys where id = ?";
        Boy boy = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Boy>(Boy.class), id);
        return boy;
    }

    @Override
    public List<Boy> selectAll() {
        String sql = "select * from boys";
        List<Boy> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Boy.class));
        return bookList;
    }

    @Override
    public void insertBoyList(List<Object[]> batchArgs) {
        String sql = "insert into boys(boyName,userCP) values(?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update boys set boyName = ? ,userCP = ? where id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
