<%-- 
    Document   : workshop
    Created on : Feb 13, 2017, 10:53:11 AM
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
                font-family:Andalus;font-size:50px;font-weight:bold

            }
            input{
                height:50px;font-size:12pt;
            }
            .d{
                height:60px;font-size:15pt;font-style:normal;font-weight:bolder 
            }
            body{
                background-color:beige
            }
        </style>
        
            </head>
        
    <body>
        <form name="workshop" method="get">
        <center><h1><b class="p1">Participation in Conference/Symposia/Workshop/Seminars</b></h1></center>  
        <table  border="1" align="center">
            <tr>
               <th class="d" bgcolor="silver">Title</th>
               <th class="d" bgcolor="silver">Place</th>
               <th class="d" bgcolor="silver">Date</th>
               <th class="d" bgcolor="silver">Details</th>
               <th class="d" bgcolor="silver">Credit points</th>
            </tr>
           
              <%
                  
                  
                 try{
                     
               
             percon q=new percon();
ResultSet rs=null,rs1=null;
      rs= q.get_data("select * from workshop where uid='"+session.getAttribute("userid")+"'and Year="+session.getAttribute("year1")+"");
  if(rs.next())
  {
   do
   {
  



%>

            
            
             <tr>
                 <td><input class="input" size="20" type="text" height="10" value="<%=rs.getString(2)%>"></td>
            
                 <td><input class="input" size="20" type="text" value="<%=rs.getString(3)%>"></td>
            
                 <td><input class="input" size="20" type="text" value="<%=rs.getString(4)%>"> </td>
            
                 <td><input class="input" size="20" type="text" value="<%=rs.getString(5)%>"></td>
                 
                 <td><input class="input" size="20" type="text" value="<%=rs.getString(7)%>"></td>
                  
             </tr>
            
             
             
           <% 
               }
while(rs.next());%>
 
<%  if (request.getParameter("submit") != null)
{
    response.sendRedirect("complete.jsp");
}
    }

          
           
           
               else 
               {
             
            response.sendRedirect("work.jsp");
              
              %>
<%   } %>       
              
        </table><br><br>
         <center>  <input style="height:40px;font-size:14pt" type="submit" value="submit" name="submit"/> </center>
        </form>     
       <%               
          } catch(Exception e)
        {
        
        }
 session.getAttribute("userid");
session.getAttribute("year1");
%>

           
    </body>
</html>
<%}
else
response.sendRedirect("login.jsp");
%>

  