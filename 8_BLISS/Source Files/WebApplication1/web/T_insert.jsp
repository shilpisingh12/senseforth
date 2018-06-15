<%-- 
    Document   : einsert
    Created on : Feb 27, 2017, 11:43:53 AM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@page import="query1.*" %>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .p1{
                 font-family:Andalus;font-size:50px;font-weight:bold

            }
             .d{
                font-size:25px;font-style:normal;font-weight:bolder 
            }
            .input{
                height:40px;font-size:14pt;
            }
             .input1{
                height:30px;font-size:14pt;
            }
        </style>
         
    </head>
    <body bgcolor="beige">
         <form name="work" method="get" action="Ti.jsp">
             <a href="logout.jsp">logout</a>
         <% if (request.getParameter("submit") != null)
       {
           %>
           <center>   
        <table  border="0">
            <center><b class="p1">Continuous</b></center>
            
            
              
                  
                  
                
                <tr>
                   <td><u><b><h2>class</h2></b></u></td>
                    <td><input class="input" type="text" name="class" size="30" ></td>
                </tr>
                <tr><td><h2><u><b>course</b></u></h2></td>
                    <td><input class="input" type="text" name="course" size="30"  /></td>
                </tr>
                <tr><td><h2><u><b>nos</b></u></h2></td>
                    <td><input class="input" type="text" name="nos" size="30" /></td>
                </tr>
                <tr><td><h2><u><b>cont_ass</b></u></h2></td>
                    <td><input class="input" type = "text" name = "cont_ass" size="30" ></td>
               
                </tr>
                
                <tr>
                    <td> <input  style="height:40px;font-size:14pt" type="submit" value="more" name="sub" ></td>
                    <td> <input  style="height:40px;font-size:14pt" type="submit" value="next>>" name="next" ></td>
               
                </tr>
                <tr><td>
                        <a href="ut1.jsp">click here to update the timetable</a></td>
                </tr>
        </table
        <center>
              <%} %>  
        <% 
            if((request.getParameter("submit1") != null))
                      {
                         
   %>
   <br>
   <br>
   <br>
   <br>
   <br>
    <br>
   <br>
   <br>
   <br>
   <br>
   <br>
   <br>
   <center><table>
    <tr>
        <th><font class="d">Select what you want to update</font></th>
                <td>
                    
                    <select class="input1" name="detail">
                        <option selected>class</option selected>
                        
                        <option>course
                        <option>nos
                        <option>cont_ass
                        
                         </option>
                        
                         </option>
                         </option>
                         </option>

                    </select>
                </td>
    </tr>
       </table></center>
   <br>
   <br>
   <br>
   
   <center> <input  style="height:40px;font-size:14pt" type="submit" value="Submit" name="btn" ></center>
                <a href="ut1.jsp">click here to update the timetable</a>       
             <% }%>      
         </form>
    </body>
</html>
