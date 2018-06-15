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
           {
               if(session.getAttribute("detail").equals("Medical"))
               {   
                   //out.println("success");
 String str1="update login1 set Medical='"+request.getParameter("m")+"' where uid='"+session.getAttribute("uid")+"' and Year='"+session.getAttribute("yr")+"'";
            

         int s=q.update_data(str1); 
         String str2="update login1 set Total=('"+session.getAttribute("v2")+"'+'"+session.getAttribute("v3")+"'+'"+request.getParameter("m")+"') where uid='"+session.getAttribute("uid")+"' and Year='"+session.getAttribute("yr")+"'";
  
 int s1=q.update_data(str2);
         
           }
         if(session.getAttribute("detail").equals("Earn"))
      {
          String duty=request.getParameter("el");
          
         
String str="update login1 set Earn ='"+duty+"' where uid='"+session.getAttribute("uid")+"' and Year='"+session.getAttribute("yr")+"'";
            
       
          int s=q.update_data(str);
        
           String str2="update login1 set Total=('"+session.getAttribute("v1")+"'+'"+session.getAttribute("v3")+"'+'"+duty+"') where uid='"+session.getAttribute("uid")+"' and Year='"+session.getAttribute("yr")+"'";
  
 int s1=q.update_data(str2);
              }
         if(session.getAttribute("detail").equals("Casual"))
      {String c=request.getParameter("c");
         
String str="update login1 set Casual ='"+c+"' where uid='"+session.getAttribute("uid")+"' and Year='"+session.getAttribute("yr")+"'";
            
       
          int s=q.update_data(str);
           String str2="update login1 set Total=('"+session.getAttribute("v2")+"'+'"+session.getAttribute("v1")+"'+'"+c+"') where uid='"+session.getAttribute("uid")+"' and Year='"+session.getAttribute("yr")+"'";
  
 int s1=q.update_data(str2);
          
          
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
