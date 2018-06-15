<%-- 
    Document   : updatef
    Created on : Feb 12, 2017, 6:46:04 PM
    Author     : pc
--%>
<%@page import="java.sql.*" %>
<%@page import="query1.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>update details</title>
        <link rel="stylesheet" type="text/css" href="styl.css"/>
    </head>
    <body bgcolor="white">
<form name="frm_admin">
<h1 align="center"><u><b>DELETE RECORD</b></u></h1>
<table align="center" cellspacing="5" cellpadding="1o" >
<tr>
<td>admin id:</td>
<td><input type="text" name="u_id"></td>
 <td>
<input type="submit" value="submit" name="submit1" />
 </td>         
</tr>
</table>
 </form>   
 </body>
</html>

<%  
   
String eno=request.getParameter("u_id");
//String idk=request.getParameter("mob_no");
//out.println(eno);
NewClass q=new NewClass();
    if (request.getParameter("submit1")!= null)
    {   
         
        //   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          // Connection conn=DriverManager.getConnection("Jdbc:Odbc:mydsn");  
   // PreparedStatement ps=conn.prepareStatement("update stud1 set fname='"+idk+"' where id='"+eno+"' ");
   //  ps.executeUpdate();
        
      //  out.println("success");
        String str="delete from adminn where user_id='"+eno+"' ";
        int s=q.delete_data(str);
        out.println("record deleted successfully");
   // out.println(s);
   
    }
%>