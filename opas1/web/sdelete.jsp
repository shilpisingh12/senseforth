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
        <title>delete record</title>
        <link rel="stylesheet" type="text/css" href="styl.css"/>
    </head>
    <body bgcolor="white">
<form  name="frm_stud">
  <h1 align="center"><b><u>DELETE YOUR RECORD </u></b></h1>  
<table align="center" cellspacing="5" cellpadding="1o" >
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
 </body>
</html>

<%  
   
String eno=request.getParameter("id");
String idk=request.getParameter("name");
//out.println(eno);
NewClass q=new NewClass();
    if (request.getParameter("submit1")!= null)
    {   
         
        //   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          // Connection conn=DriverManager.getConnection("Jdbc:Odbc:mydsn");  
   // PreparedStatement ps=conn.prepareStatement("update stud1 set fname='"+idk+"' where id='"+eno+"' ");
   //  ps.executeUpdate();
        
        //out.println("success");
        // String str="delete from stud where rno='"+rno+"'";
                  // int i=q.delete_data(q1);
        String str="delete from stud1 where id='"+eno+"' ";
        int s=q.delete_data(str);
        out.println("record deleted successfully");
       //  out.println(s);
   
    }
%>
