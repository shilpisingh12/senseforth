package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_005flink_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 if(session.getAttribute("userid")!=null)
{

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            function preventBack(){window.history.forward();}\n");
      out.write("            setTimeout(\"preventBack()\",0);\n");
      out.write("            window.onunload=function(){null};\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#ac2d9f\">\n");
      out.write("        <a href=\"personal.jsp\" target=\"f2\"><font size=\"3px\" color=\"white\">Personal_Details</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <a href=\"continuous.jsp\" target=\"f2\"><font size=\"3px\" color=\"white\">Continuous_Assessment</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <a href=\"otheracadmic_respo.jsp\" target=\"f2\"><font size=\"3px\" color=\"white\">Academic_Details</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <a href=\"departmental_respo.jsp\" target=\"f2\"><font size=\"3px\" color=\"white\">Departmental_Responsibilities</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("         <a href=\"invigilation.jsp\" target=\"f2\"><font size=\"3px\" color=\"white\">Invigilation</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("          <a href=\"institutional_respo.jsp\" target=\"f2\"><font size=\"3px\" color=\"white\">Institution_responsibilities</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("           <a href=\"workshop.jsp\" target=\"f2\"><font size=\"3px\" color=\"white\">Workshop</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("           <a href=\"download.jsp\" target=\"f2\"><font size=\"3px\" color=\"white\">Documents</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("           <!--<a href=\"logout.jsp\" target=\"_top\"><font size=\"4px\">Logout</font></a>-->\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" ");
}
else
response.sendRedirect("login.jsp");

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
