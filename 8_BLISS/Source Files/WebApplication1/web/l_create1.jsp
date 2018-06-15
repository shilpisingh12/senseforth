<%-- 
    Document   : e_create1
    Created on : Feb 28, 2017, 10:02:18 AM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="query1.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <%
              try
              {ResultSet rs=null;
              NewClass q=new NewClass();
             if (request.getParameter("btn")!= null)
           {
               String var=request.getParameter("val");
               if(session.getAttribute("detail").equals("Medical"))
               {  
 String str1="update login1 set Medical='"+ var +"' where uid='"+session.getAttribute("uid")+"' and Year='"+session.getAttribute("yr")+"'";
             int s=q.update_data(str1);      

 String str2="update login1 set Total=('"+session.getAttribute("v2")+"'+'"+session.getAttribute("v3")+"'+'"+var+"') where uid='"+session.getAttribute("uid")+"' and Year='"+session.getAttribute("yr")+"'";
  
 int s1=q.update_data(str2);
 
        
         
              out.println("success");
           }%>
        <%--   else  if(session.getAttribute("detail").equals("Duties_attend"))
       {
         out.println("success");
            String str="update invigilation set Duties_attend="+request.getParameter("duty")+" where uid='"+session.getAttribute("uid")+"' and Year='"+session.getAttribute("yr")+"'";
       
          int s=q.update_data(str);
          out.println("success");
          
              }--%>
        <%}
              }
              catch(Exception e)
              {
                  
              }
              %>
    </body>
</html>
