<%-- 
    Document   : ut1
    Created on : Mar 29, 2017, 6:43:21 PM
    Author     : Inspiron_15_5000
--%>

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
                font-family:Andalus;font-size:40px;font-weight:bold
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
          <center> 
              <form name="table" action="u2t2.jsp">
                 
        <table  border="0">
            <center><b class="p1">Time Table</b></center>
            
            
                <tr><td><h2><u><b>Day</b></u></h2></td>
                    <td><input class="input" type = "text" name ="0" size="30" ></td>
               
                </tr>
                
                  
                  
                
                <tr>
                   <td><u><b><h2>9:00-10:00</h2></b></u></td>
                    <td><input class="input" type="text" name="1" size="30" ></td>
                </tr>
                <tr><td><h2><u><b>10:00-11:00</b></u></h2></td>
                    <td><input class="input" type="text" name="2" size="30"  /></td>
                </tr>
                <tr><td><h2><u><b>11:00-12:00</b></u></h2></td>
                    <td><input class="input" type="text" name="3" size="30" /></td>
                </tr>
                <tr><td><h2><u><b>12:00-1:00</b></u></h2></td>
                    <td><input class="input" type = "text" name = "4" size="30" ></td>
               
                </tr>
                  <tr><td><h2><u><b>1:00-3:00</b></u></h2></td>
                    <td><input class="input" type = "text" name = "5" size="30" ></td>
               
                </tr>
                  <tr><td><h2><u><b>3:00-4:00</b></u></h2></td>
                    <td><input class="input" type = "text" name = "6" size="30" ></td>
               
                </tr>
                  <tr><td><h2><u><b>4:00-5:00</b></u></h2></td>
                    <td><input class="input" type = "text" name = "7" size="30" ></td>
               
                </tr>
               
        </table>
          </center>
    <center> <input  style="height:40px;font-size:14pt" type="submit" value="submit" name="sub" ></center>
              </form>    
        
    </body>
</html>
