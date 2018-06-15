<%-- 
    Document   : admin1
    Created on : Mar 1, 2017, 5:21:51 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>online form</title>
</head>
<body bgcolor="white">
 <form action="adminregcode.jsp" method="post" name="frm_stud">
 <h1 align="center"><u><b>REGISTERATION FORM FOR ADMIN DETAILS</b></u></h1>   
 <table align="center" cellspacing="5" cellpadding="1o">
<tr>
<td >User Name:</td>
<td><input type="text" name="u_name"></td>
</tr>
<tr>
<td > User ID:</td>
<td><input type="text" name="u_id"></td>
</tr>
<tr>
<td > Email:</td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td>Mobile No.:</td>
<td><input type="text" name="mob_no" ></td>
</tr>
<tr>
<td></td>    
<td><input type="submit" name="submit"></td>
</table>
</form>
</body>
</html>


