<%@page import="java.sql.*" %>
<%@page import="query1.*"%>
<jsp:include page="header.jsp" ></jsp:include>
    
<%
     String s=request.getParameter("id");
     String r=request.getParameter("qn");
     String a=request.getParameter("a");
    try
    {
       
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opas","root","");
        Statement stmt=con.createStatement();
        boolean status=false;
        NewClass q=new NewClass();
        String dchecke_q="select * from login where uid='"+s+"' and q='"+r+"'and a='"+a+"'";
        ResultSet rs=q.get_data(dchecke_q);
        status=rs.next();
        //out.println(status);
        if(status)
         {
        String p="select pwd from login where uid='"+s+"' and q='"+r+"'and a='"+a+"'";
        //status=rs.next();
        ResultSet rsp=stmt.executeQuery(p);
	while(rsp.next())
               {
                out.print("\n\n\n\n\nYOUR PASSWORD IS="+rsp.getString(1)+"\n\n\n\n\n\n\n\n\n\n\n\n");
                    //out.print("<br>");
               }  
        }
        else
        {
            //System.out.println("wrong id");
            out.println(status);
            response.sendRedirect("forgetpassword.jsp");
        }
    }
        catch(Exception e)
    {
        e.printStackTrace();
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>forget password</title>
    </head>
    <body >
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
     <div>
                 <img src="footer.jpg">
</div> 
        <head>
        </html>