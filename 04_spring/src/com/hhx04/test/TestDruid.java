package com.hhx04.test;

import org.junit.Test;
import com.alibaba.druid.pool.DruidDataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Spring+Druid+外部文件实现数据库操作
 * @author hhxStellar
 * @date 2021/9/13-16:22
 */
public class TestDruid {

    @Test
    public void TestDB() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = dataSource.getConnection();

            String sql = "select * from beauty where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, "1");

            resultSet = preparedStatement.executeQuery();
            resultSet.next();

            System.out.println((String) resultSet.getObject(2));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
    }
}
