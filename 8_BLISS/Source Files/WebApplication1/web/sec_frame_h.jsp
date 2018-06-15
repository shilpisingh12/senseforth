<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<% if(session.getAttribute("userid")!=null)
{
%>
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>INTERFACE PAGE</title>
        <script>
             function preventBack(){window.history.forward();}
            setTimeout("preventBack()",0);
            window.onunload=function(){null};
            </script>
    </head>
    
    <frameset rows="10%,*">
        <frame src="form_link_h.jsp" scrolling="no"></frame>
        <frame name="f2" src="p_hod.jsp">
                
            </frame>
            
            
        </frameset>
        
     
</html>

<% 
    if(request.getParameter("submit")!=null)
    {
     String userid=request.getParameter("uid");
     session.setAttribute("uid",userid); 
      String year=request.getParameter("yr");
     session.setAttribute("yr",year); 
    }  
// session.getAttribute("userid");
   %>
  <%}
else
response.sendRedirect("login.jsp");
%>