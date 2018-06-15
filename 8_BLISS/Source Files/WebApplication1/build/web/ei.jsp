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
        <form name="ei" action="e_create1.jsp">
            <a href="logout.jsp">logout</a>
         <%   if((request.getParameter("sub") != null))
                      {
                          
           String exam=request.getParameter("exam");
           String invig=request.getParameter("invig");
           String duties=request.getParameter("duties");
           String unauth=request.getParameter("unauth");
           String quality=request.getParameter("quality");
           int cp=5;
           int cp1=5;
           
                  // NewClass q1=new NewClass();
                  try
            { 
          NewClass q=new NewClass();
           String str="insert into invigilation(uid,exam,invig_duties,Duties_attend,Unauth_absent,quality_invig,Full_cp,Obtained_cp,Year) values('"+session.getAttribute("uid")+"', '"+exam+"','"+invig+"',"+duties+","+unauth+",'"+quality+"',"+cp+","+cp1+",'"+session.getAttribute("yr")+"')";     
          int s=q.insert_data(str);
    
              //out.println("success");
             }
            catch(Exception e)
            {
            System.out.println(e);
            }
                      }
                  
        
        %>
           <%
                      if(request.getParameter("btn")!=null)
                      {
                          String uid=request.getParameter("uid");
                         String yr=request.getParameter("yr");
                        session.setAttribute("uid",uid) ;
                          session.setAttribute("yr",yr);
                          
                          if(request.getParameter("detail").equals("Exam"))
                      {%>
                      <br>
                      <br>
                      
                      <center><font size="10px">Exam Update</font></center>
<br>
                      <br>
                      <br>
                      <br>
                      <br>
                     
                     
                      <center><table>
    <tr>
        <th><font class="d">Select Exam Details</font></th>
                <td>
                    
                    <select class="input1" name="detail">
                        <option selected>btech 3rd yr periodical 1</option selected>
                        
                        <option>Btech 2nd yr semester exam
                         <option>mca 2nd yr semester exam
                         <option>btech 3rd yr semester exam
                             <option>btech 3rd yr periodical 1
                         <option>btech 1st yr periodical exam
                         <option>btech 2nd yr II periodical test
                         <option>BCA I yr semester exam
                         <option>BCA II yr periodical exam
                         <option>B.tech IV yr semester exam
                         <option> Bca 2nd yr semester exam
                            <option> BCA II yr sem exam
                               <option> Btech 3rd yr periodical 2
                         <option>Mca 1st yr periodical 1
                         <option>Bca 1st yr semester exam
                             </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                        .</option>
                         </option>
                         </option>
                         </option>                   
                         </option>
                         </option>

                    </select>
                </td>
                 </table></center>
                <%session.setAttribute("detail","Exam");%>
                <br>
                <br>
                <br>
    <center><input  style="height:40px;font-size:14pt"type="submit" value="Submit" name="btn" ></center>
                      <%}%>
                 <%if(request.getParameter("detail").equals("Duties_attend"))
                {%>
    <
    <center><font size="10px">Duties Update</font></center>
    <br>
    <br>
    <br>
    <br>
    
    <center><table>
                        <tr>
                            <th class="d">Enter Duties Attended</th>
                            <td class="input1"><input type="text" name="duty" /></td>
                    </tr>
        </table></center>
                    <%session.setAttribute("detail","Duties_attend");%>
                     <input  style="height:40px;font-size:14pt"type="submit" value="Submit" name="btn" >
                <%}%>
                 <%--if(request.getParameter("detail").equals("Unauth_absent"))
                {%>
                    <table>
                        <tr>
                            <th>Enter Unauthorized Absent</th>
                     <input type="text" name="absent" />
                    </tr>
                     
                <%}
                      
                  
        --%>
                         
        
        <%}%>
        </form>
    </body>
</html>


<%}
else
response.sendRedirect("login.jsp");
%>