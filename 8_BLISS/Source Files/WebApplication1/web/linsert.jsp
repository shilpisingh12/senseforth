<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="query1.*" %>
<%@page import="java.sql.*" %>
<% if(session.getAttribute("userid")!=null)
{
%>
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
        <a href="logout.jsp">logout</a>
<form name="work" method="get" action="li_1.jsp">
         <% if (request.getParameter("submit") != null)
       {
           %>
           
           <center><table  border="0">
            <center><b class="p1">Leave</b></center>
            
            
              
                  
                  
                
                <tr>
                   <td><u><b><h2>Medical Leave</h2></b></u></td>
                    <td><input class="input" type="text" name="m" size="30" ></td>
                </tr>
                <tr><td><h2><u><b>Earn Leave</b></u></h2></td>
                    <td><input class="input" type="text" name="e" size="30"  /></td>
                </tr>
                <tr><td><h2><u><b>Casual Leave</b></u></h2></td>
                    <td><input class="input" type="text" name="c" size="30" /></td>
                </tr>
                <tr><td><h2><u><b>Total Leave Taken</b></u></h2></td>
                    <td><input class="input" type = "text" name = "t" size="30" ></td>
                </tr>
               
               
                   <!-- <td> <input  style="height:40px;font-size:14pt" type="submit" value="next>>" name="next" ></td>-->
               
               </table></center>
           <center> <input  style="height:40px;font-size:14pt" type="submit" value="more" name="sub" ></center>
        <%  }  
            if((request.getParameter("submit1") != null))
                      {
                       
       
               String var=request.getParameter("1");
         String var2=request.getParameter("2");
         String var3=request.getParameter("3");
         String var4=request.getParameter("4");
        session.setAttribute("v1",var);
session.setAttribute("v2",var2);
session.setAttribute("v3",var3);
session.setAttribute("v4",var4);
out.println(var);
  

        %>
                       
    <center> <table border="0">
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
           
           
        
    <tr>
        <th><font class="d">Select what you want to update</font></th>
                <td>
                    
                    <select class="input" name="detail">
                        <option selected>Medical</option selected>
                        
                        <option>Earn 
                              <option>Casual
                        
                         </option>
                        
                         </option>

                    </select>
                </td>
    </tr>
    
        </table></center>
    
              <center><input  style="height:40px;font-size:14pt" type="submit" value="Submit" name="btn" ></center>         
             <% };%>  
            
            
         </form>
    </body>
</html>

<%}
else
response.sendRedirect("login.jsp");
%>