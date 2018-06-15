package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<!--\n");
      out.write("Template Name: Touch of Purple\n");
      out.write("Author: <a href=\"http://www.os-templates.com/\">OS Templates</a>\n");
      out.write("Author URI: http://www.os-templates.com/\n");
      out.write("Licence: Free to use under our free template licence terms\n");
      out.write("Licence URI: http://www.os-templates.com/template-terms\n");
      out.write("-->\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>BLISS</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"layout/styles/layout.css\" type=\"text/css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"layout/scripts/jquery.min.js\"></script>\n");
      out.write("<!-- Waterwheel Carousel -->\n");
      out.write("<script type=\"text/javascript\" src=\"layout/scripts/carousel/jquery.waterwheelCarousel.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"layout/scripts/carousel/jquery.waterwheelCarousel.setup.js\"></script>\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write("             \n");
      out.write("    function validation()\n");
      out.write("    {\n");
      out.write("        \n");
      out.write("       var uid=document.myform.uid.value;\n");
      out.write("       var psw=document.myform.psw.value;  \n");
      out.write("        if(uid==null||uid==\"\")\n");
      out.write("                            {\n");
      out.write("            alert(\"Enter the id\"); \n");
      out.write("           ");
      out.write("\n");
      out.write("          return false;\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("            else if(psw==null||psw==\"\")\n");
      out.write("            {\n");
      out.write("                alert(\"enter the password\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("         \n");
      out.write("         \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("   \n");
      out.write("  \n");
      out.write("</script>\n");
      out.write("           <style type=\"text/css\">\n");
      out.write("            .p{\n");
      out.write("                color:indigo; font-family:algerian;font-size:40px;font-weight:bold;z-index:5\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .input{\n");
      out.write("                height:40px;font-size:14pt;\n");
      out.write("            }\n");
      out.write("            .input1{\n");
      out.write("                height:40px;font-size:14pt;width:208px\n");
      out.write("            }\n");
      out.write("            .d{\n");
      out.write("                font-size:20pt;font-style:normal;font-weight:bolder \n");
      out.write("            }\n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("<!-- / Waterwheel Carousel -->\n");
      out.write("</head>\n");
      out.write("<body id=\"top\" bgcolor=\"black\">\n");
      out.write("<div class=\"wrapper col1\">\n");
      out.write("  <div id=\"header\">\n");
      out.write("    <div class=\"fl_left\">\n");
      out.write("      <h1><a href=\"index.html\">BANASTHALI VIDYAPITH</a></h1>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    <div class=\"fl_right\"><a href=\"#\"><img src=\"images/demo/468x60.gif\" alt=\"\" /></a></div>\n");
      out.write("    <br class=\"clear\" />\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- ####################################################################################################### -->\n");
      out.write("<div class=\"wrapper col2\">\n");
      out.write("  <div id=\"topbar\">\n");
      out.write("    <div id=\"topnav\">\n");
      out.write("      <ul>\n");
      out.write("        <li class=\"active\"><a href=\"sample.jsp\">Home</a></li>\n");
      out.write("        <li><a href=\"about us.jsp\">ABOUT US</a></li>\n");
      out.write("          <li><a href=\"contact.jsp\">CONTACT US</a></li>\n");
      out.write("        <li><a href=\"reachbanas.jsp\">HOW TO REACH BANASTHALI</a></li>\n");
      out.write("        \n");
      out.write("          <li><a href=\"login.jsp\">LOGIN</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"search\">\n");
      out.write("     \n");
      out.write("        <fieldset>\n");
      out.write("          <legend>Site Search</legend>\n");
      out.write("          <input type=\"text\" value=\"Search Our Website&hellip;\"  onfocus=\"this.value=(this.value=='Search Our Website&hellip;')? '' : this.value ;\" />\n");
      out.write("          <input type=\"submit\" name=\"go\" id=\"go\" value=\"Search\" />\n");
      out.write("        </fieldset>\n");
      out.write("   \n");
      out.write("    </div>\n");
      out.write("    <br class=\"clear\" />\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("   \n");
      out.write("    <h1 align=\"center\"><b><h1>Banasthali Libralization Incentive Scheme for Staff</h1></b></h1>\n");
      out.write("        <form name=\"myform\" method=\"get\" action=\"create1.jsp\">\n");
      out.write("                        \n");
      out.write("            <center>\n");
      out.write("                <table border=\"0\">    \n");
      out.write("                    \n");
      out.write("                    <h2>  User Id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input  class=input type=\"text\" name=\"uid\" placeholder=\"UserId\" ></h2>\n");
      out.write("                    \n");
      out.write("                       \n");
      out.write("                  \n");
      out.write("                    <h2>  Password:\n");
      out.write("                           \n");
      out.write("                        \n");
      out.write("                \n");
      out.write("                        <input  class=input type=\"password\" name=\"psw\" placeholder=\"Password\" ></h2><br>\n");
      out.write("                   \n");
      out.write("                            <h2> <input class=input type=\"submit\" value=\"submit\" name=\"submit\" onclick=\"return validation();\"/>\n");
      out.write("                                 \n");
      out.write("                        <a href=\"forgot.jsp\">forgot password?</h2></a>\n");
      out.write("                   \n");
      out.write("              \n");
      out.write("                        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("              </table>\n");
      out.write("            </center>\n");
      out.write("            <div class=\"wrapper col4\">\n");
      out.write("  <div id=\"featured_intro\">\n");
      out.write("    <div class=\"fl_left\">\n");
      out.write("      <h2>BLISS</h2>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("    <br class=\"clear\" />\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        </form>\n");
      out.write("   \n");
      out.write("    \n");
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
