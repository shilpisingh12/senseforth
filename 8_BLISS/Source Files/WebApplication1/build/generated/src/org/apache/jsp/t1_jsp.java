package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class t1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("   \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("            .p1{\n");
      out.write("                 font-family:Andalus;font-size:50px;font-weight:bold\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                height:30px;font-size:10pt;\n");
      out.write("            }\n");
      out.write("            .d{\n");
      out.write("                font-size:12pt;font-style:normal;font-weight:bolder \n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color:beige\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body bgcolor=\"beige\">\n");
      out.write("<form>\n");
      out.write("    <BR>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("<table border=\"1\" align=\"center\" cellspacing=\"2\" cellpadding=\"2\" bgcolor=\"white\">\n");
      out.write("    <caption class=\"d\"><font size=\"10px\">Time Table of Rita Gupta</font></caption>\n");
      out.write("<tr>\n");
      out.write("<th class=\"d\" bgcolor=\"silver\">Day/Time</th>\n");
      out.write("<th class=\"d\" bgcolor=\"silver\">9-10am</th>\n");
      out.write("<th class=\"d\" bgcolor=\"silver\">10-11am</th>\n");
      out.write("<th class=\"d\" bgcolor=\"silver\">11-12pm</th>\n");
      out.write("<th class=\"d\" bgcolor=\"silver\">12-1pm</th>\n");
      out.write("<th class=\"d\" bgcolor=\"silver\">1-2pm</th>\n");
      out.write("<th class=\"d\" bgcolor=\"silver\">2-3pm</th>\n");
      out.write("<th class=\"d\" bgcolor=\"silver\">3-4pm</th>\n");
      out.write("<th class=\"d\" bgcolor=\"silver\">4-5pm</th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th class=\"d\" bgcolor=\"silver\">Wed</th>\n");
      out.write("<td><input type=\"text\" name=\"1\" value=\"SE (Btech(IT)III yr)\"></td>\n");
      out.write("<td><input  type=\"text\" name=\"2\" value=\"OS (Btech I yr)\"></td>\n");
      out.write("<td colspan=\"2\"><input type=\"text\" name=\"3\" value=\"Lab batch-A(Btech I yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"4\"></td>\n");
      out.write("<td><input type=\"text\" name=\"5\"></td>\n");
      out.write("<td><input type=\"text\" name=\"6\" value=\"SAD (Btech II yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"7\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th class=\"d\" bgcolor=\"silver\">Thu</th>\n");
      out.write("<td><input type=\"text\" name=\"8\" value=\"SE (Btech(IT)III yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"9\" value=\"SE (Btech I yr)\"></td>\n");
      out.write("<td colspan=\"2\"><input type=\"text\" name=\"10\" value=\"Lab batch-B(Btech I yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"11\"></td>\n");
      out.write("<td><input type=\"text\" name=\"12\"></td>\n");
      out.write("<td><input type=\"text\" name=\"13\" value=\"SAD (Btech II yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"14\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th class=\"d\" bgcolor=\"silver\">Fri</th>\n");
      out.write("<td><input type=\"text\" name=\"15\" ></td>\n");
      out.write("<td><input type=\"text\" name=\"16\" value=\"SAD (Btech(IT)II yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"17\"></td>\n");
      out.write("<td><input type=\"text\" name=\"43\"></td>\n");
      out.write("<td><input type=\"text\" name=\"18\" value=\"OS (Btech I yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"19\" value=\"SE (Btech(IT)III yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"20\" value=\"SAD (Btech(CS)II yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"21\" ></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th class=\"d\" bgcolor=\"silver\">Sat</th>\n");
      out.write("<td><input type=\"text\" name=\"22\"></td>\n");
      out.write("<td><input type=\"text\" name=\"23\" value=\"SAD (Btech(IT)II yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"24\"></td>\n");
      out.write("<td><input type=\"text\" name=\"44\"></td>\n");
      out.write("<td><input type=\"text\" name=\"25\" value=\"OS (Btech I yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"26\" value=\"SE (Btech(IT)III yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"27\" value=\"SAD (Btech(CS)II yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"28\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th class=\"d\" bgcolor=\"silver\">Sun</th>\n");
      out.write("<td colspan=\"2\"><input type=\"text\" name=\"29\" value=\"Lab batch-A(Btech(CS)II yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"30\" value=\"SAD (Btech(IT)II yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"31\"></td>\n");
      out.write("<td><input type=\"text\" name=\"32\" value=\"OS (Btech(CS)II yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"33\" value=\"SE (Btech(IT)III yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"34\" value=\"SAD (Btech I yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"35\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th class=\"d\" bgcolor=\"silver\">Mon</th>\n");
      out.write("<td colspan=\"2\"><input type=\"text\" name=\"36\" value=\"Lab batch-A(Btech(CS)II yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"37\" value=\"SAD (Btech(IT)II yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"38\"></td>\n");
      out.write("<td><input type=\"text\" name=\"39\" value=\"OS (Btech(CS)II yr)\"></td>\n");
      out.write("<td><input type=\"text\" value=\"SE (Btech(IT)III yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"41\" value=\"SAD (Btech I yr)\"></td>\n");
      out.write("<td><input type=\"text\" name=\"42\"></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</body>\n");
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
