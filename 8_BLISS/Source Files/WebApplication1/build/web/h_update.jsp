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
            .p1{
                color:indigo; font-family:Andalus;font-size:50px;font-weight:bold
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
       <form name="h_update" method="post" action="hod_update.jsp">
          
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
                   
                    <tr>
                        <td class="d"><a href="list.jsp"onClick="return popup(this,'hello')">Click to see the details</a>
       <!-- <a href="list.jsp">Click to see the details</a>-->
        <input type="text" name="uid" /></td>
               
                        <th><font class="d">Select Table</font></th>
                        <td>
                             <select class="input" name="table1">
                        <option selected>departmental_respo</option selected>
                         <option>invigilation
                         <option>other_academic_respo
                         <option>other_insti_respo
                         <option>workshop
                                 </option></option></option></option>
                    </select>
                            
                        </td>
       
    
                    <th><font class="d">Select Year</font></th>
                <td>
                    
                    <select class="input" name="yr">
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
        
       </form>
    </body>
</html>
