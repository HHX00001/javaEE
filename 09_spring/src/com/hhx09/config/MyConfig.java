package com.hhx09.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


/**
 * @author hhxStellar
 * @date 2021/9/14-18:05
 */
@Configuration
@ComponentScan(basePackages = "com.hhx09")
@EnableTransactionManagement
public class MyConfig {
    //创建数据库连接池
    @Bean(value = "druidDataSource")//可以随便命名，因为用到的地方是按类型装配注入的（35，43行代码）
    public DruidDataSource getDruidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/bank?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");
        return druidDataSource;
    }

    //创建JdbcTemplate对象
    @Bean(value = "jdbcTemplate")//不可以随便命名，在dao层用qulifier按照名称注入的
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {//按类型自动装配dataSource对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    //创建transactionManager对象
    @Bean(value = "dataSourceTransactionManager")
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
