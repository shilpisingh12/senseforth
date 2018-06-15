<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*" %>
<%
    if(session.getAttribute("userid")!=null)
    {
        %>
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>INTERFACE PAGE</title>
        <style type="text/css">
        .p
        {
           background-color:lightslategray;
        }
       </style>
        <script>
             function preventBack(){window.history.forward();}
            setTimeout("preventBack()",0);
            window.onunload=function(){null};
            </script>
    </head>
    <frameset rows="20%,71%,*" >
        <frame class="p" src="header1.jsp" allowTransparency="true"></frame>
        <frameset cols="10%,*">
            <frame src="A_link.jsp">
                
            </frame>
            <frame name="f1"></frame>
            
        </frameset>
        
  <frame class="p" src="Footer.jsp" allowTransparency="true"></frame>
    </frameset>
   
</html>
<%}
else
response.sendRedirect("login.jsp");
%>