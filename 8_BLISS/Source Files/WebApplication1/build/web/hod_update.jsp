

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
    
        <form name="hod_update" method="post"  action="u_credit.jsp">
            
            
        
            <% 
                try    
                    
            {
                
            
                 
  
   
       ResultSet rs=null,rs1=null; 
       
  
       if (request.getParameter("submit") != null)
       {
           String uid=request.getParameter("uid");
    String yr=request.getParameter("yr");
    session.setAttribute("uid",uid) ;
    session.setAttribute("yr",yr);
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
                    <th><font class="d">Select Details</font></th>
                <td>
                    
                    <select class="input1" name="detail">
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
                 <th><font class="d">Select Credit Points</font></th>
                <td>
                    <select class="input1" name="credit">
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
 <%session.setAttribute("table1","departmental_respo");%>
   <input type="submit" value="update" name="update" /> 
       <% } 
%>



      


    
    <%
         
       if(request.getParameter("table1").equals("invigilation"))
       {
           %>  
             
         
              
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

        <table align="center">
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
                 <th><font class="d">Select Credit Points</font></th>
                <td>
                    <select class="input1" name="credit">
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
        <% session.setAttribute("table1","invigilation");%>
        <input type="submit" value="update" name="update" /> 
        <%}%>



        
      <%
              
    
    if(request.getParameter("table1").equals("other_academic_respo"))
       {%>
            <table  align="center" border="1">
            
            <h1 align="center"><b class="p1" size="10">Other Academic Responsibilities</b></h1>
             <tr>
                 <th class="d" bgcolor="silver" rowspan="2">Academic body/Committee</th>
            
                  <th class="d" bgcolor="silver" rowspan="2">Meeting attended/held</th>
            
           
                  
               <th class="d"  bgcolor="silver" rowspan="2" size="20">Role & responsibilities</th>
            
                   
              <th class="d" bgcolor="silver" rowspan="2" size="10">Quality of participation</th>
              <th class="d" bgcolor="silver" colspan="2">Credit Points</th>
            
                   
                  
             </tr>
             <tr>
                 <th class="d" bgcolor="silver">Full</th>
                 <th class="d" bgcolor="silver">Obtained</th>
             </tr>
        
             <%
                
               
             
 NewClass q=new NewClass(); 
 

       rs= q.get_data("select * from other_academic_respo where uid='"+request.getParameter("uid")+"'and Year="+request.getParameter("yr")+"");
   while(rs.next())
   {
                 
%>
<center>
  
             <tr >
                 <td><input class="input" size="30" type="text" value="<%=rs.getString(2)%>"></td>
            
            
                
                 <td><input class="input" size="27" type="text" value="<%=rs.getString(3)%>"></td>
            
                 
                 <td><input class="input" size="28" type="text" value="<%=rs.getString(4)%>"> </td>
            
                
                 <td><input class="input" size="30" type="text" value="<%=rs.getString(5)%>"></td>
                 <td><input class="input" size="5" type="text" value="<%=rs.getString(6)%>"></td>
                 <td><input class="input" size="8" type="text" value="<%=rs.getString(7)%>"></td>
                 
            </tr>
           <% }%>
</center>
        
        </table>

 <table align="center">
    <tr>
        <th><font class="d">Roles and Responsibility</font></th>
                <td>
                    
                    <select class="input1" name="detail">
                        <option selected>syallbus designed</option selected>
                        
                        <option>Syllabus discussion
                         <option>time table design
                               </option>
                         </option>

                    </select>
                </td>
                 <th><font class="d">Select Credit Points</font></th>
                <td>
                    <select class="input1" name="credit">
                        <option selected>1</option selected>
                        
                        <option>2
                         <option>3	
                         <option>4
                         <option>5
                         </option> </option>
                         </option>
                         </option>
                    </select>
                            
                </td>
                </tr>
</table>
                         


  <% session.setAttribute("table1","other_academic_respo");%>
  <input type="submit" value="update" name="update" /> 

  
  
        
        <%
          }
        
             if(request.getParameter("table1").equals("other_insti_respo"))
       {
        %>    <table  align="center" border="1">
           <h1 align="center"><b class="p1">Other Institutional Responsibilities Assigned</b></h1>
             <tr>
                 <th class="d" bgcolor="silver" rowspan="2" size="30">Responsibilities</th>
            
                  <th class="d"  bgcolor="silver" rowspan="2">Quality</th>
            
           
                  
               <th class="d" bgcolor="silver" colspan="2"> Credit Points</th>
            
             
             </tr>
             <tr>
                 <th class="d" bgcolor="silver"> Full</th>
                 <th class="d" bgcolor="silver">Obtained</th>
             </tr>
                       
                  
            
              <%
        
               
             percon q=new percon();

       rs= q.get_data("select * from other_insti_respo where uid='"+request.getParameter("uid")+"'and Year="+request.getParameter("yr")+" ");
   while(rs.next())
   {
                 
%>
<center>
  
             <tr >
                 <td><input class="input" size="30" type="text" value="<%=rs.getString(2)%>"></td>
                 <td><input class="input" size="30" type="text" value="<%=rs.getString(3)%>"></td>
                 <td><input class="input"size="5" type="text" value="<%=rs.getString(4)%>"></td>
                 <td><input class="input"size="10" type="text" value="<%=rs.getString(5)%>"></td>
            
                 
                 
            </tr>
            
           <% }%>
           
</center>
        </table>
            
     <br>
<br> 
 <table align="center">
    <tr>
        <th><font class="d">Responsibilities</font></th>
                <td>
                    
                    <select class="input1" name="detail">
                        <option selected>Convocation degree </option selected>
                        
                        <option>Apaji Mala dinner duty
                         <option>Admission Duty
                         <option>Annual function duty
                         <option>Workshop conduct
                         <option>Convocation duty   
                         <option>Apaji mela duty
                         <option>Placement duty
                         <option>Workshop duty</option>
                             
                    </option>
                         </option>
                         </option>
                         
                         </option>
                         </option>
                               </option>
                         </option>

                    </select>
                </td>
                 <th><font class="d">Select Credit Points</font></th>
                <td>
                    <select class="input1" name="credit">
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
                         


  
<% session.setAttribute("table1","other_insti_respo");
        %>
        <input type="submit" value="update" name="update" />    
      <%}
       if(request.getParameter("table1").equals("workshop"))
       {%>
          <center><h1><b class="p1">Participation in Conference/Symposia/Workshop/Seminars</b></h1></center>  
        <table  border="1" align="center">
            <tr>
               <th class="d" bgcolor="silver">Title</th>
               <th class="d" bgcolor="silver">Place</th>
               <th class="d" bgcolor="silver">Date</th>
               <th class="d" bgcolor="silver">Details</th>
               <th class="d" bgcolor="silver">Credit points</th>
            </tr>
           
             <%
                  
                  
              
                     
               
             percon q=new percon();

      rs= q.get_data("select * from workshop where uid='"+request.getParameter("uid")+"'and Year="+request.getParameter("yr")+"");
  if(rs.next())
  {
   do
   {
  



%>

            
            
             <tr>
                 <td><input class="input" size="20" type="text" height="10" value="<%=rs.getString(2)%>"></td>
            
                 <td><input class="input" size="20" type="text" value="<%=rs.getString(3)%>"></td>
            
                 <td><input class="input" size="20" type="text" value="<%=rs.getString(4)%>"> </td>
            
                 <td><input class="input" size="20" type="text" value="<%=rs.getString(5)%>"></td>
                 
                 <td><input class="input" size="20" type="text" value="<%=rs.getString(7)%>"></td>
                  
             </tr>
            
             
             
           <% 
               }
while(rs.next());%>
<br>
<br>
<table align="center">
    <tr>
        <th><font class="d">Details</font></th>
                <td>
                    
                    <select class="input1" name="detail">
                        <option selected>Big data Hadoop </option selected>
                        
                        <option>Networking
                         <option>Ethical hacking
                         
                         </option>
                         </option>
                              
                        
                    </select>
                </td>
                 <th><font class="d">Select Credit Points</font></th>
                <td>
                    <select class="input1" name="credit">
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
                         

     
<% session.setAttribute("table1","workshop");}
        %>
 
          
       
   
        
    
     
     
       
<input type="submit" value="update" name="update" />

<%


}%>
 
 <%
}
}

catch(Exception e)
        {
        
        }
%>
 </body>
    </form>
</html>