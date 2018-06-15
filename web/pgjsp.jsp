<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="query1.*" %>
<html>  
<head>
<title>pg</title>
<link rel="stylesheet" type="text/css" href="styl.css"/>
</head>
<body bgcolor="white">
<form action="rfpinsertion.jsp" method="post" name="frm_stud">
     <h1 align="center"><b><u> EDUCATIONAL QUALIFICATION FORM FOR PG STUDENTS</u></b></h1>
<table align="center" cellspacing="5" cellpadding="1o"> 
<tr>
<td>Stu_id</td><td><input type="text" name="Stu_id"></td></tr>
<tr>
<td>Course_id</td><td><input type="text" name="Course_id"></td></tr>
<tr>
<td>10th_year</td><td><input type="text" name="10th_year"></td></tr>
<tr>
<td>Per_10</td><td><input type="text" name="Per_10"></td></tr>
<tr>
<td>12th_year</td><td><input type="text" name="12th_year"></td></tr>
<tr>
<td>Per_12</td><td><input type="text" name="Per_12"></td></tr>
<tr>
<td>UG_year</td><td><input type="text" name="UG_year"></td></tr>
<tr>
<td>Per_UG</td><td><input type="text" name="Per_UG"></td></tr>
<tr>
<td>Sem1</td><td><input type="text" name="Sem1"></td></tr>
<tr>
<td>Sem2</td><td><input type="text" name="Sem2"></td></tr>
<tr>
<td>Sem3</td><td><input type="text" name="Sem3"></td></tr>
<tr>
<td>Sem4</td><td><input type="text" name="Sem4"></td>
</tr>
<tr>
<td><input type="submit" value="submit" name="btn_add">
</td>
</tr>
</table>
</form>
</body>
</html>