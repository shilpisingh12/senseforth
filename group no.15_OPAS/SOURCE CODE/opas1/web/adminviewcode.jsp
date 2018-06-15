<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    // String s=request.getParameter("id");
    try
    {
       
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opas","root","");
        Statement stmt=con.createStatement();
        String q="select * from stud1";
        ResultSet rs=stmt.executeQuery(q);
	while(rs.next())
               {
                   out.write("<table border=1 bgcolor=white>");
                   out.write("<tr><th>Enrollment no</th><th>DOB</th><th>First name</th><th>Last name</th><th>Father name</th><th>Mob no.</th><th>Email</th><th>Temporary Address</th><th>Permanent Address</th><th>City</th><th>State</th></tr>");
                   out.write("<tr>");
                   out.write("<td>"+rs.getString(1)+"</td>"+"<td>"+rs.getString(2)+"</td>"+"<td>"+rs.getString(3)+"</td>"+"<td>"+rs.getString(4)+"</td>"+"<td>"+rs.getString(5)+"</td>"+"<td>"+rs.getString(6)+"</td>"+"<td>"+rs.getString(7)+"</td>"+"<td>"+rs.getString(8)+"</td>"+"<td>"+rs.getString(9)+"</td>"+"<td>"+rs.getString(10)+"</td>"+"<td>"+rs.getString(11)+"</td>");
                   out.write("</tr></table>");
                   out.print("<br>");
                //out.print("\n Enrollment no- "+rs.getString(1)+"\n\t\t<br>name-"+rs.getString(2)+"\n\t\t"+rs.getString(3)+"\n\t\t<br>Father name-"+rs.getString(4)+"\t\t<br>Dob-"+rs.getDate(5)+"\t\t<br>mobile no-"+rs.getString(6)+"\t\t<br>email id-"+rs.getString(7)+"\t\t<br>temporary address-"+rs.getString(8)+"\t\t<br>Permanent address"+rs.getString(9)+"\t\t<br>City-"+rs.getString(10)+"\t\t<br>State-"+rs.getString(11));
                    out.print("<br>");
               }  
          // }
    }
        catch(Exception e)
    {
        e.printStackTrace();
    }
%>