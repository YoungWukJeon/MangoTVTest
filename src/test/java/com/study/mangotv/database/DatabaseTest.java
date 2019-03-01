package com.study.mangotv.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatabaseTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void connectionTest() throws SQLException {
        Connection conn = dataSource.getConnection();

        PreparedStatement pstmt = conn.prepareStatement("SELECT 1");
        ResultSet rs = pstmt.executeQuery();
        
        rs.next();
        System.err.println("Result :: " + rs.getInt(1));
    }
}