<%--

    Document   : ei.jsp
    Created on : Feb 27, 2017, 1:00:03 PM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="query1.*" %>
<%@page import="java.sql.*" %>
<% if(session.getAttribute("userid")!=null)
{
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
             .d{
                font-size:25px;font-style:normal;font-weight:bolder 
            }
            .input{
                height:40px;font-size:14pt;
            }
             .input1{
                height:30px;font-size:14pt;
            }
        </style>
        
        
    </head>
    
    <body bgcolor="beige">
        <form name="ei" action="o_create1.jsp">
            <a href="logout.jsp">logout</a>
        
           <%
                      if(request.getParameter("btn")!=null)
                      {
                         /* String uid=request.getParameter("uid");
                         String yr=request.getParameter("yr");
                        session.setAttribute("uid",uid) ;
                          session.setAttribute("yr",yr);*/
                          
                          if(request.getParameter("detail").equals("Salary"))
                      {%>
                      <br>
                      <br>
                      
                      <center><font size="10px">Salary Update</font></center>
<br>
                       <br>
    <br>
    <br>
    <br>
    
    <center><table>
                        <tr>
                            <th class="d">Enter New Salary</th>
                            <td class="input1"><input type="text" name="sal" /></td>
                    </tr>
        </table></center>
                     
                     
                                        
                <%session.setAttribute("detail","Salary");%>
                <br>
                <br>
                <br>
    <center><input  style="height:40px;font-size:14pt" type="submit" value="Submit" name="btn" ></center>
                      <%}%>
                 <%if(request.getParameter("detail").equals("Designation"))
                {%>
    <
    <center><font size="10px">Designation Update</font></center>
    <br>
    <br>
    <br>
    <br>
    
   
    
    <center><table>
                        <tr>
                            <th class="d">Enter Designation</th>
                            <td class="input1"><input type="text" name="desig" /></td>
                    </tr>
        </table></center>
                    <%session.setAttribute("detail","Designation");%>
                    <center>  <input  style="height:40px;font-size:14pt" type="submit" value="Submit" name="btn" ></center>
                <%}
                 
        }%>
        </form>
    </body>
</html>


<%}
else
response.sendRedirect("login.jsp");
%>