package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class conti_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("            .p{\n");
      out.write("                color:indigo; font-family:algerian;font-size:40px;font-weight:bold\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                height:30px;font-size:14pt;\n");
      out.write("            }\n");
      out.write("            .d{\n");
      out.write("                font-size:20pt;font-style:normal;font-weight:bolder \n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color:lemonchiffon\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("        <table  align=\"center\">\n");
      out.write("            <h1 align=\"center\"><u><b>Continuous Assessment Table</b></u></h1>\n");
      out.write("             <tr>\n");
      out.write("                 <td><b>Class/Semester:</b></td>\n");
      out.write("                 <td><input class=\"input\" size=\"30\" type=\"text\" ></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                 <td><b>Course/Paper:</b></td>\n");
      out.write("                 <td><input class=\"input\" size=\"30\" type=\"text\" ></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                 <td><b>No. of Students in class:</b></td>\n");
      out.write("                 <td><input class=\"input\" size=\"30\" type=\"text\" ></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                 <td><b>Continuous Assessment Project:</b></td>\n");
      out.write("                 <td><input class=\"input\" size=\"30\" type=\"text\" ></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr></tr>\n");
      out.write("<tr>\n");
      out.write("    <td></td>\n");
      out.write("    </table>\n");
      out.write("            <center><input type=\"button\" value=\"submit\">\n");
      out.write("         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"button\" value=\"more\">\n");
      out.write("            </center>\n");
      out.write("           \n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("          \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
