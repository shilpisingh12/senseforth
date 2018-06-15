<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
                <tr>
                <th>Select Year</th>
                <td>
                    <select name="yr">
                        <option selected>2014</option selected>
                        <option>2015
                         <option>2016
                         </option></option>
                    </select>
                </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="OK" name="btn">                   
                    </td>
                </tr>
            </table>
        </form>
    </body>
    </html>
    <%
        
   if(request.getParameter("btn") != null)
   {    
   String year1=request.getParameter("yr");
   if(request.getParameter("yr")!=null)
   {
   session.setAttribute("year1",year1); 
   
   response.sendRedirect("personal.jsp");
   }
   }
    session.getAttribute("userid");
   %>    