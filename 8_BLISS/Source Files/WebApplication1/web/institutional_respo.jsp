<%-- 
    Document   : continuous
    Created on : Jan 12, 2017, 4:44:16 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <%@page import="query1.*" %>
<%@page import="java.sql.*" %>
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
                height:50px;font-size:12pt;
            }
            .d{
                font-size:15pt;font-style:normal;font-weight:bolder 
            }
            body{
                background-color:beige
            }
        </style>
        </head>
    <body>
        <form name="otheracadmic_respo" method="get" >
       <table  align="center" border="1">
           <h1 align="center"><b class="p1">Other Institutional Responsibilities Assigned</b></h1>
             <tr>
                 <th class="d" bgcolor="silver" rowspan="2" size="30">Responsibilities</th>
            
                  <th class="d"  bgcolor="silver" rowspan="2">Quality</th>
            
           
                  
               <th class="d" bgcolor="silver" colspan="2"> Credit Points</th>
            
             
             </tr>
             <tr>
                 <th class="d" bgcolor="silver"> Full</th>
                 <th class="d" bgcolor="silver">Obtained</th>
             </tr>
                       
                  
            
              <%
                 try{
               
             percon q=new percon();
ResultSet rs=null,rs1=null;
       rs= q.get_data("select * from other_insti_respo where uid='"+session.getAttribute("userid")+"'and Year="+session.getAttribute("year1")+"");
   while(rs.next())
   {
                 
%>
<center>
  
             <tr >
                 <td><input class="input" size="30" type="text" value="<%=rs.getString(2)%>"></td>
                 <td><input class="input" size="30" type="text" value="<%=rs.getString(3)%>"></td>
                 <td><input class="input"size="5" type="text" value="<%=rs.getString(4)%>"></td>
                 <td><input class="input"size="10" type="text" value="<%=rs.getString(5)%>"></td>
            
                 
                 
            </tr>
            
           <% }%>
           
</center>
        </table>
           <br>
           <br>
           
                  
          
       
        </form>     
          
    </body>
</html>
<% } catch(Exception e)
        {
        
        }
 session.getAttribute("userid");
session.getAttribute("year1");
%>
        
           
        </table>
        </form>
        
       
          
          
    </body>
</html>

  
