<%--

    Document   : ei.jsp
    Created on : Feb 27, 2017, 1:00:03 PM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="query1.*" %>
<%@page import="java.sql.*" %>
<% if(session.getAttribute("userid")!=null)
{
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
             .d{
                font-size:25px;font-style:normal;font-weight:bolder 
            }
            .input{
                height:40px;font-size:14pt;
            }
             .input1{
                height:30px;font-size:14pt;
            }
        </style>
        
    </head>
    
    <body bgcolor="beige">
        <form name="ei" >
            <br>
           <br>
           <br>
           <br>
           <br>
           <br>
           <br>
           <br>
         <%   if((request.getParameter("next")!= null))
                      {
                          
           String medical=request.getParameter("m");
           String earn=request.getParameter("e");
           String casual=request.getParameter("c");
           String total=request.getParameter("t");
           
          
                  // NewClass q1=new NewClass();
                  try
            { 
                Class.forName("com.mysql.jdbc.Driver");    //driver for MySQL
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bliss","root","");

           String str="insert into login1(uid,Medical,Earn,Casual,Total,Year)values('"+session.getAttribute("uid")+"', '"+medical+"','"+earn+"','"+casual+"','"+total+"','"+session.getAttribute("yr")+"')";   
           
           PreparedStatement ps=conn.prepareStatement(str);

          
            
         // NewClass q=new NewClass();
             
          int s=ps.executeUpdate();
            
            if(s>0)
                
              
            conn.close();
             }
                  
                  
            catch(Exception e)
            {
            System.out.println(e);
            }
                      }
                  
        
        %>
           <%
                      if(request.getParameter("btn")!=null)
                      {%>
                          
                         
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
              <%String detail=request.getParameter("detail");
            //  session.setAttribute("detail",detail);%>       
   
  Enter the new value<input type="text" name="val">
    <center><input  style="height:40px;font-size:14pt" type="submit" value="Submit" name="btn3" ></center>
      <%
              try
              {ResultSet rs=null;
              NewClass q=new NewClass();
             if (request.getParameter("btn3")!= null)
           {//out.println("success");
               String var=request.getParameter("val");
               if(detail.equals("Medical"))
               {   
                  // out.println("success");
 String str1="update login1 set Medical='"+ var +"' where uid='"+session.getAttribute("uid")+"' and Year='"+session.getAttribute("yr")+"'";
             int s=q.update_data(str1);      

 String str2="update login1 set Total=('"+session.getAttribute("v2")+"'+'"+session.getAttribute("v3")+"'+'"+var+"') where uid='"+session.getAttribute("uid")+"' and Year='"+session.getAttribute("yr")+"'";
  
 int s1=q.update_data(str2);
 
        
         
             // out.println("success");
           }%>      
          
                }--%>
        <%}
              }
              catch(Exception e)
              {
                  
              }
              %>
              
        <% }%>
        </form>
    </body>
</html>

<%}
else
response.sendRedirect("login.jsp");
%>