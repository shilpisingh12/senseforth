<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*" %>

<!DOCTYPE html>
<%
    if(session.getAttribute("userid")!=null)
    {
        %>
    
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>INTERFACE PAGE</title>
        <style type="text/css">
        .p
        {
           background-color:silver;
        }
       </style>
    </head>
   
    <frameset rows="20%,72%,*">
        <frame class="p" src="header1.jsp" allowTransparency="true" frameborder="0" scrolling="no"></frame>
        <frameset cols="10%,*" name="f5">
             
            <frame src="f_link.jsp" frameborder="0">
                
            </frame>
             <frame name="f1" frameborder="0" src="marque1.jsp" scrolling="0" background-color="black"></frame>
            
        </frameset>
        
  <frame class="p" src="Footer.jsp" allowTransparency="true" frameborder="0" scrolling="no"></frame>
    </frameset>
        

</html>
<%}
else
response.sendRedirect("login.jsp");
%>