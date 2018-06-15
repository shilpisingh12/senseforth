<%-- 
    Document   : timetable
    Created on : Mar 29, 2017, 6:00:29 PM
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
    </head>
    <body>
        <form name="continuous" method="get">
        <table align="center" border="1">
            <h1 align="center"><b class="p1">Time Table</b></h1>
             <tr>
                 <th class="d" bgcolor="silver">Days</th>
            
                  <th class="d" bgcolor="silver">9:00-10:00</th>
            
           
                  
               <th class="d" bgcolor="silver">10:00-11:00</th>
            
                   
              <th class="d" bgcolor="silver">11:00-12:00</th>
            
           <th class="d" bgcolor="silver">12:00-1:00</th>
            <th class="d" bgcolor="silver">1:00-3:00</th>
             <th class="d" bgcolor="silver">3:00-4:00</th>
              <th class="d" bgcolor="silver">4:00-5:00</th>
                   
                  
             </tr>
        
      <% try
      {
          boolean status=false;
      
NewClass q=new NewClass();
ResultSet rs=q.get_data("select * from timetable1");
status=rs.next();
      while(rs.next())
   {
                 
%>
<center>
  
             <tr >
                 <td><input  class="input" size="30" type="text" height="10" value="<%=rs.getString(1)%>"></td>
            
            
                
                 <td><input class="input" size="30" type="text" value="<%=rs.getString(2)%>"></td>
            
                 
                 <td><input class="input" size="30" type="text" value="<%=rs.getString(3)%>"></td>
            
                
                 <td><input class="input" size="40" type="text" value="<%=rs.getString(4)%>"></td>
                    <td><input class="input" size="40" type="text" value="<%=rs.getString(5)%>"></td>
                       <td><input class="input" size="40" type="text" value="<%=rs.getString(6)%>"></td>
                          <td><input class="input" size="40" type="text" value="<%=rs.getString(7)%>"></td>
                          <td><input class="input" size="40" type="text" value="<%=rs.getString(8)%>"></td>
                          
            </tr>
            
           <% }%>
           
</center>
        </table>
            
           
        
       
        </form>     
          
    </body>
</html>
<% }
catch(Exception e)
        {
        
        }%>
    </body>
</html>
