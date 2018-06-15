package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import query1.*;

public final class forgetpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>forget password</title>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("<form action=\"forget.jsp\" method=\"post\" name=\"frm_stud\">\n");
      out.write(" <h1 align=\"center\"><b><u> FORGET PASSWORD FORM</u></b></h1> \n");
      out.write("<table align=\"center\" cellspacing=\"5\" cellpadding=\"1o\" >\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr></tr>\n");
      out.write("<tr>\n");
      out.write("<td> user name:</td>\n");
      out.write("<td><input type=\"text\" name=\"id\"></td>\n");
      out.write(" <tr>\n");
      out.write("\t\t\t\t<td>question:</td> \n");
      out.write("                                 <td>\n");
      out.write("                              <select name=\"qn\">\n");
      out.write("                              <option>ur best frd name</option>\n");
      out.write("                              <option>email id</option>\n");
      out.write("                              <option>mobile no</option>\n");
      out.write("                              <option>ur pet name</option>\n");
      out.write("                              </select>\n");
      out.write("                               </td>      \n");
      out.write("\t\t\t</tr>\n");
      out.write("<td> answer:</td>\n");
      out.write("<td><input type=\"text\" name=\"a\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write(" <td>\n");
      out.write(" </td>    \n");
      out.write(" <td>\n");
      out.write("<input type=\"submit\" value=\"submit\" name=\"submit1\" />\n");
      out.write(" </td>         \n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write(" <br><br><br><br><br><br><br><br><br>\n");
      out.write("             <div>\n");
      out.write("                 <img src=\"footer.jpg\">\n");
      out.write("</div>\n");
      out.write(" </form>   \n");
      out.write(" </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
