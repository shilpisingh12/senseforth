<%-- 
    Document   : hyper
    Created on : Feb 18, 2017, 12:20:36 AM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="query1.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            .p{
                color:indigo; font-family:algerian;font-size:40px;font-weight:bold;z-index:5

            }
            .input{
                height:40px;font-size:14pt;
            }
            .input1{
                height:40px;font-size:14pt;width:208px
            }
            .d{
                font-size:20pt;font-style:normal;font-weight:bolder 
            }
            body{
                background-color:beige
            }
        </style>
        <script type="text/javascript">
function popup(mylink,windowname)
{ if(!window.focus)
return true;
var href;
if(typeof(mylink)=='string')href=mylink;
else href=mylink.href;
window.open(href,windowname,'width=400,height=200,scrollbars=no');
return false;
}

</script>
    </head>
    <body>
         <a href="logout.jsp">logout</a>
       <form name="leave_interfacer" method="post"  action="leave_inter.jsp"  >
          
           <center>
            <table>
                
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
                    <tr>
                        <td><a class="d" href="list.jsp"onClick="return popup(this,'hello')">Click to see the details</a>
       <!-- <a href="list.jsp">Click to see the details</a>-->
        <input class="input1" type="text" name="uid" /></td>
               
     
       
    
                    <th class="d"><font size="4pt">Select Year</font></th>
                <td>
                    
                    <select class="input1" name="yr">
                        <option selected>2014</option selected>
                         <option>2015
                         <option>2016
                         </option></option>
                    </select>
                </td>
                </tr>
                
              
            </table>
           </center>   
           <br>
           <br>
           <br>
           <br>
           <center><input style="height:40px;font-size:14pt" type="submit" value="Submit" name="submit"></center>
        
     
    </body>
</html>
