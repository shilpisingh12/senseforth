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
              {
              NewClass q=new NewClass();
             if (request.getParameter("btn")!= null)
           {//out.println("success");
               if(session.getAttribute("detail").equals("Salary"))
               {   
                   //out.println("success");
 String str1="update personal_details set Salary='"+request.getParameter("sal")+"' where uid='"+session.getAttribute("uid")+"' and Year='"+session.getAttribute("yr")+"'";
            

         int s=q.update_data(str1);      
         
             // out.println("success");
           }
         if(session.getAttribute("detail").equals("Designation"))
      {String duty=request.getParameter("desig");
         
String str="update personal_details set Desig ='"+duty+"' where uid='"+session.getAttribute("uid")+"' and Year='"+session.getAttribute("yr")+"'";
            
       
          int s=q.update_data(str);
          
          
              }
         
                }
             
              }
              catch(Exception e)
              {
                  
              }
               out.println("DATA UPDATED SUCCESSFULLY");
              %>
    </body>
</html>
