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
        <form name="ei" action="l_create2.jsp">
            <a href="logout.jsp">logout</a>
          <% if(request.getParameter("sub")!=null) %>
        
           <%
                      if(request.getParameter("btn")!=null)
                      {
                         /* String uid=request.getParameter("uid");
                         String yr=request.getParameter("yr");
                        session.setAttribute("uid",uid) ;
                          session.setAttribute("yr",yr);*/
                          
                          if(request.getParameter("detail").equals("Medical"))
                      {%>
                      <br>
                      <br>
                      
                      <center><font size="10px">Medical Leave Update</font></center>
<br>
                       <br>
    <br>
    <br>
    <br>
    
    <center><table>
                        <tr>
                            <th class="d">Enter Medical Leave</th>
                            <td class="input1"><input type="text" name="m" /></td>
                    </tr>
        </table></center>
                     
                     
                                        
                <%session.setAttribute("detail","Medical");%>
                <br>
                <br>
                <br>
    <center><input  style="height:40px;font-size:14pt" type="submit" value="Submit" name="btn" ></center>
                      <%}%>
                 <%if(request.getParameter("detail").equals("Earn"))
                {%>
    
    <center><font size="10px">Earn Leave Update</font></center>
    <br>
    <br>
    <br>
    <br>
    
   
    
    <center><table>
                        <tr>
                            <th class="d">Enter Earn Leave</th>
                            <td class="input1"><input type="text" name="el" /></td>
                    </tr>
        </table></center>
                    <%session.setAttribute("detail","Earn");%>
                    <center>  <input  style="height:40px;font-size:14pt" type="submit" value="Submit" name="btn" ></center>
                <%}
              if(request.getParameter("detail").equals("Casual"))
                {%>
    
    <center><font size="10px">Casual Leave Update</font></center>
    <br>
    <br>
    <br>
    <br>
    
   
    
    <center><table>
                        <tr>
                            <th class="d">Enter Casual Leave</th>
                            <td class="input1"><input type="text" name="c" /></td>
                    </tr>
        </table></center>
                    <%session.setAttribute("detail","Casual");%>
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