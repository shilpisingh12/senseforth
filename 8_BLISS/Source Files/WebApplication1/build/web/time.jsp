<%-- 
    Document   : time.jsp
    Created on : Mar 2, 2017, 2:17:48 PM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*" %>
<%@page import="query1.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           
   if("TABCF12345".equals(session.getAttribute("uid")))
   {
      
       response.sendRedirect("timetable.jsp");
       
   }
    if("TABCF42521".equals(session.getAttribute("uid")))
   {
       
       response.sendRedirect("timetable1.jsp");
       
   }
     if("TABCH67890".equals(session.getAttribute("uid")))
   {
      
       response.sendRedirect("t3.jsp");
       
   }
        %>
    </body>
</html>
