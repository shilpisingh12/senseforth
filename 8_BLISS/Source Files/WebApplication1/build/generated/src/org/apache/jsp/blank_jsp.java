package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class blank_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write(" <html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <title>Online Leave Application System</title>\n");
      out.write("        <h1 align=\"center\"><font color=\"navy\" size=\"+5\" face=\"Algerian\"><u>WELCOME TO BANASTHALI VIDYAPITH</u></font></h1>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("  ");
      out.write("\n");
      out.write("  <body style='background: linear-gradient(to right, aqua,deepskyblue)' align='center'>\n");
      out.write("        <h3 align=\"center\"><font color=\"indigo\" size=\"+2\">University for Women: University with a difference</font></h3>\n");
      out.write("        <h2 align=\"center\"><font color=\"royalblue\" size=\"+2\" face=\"Castellar\"><u>WELCOME TO OLAS</u></font></h4>\n");
      out.write("        <h3 align=\"center\"><font color=\"royalblue\" size=\"+2\" face=\"Castellar\">(Online Leave Application System)</font></h3><br>\n");
      out.write("   <h3>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href=\"about us.jsp\"><b>About Us</b></a>\n");
      out.write("      &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href=\"loginnn.jsp\"><b>Login</b></a>\n");
      out.write("      &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href=\"signup.jsp\"><b>Sign up</b></a>\n");
      out.write("      &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href=\"contact uss.jsp\"><b>Contact Us</b></a>\n");
      out.write("      &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href=\"FAQs.jsp\"><b>FAQs</b></a></h3>\n");
      out.write("\n");
      out.write("          <hr color=\"white\">\n");
      out.write("          <h3><font color=\"black\"> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Welcome to Online Leave Application System of Banasthali University\n");
      out.write("                    We help you to complete the Leave Application process easily and efficiently</font></h3>\n");
      out.write("        <marquee ><img src=\"1.jpg\" width=\"20%\" height=\"20%\" position=\"bottom left\" alt=\"img\"/><img src=\"2.jpg\" width=\"20%\" height=\"20%\" position=\"bottom left\" alt=\"img\"/><img src=\"3.jpg\" width=\"20%\" height=\"20%\" position=\"bottom left\" alt=\"img\"/><img src=\"ab.jpg\" width=\"20%\" height=\"50%\" position=\"bottom left\" alt=\"img\"/><img src=\"images(5).jpg\" width=\"20%\" height=\"50%\" position=\"bottom left\" alt=\"img\"/></marquee>   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
