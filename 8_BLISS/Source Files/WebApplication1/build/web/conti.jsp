<%-- 
    Document   : continuous
    Created on : Jan 12, 2017, 4:44:16 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" ></jsp:include>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <style type="text/css">
            .p{
                color:indigo; font-family:algerian;font-size:40px;font-weight:bold

            }
            input{
                height:30px;font-size:10pt;
            }
            .d{
                font-size:20pt;font-style:normal;font-weight:bolder 
            }
            body{
                background-color:lemonchiffon
            }
        </style>
    <body>
        <form>
        <table  align="center">
            <h1 align="center"><u><b>Continuous Assessment Table</b></u></h1>
             <tr>
                 <td><b>Class/Semester:</b></td>
                 <td><input class="input" size="30" type="text" ></td>
            </tr>
             <tr>
                 <td><b>Course/Paper:</b></td>
                 <td><input class="input" size="30" type="text" ></td>
            </tr>
             <tr>
                 <td><b>No. of Students in class:</b></td>
                 <td><input class="input" size="30" type="text" ></td>
            </tr>
             <tr>
                 <td><b>Continuous Assessment Project:</b></td>
                 <td><input class="input" size="30" type="text" ></td>
            </tr>
            <tr></tr>
<tr>
    <td></td>
    </table>
            <center><input type="button" value="submit">
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="more">
            </center>
           
        
        </form>
          <jsp:include page="Footer.jsp" ></jsp:include>
          
    </body>
</html>
