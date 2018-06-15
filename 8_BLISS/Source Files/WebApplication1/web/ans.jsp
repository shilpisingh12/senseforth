<%-- 
    Document   : ans.jsp
    Created on : Feb 9, 2017, 12:44:11 AM
    Author     : Inspiron_15_5000
--%>

<jsp:include page="header.jsp" ></jsp:include>
    <%@page import="query1.*" %>
<%@page import="java.sql.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%   
            try
            {
                
            percon q=new percon();
                      boolean status=false;
 ResultSet rs1=q.get_data("select * from login where uid='"+session.getAttribute("userid")+"'");
status=rs1.next();
if(status==true)
{ 
%>
     <input type="text" value="<%=rs1.getString(2)%>" name="txt">   
    </body>
</html>
<%
    }
}
catch(Exception e)
        {
        
        }
%>

