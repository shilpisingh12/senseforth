<%-- 
    Document   : linter.jsp
    Created on : Mar 1, 2017, 6:50:14 PM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="query1.*" %>
<% if(session.getAttribute("userid")!=null)
{
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <table  align="center" border="1">
            <h1 align="center"><b class="p1">Leave</b></h1>
            <tr>   <th>Casual Leave</th>
            <th>Earn Leave</th>
            <th>Medical Leave</th>
            <th>Total Leave Taken</th></tr>
             <%    
            Connection conn=null;
        Statement stat=null;
        ResultSet rs=null;
        boolean status=false;
        try
        {
        
          Class.forName("com.mysql.jdbc.Driver");    //driver for MySQL
	 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bliss","root","");

       stat=conn.createStatement();
        
String q="select * from login1";
        rs=stat.executeQuery(q);
        if(rs.next())
        {
        %>
            <tr>
                <td> <input type="text" name="1" value="<%rs.getString(2)%>"/></td>
                <td> <input type="text" name="2" value="asd"/> </td>
                <td> <input type="text" name="2" value="asd"/> </td>
                <td> <input type="text" name="2" value="asd"/> </td>
                
            </tr>
            <% 

}%>
<%}
            catch(Exception e)
            {
            System.out.println(e);
            }
                  %>
         </table> 
    </body>
</html>
<%}
else
response.sendRedirect("login.jsp");
%>