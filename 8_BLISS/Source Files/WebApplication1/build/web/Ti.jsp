<%--

    Document   : ei.jsp
    Created on : Feb 27, 2017, 1:00:03 PM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@page import="query1.*" %>
<%@page import="java.sql.*" %>
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
        <form name="Ti" action="T_create1.jsp">
         <%   if((request.getParameter("sub") != null))
                      {
                         // out.println("success");
           String class1=request.getParameter("class");
           String course=request.getParameter("course");
           String nos=request.getParameter("nos");
           String cont_ass=request.getParameter("cont_ass");
           
           int cp=5;
           int cp1=5;
           
                  // NewClass q1=new NewClass();
                  try
            { 
          NewClass q=new NewClass();
           String str="insert into continuous(uid,class,course,nos,cont_ass,Year) values('"+session.getAttribute("uid")+"', '"+class1+"','"+course+"',"+nos+",'"+cont_ass+"','"+session.getAttribute("yr")+"')";     
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
                         
                          
                          if(request.getParameter("detail").equals("class"))
                      {%>
                      
                      <a href="logout.jsp">logout</a>
                      <br>
                      <br>
                      <BR>
                      
                      <center><font size="10px">Class Update</font></center>
                       <br>
                      <br>
                      <BR>
                      <br>
                      <br>
                      <BR>

                           <table align="center">
    <tr>
        <th><font class="d">Select Class </font></th>
                <td>
                    
                    <select class="input" name="detail" placeholder="select">
                        <option>Btech 3rd year(CS) </option>
                        
                        <option>Mca 2nd year
                         <option>Btech 2nd year(CS)
                         <option>Btech 3rd year(IT)
                             <option>Mca 3rd year
                         <option>Btech 2nd year(IT)
                         <option>Btech 3rd year(CS)
                         <option>Btech 1st year(CS)
                         <option>BCA 1st year
                         <option>BCA 2nd year
                            
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
                <td>
                    
                </td>
                 
        <th><font class="d">Select Previous Class </font></th>
                <td>
                    
                    <select class="input" name="detail1">
                         <option>Btech 3rd year(CS) </option>
                        
                        <option>Mca 2nd year
                         <option>Btech 2nd year(CS)
                         <option>Btech 3rd year(IT)
                             <option>Mca 3rd year
                         <option>Btech 2nd year(IT)
                         <option>Btech 3rd year(CS)
                         <option>Btech 1st year(CS)
                         <option>BCA 1st year
                         <option>BCA 2nd year
                            
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
                <td></td>
                <th><font class="d">Select Previous Course </font></th>
                             <td>
                    
                    <select class="input" name="detail2">
                        <option selected>OS </option selected>
                        
                        <option>OT
                         <option>DAA
                         <option>SE
                             <option>BDP & SAD
                         <option>CAO
                         <option>CFP
                         <option>DS
                         <option>DCN
                         <option>OOP
                            <option>IWT
                               <option>MM
                                  
                         <option>TOC
                         <option>SAD
                             </option>
                              </option>
                        
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>                   
                         </option>
                         </option>

                    </select>
                             </td>
    </tr>
                           </table>
                <%session.setAttribute("detail","class");%>
                <br>
                    <br>
                    <br>
                <center><input  style="height:40px;font-size:14pt"type="submit" value="Submit" name="btn" ></center>
                      <%}%>
                 <%if(request.getParameter("detail").equals("course"))
                {%>
                <a href="logout.jsp">logout</a>
                
                <br>
                      <br>
                      <br>
                      <center><font size="10px">Course Update</font></center>
                      <br>
                      <br>
                      <br>
                      <br>
                      <br>
                      <br>
                      <br>
                      <br>
                    <table>
                        <tr>
                            <th><font class="d">Select Course </font></th>
                             <td>
                    
                    <select class="input" name="detail">
                        <option selected>OS </option selected>
                        
                        <option>OT
                         <option>DAA
                         <option>SE
                             <option>BDP & SAD
                         <option>CAO
                         <option>CFP
                         <option>DS
                         <option>DCN
                         <option>OOP
                            <option>IWT
                               <option>MM
                                  
                         <option>TOC
                         <option>SAD
                             </option>
                              </option>
                        
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>                   
                         </option>
                         </option>

                    </select>
                </td>
                <td></td>
                     <th><font class="d">Select Previous Class </font></th>
                <td>
                    
                    <select class="input" name="detail1">
                         <option>Btech 3rd year(CS) </option>
                        
                        <option>Mca 2nd year
                         <option>Btech 2nd year(CS)
                         <option>Btech 3rd year(IT)
                             <option>Mca 3rd year
                         <option>Btech 2nd year(IT)
                         <option>Btech 3rd year(CS)
                         <option>Btech 1st year(CS)
                         <option>BCA 1st year
                         <option>BCA 2nd year
                            
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
                <td></td>
                <th><font class="d">Select Previous Course </font></th>
                             <td>
                    
                    <select class="input" name="detail2">
                        <option selected>OS </option selected>
                        
                        <option>OT
                         <option>DAA
                         <option>SE
                             <option>BDP & SAD
                         <option>CAO
                         <option>CFP
                         <option>DS
                         <option>DCN
                         <option>OOP
                            <option>IWT
                               <option>MM
                                  
                         <option>TOC
                         <option>SAD
                             </option>
                              </option>
                        
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>                   
                         </option>
                         </option>

                    </select>
                             </td>
    </tr>
                    
                     </table>
                    <%session.setAttribute("detail","course");%>
                    <br>
                    <br>
                    <br>
                    <center><input  style="height:40px;font-size:14pt"type="submit" value="Submit" name="btn" ></center>
                <%}
                if(request.getParameter("detail").equals("nos"))
                {%>
                    <a href="logout.jsp">logout</a>
                <br>
                      <br>
                      <br>
                      <center><font size="10px">No.Of Student Update</font></center>
                      <br>
                      <br>
                      <br>
                      <br>
                      
                      <center><table>
                        <tr>
                            <th class="d">Enter the number of student</th>
                            <th><input class="input1" type="text" name="nos" /></th>
                    </tr>
                    <tr></tr>
                    <tr></tr>
                        <tr></tr>
                    <tr>
                     <th><font class="d">Select Previous Course </font></th>
                             <td>
                    
                    <select class="input" name="detail2">
                       <option selected>OS </option selected>
                        
                        <option>OT
                         <option>DAA
                         <option>SE
                             <option>BDP & SAD
                         <option>CAO
                         <option>CFP
                         <option>DS
                         <option>DCN
                         <option>OOP
                            <option>IWT
                               <option>MM
                                  
                         <option>TOC
                         <option>SAD
                             </option>
                              </option>
                        
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>                   
                         </option>
                         </option>
                    </select>
                             </td>
                             <th><font class="d">Select Previous Class </font></th>
                             <td> <select class="input" name="detail1">
                        <option>Btech 3rd year(CS) </option>
                        
                        <option>Mca 2nd year
                         <option>Btech 2nd year(CS)
                         <option>Btech 3rd year(IT)
                             <option>Mca 3rd year
                         <option>Btech 2nd year(IT)
                         <option>Btech 3rd year(CS)
                         <option>Btech 1st year(CS)
                         <option>BCA 1st year
                         <option>BCA 2nd year
                            
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
                    </tr>
                    </table></center>
               <%session.setAttribute("detail","nos");%>
               <br>
               <br>
               <br>
               <br>
               <center><input  style="height:40px;font-size:14pt"type="submit" value="Submit" name="btn" ></center>
                     <% }
                 if(request.getParameter("detail").equals("cont_ass"))
                {%>
               <a href="logout.jsp">logout</a>
                <br>
                      <br>
                      <br>
                      <center><font size="10px">Continuous Assessment Update</font></center>
                      <br>
                      <br>
                      <br>
                      
                      <center><table>
                        <tr>
                            <th class="d">Enter the Continuous Assessment</th>
                            <th> <input class="input1" type="text" name="cont_ass" /></th>
                        </tr>
                        <tr></tr>
                        <tr></tr>
                        <tr></tr>
                        <tr>
                      <th><font class="d">Select Previous Class </font></th>
                <td>
                    
                    <select class="input" name="detail1">
                        <option>Btech 3rd year(CS) </option>
                        
                        <option>Mca 2nd year
                         <option>Btech 2nd year(CS)
                         <option>Btech 3rd year(IT)
                             <option>Mca 3rd year
                         <option>Btech 2nd year(IT)
                         <option>Btech 3rd year(CS)
                         <option>Btech 1st year(CS)
                         <option>BCA 1st year
                         <option>BCA 2nd year
                            
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
                <td></td>
                <th><font class="d">Select Previous Course </font></th>
                             <td>
                    
                    <select class="input" name="detail2">
                        <option selected>OS </option selected>
                        
                        <option>OT
                         <option>DAA
                         <option>SE
                             <option>BDP & SAD
                         <option>CAO
                         <option>CFP
                         <option>DS
                         <option>DCN
                         <option>OOP
                            <option>IWT
                               <option>MM
                                  
                         <option>TOC
                         <option>SAD
                             </option>
                              </option>
                        
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>
                         </option>                   
                         </option>
                         </option>

                    </select>
                             </td>
    </tr>
                    
                    
                    
                          </table></center>
                <%session.setAttribute("detail","cont_ass");%>
                <center><input  style="height:40px;font-size:14pt"type="submit" value="Submit" name="btn" ></center>
              <% }
                      
                  
}
        %>
        </form>
    </body>
</html>
