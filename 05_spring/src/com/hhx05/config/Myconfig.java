package com.hhx05.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author hhxStellar
 * @date 2021/9/13-20:50
 */

@Configuration//当前为配置类,替换xml配置文件
@ComponentScan(basePackages = "com.hhx05")
public class Myconfig {
}
