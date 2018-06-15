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
           
          
                  out.println(v1);
                  out.println(v0);
                  
                  try
            { 
          NewClass q=new NewClass();
         //String str1="update timetable1 set 9:00-10:00='"+v1+"', 10:00-11:00='"+v2+"' , 11:00-12:00='"+v3+"', 12:00-1:00='"+v4+"',1:00-3:00='"+v5+"', 3:00-4:00='"+v6+"', 4:00-5:00='"+v7+"' where Days='"+v0+"'";
            
  String str="update login2 set 9:00-10:00='"+v1+"' where Days='"+v0+"' " ;
         int s=q.update_data(str);  
                      out.println(s);

    
              out.println("success");
             }
            catch(Exception e)
            {
            System.out.println(e);
            }
                      }     %>   
                
    </body>
</html>
