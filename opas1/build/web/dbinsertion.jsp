<%-- 
    Document   : dbinsertion
    Created on : Feb 10, 2017, 4:59:44 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="query1.*"%>
<!DOCTYPE html>
 <%
           String userid=request.getParameter("name");
           String role=request.getParameter("role");
           String password=request.getParameter("password");
           String ques=request.getParameter("qn");
           String ans=request.getParameter("a");
           
           try
       {
           
           if(request.getParameter("btn_submit")!=null)
           {
           NewClass q=new NewClass();
           boolean stat=false;
           String dcheck_q="select * from login where uid='"+userid+"'and pwd='"+password+"'";
           ResultSet rs=q.get_data(dcheck_q);
           //boolean stat=false;
          // out.println(userid);
           stat=rs.next();
           if(stat)
           {
               response.sendRedirect("register.jsp");
              // out.println("record already present");
              // alert("record already present");
           
           }
           else
           {
             out.println(userid);
           String str="insert into login(uid,role,pwd,q,a)values('"+userid+"','"+role+"','"+password+"','"+ques+"','"+ans+"')";
                  q.insert_data(str); 
                  response.sendRedirect("login.jsp");
               //out.println("<script>alert('record already present')</script>");  
                
           }
       }
     }
           catch(Exception ex)
{
 ex.printStackTrace();
}

%>