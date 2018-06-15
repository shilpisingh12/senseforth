<%-- 
    Document   : f_link
    Created on : Feb 7, 2017, 11:52:40 AM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% if(session.getAttribute("userid")!=null)
{
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function preventBack(){window.history.forward();}
            setTimeout("preventBack()",0);
            window.onunload=function(){null};
            </script>
    </head>
    <body bgcolor="ac2d9f">
        <a href="personal.jsp" target="f2"><font size="3px" color="white">Personal_Details</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <a href="continuous.jsp" target="f2"><font size="3px" color="white">Continuous_Assessment</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="otheracadmic_respo.jsp" target="f2"><font size="3px" color="white">Academic_Details</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="departmental_respo.jsp" target="f2"><font size="3px" color="white">Departmental_Responsibilities</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <a href="invigilation.jsp" target="f2"><font size="3px" color="white">Invigilation</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <a href="institutional_respo.jsp" target="f2"><font size="3px" color="white">Institution_responsibilities</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
           <a href="work.jsp" target="f2"><font size="3px" color="white">Workshop</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
           <a href="upload.jsp" target="f2"><font size="3px" color="white"> Document</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <!-- <a href="logout.jsp" target="_top"><font size="4px">Logout</font></a>-->
        
    </body>
</html>
 <%}
else
response.sendRedirect("login.jsp");
%>