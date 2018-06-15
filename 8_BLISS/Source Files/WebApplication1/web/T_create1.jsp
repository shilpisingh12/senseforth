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
    <a href="T_create1.jsp"></a>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <%
              try
              {
              NewClass q=new NewClass();
             if (request.getParameter("btn")!= null)
           { //out.println("success");
           String detail=request.getParameter("detail");
               String detail1=request.getParameter("detail1");
                   String detail2=request.getParameter("detail2");
                   String cont_ass=request.getParameter("cont_ass");
               if(session.getAttribute("detail").equals("class"))
               {   
                   //out.println("success");
 String str1="update continuous set class='"+detail+"' where uid='"+session.getAttribute("uid")+"' and class='"+detail1+"' and course='"+detail2+"' and Year="+session.getAttribute("yr")+"";
            

         int s=q.update_data(str1);  
        
           }
             if(session.getAttribute("detail").equals("course"))
               {   
                   //out.println("success");
 String str1="update continuous set course='"+request.getParameter("detail")+"' where uid='"+session.getAttribute("uid")+"' and class='"+request.getParameter("detail1")+"' and course='"+request.getParameter("detail2")+"' and Year='"+session.getAttribute("yr")+"'";
            
            

         int s=q.update_data(str1);      
         
              //out.println("success");
           }
           if(session.getAttribute("detail").equals("nos"))
       {
         //out.println("success");
            String str="update continuous set nos="+request.getParameter("nos")+" where uid='"+session.getAttribute("uid")+"'and class='"+detail1+"' and course='"+detail2+"'and Year='"+session.getAttribute("yr")+"'";
       
          int s=q.update_data(str);
          //out.println("success");
          
              }
                  if(session.getAttribute("detail").equals("cont_ass"))
       {
         //out.println("success");
            String str="update continuous set cont_ass='"+cont_ass+"' where uid='"+session.getAttribute("uid")+"'and class='"+detail1+"' and course='"+detail2+"' and Year='"+session.getAttribute("yr")+"'";
       
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
