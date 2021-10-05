package com.hhx07.dao;

import com.hhx07.bean.Boy;

import java.util.List;


/**
 * @author hhxStellar
 * @date 2021/9/14-10:05
 */
public interface BoyDao {
    void add(Boy boy);

    int count();

    Boy selectById(int id);

    List<Boy> selectAll();

    void insertBoyList(List<Object[]> batchArgs);

    void batchUpdate(List<Object[]> batchArgs);
}
