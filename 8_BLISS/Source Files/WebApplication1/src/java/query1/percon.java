/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query1;
import java.sql.*;
/**
 *
 * @author Inspiron_15_5000
 */
public class percon {
    

    public static void main(String args[])
{
    
    
    
    }
    
    public ResultSet get_data(String q)
    {
        Connection conn=null;
        Statement stat=null;
        ResultSet rs=null;
        try
        {
        
          Class.forName("com.mysql.jdbc.Driver");    //driver for MySQL
	 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bliss","root","");

       stat=conn.createStatement();
        

        rs=stat.executeQuery(q);
       
        }
        catch(Exception e)
{
System.out.println(e);
}

return rs;
    
    
    }
    }

    

