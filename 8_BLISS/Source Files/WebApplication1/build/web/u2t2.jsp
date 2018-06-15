<%-- 
    Document   : u1t1.jsp
    Created on : Mar 29, 2017, 7:25:33 PM
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
        <%   if((request.getParameter("sub") != null))
                      {
                         // out.println("success");
                           String v0=request.getParameter("0");
           String v1=request.getParameter("1");
           String v2=request.getParameter("2");
           String v3=request.getParameter("3");
           String v4=request.getParameter("4");
            String v5=request.getParameter("5");
           String v6=request.getParameter("6");
           String v7=request.getParameter("7");
           
          
                 
                  
                  try
            { 
          NewClass q=new NewClass();
         String str="update timetable set _9_to_10='"+v1+"', _10_to_11='"+v2+"' ,_11_to_12='"+v3+"', _12_to_1='"+v4+"',_1_to_3='"+v5+"', _3_to_4='"+v6+"',_4_to_5 ='"+v7+"' where Days='"+v0+"'";
         
            
  //String str="update timetable set t='"+v1+"' where Days='"+v0+"' " ;
         int s=q.update_data(str);  
                     
    
             
             }
            catch(Exception e)
            {
            System.out.println(e);
            }
                      }     %>   
                
    </body>
</html>
