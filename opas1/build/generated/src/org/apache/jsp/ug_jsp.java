package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import query1.*;

public final class ug_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>    \n");
      out.write("<title>ug</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"stsheet.css\"/>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"white\">\n");
      out.write("<form action=\"rfpinsertion.jsp\" method=\"post\" name=\"frm_stud\">   \n");
      out.write("   <h1 align=\"center\"><b><u> EDUCATIONAL QUALIFICATION FORM FOR UG STUDENTS</u></b></h1>\n");
      out.write("<table align=\"center\" cellspacing=\"5\" cellpadding=\"1o\">\n");
      out.write("<tr>\n");
      out.write("<td>Stu_id</td>\n");
      out.write("<td><input type=\"text\" name=\"Stu_id\"></td>\n");
      out.write("<td>Course_id</td>\n");
      out.write("<td><input type=\"text\" name=\"Course_id\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Year_of_10th</td>\n");
      out.write("<td><input type=\"text\" name=\"Year_of_10\"></td>\n");
      out.write("<td>Tot_marks_10</td>\n");
      out.write("<td><input type=\"text\" name=\"Tot_marks_10\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Max_marks_10</td>\n");
      out.write("<td><input type=\"text\" name=\"Max_marks_10\"></td>\n");
      out.write("<td>Per_10</td>\n");
      out.write("<td><input type=\"text\" name=\"Per_10\"></td>\n");
      out.write("</tr> \n");
      out.write("<tr>\n");
      out.write("<td>Year_of_12</td>\n");
      out.write("<td><input type=\"text\" name=\"Year_of_12\"></td>\n");
      out.write("<td>Tot_marks_12</td>\n");
      out.write("<td><input type=\"text\" name=\"Tot_marks_12\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Max_marks_12</td>\n");
      out.write("<td><input type=\"text\" name=\"Max_marks_12\"></td>\n");
      out.write("<td>Per_12</td>\n");
      out.write("<td><input type=\"text\" name=\"Per_12\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>sem1</td>\n");
      out.write("<td><input type=\"text\" name=\"Sem1\"></td>\n");
      out.write("<td>sem2</td>\n");
      out.write("<td><input type=\"text\" name=\"Sem2\"></td>\n");
      out.write("</tr> \n");
      out.write("<tr>\n");
      out.write("<td>sem3</td>\n");
      out.write("<td><input type=\"text\" name=\"Sem3\"></td>\n");
      out.write("<td>sem4</td>\n");
      out.write("<td><input type=\"text\" name=\"Sem4\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>sem5</td>\n");
      out.write("<td><input type=\"text\" name=\"Sem5\"></td>\n");
      out.write("<td>sem6</td>\n");
      out.write("<td><input type=\"text\" name=\"Sem6\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td></td>    \n");
      out.write("</tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr align=\"center\">\n");
      out.write(" <td></td>   \n");
      out.write(" <td></td> \n");
      out.write(" \n");
      out.write(" <td>   \n");
      out.write("<input type=\"submit\" value=\"submit\" name=\"btn_add\">\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("    \n");
      out.write("</form>\n");
      out.write("  <marquee>enter marks carefully</marguee>  \n");
      out.write("</body>    \n");
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
