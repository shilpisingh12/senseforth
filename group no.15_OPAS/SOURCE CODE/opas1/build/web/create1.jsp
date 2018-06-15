<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<jsp:include page="header.jsp" ></jsp:include>
<%@page import="java.sql.*" %>
<%@page import="query1.*" %>

<html>
    <head></head>
    <body>
        hello
    </body>
</html>

<%

    


try
        
 {
    
    
if (request.getParameter("submit1") != null)
       {    
    String userid=request.getParameter("name");
String uid=request.getParameter("uid");
String pwd=request.getParameter("psw");
String as=request.getParameter("ad");
boolean status=false;
NewClass q=new NewClass();
ResultSet rs=q.get_data("select * from login where uid='"+uid+"' and pwd='"+pwd+"'and role='"+as+"'");
status=rs.next();
out.println(status);
//char ch = uid.charAt(4);

char ch = uid.charAt(0);
String str= "student";
String str1="admin";


if(status && (as.equals(str)))
      {
   // if(request.getParameter("as")=="student")
//session.setAttribute("uid", uid);
           response.sendRedirect("role_student.jsp");
      }
else if(status && (as.equals(str1)))
{
 //if(request.getParameter("as")=="admin")
       // {
    response.sendRedirect("ADMIN.jsp");
      }

else
    {
    response.sendRedirect("login.jsp");
    }

    }
    }
catch(Exception e)
{
System.out.println(e);
}



%>

