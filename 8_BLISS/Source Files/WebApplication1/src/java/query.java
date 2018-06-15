/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Inspiron_15_5000
 */
package pac; 
  import java.util.*;
import java.io.*;
import java.sql.*;
public class query {
    public void search ()
    {
        String login_id=null,password=null;
        try
        {
            
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("Jdbc:Odbc:dsn");
        String sql="Select * from login where login_id='"+login_id+"',password='"+password+"'";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next())
        {
            System.out.println(rs.getString(1)+"\t"+rs.getString(2));
        }
        
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}
