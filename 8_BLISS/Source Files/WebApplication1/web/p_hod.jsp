<%--
    Document   : personal
    Created on : Jan 18, 2017, 10:05:56 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="query1.*" %>
<% if(session.getAttribute("userid")!=null)
{
%>
<%--<jsp:include page="header.jsp" ></jsp:include>--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style type="text/css">
            .p1{
                color:indigo; font-family:Andalus;font-size:50px;font-weight:bold
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
    <body>
    <center><b class="p1">Personal Detail</b></center>
        <form name="p_hod" method="post"  >
            <table align="center">
            <% 
                try
            {
                 
                         
percon q=new percon();
ResultSet rs=null,rs1=null; 
       //rs= q.get_data("select * from personal_details where uid='"+session.getAttribute("uid") +"'");
   
       rs= q.get_data("select * from personal_details where uid='"+session.getAttribute("uid") +"'and Year='"+session.getAttribute("yr")+"'");  
       %>
       

<%

                if(rs.next())
                {                              
                    %>                    
                    <tr><td><u><b><h2>Faculty id</h2></b></u></td>
                    <td><input class="input" type="text" name="faculty" value="<%=rs.getString(1)%>" /></td>
                </tr>
                <tr><td><h2><u><b>Name</b></u></h2></td>
                    <td><input class="input" type="text" name="Name" value="<%=rs.getString(2)%>" /></td>
                </tr>
                <tr><td><h2><u><b>Designation</b></u></h2></td>
                    <td><input class="input" type="text" name="Designation" value="<%=rs.getString(3)%>" /></td>
                </tr>
                
                <tr><td><h2><u><b>Gender</b></u></h2></td>
                    <td>   <input class="input" type = "text" name = "gender" value ="<%=rs.getString(5)%>" /></td>
                </tr>
                </table>
                
            </form>
      
    </body>
    
  
    
</html>
<% }} catch(Exception e)
        {
        
        }
%>
 <%}
else
response.sendRedirect("login.jsp");
%>
<%--
     String userid=request.getParameter("uid");
     session.setAttribute("uid",userid); 
      String year=request.getParameter("yr");
     session.setAttribute("yr",year); 
         
// session.getAttribute("userid");
   
--%>
  
 

  
  
    

