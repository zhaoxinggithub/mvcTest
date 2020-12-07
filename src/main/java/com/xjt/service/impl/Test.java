package com.xjt.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static com.oracle.jrockit.jfr.DataType.UTF8;

public class Test {
    public static void mainl(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            conn = (Connection) DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/j2ee?user=root&password=root&useUnicode=true&characterEncoding=UTF8");
                            Statement s =  conn.createStatement();
            System.out.println(conn.isClosed());
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
