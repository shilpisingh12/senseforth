<%-- 
    Document   : continuous
    Created on : Jan 12, 2017, 4:44:16 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@page import="query1.*" %>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style type="text/css">
            .p1{
                 font-family:Andalus;font-size:50px;font-weight:bold

            }
            input{
                height:50px;font-size:12pt;
            }
            .d{
                font-size:15pt;font-style:normal;font-weight:bolder; height:60px
            }
            body{
                background-color:beige
            }
        </style>
    <body>
        <form name="h_continuous" method="post">
        <table align="center" border="1">
            <h1 align="center"><b class="p1">Continuous Assessment Table</b></h1>
             <tr>
                 <th class="d" bgcolor="silver">Class/Semester</th>
            
                  <th class="d" bgcolor="silver">Course/Paper</th>
            
           
                  
               <th class="d" bgcolor="silver">No. of Students in class</th>
            
                   
              <th class="d" bgcolor="silver">Continuous Assessment Project</th>
            
            
                   
                  
             </tr>
        
             <%
                 try{
               
             percon q=new percon();
ResultSet rs=null,rs1=null;
    //   rs= q.get_data("select * from continuous where uid='"+request.getParameter("uid")+"'and Year="+session.getAttribute("year1")+"");
       rs= q.get_data("select * from continuous where uid='"+session.getAttribute("uid") +"'and Year='"+session.getAttribute("yr")+"'");
   while(rs.next())
   {
                 
%>
<center>
  
             <tr >
                 <td><input  class="input" size="30" type="text" height="10" value="<%=rs.getString(2)%>"></td>
            
            
                
                 <td><input class="input" size="30" type="text" value="<%=rs.getString(3)%>"></td>
            
                 
                 <td><input class="input" size="30" type="text" value="<%=rs.getString(4)%>"> </td>
            
                
                 <td><input class="input" size="40" type="text" value="<%=rs.getString(5)%>"></td>
            </tr>
            
           <% }%>
           
</center>
        </table>
          
           
        
       
        </form>     
          
    </body>
</html>
<% } catch(Exception e)
        {
        
        }
// session.getAttribute("uid");
// session.getAttribute("yr");
%>

  
