<%-- 
    Document   : s_faculty
    Created on : Feb 10, 2017, 5:16:38 PM
    Author     : Inspiron_15_5000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script>
            function valid()
            {
                windows.open("A_list.jsp",null,"height=200,width=400,status=yes,tollbar=no,menubar=no,location=no");
            }
            </script>

    </head>
    <form name="A_list.jsp">
    <body>
    <center><h3><b> Faculty Members </b></h3></center>
    <center>    <table>
          
            <tr>
            <th>Faculty name</th>
            <th></th>
            <th>Faculty ID </th>
            <th>
            </th>
            <th></th>
            <th>Designation</th> 
        </tr>
         <tr>
            <td>Anant Mathur</td>
            <td></td>
            <td>BTBTD21750</td>
            <td></td>
            <td></td>
              <td>DEAN</td>  
                      
        </tr>
         <tr>
            <td> Suhana Malik</td>
            <td></td>
            <td>BTBTH67890</td>
            <td></td>
            <td></td>
              <td>HOD</td>         
                      
        </tr> 
        
        <tr>
            <td> Rita Gupta</td>
            <td></td>
            <td>BTBTF12345</td>
            <td></td>
            <td></td>
              <td>FACULTY</td>         
                      
        </tr> 
        
        
        
        <tr>
            <td> Vijay Kumar</td>
            <td></td>
            <td>BTBTF58670</td>
            <td></td>
            <td></td>
         <td>FACULTY</td>  
                    
        </tr>
         <tr>
            <td> Amit Trivedi</td>
            <td></td>
            <td>BTBTF42521</td>
            <td></td>
            <td></td>
                 <td>FACULTY</td>  
                    
        </tr>
        </table></center>
    </body>
    </form>
</html>
