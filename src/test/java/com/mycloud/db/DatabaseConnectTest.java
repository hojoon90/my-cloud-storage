package com.mycloud.db;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
public class DatabaseConnectTest {

    @Autowired
    DataSource dataSource;

    @Test
    void 연결_테스트() throws Exception{
        Connection conn = dataSource.getConnection();
        if(conn != null) System.out.println("connection Success");
    }

}
