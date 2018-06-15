<%--
    Document   : personal
    Created on : Jan 18, 2017, 10:05:56 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="query1.*" %>
<%--<jsp:include page="header.jsp" ></jsp:include>--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
   
    <style type="text/css">
            .p1{
                color:indigo; font-family:Andalus;font-size:50px;font-weight:bold
               }
            input{
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
    
        <form name="u_hod" method="post"  >
            
            
        
            <% 
                try
            {
                 
   
ResultSet rs=null,rs1=null; 
       if (request.getParameter("submit") != null)
       {
          if(request.getParameter("table1").equals("departmental_respo"))
       {
             String str="select * from departmental_respo where uid='"+request.getParameter("uid")+"' and Year='"+request.getParameter("yr")+"'";
            NewClass q=new NewClass();
   
          rs=q.get_data(str);
       
         
          %>
           <table  align="center" border="1">
            <h1 align="center"><b class="p1"><b>Departmental_Responsibilities</b></h1>
             <tr>
                 
            
                  <th class="d" bgcolor="silver">Details</th>
            
           
                  
                  <th  class="d" bgcolor="silver">Credit_Points</th>       
                  
             </tr>
       <%   while(rs.next())
   {
   
        
%>
 
<center>
  
             <tr >
                 <td><input class="input" size="30" type="text" size="30" value="<%=rs.getString(2)%>"></td>                
                 <td><input class="input" size="30" type="text" size="30" value="<%=rs.getString(3)%>"</td> 
                            
                           
        </tr>
          
</center>
   <%} %>
</table>
<table align="center">
    <tr>
                    <th><font size="3pt">Select Details</font></th>
                <td>
                    
                    <select class="div" name="detail">
                        <option selected>Annual report Committee</option selected>
                        
                        <option>Cultural Committee
                         <option>Student taken for placement	
                         <option>Cultural Committee of Mayukh
                         <option>Cultural Committee
                         <option>
                             Decor committee of Mayukh
                         <option>
                             Workshop conduct
                         <option>
                             Coordinator of placement
                         </option>
                         </option>
   </option>
                         </option>
                         </option>
                         </option></option>
                    </select>
                </td>
                 <th><font size="3pt">Select Credit Points</font></th>
                <td>
                    <select class="div" name="credit">
                        <option selected>1</option selected>
                        
                        <option>2
                         <option>3	
                         <option>4
                         <option>5
                         </option> </option>
                         </option>
                         </option></option>
                    </select>
                            
                </td>
                </tr>
</table>
<center>               
    <input  type="submit" value="Update" name="B1">
<input type="submit" value="Update1" name="update"></center>
      
   
         <%
             if (request.getParameter("update")!= null)
           {
 // String str1="update departmental_respo set Credit_Points='"+request.getParameter("credit")+"' where uid='"+request.getParameter("uid")+"' and Details='"+request.getParameter("detail")+"'and Year='"+request.getParameter("yr")+"'";
            

       //   int s=q.update_data(str1);      
         
              response.sendRedirect("u_credit.jsp");
           }
          }
       
      else if(request.getParameter("table1").equals("invigilation"))
       {
         
            // String str="update invigilation set Obtained_cp='"+request.getParameter("credit")+"' where uid='"+request.getParameter("uid")+"' and Year='"+request.getParameter("yr")+"'";
             //NewClass q=new NewClass();

         // int s=q.update_data(str);
            // response.sendRedirect("u_credit.jsp");%>
           <table  align="center" border="1">
            <h1 align="center"><b class="p1">Invigilation</b></h1>
             <tr>
                 <th class="d" bgcolor="silver" rowspan="2" size="20">Exam</th>
            
                  <th class="d" bgcolor="silver" rowspan="2" size="20">Invigilation_Duties</th>
            
           
                  
               <th class="d" bgcolor="silver" rowspan="2">Duties_Attended</th>
            
                   
              <th class="d" bgcolor="silver" rowspan="2" size="10">Unauthorized_Absent</th>
              <th class="d" bgcolor="silver" rowspan="2" size="10">Quality_of_Invigilation</th> 
              <th class="d" bgcolor="silver" colspan="2">Credit_Points</th>
                   
                  
             </tr>
             <tr>
                 <th class="d" bgcolor="silver">Full</th>
                 <th class="d" bgcolor="silver">Obtained</th>
             </tr>
        
             <%
                 
               
          NewClass q=new NewClass();            
       rs= q.get_data("select * from invigilation where  uid='"+request.getParameter("uid")+"' and Year='"+request.getParameter("yr")+"'");
   while(rs.next())
   {
                 
%>
<center>
  
             <tr >
                 <td><input class="input" size="30" type="text" value="<%=rs.getString(2)%>"></td>
            
            
                
                 <td><input class="input" size="20" type="text" value="<%=rs.getString(3)%>"></td>
            
                 
                 <td><input class="input" size="15" type="text" value="<%=rs.getString(4)%>"> </td>
                  <td><input class="input" size="20" type="text" value="<%=rs.getString(5)%>"></td>
                 <td><input class="input"  size="25" type="text" value="<%=rs.getString(6)%>"></td>
                 <td><input class="input" size="5" type="text" value="<%=rs.getString(7)%>"></td>
                  <td><input class="input" size="10" type="text" value="<%=rs.getString(8)%>"></td>
                   
            </tr>
           <% }%>
</center>
        </table>
      <% }
      else if(request.getParameter("table1")=="other_academic_respo")
       {
        
             String str="update other_academic_respo set Obtained_cp='"+request.getParameter("credit")+"' where uid='"+request.getParameter("uid")+"' and Year='"+request.getParameter("yr")+"'";
           NewClass q=new NewClass();

          int s=q.update_data(str);
             response.sendRedirect("u_credit.jsp");
       }
      else if(request.getParameter("table1")=="other_insti_respo")
       {
             String str="update other_insti_respo set Obtained_cp='"+request.getParameter("credit")+"' where uid='"+request.getParameter("uid")+"' and Year='"+request.getParameter("yr")+"'";
          NewClass q=new NewClass();

          int s=q.update_data(str);
             response.sendRedirect("u_credit.jsp");
       }
      else if(request.getParameter("table1")=="workshop")
       {
          
             String str="update workshop set credit='"+request.getParameter("credit")+"' where uid='"+request.getParameter("uid")+"' and Year='"+request.getParameter("yr")+"'";
           NewClass q=new NewClass();

          int s=q.update_data(str);
             response.sendRedirect("u_credit.jsp");
       }
   
      // rs= q.get_data("select * from personal_details where uid='"+request.getParameter("uid") +"'and Year='"+request.getParameter("yr")+"'");  
      %>
       

<% }}
catch(Exception e)
        {
        
        }
%>
 </body>
    </form>
</html>