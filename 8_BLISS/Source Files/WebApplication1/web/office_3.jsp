<%-- 
    Document   : hyper
    Created on : Feb 18, 2017, 12:20:36 AM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="query1.*" %>
<% if(session.getAttribute("userid")!=null)
{
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
function popup(mylink,windowname)
{ if(!window.focus)
return true;
var href;
if(typeof(mylink)=='string')href=mylink;
else href=mylink.href;
window.open(href,windowname,'width=400,height=200,scrollbars=no');
return false;
}
</script>
<style>
             .d{
                font-size:25px;font-style:normal;font-weight:bolder 
            }
            .p1{
                 font-family:Andalus;font-size:35px;font-weight:bold

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
        <a href="logout.jsp">logout</a>
         <form name="office_3" method="post"  action="o_update.jsp"  >
          
         <%if(request.getParameter("submit1")!=null)
           {%>
      
           <center>
            <table>
                
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
                    <tr>
                        <td class="d"><a href="A_list.jsp"onClick="return popup(this,'hello')">Click to see the details</a>
       <!-- <a href="list.jsp">Click to see the details</a>-->
        <input class="input1" type="text" name="uid" /></td>
               
     
       
    
                    <th><font class="d">Select Year</font></th>
                <td>
                    
                    <select class="input1" name="yr">
                        <option selected>2014</option selected>
                         <option>2015
                         <option>2016
                         </option></option>
                    </select>
                </td>
                </tr>
                
              
            </table>
           </center>   
           <br>
           <br>
           <br>
           <br>
           <center><input style="height:40px;font-size:14pt" type="submit" value="Submit" name="submit"></center>
        <%}
        if(request.getParameter("submit")!=null)
{%>

      
                   
            <center><table  border="0">
                    
            <center><b class="p1">Personal Details</b></center>
            
            
              
                  
                  
                
                <tr>
                   <td><u><b><h2>UserId</h2></b></u></td>
                    <td><input class="input" type="text" name="uid" size="30" ></td>
                </tr>
                <tr><td><h2><u><b>Name</b></u></h2></td>
                    <td><input class="input" type="text" name="name" size="30"  /></td>
                </tr>
                <tr><td><h2><u><b>Designation</b></u></h2></td>
                    <td><input class="input" type="text" name="desig" size="30" /></td>
                </tr>
                <tr><td><h2><u><b>Salary</b></u></h2></td>
                    <td><input class="input" type = "text" name = "sal" size="30" ></td>
                </tr>
                 <tr><td><h2><u><b>Gender</b></u></h2></td>
                    <td><input class="input" type = "text" name = "gen" size="30"  ></td>
                </tr>
                 <tr><td><h2><u><b>Year</b></u></h2></td>
                    <td><input class="input" type = "text" name = "yr" size="30"  ></td>
                </tr>
                  </table></center>
                
     <center> <input  style="height:40px;font-size:14pt" type="submit" value="submit" name="more" ></center>
                    
               
               
           
                  <%        
                      if((request.getParameter("more") != null))
                      {
                          
           String uid=request.getParameter("uid");
           String name=request.getParameter("name");
           String desig=request.getParameter("desig");
           String gen=request.getParameter("gen");
           String sal=request.getParameter("sal");
           String yr=request.getParameter("yr");
                  // NewClass q1=new NewClass();
                  try
            {
          
                
          
            String str="insert into personal_details (uid,Name,Desig,Salary,Gender,Year) values('"+uid+"', '"+name+"','"+desig+"',"+sal+",'"+gen+"',"+yr+")";         
            
          NewClass q=new NewClass();

          int s=q.insert_data(str);
           

                }
            catch(Exception e)
            {
            System.out.println(e);
            }
                  
                     
                     
                      if(request.getParameter("next") != null)
                      {
                      response.sendRedirect("complete.jsp");
                      }
                     
                      
                  
             
                 
                 
               
            } 
                  }
if(request.getParameter("submit2")!=null)
{ 
                  %>   
   <center>
            <table>
                
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
                    <tr>
                        <td class="d"><a href="A_list.jsp"onClick="return popup(this,'hello')">Click to see the details</a>
       <!-- <a href="list.jsp">Click to see the details</a>-->
        <input class="input1" type="text" name="uid" /></td>
                  

                  
                     
             </td>
                </tr>
                
              
            </table>
              <br>
           <br>
           <br>
           <br>
           <center><input style="height:40px;font-size:14pt" type="submit" value="Submit" name="sub"></center> 
       
        </form>     
       
<%}
        %>
     
    </body>
</html>
<%}
else
response.sendRedirect("login.jsp");
%>
