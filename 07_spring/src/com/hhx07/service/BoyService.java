package com.hhx07.service;

import com.hhx07.bean.Boy;
import com.hhx07.dao.BoyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hhxStellar
 * @date 2021/9/14-10:05
 */
@Service
public class BoyService {

    @Autowired
    @Qualifier(value = "boyDao")
    private BoyDao boyDao;

    public void addBoy(Boy boy) {
        boyDao.add(boy);
    }

    public int selectCount() {
        return boyDao.count();
    }

    public Boy findOneBoy(int id) {
        return boyDao.selectById(id);
    }

    public List<Boy> findAll() {
        return boyDao.selectAll();
    }

    public void addBoyList(List<Object[]> boyList) {
        boyDao.insertBoyList(boyList);
    }

    public void updateBoyList(List<Object[]> boyList) {
        boyDao.batchUpdate(boyList);
    }
}
