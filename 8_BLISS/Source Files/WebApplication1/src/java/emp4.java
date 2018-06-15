/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Inspiron_15_5000
 */

    

import java.sql.*;
import java.util.*;
class emp4
{
public void get_data()
{
try
{
System.out.println("OK");
Class.forName("com.mysql.jdbc.Driver");    

	 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery("select * from emp1");
while(rs.next())
{
System.out.println(rs.getString(1)+"\t"+rs.getString(2));
}
conn.close();
}
catch(Exception ex)
{
ex.printStackTrace();
}
}
public static void main(String args[])
{

emp4 e=new emp4();
 e.get_data();
}

}