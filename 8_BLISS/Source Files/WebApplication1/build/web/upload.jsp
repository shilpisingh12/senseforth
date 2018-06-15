<%-- 
    Document   : upload
    Created on : Mar 23, 2017, 10:30:55 PM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="upload" method="post" action="attach1.jsp"  enctype="multipart/form-data" > 
            
    <center>
        <input type="file"  name="img_file"  id="img_file" ><br><br>
        <input type="submit" value="submit" name="submit">
        </center>
            <%
                if (request.getParameter("submit") != null)
       {
  
    //String yr=(String)session.getAttribute("yr");
    //out.println(yr);
       }
    %>
        </form>
    </body>
</html>
