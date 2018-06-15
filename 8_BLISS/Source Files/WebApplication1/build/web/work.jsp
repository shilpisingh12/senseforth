<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@page import="query1.*" %>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
   
    <style type="text/css">
            .p1{
                 font-family:Andalus;font-size:35px;font-weight:bold

            }
            input{
                height:30px;font-size:14pt;
            }
            .d{
                font-size:30px;font-size:12pt;font-style:normal;font-weight:bolder 
            }
            body{
                background-color:beige
            }
        </style>
         </head>
    <body>
        <form name="work" method="get">
            <center><table  border="0">
            <center><b class="p1">Participation in Conference/Symposia/Workshop/Seminars</b></center>
            
            
              
                  
                  
                
                <tr>
                   <td><u><b><h2>Title</h2></b></u></td>
                    <td><input class="input" type="text" name="title" size="30" ></td>
                </tr>
                <tr><td><h2><u><b>Place</b></u></h2></td>
                    <td><input class="input" type="text" name="place" size="30"  /></td>
                </tr>
                <tr><td><h2><u><b>Date</b></u></h2></td>
                    <td><input class="input" type="text" name="date" size="30" /></td>
                </tr>
                <tr><td><h2><u><b>Details</b></u></h2></td>
                    <td><input class="input" type = "text" name = "details" size="30" ></td>
                </tr>
                 <tr><td><h2><u><b>Credit Points</b></u></h2></td>
                    <td><input class="input" type = "text" name = "cp" size="30"  ></td>
                </tr>
                
                <tr>
                    <td> <input  style="height:40px;font-size:14pt" type="submit" value="more" name="more" ></td>
                    <td> <input  style="height:40px;font-size:14pt" type="submit" value="next>>" name="next" ></td>
                </tr>
               
           
                  <%        session.getAttribute("userid");
                            session.getAttribute("year1");
                      if((request.getParameter("more") != null)||(request.getParameter("next") != null))
                      {
                          
           String title=request.getParameter("title");
           String place=request.getParameter("place");
           String date=request.getParameter("date");
           String details=request.getParameter("details");
           String cp=request.getParameter("cp");
                  // NewClass q1=new NewClass();
                  try
            {
          
                
          
            String str="insert into workshop (uid,title,place,date,details,Year,credit) values('"+session.getAttribute("userid")+"', '"+title+"','"+place+"','"+date+"','"+details+"','"+session.getAttribute("year1")+"','"+cp+"')";         
            
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
                      else if(request.getParameter("more") != null)
                      {
                          response.sendRedirect("work.jsp");
                      }
                      
                      
                  
             
                 
                 
               
            }  %>       
            
                </table></center>
       
        </form>     
       
           
    </body>
</html>


 