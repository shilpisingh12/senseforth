package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import query1.*;

public final class exam_005finterface_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("function popup(mylink,windowname)\n");
      out.write("{ if(!window.focus)\n");
      out.write("return true;\n");
      out.write("var href;\n");
      out.write("if(typeof(mylink)=='string')href=mylink;\n");
      out.write("else href=mylink.href;\n");
      out.write("window.open(href,windowname,'width=400,height=200,scrollbars=no');\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <form name=\"hyper\" method=\"post\"  action=\"e_inter.jsp\"  >\n");
      out.write("          \n");
      out.write("           <center>\n");
      out.write("            <table>\n");
      out.write("                \n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"list.jsp\"onClick=\"return popup(this,'hello')\">Click to see the details</a>\n");
      out.write("       <!-- <a href=\"list.jsp\">Click to see the details</a>-->\n");
      out.write("        <input type=\"text\" name=\"uid\" /></td>\n");
      out.write("               \n");
      out.write("     \n");
      out.write("       \n");
      out.write("    \n");
      out.write("                    <th><font size=\"4pt\">Select Year</font></th>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                    <select class=\"div\" name=\"yr\">\n");
      out.write("                        <option selected>2014</option selected>\n");
      out.write("                         <option>2015\n");
      out.write("                         <option>2016\n");
      out.write("                         </option></option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("              \n");
      out.write("            </table>\n");
      out.write("           </center>   \n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("           <center><input style=\"height:40px;font-size:14pt\" type=\"submit\" value=\"Submit\" name=\"submit\"></center>\n");
      out.write("        \n");
      out.write("     \n");
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
