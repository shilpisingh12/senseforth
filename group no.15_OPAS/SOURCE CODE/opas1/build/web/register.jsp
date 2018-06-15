<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" ></jsp:include>
<%@page import="java.sql.*" %>
<%@page import="query1.*" %>
<html>
<style>
form {
    border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
    width: 100%;
    height: 10%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 80%;
}

button:hover {
    opacity: 0.8;
}


.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 15%;
    border-radius: 15%;
}

.container {
    padding: 16px;
}
span.psw {
    float: right;
    padding-top: 16px;
}
</style>
<body>
<div>
<form action="dbinsertion.jsp" name="myForm"><div class="imgcontainer">
<img src="img_avatar2.png" alt="Avatar" class="avatar">
</div>
<div class="container">  
 <h1 align="center"><b><u>REGISTERATION FORM</u></b></h1>   
<table border="0" align="center">			
<tr>				
<td><b><u>Userid:</u></b></td>				
<td><input type="text" name="name"></td>			
</tr> 					
<tr>			
<td><b><u>Role:</u></b></td>                                  
<td><input type="radio" name="role" value="student">student</td>                                 
<td><input type="radio" name="role" value="admin">admin</td>			
</tr>			
<tr>				
<td><b><u>Password:</u></b></td>				
<td><input type="password" name="password"></td>                    
</tr>			
<tr>				
<td><b><u>Question:</u></b></td>                                 
<td>                         
<select name="qn">                             
<option>ur best frd name</option>                            
<option>email id</option>                           
<option>mobile no</option>                             
<option>ur pet name</option>                             
</select>                             
</td>      			
</tr>			
<tr>				
<td><b><u>Answer:</u></b></td>				
<td><input type="password" name="a"></td>			
</tr>			
<tr>				
<td colspan="3"><center><input type="Submit" name="btn_submit" value="Submit"></center></td>			
</tr>
                
</table>
</div>
<div>
<img src="footer.jpg">
</div>
</form>
</body>
</html>
