<%-- 
    Document   : updatef
    Created on : Feb 12, 2017, 6:46:04 PM
    Author     : pc
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" ></jsp:include>
<%@page import="java.sql.*" %>
<%@page import="query1.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>forget password</title>
    </head>
    <body >
<form action="forget.jsp" method="post" name="frm_stud">
 <h1 align="center"><b><u> FORGET PASSWORD FORM</u></b></h1> 
<table align="center" cellspacing="5" cellpadding="1o" >
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr>
<td> user name:</td>
<td><input type="text" name="id"></td>
 <tr>
				<td>question:</td> 
                                 <td>
                              <select name="qn">
                              <option>ur best frd name</option>
                              <option>email id</option>
                              <option>mobile no</option>
                              <option>ur pet name</option>
                              </select>
                               </td>      
			</tr>
<td> answer:</td>
<td><input type="text" name="a"></td>
</tr>
<tr>
 <td>
 </td>    
 <td>
<input type="submit" value="submit" name="submit1" />
 </td>         
</tr>
</table>
 <br><br><br><br><br><br><br><br><br>
             <div>
                 <img src="footer.jpg">
</div>
 </form>   
 </body>
</html>


