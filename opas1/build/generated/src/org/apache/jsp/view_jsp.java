package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("<html>  \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Jsp page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"p1\">\n");
      out.write("        <form  method=\"post\" name=\"frm_stud\">\n");
      out.write("            <h1 align=\"center\"><b><u>VIEW YOUR DETAILS </u></b></h1>\n");
      out.write("            <table align=\"center\">\n");
      out.write("<tr>\n");
      out.write("<td> enrollment no:</td>\n");
      out.write("<td><input type=\"text\" name=\"id\"></td>\n");
      out.write("<td>\n");
      out.write("<input type=\"submit\" value=\"submit\" name=\"submit1\" />\n");
      out.write(" </td>         \n");
      out.write("</tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("</table>\n");
      out.write(" </form>   \n");

     String s=request.getParameter("id");
    try
    {
       
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/opas","root","");
        Statement stmt=con.createStatement();
        String q="select * from stud1 where id='"+s+"'";
           ResultSet rs=stmt.executeQuery(q);
	while(rs.next())
               { 
                   out.write("<table border=1 bgcolor=white>");
                   out.write("<tr><th>Enrollment no</th><th>DOB</th><th>Fname name</th><th>Last name</th><th>Father name</th><th>Mob no.</th><th>Email</th><th>Temporary Address</th><th>Permanent Address</th><th>City</th><th>State</th></tr>");
                   out.write("<tr>");
                   out.write("<td>"+rs.getString(1)+"</td>"+"<td>"+rs.getString(2)+"</td>"+"<td>"+rs.getString(3)+"</td>"+"<td>"+rs.getString(4)+"</td>"+"<td>"+rs.getString(5)+"</td>"+"<td>"+rs.getString(6)+"</td>"+"<td>"+rs.getString(7)+"</td>"+"<td>"+rs.getString(8)+"</td>"+"<td>"+rs.getString(9)+"</td>"+"<td>"+rs.getString(10)+"</td>"+"<td>"+rs.getString(11)+"</td>");
                   out.write("</tr></table>");
                   out.print("<br>");
               }  
              }
        catch(Exception e)
    {
        e.printStackTrace();
    }

      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
