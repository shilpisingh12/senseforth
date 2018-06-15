

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="query1.*" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <style type="text/css">
            .p1{
                 font-family:Andalus;font-size:50px;font-weight:bold
               }
            input{
                height:30px;font-size:14pt;
            }
            .d{
                font-size:15pt;font-style:normal;font-weight:bolder ;height:30px
            }
            body{
                background-color:beige
            }
        </style>
    </head>
   
    <body>
    <a href="logout.jsp">logout</a>
        <form name="l_inter" method="post"  action="linsert.jsp">
            
            
        
            <% 
                try    
                    
            {
                
            
                 
  
   
       ResultSet rs;//=null,rs1=null; 
       
  
       if (request.getParameter("submit")!= null)
       {
     
           String uid=request.getParameter("uid");
    String yr=request.getParameter("yr");
    session.setAttribute("uid",uid) ;
    session.setAttribute("yr",yr);%>
     
            <% 
             NewClass q=new NewClass();
              boolean status=false;%>
             
           <table  align="center" border="1">
            <h1 align="center"><b class="p1">Leave</b></h1>
            <tr>   
            
            <th class="d" bgcolor="silver" size="30">Medical Leave</th>
            <th class="d" bgcolor="silver" size="30">Earn Leave</th>
            <th class="d" bgcolor="silver" size="30">Casual Leave</th>
            <th class="d" bgcolor="silver" size="30">Total Leave Taken</th></tr>
             <%
                 
               
                
       rs= q.get_data("select * from login1 where uid='"+uid+"' and Year="+yr+" ");
 if(rs.next())
     
   {
                
%>

             <tr>
                 <td><input class="input"  size="30" type="text" name="1" value="<%=rs.getString(2)%>"></td>
            
            
                
                 <td><input class="input"  size="20" type="text" name="2" value="<%=rs.getString(3)%>"></td>
            
                 
                 <td><input class="input"  size="20" type="text" name="3" value="<%=rs.getString(4)%>"> </td>
               <td><input class="input" size="20" type="text" name="4" value="<%=rs.getString(5)%> "> </td>
            </tr>
          <%}%>
         
        </table>
          <br>
          <br>
          <center> <input style="height:40px;font-size:14pt" type="submit" value="insert" name="submit"/>
              <input style="height:40px;font-size:14pt" type="submit" value="Update" name="submit1"/></center>

          <%   }
}
            catch(Exception e)
            {
            out.println(e);
            }
                  %>
        </form>
    </body>
</html>