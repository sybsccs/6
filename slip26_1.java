/*
Write a Java program to delete the details of given employee (ENo EName Salary). 
Accept employee ID through command line. (Use PreparedStatement Interface)
 */
package com.mycompany.javaslip;


import java.sql.*;

public class slip26_1
{
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        
        String sql = "delete from emp where id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, Integer.parseInt(args[0]));
        ps.executeUpdate();
    }
}
