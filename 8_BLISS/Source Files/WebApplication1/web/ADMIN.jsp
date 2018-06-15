<%--
    Document   : personal
    Created on : Jan 18, 2017, 10:05:56 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="query1.*" %>
<jsp:include page="header.jsp" ></jsp:include>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body >
        <h1 align="center"><b><u>Personal Detail</u></b></h1>
        <form name="Personal" >
            <table align="center">
            <% try
            {
                 
percon q=new percon();
ResultSet rs=null;
       rs= q.get_data("select * from personal_details where F_id='"+session.getAttribute("userid")+"'");
            
%>

<%

                if(rs.next())
                {
                
                
                    %>
                
                
                <tr><td>Faculty id</td>
                    <td><input type="text" name="faculty" value="<%=rs.getString(1)%>" /></td>
                </tr>
                <tr><td>Name</td>
                    <td><input type="text" name="Name" value="<%=rs.getString(2)%>" /></td>
                </tr>
                <tr><td>Designation</td>
                    <td><input type="text" name="Designation" value="<%=rs.getString(3)%>" /></td>
                </tr>
                <tr><td>Salary</td>
                    <td><input type="text" name="Salary" value="<%=rs.getString(4)%>" /></td>
                </tr>
                <tr><td>Gender</td>
                    <td>   <input type = "text" name = "gender" value ="<%=rs.getString(5)%>" /></td>
                </tr>
            </table>
        </form>
      
    </body>
    
   
    
    <jsp:include page="Footer.jsp" ></jsp:include>
</html>
<% }} catch(Exception e)
        {
        
        }%>


  
  

  
  
    

