<%-- 
    Document   : logout
    Created on : Feb 28, 2017, 11:59:27 PM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% session.removeAttribute("userid");
session.setAttribute("userid",null);

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script type="text/javascript">
             
   
        top.location.href="login.jsp";
      // window.history.forward(0);
   
            </script>
    </head>
    <body>
        <form name="logout">
           <%-- response.sendRedirect("login.jsp");--%>
        </form>
    </body>
</html>
