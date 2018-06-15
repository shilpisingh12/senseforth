package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import query1.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <title>LOGIN PAGE</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("    function validation()\n");
      out.write("    {\n");
      out.write("        \n");
      out.write("        var valid=true;\n");
      out.write("     \n");
      out.write("        var a = document.getElementById(\"uid\");\n");
      out.write("        if(a == \"\")\n");
      out.write("                            {\n");
      out.write("            alert(\"Enter the id\"); \n");
      out.write("            document.myform.uid.focus();\n");
      out.write("          return false;\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            return valid;\n");
      out.write("         \n");
      out.write("         \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"white\">\n");
      out.write("        <form name=\"myform\" method=\"get\" action=\"create1.jsp\" onclick=\"return validation();\">\n");
      out.write("             <h1 align=\"center\"><b><u>LOGIN PAGE </u></b></h1>\n");
      out.write("            <center>\n");
      out.write("            <table>\n");
      out.write("                <tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        User ID:\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"uid\"  />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        Password:\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"password\" name=\"psw\"  />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("                <tr>                      \n");
      out.write("                  <td>role:</td>\n");
      out.write("                  <td>\n");
      out.write("                 <select name=\"ad\">\n");
      out.write("              <option>admin</option>\n");
      out.write("                 <option>student</option>\n");
      out.write("                 </select>\n");
      out.write("                  </td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"submit\" value=\"submit\" name=\"submit1\" />\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                 <a href=\"forgetpassword.jsp\">forget password?</a><br>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("                </center>\n");
      out.write("             <br><br><br><br><br><br><br><br><br>\n");
      out.write("             <div>\n");
      out.write("                 <img src=\"footer.jpg\">\n");
      out.write("</div>\n");
      out.write("        </form>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("        \n");


                    // try
      // {
          // out.println("sub");
          // if(request.getParameter("sub")!=null)
          // {
              // out.println("sub");
              // 
              // response.sendRedirect("forgetpassword.jsp");
          // }
     //}
           //catch(Exception ex)
//{
 //ex.printStackTrace();
//}                
//
      out.write("\n");
      out.write("\n");
      out.write(" </body>\n");
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
