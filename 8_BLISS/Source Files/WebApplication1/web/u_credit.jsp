<%-- 
    Document   : s_faculty
    Created on : Feb 10, 2017, 5:16:38 PM
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
    <form name="u_credit"><center><b class="p1">Update Credit Points</b></center>
   
          <%
              try
              {
              NewClass q=new NewClass();
             if (request.getParameter("update")!= null)
           {
               if(session.getAttribute("table1").equals("departmental_respo"))
               {   
 String str1="update departmental_respo set Credit_Points='"+request.getParameter("credit")+"' where uid='"+session.getAttribute("uid")+"' and Details='"+request.getParameter("detail")+"'and Year='"+session.getAttribute("yr")+"'";
            

         int s=q.update_data(str1);      
         
              
           }
            else  if(session.getAttribute("table1").equals("invigilation"))
       {
         
            String str="update invigilation set Obtained_cp='"+request.getParameter("credit")+"' where uid='"+session.getAttribute("uid")+"' and Year='"+session.getAttribute("yr")+"'and exam='"+request.getParameter("detail")+"'";
       
          int s=q.update_data(str);
          
              }
       else  if(session.getAttribute("table1").equals("other_academic_respo"))
       {
         
   String str="update other_academic_respo set Obtained_cp='"+request.getParameter("credit")+"' where uid='"+session.getAttribute("uid")+"'and role_respo='"+request.getParameter("detail")+"' and Year='"+session.getAttribute("yr")+"'";
           //NewClass q=new NewClass();   
           
          int s=q.update_data(str);
          
              }        
      else  if(session.getAttribute("table1").equals("other_insti_respo"))
       {
        
   String str="update other_insti_respo set Obtained_cp='"+request.getParameter("credit")+"' where uid='"+session.getAttribute("uid")+"'and Responsibilities='"+request.getParameter("detail")+"'   and Year='"+session.getAttribute("yr")+"'";
           //NewClass q=new NewClass();             
          int s=q.update_data(str);
              } 
                else  if(session.getAttribute("table1").equals("workshop"))
       {
         
   String str="update workshop set credit='"+request.getParameter("credit")+"' where uid='"+session.getAttribute("uid")+"'and details='"+request.getParameter("detail")+"'   and Year='"+session.getAttribute("yr")+"'";
           //NewClass q=new NewClass();             
          int s=q.update_data(str);
              } 
               
           } 
             
              }
              
              catch(Exception e)
        {
        
        }
             
         %>
          <h2 align="center">Data updated successfully</h2>
      </form> 
    </body>
    
</html>
