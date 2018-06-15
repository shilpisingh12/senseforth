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
    </head>
    <body>
       <form name="hyper" method="post"  action="sec_frame_h.jsp" >
          
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
                        <td class="d"><a href="A_list.jsp"onClick="return popup(this,'hello')">Click to see the details</a>
       <!-- <a href="list.jsp">Click to see the details</a>-->
        <input class="input1" type="text" name="uid" /></td>
               <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
     
       
    
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
           <center><input style="height:40px;font-size:14pt" type="submit" value="Submit"name="submit" ></center>
        
     
    </body>
</html>
<%--
     String userid=request.getParameter("uid");
     session.setAttribute("uid",userid); 
      String year=request.getParameter("yr");
     session.setAttribute("yr",year); 
         
// session.getAttribute("userid");
   
--%>
  
 

  