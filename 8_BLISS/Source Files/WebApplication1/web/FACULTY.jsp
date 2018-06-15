<%-- 
    Document   : FACULTY
    Created on : Jan 9, 2017, 11:28:39 PM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="query1.*" %>

<!DOCTYPE html>
<%
    
 
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
       // conn.close();
	/*while(rs.next())
	{
	System.out.print(rs.getString(1));
	System.out.print(" "+rs.getString(2));
System.out.println();
	}*/
        

}
catch(Exception e)
{
System.out.println(e);
}

}


    %>
