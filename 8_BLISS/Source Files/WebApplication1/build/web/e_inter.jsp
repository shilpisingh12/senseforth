

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*" %>
<%@page import="query1.*" %>
<% if(session.getAttribute("userid")!=null)
{
%>
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
    <body>
    <a href="logout.jsp">logout</a>     
        <form name="e_inter" method="post"  action="einsert.jsp">
            
            
        
        
   
    
    <center>
         <h1 align="center"><b class="p1">Invigilation</b></h1>
           
           <table   border="1">
               <tr>
                  <th class="d" bgcolor="silver"  size="30">Exam</th> 
               
            
                   <th class="d" bgcolor="silver" size="30">Invigilation_Duties</th>
            
           
                  
                   <th class="d" bgcolor="silver" size="30">Duties_Attended</th>
            
                   
                   <th class="d" bgcolor="silver"  size="30">Unauthorized_Absent</th>
                    <th class="d" bgcolor="silver"  size="30">Quality_of_Invigilation</th> 
              </tr>
             
                      
            
                          
             <% 
                try    
                    
            {
                
       ResultSet rs=null,rs1=null; 
       
  
       if (request.getParameter("submit")!= null)
       {
          
           String uid=request.getParameter("uid");
    String yr=request.getParameter("yr");
    session.setAttribute("uid",uid) ;
    session.setAttribute("yr",yr);
     
                 
               
          NewClass q=new NewClass();            
       rs= q.get_data("select * from invigilation where  uid='"+uid+"' and Year='"+yr+"'");
   while(rs.next())
   {
                 
%>
            
             <tr>
                 <td><input class="input" size="20" type="text" value="<%=rs.getString(2)%>"></td>
            
            
                
                 <td><input class="input" size="25" type="text" value="<%=rs.getString(3)%>"></td>
            
                 
                 <td><input class="input" size="20" type="text" value="<%=rs.getString(4)%>"> </td>
                  <td><input class="input" size="30" type="text" value="<%=rs.getString(5)%>"></td>
                   <td><input class="input" size="30" type="text" value="<%=rs.getString(6)%>"></td>
                
            </tr>
           <% }%>
        </table>
            </center>
        <br>
        <br>
        <br>
            <center><input style="height:40px;font-size:14pt" type="submit" value="insert" name="submit"/>
                <input style="height:40px;font-size:14pt" type="submit" value="Update" name="submit1"/><center>
                    
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



<%}
else
response.sendRedirect("login.jsp");
%>