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
    <body bgcolor="silver">
        <a href="p_hod.jsp" target="f2"><font size="3px">Personal_Details</font></a>&nbsp;&nbsp;&nbsp;
         <a href="h_continuous.jsp" target="f2"><font size="3px">Continuous_Ass</font></a>&nbsp;&nbsp;&nbsp;
        <a href="h_otheracadmic_respo.jsp" target="f2"><font size="3px">Academic_Details</font></a>&nbsp;&nbsp;&nbsp;
        <a href="h_departmental_respo.jsp" target="f2"><font size="3px">Departmental_Responsibilities</font></a>&nbsp;&nbsp;&nbsp;
         <a href="h_invigilation.jsp" target="f2"><font size="3px">Invigilation</font></a>&nbsp;&nbsp;&nbsp;
          <a href="h_institutional_respo.jsp" target="f2"><font size="3px">Institution_responsibilities</font></a>&nbsp;&nbsp;&nbsp;
           <a href="h_workshop.jsp" target="f2"><font size="3px">Workshop</font></a>&nbsp;&nbsp;&nbsp;
           <a href="h_download.jsp" target="f2"><font size="3px">Documents</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <!-- <a href="logout.jsp" target="f4"><font size="3px">Logout</font></a>-->
        
    </body>
</html>
 <%}
else
response.sendRedirect("login.jsp");
%>