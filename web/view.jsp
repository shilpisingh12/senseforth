<%-- 
    Document   : view
    Created on : Feb 27, 2017, 7:10:34 PM
    Author     : pc
--%>

<%@page import="java.sql.*"%>
<%@page import="java.util.*" %>
<html>  
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jsp page</title>
        <link rel="stylesheet" type="text/css" href="style.css"/>
    </head>
    <body class="p1">
        <form  method="post" name="frm_stud">
            <h1 align="center"><b><u>VIEW YOUR DETAILS </u></b></h1>
            <table align="center">
<tr>
<td> enrollment no:</td>
<td><input type="text" name="id"></td>
<td>
<input type="submit" value="submit" name="submit1" />
 </td>         
</tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
</table>
 </form>   
<%
     String s=request.getParameter("id");
    try
    {
       
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opas","root","");
        Statement stmt=con.createStatement();
        String q="select * from stud1 where id='"+s+"'";
           ResultSet rs=stmt.executeQuery(q);
	while(rs.next())
               { 
                   out.write("<table border=1 bgcolor=white>");
                   out.write("<tr><th>Enrollment no</th><th>DOB</th><th>Fname name</th><th>Last name</th><th>Father name</th><th>Mob no.</th><th>Email</th><th>Temporary Address</th><th>Permanent Address</th><th>City</th><th>State</th></tr>");
                   out.write("<tr>");
                   out.write("<td>"+rs.getString(1)+"</td>"+"<td>"+rs.getString(2)+"</td>"+"<td>"+rs.getString(3)+"</td>"+"<td>"+rs.getString(4)+"</td>"+"<td>"+rs.getString(5)+"</td>"+"<td>"+rs.getString(6)+"</td>"+"<td>"+rs.getString(7)+"</td>"+"<td>"+rs.getString(8)+"</td>"+"<td>"+rs.getString(9)+"</td>"+"<td>"+rs.getString(10)+"</td>"+"<td>"+rs.getString(11)+"</td>");
                   out.write("</tr></table>");
                   out.print("<br>");
               }  
              }
        catch(Exception e)
    {
        e.printStackTrace();
    }
%>
</body>
</html>