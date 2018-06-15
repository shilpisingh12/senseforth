

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*" %>
<%@page import="query1.*" %>
<%--<jsp:include page="header.jsp" ></jsp:include>--%>

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
                font-size:20pt;font-style:normal;font-weight:bolder 
            }
            body{
                background-color:beige
            }
        </style>
        
    </head>
    <body bgcolor="beige">
    
        <form name="T_interface" method="post"  action="T_insert.jsp">
            
            
        
            <% 
                try    
                    
            {
                
            
                 
  
   
       ResultSet rs=null,rs1=null; 
       
  
       if (request.getParameter("submit")!= null)
       {
           String uid=request.getParameter("uid");
    String yr=request.getParameter("yr");
    session.setAttribute("uid",uid) ;
    session.setAttribute("yr",yr);%>
     
    
    <a href="logout.jsp">logout</a>
           <table  align="center" border="1">
            <h1 align="center"><b class="p1">Continuous</b></h1>
             <tr>
                 
                  <th class="d" bgcolor="silver" size="30">Class</th>
            
                   <th class="d" bgcolor="silver" size="30">Course</th>
            
           
                  
                   <th class="d" bgcolor="silver" size="30">Nos</th>
            
                   
                   <th class="d" bgcolor="silver" size="30">Cont_ass</th>
             </tr>
             <%
                 
               
          NewClass q=new NewClass();            
       rs= q.get_data("select * from continuous where  uid='"+uid+"' and Year="+yr+"");
   while(rs.next())
   {
                 
%>

             <tr>
                 <td><input class="input" size="30" type="text" value="<%=rs.getString(2)%>"></td>
            
            
                
                 <td><input class="input" size="20" type="text" value="<%=rs.getString(3)%>"></td>
            
                 
                 <td><input class="input" size="15" type="text" value="<%=rs.getString(4)%>"> </td>
                  <td><input class="input" size="20" type="text" value="<%=rs.getString(5)%>"></td>
                   
                
            </tr>
           <% }%>
         
        </table>
           <br>
           <center>
            <input style="height:40px;font-size:14pt" type="submit" value="insert" name="submit"/>
          <input style="height:40px;font-size:14pt" type="submit" value="Update" name="submit1"/>
          <a href="time.jsp" target="p1">Click to view time-table</a>
           </center>
          <%   }
}
            catch(Exception e)
            {
            System.out.println(e);
            }
                  %>
        </form>
    </body>
</html>

