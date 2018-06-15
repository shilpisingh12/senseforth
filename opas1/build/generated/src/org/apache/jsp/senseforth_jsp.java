package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class senseforth_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head><title></title></head>\n");
      out.write("<body bgcolor=\"#6495ED\">\n");
      out.write("<img src=\"budd.jpg\" usemap=\"#wmap\" alt=\"im\">\n");
      out.write("<map name=\"wmap\">\n");
      out.write("<area shape=\"rect\" coords=\"131,124,230,147\" href=\"aboutus.jsp\" target=\"mid\" alt =\"raj\">\n");
      out.write("<area shape=\"rect\" coords=\"368,126,486,146\" href=\"contactus.jsp\" target=\"mid\" alt =\"raj\">\n");
      out.write("<area shape=\"rect\" coords=\"671,127,761,146\" href=\"register.jsp\" target=\"-new\" alt =\"raj\">\n");
      out.write("<area shape=\"rect\" coords=\"946,124,1023,146\" href=\"login.jsp\" target=\"-new\" alt =\"raj\">\n");
      out.write("</map>\n");
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
