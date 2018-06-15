<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<% if(session.getAttribute("userid")!=null)
{
%>
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>INTERFACE PAGE</title>
         <script>
             function preventBack(){window.history.forward();}
            setTimeout("preventBack()",0);
            window.onunload=function(){null};
            </script>
    </head>
    
    <frameset rows="10%,*">
        <frame src="form_link.jsp" scrolling="no"></frame>
        <frame src="personal.jsp" name="f2">
              
            </frame>
            
             
        </frameset>
        
     
</html>
<%   }
else
response.sendRedirect("login.jsp");
%>
