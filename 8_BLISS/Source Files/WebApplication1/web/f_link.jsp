<%-- 
    Document   : f_link
    Created on : Feb 7, 2017, 11:52:40 AM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% if(session.getAttribute("userid")!=null)
{
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script>
             function preventBack(){window.history.forward();}
            setTimeout("preventBack()",0);
            window.onunload=function(){null};
            </script>
    </head>
    <body bgcolor="#AC2D9F">
        <a href="Faculty_Interface.jsp" target="f1"><font color="white">VIEW</font></a><br><br>
        <a href="fill_interface.jsp" target="f1"><font color="white">FILL</font></a>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
         <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <a href="logout.jsp" target="f1"><font color="white">LOGOUT</font></a>
        
    </body>
</html>
<%}
else
response.sendRedirect("login.jsp");
%>
