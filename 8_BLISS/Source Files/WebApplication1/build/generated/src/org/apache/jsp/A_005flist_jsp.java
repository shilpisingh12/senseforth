package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class A_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <script>\n");
      out.write("            function valid()\n");
      out.write("            {\n");
      out.write("                windows.open(\"A_list.jsp\",null,\"height=200,width=400,status=yes,tollbar=no,menubar=no,location=no\");\n");
      out.write("            }\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <form name=\"A_list.jsp\">\n");
      out.write("    <body>\n");
      out.write("    <center><h3><b> Faculty Members </b></h3></center>\n");
      out.write("    <center>    <table>\n");
      out.write("          \n");
      out.write("            <tr>\n");
      out.write("            <th>Faculty name</th>\n");
      out.write("            <th></th>\n");
      out.write("            <th>Faculty ID </th>\n");
      out.write("            <th>\n");
      out.write("            </th>\n");
      out.write("            <th></th>\n");
      out.write("            <th>Designation</th> \n");
      out.write("        </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td>Anant Mathur</td>\n");
      out.write("            <td></td>\n");
      out.write("            <td>BTBTD21750</td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("              <td>DEAN</td>  \n");
      out.write("                      \n");
      out.write("        </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td> Anshulika Rathore</td>\n");
      out.write("            <td></td>\n");
      out.write("            <td>BTBTH67890</td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("              <td>HOD</td>         \n");
      out.write("                      \n");
      out.write("        </tr> \n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            <td> Amandeep</td>\n");
      out.write("            <td></td>\n");
      out.write("            <td>BTBTF12345</td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("              <td>FACULTY</td>         \n");
      out.write("                      \n");
      out.write("        </tr> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            <td> Vijay Malya</td>\n");
      out.write("            <td></td>\n");
      out.write("            <td>BTBTF58670</td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("         <td>FACULTY</td>  \n");
      out.write("                    \n");
      out.write("        </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td> Amit Trivedi</td>\n");
      out.write("            <td></td>\n");
      out.write("            <td>BTBTF42521</td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("                 <td>FACULTY</td>  \n");
      out.write("                    \n");
      out.write("        </tr>\n");
      out.write("        </table></center>\n");
      out.write("    </body>\n");
      out.write("    </form>\n");
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
