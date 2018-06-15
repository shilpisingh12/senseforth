<%-- 
    Document   : office_1
    Created on : Mar 25, 2017, 8:46:09 PM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    </head>
    <body bgcolor="beige">
        <form name="office_1" method="get" action="office_3.jsp">
            <a href="logout.jsp">logout</a>
            <br>
            <br>
            <br>
            <br>
            <br>
            
            <center><p class="d"> Select the option </p></center>
         <center><input style="height:40px;font-size:14pt" type="submit" value="insert" name="submit"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input style="height:40px;font-size:14pt" type="submit" value="Update" name="submit1"/>
        
               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input style="height:40px;font-size:14pt" type="submit" value="Delete" name="submit2"/></center>
       
        </form>         
    </body>
</html>
