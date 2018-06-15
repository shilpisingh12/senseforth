<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" ></jsp:include>
<%@page import="java.sql.*" %>
<%@page import="query1.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>LOGIN PAGE</title>
         <style type="text/css">
            .p{
                color:indigo; font-family:algerian;font-size:40px;font-weight:bold;z-index:5

            }
            .input{
                height:40px;font-size:16pt;
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
        <script type="text/javascript">
    
    
</script>
    </head>
    <body>
    
    
    <%
                 try{
               boolean status=false;
             percon q=new percon();
             String ques1=request.getParameter("ques");
ResultSet rs=null,rs1=null;
String ans1=request.getParameter("ans");
if(request.getParameter("submit")!=null)
{ String userid=request.getParameter("uid");
               
               
    
       rs= q.get_data("select que,ans from security_que where uid='"+userid+"'and que='"+ques1+"'and ans='"+ans1+"'");
      
 status=rs.next();
 if(status==true)
 {   
    session.setAttribute("userid",userid);
        
                
                
           
 rs1=q.get_data("select * from login where uid='"+session.getAttribute("userid")+"'");
status=rs1.next();
if(status==true)
{ 
    %><br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <center><font class="d"> YOUR PASSWORD IS: </font>
       
    <input class="input"  type="text" value="<%=rs1.getString(2)%>" name="txt"> </center>
               
 
 <%         
      
}}
}

} catch(Exception e)
        {
        
        }
%>
<%



%>
    </body>
</html>
<jsp:include page="Footer1.jsp" ></jsp:include>
