<%-- 
    Document   : h_interface
    Created on : Feb 10, 2017, 10:04:14 PM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="query1.*" %>
<!DOCTYPE html>
<%
     if(session.getAttribute("userid")!=null)
    {
        %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center"><b><u>Personal Detail</u></b></h1>
        <form name="Personal" method="post"  action="continuous.jsp" >
            <table align="center">
        <%
            if (request.getParameter("submit") != null)
       {
        String userid1=request.getParameter("id");
            try
            {
            session.setAttribute("userid1",userid1);     
percon q=new percon();
ResultSet rs=null,rs1=null;

       rs= q.get_data("select * from personal_details where uid='"+userid1+"'");
   
        
      
                if(rs.next())
                {
                
                
                    %>
                
                
                    <tr><td><u><b><h3>Faculty id</h3></b></u></td>
                    <td><input type="text" name="faculty" value="<%=rs.getString(1)%>" /></td>
                </tr>
                <tr><td><h3><u><b>Name</b></u></h3></td>
                    <td><input type="text" name="Name" value="<%=rs.getString(2)%>" /></td>
                </tr>
                <tr><td><h3><u><b>Designation</b></u></h3></td>
                    <td><input type="text" name="Designation" value="<%=rs.getString(3)%>" /></td>
                </tr>
                
                <tr><td><h3><u><b>Gender</b></u></h3></td>
                    <td>   <input type = "text" name = "gender" value ="<%=rs.getString(5)%>" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="next"  /></td>
                    
                      
                </tr>
                
            </table>
            
       
    </form>
    </body>
    
  
    
</html>


<% }
} 

catch(Exception e)
        {
        
        }
}
 
%>
       
<%}
else
response.sendRedirect("login.jsp");
%>