
<%--
    Document   : regfp
    Created on : Feb 9, 2017, 6:52:13 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<title>online form</title>
<script>
function validateForm() {
    var x = document.forms["frm_stud"]["email"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Not a valid e-mail address");
        return false;
    }
}
</script>
<link rel="stylesheet" type="text/css" href="stsheet.css"/>
</head>
<body bgcolor="white">
 <form action="rfpinsertion.jsp" onsubmit="return validateForm();"  method="post" name="frm_stud">
     <h1 align="center"><b><u> ONLINE REGISTRATION FORM </u></b></h1>  
<table align="center" cellspacing="5" cellpadding="1o" >
<tr>
<td > Enrollment no:</td>
<td><input type="text" name="eno"></td>
<td>dob</td>
<td><input type="date" name="dob"></td>
</tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr>
<td > First name:</td>
<td><input type="text" name="fname"></td>
<td> Last name:</td>
<td><input type="text" name="lname"></td>
</tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr>
<td>Father name&nbsp:</td>
<td><input type="text" name="faname" ></td>
</tr>
<tr></tr>
<tr>
<td>course:</td>
<td>
<select name="nm">
<option>b.tech</option>
<option>m.tech</option>
<option>bca</option>
<option>mca</option>
</select>
</td>
<td>course_id</td>
<td><input type="text" name="cid" >
</td>
</tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr>
<td>mobile no:</td>
<td><input type="text" name="mobil" ></td>
<td>email id:</td>
<td><input type="text" name="email"></td>
</tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr>
<td>state:</td>
<td><input type="text" name="state"></td>
<td>city:</td>
<td><input type="text" name="city"></td>
</tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr>
<td>qualification:</td>
<td><A href ="ug.jsp">ug</A></td>
<td><A href ="pgjsp.jsp">pg</A></td>
</tr> 
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr>
<td>temporary address :</td>
<td> 
<textarea name="add" rows="4" cols="40">enter address: </textarea>
</td>
<td>permanent address :</td>
<td>
<textarea name="add" rows="4" cols="40">enter address:</textarea></td>
</tr> 
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr>
<td colspan="3" ><input type="submit" value="submit" name="btn_add">
</td>
<td><A href ="updatef.jsp">update</A></td>
</tr>
  
</table>
</form> 
<marquee>get register</marquee>  
</body>
</html>


