package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reachbanas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header_home.jsp", out, false);
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"black\">\n");
      out.write("                \n");
      out.write("        <a href=\"home_demo.jsp\"><font size=\"5\" color=\"green\">&lt;&lt;Home</font></a>        \n");
      out.write("    <H1><font color=\"white\">HOW TO REACH</font></H1><HR>       \n");
      out.write("    <center>   <img src=\"rajasthan1.jpg\" align=\"center\"></center>\n");
      out.write("        <br> <font color=\"white\">Banasthali is well linked by road, rail and air :\n");
      out.write("     <br>\n");
      out.write("     <br>\n");
      out.write("ROAD LINK :\n");
      out.write("72 km. from Jaipur. 8 km. off. Jaipur-Kota Road at 65 km. stone. There are 14 buses of Rajasthan Roadways Transport Corporation at Jaipur-Banasthali route.\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("RAIL LINK :\n");
      out.write("Banasthali Newai Railway station is on the Jaipur-Swaimadhopur-Mumbai broad gauge line of the Western Railway. It is equidistance from Jaipur and Swaimadhopur, 66 Kms from both.\n");
      out.write("\n");
      out.write("Jaipur is on Delhi-Ahmedabad Broad-guage main line of Western Railway and there are direct trains to Jaipur from Delhi-Junction, Agra Fort, Ahmedabad, Indore, Mumbai, Udaipur, Bikaner, Jodhpur, Chennai, Bangalore, Howrah etc.\n");
      out.write("\n");
      out.write("Swaimadhopur is on Delhi-Mumbai Central Broad gauge main line of the Western Railways. Their are direct trains to Swaimadhopur from Agra Fort also.\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("AIR LINK : Banasthali has its own licenced Air Field (09/26). Jaipur Airport is 59 km.\n");
      out.write("\n");
      out.write("  \n");
      out.write("    \n");
      out.write("</font>\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer_home.jsp", out, false);
      out.write("\n");
      out.write("   ");

       
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>     \n");
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
