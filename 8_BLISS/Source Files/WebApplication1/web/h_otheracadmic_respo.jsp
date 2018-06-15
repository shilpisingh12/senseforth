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
                height:60px;font-size:12pt;
            }
            .d{
                font-size:15pt;font-style:normal;font-weight:bolder ;height:30px
            }
            body{
                background-color:beige
            }
        </style>
    <body>
        <form name="h_otheracadmic_respo.jsp" method="get">
        
        <table  align="center" border="1">
            
            <h1 align="center"><b class="p1" size="10">Other Academic Responsibilities</b></h1>
             <tr>
                 <th class="d" bgcolor="silver" rowspan="2">Academic body/Committee</th>
            
                  <th class="d" bgcolor="silver" rowspan="2">Meeting attended/held</th>
            
           
                  
               <th class="d"  bgcolor="silver" rowspan="2" size="20">Role & responsibilities</th>
            
                   
              <th class="d" bgcolor="silver" rowspan="2" size="10">Quality of participation</th>
              <th class="d" bgcolor="silver" colspan="2">Credit Points</th>
            
                   
                  
             </tr>
             <tr>
                 <th class="d" bgcolor="silver">Full</th>
                 <th class="d" bgcolor="silver">Obtained</th>
             </tr>
        
             <%
                 try{
               
             percon q=new percon();
ResultSet rs=null,rs1=null;
       rs= q.get_data("select * from other_academic_respo where uid='"+session.getAttribute("uid")+"'and Year='"+session.getAttribute("yr")+"'");
   while(rs.next())
   {
                 
%>
<center>
  
             <tr >
                 <td><input class="input" size="30" type="text" value="<%=rs.getString(2)%>"></td>
            
            
                
                 <td><input class="input" size="27" type="text" value="<%=rs.getString(3)%>"></td>
            
                 
                 <td><input class="input" size="28" type="text" value="<%=rs.getString(4)%>"> </td>
            
                
                 <td><input class="input" size="30" type="text" value="<%=rs.getString(5)%>"></td>
                 <td><input class="input" size="5" type="text" value="<%=rs.getString(6)%>"></td>
                 <td><input class="input" size="8" type="text" value="<%=rs.getString(7)%>"></td>
                 
            </tr>
           <% }%>
</center>
        </form>
        </table>
<br>
<br>
           

          
          
    </body>
</html>
<% } catch(Exception e)
        {
        
        }
//session.getAttribute("uid");
//session.getAttribute("yr");
%>

  
