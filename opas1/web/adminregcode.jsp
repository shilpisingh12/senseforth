
<!DOCTYPE html>
<%@page import="java.sql.*" %>
<%@page import="query1.*"%>
<html>
    <head>
        <title> your record successfully updated</title>
    </head>  
    <body>
        <h1 align="center"><b> UR  ARE SUCESSFULLY REGISTERED</b></h1> 
<marquee>UR ARE SUCESSFULLY REGISTERED</marquee>
</body>
</html>



<%
    String u_n=request.getParameter("u_name");
    String u_id=request.getParameter("u_id");
    String em=request.getParameter("email");
    String mob=request.getParameter("mob_no");
    if(request.getParameter("submit")!=null)
    {
         NewClass q=new NewClass();
         String str= "insert into adminn(user_name,user_id,email,mob_no)values('"+u_n+"','"+u_id+"','"+em+"','"+mob+"')";
         int x=q.insert_data(str); 
          //out.print("You have successfully Registered yourself");
    }
    %>