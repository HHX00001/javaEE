package com.hhx10.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hhxStellar
 * @date 2021/9/15-0:07
 */
public class UserLog {
    private final static Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello log4j warn");
        log.warn("hello log4j warn");
    }
}
