package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class f_005finterface_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    if(session.getAttribute("userid")!=null)
    {
        
      out.write("\n");
      out.write("    \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <title>INTERFACE PAGE</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("        .p\n");
      out.write("        {\n");
      out.write("           background-color:silver;\n");
      out.write("        }\n");
      out.write("       </style>\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <frameset rows=\"20%,72%,*\">\n");
      out.write("        <frame class=\"p\" src=\"header1.jsp\" allowTransparency=\"true\" frameborder=\"0\" scrolling=\"no\"></frame>\n");
      out.write("        <frameset cols=\"10%,*\" name=\"f5\">\n");
      out.write("             <body bgcolor=\"black\">\n");
      out.write("            <frame src=\"f_link.jsp\" frameborder=\"0\">\n");
      out.write("                \n");
      out.write("            </frame>\n");
      out.write("             <frame name=\"f1\" frameborder=\"0\" src=\"marque1.jsp\" scrolling=\"0\" background-color=\"black\"></frame>\n");
      out.write("            \n");
      out.write("        </frameset>\n");
      out.write("        \n");
      out.write("  <frame class=\"p\" src=\"Footer.jsp\" allowTransparency=\"true\" frameborder=\"0\" scrolling=\"no\"></frame>\n");
      out.write("    </frameset>\n");
      out.write("        \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
