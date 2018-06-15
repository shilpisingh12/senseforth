<%-- 
    Document   : hyper
    Created on : Feb 18, 2017, 12:20:36 AM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="query1.*" %>
<% if(session.getAttribute("userid")!=null)
{
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
<style>
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
        <a href="logout.jsp">logout</a>
       <form name="hyper" method="post"  action="e_inter.jsp"  >
           
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
                    <tr>
                        <td class="d"><a href="A_list.jsp"onClick="return popup(this,'hello')">Click to see the details</a>
       <!-- <a href="list.jsp">Click to see the details</a>-->
        <input class="input1" type="text" name="uid" /></td>
               
     
       
    
                    <th><font class="d">Select Year</font></th>
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
<%}
else
response.sendRedirect("login.jsp");
%>