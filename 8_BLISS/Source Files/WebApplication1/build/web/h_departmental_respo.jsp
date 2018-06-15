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
                font-size:15pt;font-style:normal;font-weight:bolder;height:60px 
            }
            body{
                background-color:beige            }
        </style>
    <body>
        <form name="h_departmental_respo" method="get">
        <table  align="center" border="1">
            <h1 align="center"><b class="p1"><b>Departmental_Responsibilities</b></h1>
             <tr>
                 
            
                  <th class="d" bgcolor="silver">Details</th>
            
           
                  
               <th  class="d" bgcolor="silver">Credit_Points</th>
            
                   
          
            
            
                   
                  
             </tr>
        
             <%
                 try{
               
             percon q=new percon();
ResultSet rs=null,rs1=null;
       rs= q.get_data("select * from departmental_respo where uid='"+session.getAttribute("uid")+"'and Year='"+session.getAttribute("yr")+"'");
   while(rs.next())
   {
                 
%>
<center>
  
             <tr >
                 <td><input class="input" size="30" type="text" size="30" value="<%=rs.getString(2)%>"></td>
            
            
                
                 <td><input class="input" size="30" type="text" size="30" value="<%=rs.getString(3)%>"></td>
            
                 
                
            
                
                 
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
//session.getAttribute("uid");
//session.getAttribute("yr");
%>

  
