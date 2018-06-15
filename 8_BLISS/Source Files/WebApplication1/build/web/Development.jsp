<%-- 
    Document   : continuous
    Created on : Jan 12, 2017, 4:44:16 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" ></jsp:include>
    <%@page import="query1.*" %>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table  align="center" border="1">
            <h1 align="center"><u><b>Development /Members of advisory/ Organizing /Technical Committee of a /Conference elsewhere,development of modules/tests</b></u></h1>
             <tr>
                 <th bgcolor="pink" size="30">Title</th>
            
                  <th bgcolor="pink" size="30">Place</th>
            
           
                  
               <th bgcolor="pink">Date & Details</th>
            
                   
              <th bgcolor="pink">Credit Points</th>
            
            
                   
                  
             </tr>
        
             <%
                 try{
               
             percon q=new percon();
ResultSet rs=null,rs1=null;
       rs= q.get_data("select * from continuous where uid='"+session.getAttribute("userid")+"'");
   while(rs.next())
   {
                 
%>
<center>
  
             <tr >
                 <td><input size="30" type="text" value="<%=rs.getString(2)%>"></td>
            
            
                
                 <td><input size="30" type="text" value="<%=rs.getString(3)%>"></td>
            
                 
                 <td><input size="30" type="text" value="<%=rs.getString(4)%>"> </td>
            
                
                 <td><input size="30" type="text" value="<%=rs.getString(5)%>"></td>
            </tr>
           <% }%>
</center>
        </table>
           
        
       
          
          
    </body>
</html>
<% } catch(Exception e)
        {
        
        }
%>
<jsp:include page="Footer.jsp" ></jsp:include>
  
