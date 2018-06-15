


<%-- 
    Document   : login1.jsp
    Created on : Nov 18, 2016, 1:03:04 PM
    Author     : Student
--%>

<%-- 
    Document   : login
    Created on : Jan 27, 2016, 2:48:53 PM
    Author     : admin
--%>




<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" ></jsp:include>
<%@page import="java.sql.*" %>
<%@page import="query1.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>LOGIN PAGE</title>
        <script type="text/javascript">
    function validation()
    {
        
        var valid=true;
     
        var a = document.getElementById("uid");
        if(a == "")
                            {
            alert("Enter the id"); 
            document.myform.uid.focus();
          return false;
            
            }
            
            
            
            return valid;
         
         
    }
    
</script>
    </head>
    <body bgcolor="white">
        <form name="myform" method="get" action="create1.jsp" onclick="return validation();">
             <h1 align="center"><b><u>LOGIN PAGE </u></b></h1>
            <center>
            <table>
                <tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
                <tr>
                    <td>
                        User ID:
                    </td>
                    <td>
                        <input type="text" name="uid"  />
                    </td>
                </tr>
                <tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
                <tr>
                    <td>
                        Password:
                    </td>
                    <td>
                        <input type="password" name="psw"  />
                    </td>
                </tr>
                <tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
                <tr>                      
                  <td>role:</td>
                  <td>
                 <select name="ad">
              <option>admin</option>
                 <option>student</option>
                 </select>
                  </td>
                  </tr>
                  <tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
                <tr>
                    <td>
                        <input type="submit" value="submit" name="submit1" />
                    </td>
                    <td>
                 <a href="forgetpassword.jsp">forget password?</a><br>
                    </td>
                </tr>
            </table>
                </center>
             <br><br><br><br><br><br><br><br><br>
             <div>
                 <img src="footer.jpg">
</div>
        </form>
   
    
        
<%

                    // try
      // {
          // out.println("sub");
          // if(request.getParameter("sub")!=null)
          // {
              // out.println("sub");
              // 
              // response.sendRedirect("forgetpassword.jsp");
          // }
     //}
           //catch(Exception ex)
//{
 //ex.printStackTrace();
//}                
//%>

 </body>
</html>

