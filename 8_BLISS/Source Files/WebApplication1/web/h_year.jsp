<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <%@page import="query1.*" %>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            div {
                          width: 300px;
                          height: 100px;
                          border: 1px solid blue;
                          box-sizing: border-box;
                        }


        </style>
    </head>
    <body>
        <form name="h_year" action="sec_frame_h.jsp">
            <center> <table>
                <tr>
                    <th><font size="5pt">Select Year</font></th>
                <td>
                    
                    <select class="div" name="yr">
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
            </center>
        </form>
    </body>
    </html>
    <%
     //session.getAttribute("uid");  
   if(request.getParameter("btn") != null)
   {    
   String year1=request.getParameter("yr");
   if(request.getParameter("yr")!=null)
   {
   session.setAttribute("yr",year1); 
   
   //response.sendRedirect("p_hod.jsp");
   }
   }
   
   %>    