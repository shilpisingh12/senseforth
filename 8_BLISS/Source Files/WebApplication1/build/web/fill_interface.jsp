<%-- 
    Document   : fill_interface
    Created on : Feb 11, 2017, 3:15:55 PM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="fill_interface" method="get" >
               
        <table>
            <tr>
                <th>
                  <h1>Please fill the form for the year:</h1>  
                </th>
                
                <td>
                    <a href="fill_interface.jsp"></a>
                    <select name="yr">
                        <option selected>2016</option selected>
                        
                       
                    </select>
                </td>
                
            </tr>
            <tr>
                <td><input type="submit" value="submit" name="btn"></td> 
            </tr>
        
        </table>
        </form>
    </body>
</html>
 <%
        
   if(request.getParameter("btn") != null)
   {    
   String year1=request.getParameter("yr");
   if(request.getParameter("yr")!=null)
   {
   session.setAttribute("year1",year1); 
   
   response.sendRedirect("sec_frame_fill.jsp");
   }
   }
   
   %>    