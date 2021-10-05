package com.hhx06.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author hhxStellar
 * @date 2021/9/14-1:34
 */
@Configuration
@ComponentScan(basePackages = "com.hhx06")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MyConfig {
}
