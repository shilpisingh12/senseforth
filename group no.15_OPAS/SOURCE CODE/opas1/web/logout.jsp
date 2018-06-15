
<%@page import="java.sql.*"%>
<%@page import="query1.*"%>

<%    
     try
    {
     // if (request.getParameter("logout") != null)
      // {
    session.removeAttribute("userid");
    session.invalidate();
   
    
          response.sendRedirect("login.jsp");
    
       //}
           
    }  
catch(Exception e)
    {
        e.printStackTrace();
    }

%>
   
