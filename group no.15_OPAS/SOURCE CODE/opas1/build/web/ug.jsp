
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="query1.*" %>

<html>
<head>    
<title>ug</title>
<link rel="stylesheet" type="text/css" href="stsheet.css"/>
</head>
<body bgcolor="white">
<form action="rfpinsertion.jsp" method="post" name="frm_stud">   
   <h1 align="center"><b><u> EDUCATIONAL QUALIFICATION FORM FOR UG STUDENTS</u></b></h1>
<table align="center" cellspacing="5" cellpadding="1o">
<tr>
<td>Stu_id</td>
<td><input type="text" name="Stu_id"></td>
<td>Course_id</td>
<td><input type="text" name="Course_id"></td>
</tr>
<tr>
<td>Year_of_10th</td>
<td><input type="text" name="Year_of_10"></td>
<td>Tot_marks_10</td>
<td><input type="text" name="Tot_marks_10"></td>
</tr>
<tr>
<td>Max_marks_10</td>
<td><input type="text" name="Max_marks_10"></td>
<td>Per_10</td>
<td><input type="text" name="Per_10"></td>
</tr> 
<tr>
<td>Year_of_12</td>
<td><input type="text" name="Year_of_12"></td>
<td>Tot_marks_12</td>
<td><input type="text" name="Tot_marks_12"></td>
</tr>
<tr>
<td>Max_marks_12</td>
<td><input type="text" name="Max_marks_12"></td>
<td>Per_12</td>
<td><input type="text" name="Per_12"></td>
</tr>
<tr>
<td>sem1</td>
<td><input type="text" name="Sem1"></td>
<td>sem2</td>
<td><input type="text" name="Sem2"></td>
</tr> 
<tr>
<td>sem3</td>
<td><input type="text" name="Sem3"></td>
<td>sem4</td>
<td><input type="text" name="Sem4"></td>
</tr>
<tr>
<td>sem5</td>
<td><input type="text" name="Sem5"></td>
<td>sem6</td>
<td><input type="text" name="Sem6"></td>
</tr>
<tr>
<td></td>    
</tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr align="center">
 <td></td>   
 <td></td> 
 
 <td>   
<input type="submit" value="submit" name="btn_add">
</td>
</tr>

</table>
    
</form>
  <marquee>enter marks carefully</marguee>  
</body>    
</html>