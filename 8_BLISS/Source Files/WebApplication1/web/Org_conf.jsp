<%-- 
    Document   : continuous
    Created on : Jan 12, 2017, 4:44:16 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" ></jsp:include>
    <%@page import="query1.*" %>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
        <table align="center">
            <h1 align="center"><u><b>Organizing Conferences/Symposis/Workshops/Training Programs/Music Concerts/Exhibition/Refresher Course</b></u></h1>
             <tr>
                 <th>Title</th>
                 <td><input type="text" ></td>
             </tr>
            
             <tr> <th >Place</th>
             <td><input type="text" ></td></tr>
            
           
                  
             <tr><th>Date & Details</th>
             <td><input type="text" ></td></tr> 
            
                   
             <tr>   <th>Credit Points</th>
             <td><input type="text" ></td></tr>
            
             <tr>
                 <td></td>
                 <td align="center"><input type="submit" value="submit"></td></tr>
                   
                  
             
        
           
        </table>
        </form>
        
       
          
          
    </body>
</html>

<jsp:include page="Footer.jsp" ></jsp:include>
  
