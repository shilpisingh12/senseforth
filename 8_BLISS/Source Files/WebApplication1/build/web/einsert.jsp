<%-- 
    Document   : einsert
    Created on : Feb 27, 2017, 11:43:53 AM
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
        <style type="text/css">
            .p1{
                font-family:Andalus;font-size:40px;font-weight:bold
               }
            input{
                height:30px;font-size:14pt;
            }
            .d{
                font-size:20pt;font-style:normal;font-weight:bolder 
            }
            body{
                background-color:beige
            }
        </style>
        
    </head>
    <body>
         <form name="work" method="get" action="ei.jsp">
         <% if (request.getParameter("submit") != null)
       {
           %>
           <a href="logout.jsp">logout</a>
           <center><table  border="0">
            <center><b class="p1">Invigilation</b></center>
            
            
              
                  
                  
                
                <tr>
                   <td><u><b><h2>Exam</h2></b></u></td>
                    <td><input class="input" type="text" name="exam" size="30" ></td>
                </tr>
                <tr><td><h2><u><b>Invig_duties </b></u></h2></td>
                    <td><input class="input" type="text" name="invig" size="30"  /></td>
                </tr>
                <tr><td><h2><u><b>Duties_attend</b></u></h2></td>
                    <td><input class="input" type="text" name="duties" size="30" /></td>
                </tr>
                <tr><td><h2><u><b>Unauth_absent</b></u></h2></td>
                    <td><input class="input" type = "text" name = "unauth" size="30" ></td>
                </tr>
                 <tr><td><h2><u><b>Quality_invig</b></u></h2></td>
                    <td><input class="input" type = "text" name = "quality" size="30"  ></td>
                </tr>
                
                 
                   <!-- <td> <input  style="height:40px;font-size:14pt" type="submit" value="next>>" name="next" ></td>-->
                
               </table></center>
           <center> <input  style="height:40px;font-size:14pt" type="submit" value="more" name="sub" ></td></center>
        <%  }  
            if((request.getParameter("submit1") != null))
                      {%>
                        <% String uid=request.getParameter("uid");
    String yr=request.getParameter("yr");
    session.setAttribute("uid",uid) ;
    session.setAttribute("yr",yr);%>
     <a href="logout.jsp">logout</a>
    <center> <table border="0">
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
            
    <tr>
        <th><font class="d">Select what you want to update</font></th>
                <td>
                    
                    <select class="input" name="detail">
                        <option selected>Exam</option selected>
                        
                      

                    </select>
                </td>
    </tr>
    
        </table></center>
    
              <center><input  style="height:40px;font-size:14pt" type="submit" value="Submit" name="btn" ></center>         
             <% }%>  
            
            
         </form>
    </body>
</html>

<%}
else
response.sendRedirect("login.jsp");
%>