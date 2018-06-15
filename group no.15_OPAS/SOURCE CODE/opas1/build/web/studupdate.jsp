<%@page import="java.sql.*" %>
<%@page import="query1.*"%>
<html>
    <head>
        <title> your record successfully updated</title>
    </head>  
    <body>
        <h1 align="center"><b> UR RECORD ARE SUCESSFULLY UPDATED</b></h1> 
<marquee>UR ARE SUCESSFULLY UPDATED</marquee>
</body>
</html>






<%  
   
String eno=request.getParameter("id");
String idk=request.getParameter("name");
//out.println(eno);
NewClass q=new NewClass();
    if (request.getParameter("submit1")!= null)
    {   
         
        //   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          // Connection conn=DriverManager.getConnection("Jdbc:Odbc:mydsn");  
   // PreparedStatement ps=conn.prepareStatement("update stud1 set fname='"+idk+"' where id='"+eno+"' ");
   //  ps.executeUpdate();
        
      //  out.println("success");
        String str="update stud1 set fname='"+idk+"' where id='"+eno+"' ";
        int s=q.delete_data(str);
         //out.println("record updated successfully");
        // out.println(s);
   
    }
%>