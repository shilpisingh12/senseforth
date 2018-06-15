
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*" %>
<%@page import="query1.*" %>
<% if(session.getAttribute("userid")!=null)
{
%>
<%--<jsp:include page="header.jsp" ></jsp:include>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
    <style type="text/css">
            .p1{
                 font-family:Andalus;font-size:50px;font-weight:bold
               }
            input{
                height:30px;font-size:14pt;
            }
            .input1{
                height:30px;font-size:14pt;
            }
            .d{
                font-size:20pt;font-style:normal;font-weight:bolder 
            }
            body{
                background-color:beige
            }
        </style>
         
</head>
    <body>
    <a href="logout.jsp">logout</a>     
        <form name="o_update" method="post" action="office_update3.jsp" >
            
         <% 
                try    
                    
            {
                
       ResultSet rs=null,rs1=null; 
       
  
       if (request.getParameter("submit")!= null)
       {
          
           String uid=request.getParameter("uid");
    String yr=request.getParameter("yr");
    session.setAttribute("uid",uid) ;
    session.setAttribute("yr",yr);
     
                 
               
          NewClass q=new NewClass();            
       rs= q.get_data("select * from personal_details where  uid='"+uid+"' and Year="+yr+"");
   if(rs.next())
   {  %>  
    <center> <table  border="0">
                   <tr> <td><u><b><h2> UserId </h2></b></u> </td>
                     <td> <input class="input" size="20" type="text" value="<%=rs.getString(1)%>"> </td>
                </tr>
                <tr><td><h2><u><b>Name</b></u></h2></td>
                     <td><input class="input" size="20" type="text" value="<%=rs.getString(2)%>"></td>
                </tr>
                <tr><td><h2><u><b>Designation</b></u></h2></td>
                    <td><input class="input" size="20" type="text" value="<%=rs.getString(3)%>"></td>
                </tr>
                <tr><td><h2><u><b>Salary</b></u></h2></td>
                     <td><input class="input" size="20" type="text" value="<%=rs.getInt(4)%>"></td>
                </tr>
                 <tr><td><h2><u><b>Gender</b></u></h2></td>
                    <td><input class="input" size="20" type="text" value="<%=rs.getString(5)%>"></td>
                </tr>
                
                 <tr><td><h2><u><b>Year</b></u></h2></td>
                    <td><input class="input" size="20" type="text" value="<%=rs.getString(6)%>"></td>
                </tr>
                
               
             
                      
            
        </table>    </center>      
            
                <center>  <table border="0">
           
            
    <tr>
        <th><font class="input1">Select what you want to update</font></th>
                <td>
                    
                    <select class="input" name="detail">
                        <option selected>Salary</option selected>
                        <option>Designation</option>
                        
                      

                    </select>
                </td>
    </tr>
    
                    </table></center>
    
              <center><input  style="height:40px;font-size:14pt" type="submit" value="Submit" name="btn" ></center>         
            
          <%   }

}
if (request.getParameter("sub")!= null)
       {
          
           String uid=request.getParameter("uid");
NewClass q=new NewClass();            
       int s = q.delete_data("delete from personal_details where uid='"+uid+"'");

int s1 = q.delete_data("delete from continuous where uid='"+uid+"'");
int s2 = q.delete_data("delete from departmental_respo where uid='"+uid+"'");
int s3 = q.delete_data("delete from invigilation where uid='"+uid+"'");
int s4 = q.delete_data("delete from other_academic_respo where uid='"+uid+"'");
int s5 = q.delete_data("delete from other_insti_respo where uid='"+uid+"'");
int s6 = q.delete_data("delete from security_que where uid='"+uid+"'");
int s7 = q.delete_data("delete from workshop where uid='"+uid+"'");
int s8 = q.delete_data("delete from attach where uid='"+uid+"'");
int s9 = q.delete_data("delete from login where uid='"+uid+"'");
int s10 = q.delete_data("delete from login1 where uid='"+uid+"'");

}

}
            catch(Exception e)
            {
            System.out.println(e);
            }
                  %>
        </form>
    </body>
</html>



<%}
else
response.sendRedirect("login.jsp");
%>