package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class adminviewcode_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

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
                   out.write("<tr><th>Enrollment no</th><th>First name</th><th>Last name</th><th>Father name</th><th>DOB</th><th>Mob no.</th><th>Email</th><th>Temporary Address</th><th>Permanent Address</th><th>City</th><th>State</th></tr>");
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

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
