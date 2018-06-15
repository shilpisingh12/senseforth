package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import query1.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<style>\n");
      out.write("form {\n");
      out.write("    border: 3px solid #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("    width: 100%;\n");
      out.write("    height: 10%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 80%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("    opacity: 0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".imgcontainer {\n");
      out.write("    text-align: center;\n");
      out.write("    margin: 24px 0 12px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img.avatar {\n");
      out.write("    width: 15%;\n");
      out.write("    border-radius: 15%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    padding: 16px;\n");
      out.write("}\n");
      out.write("span.psw {\n");
      out.write("    float: right;\n");
      out.write("    padding-top: 16px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("<div>\n");
      out.write("<form action=\"dbinsertion.jsp\" name=\"myForm\"><div class=\"imgcontainer\">\n");
      out.write("<img src=\"img_avatar2.png\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("</div>\n");
      out.write("<div class=\"container\">  \n");
      out.write(" <h1 align=\"center\"><b><u>REGISTERATION FORM</u></b></h1>   \n");
      out.write("<table border=\"0\" align=\"center\">\t\t\t\n");
      out.write("<tr>\t\t\t\t\n");
      out.write("<td><b><u>Userid:</u></b></td>\t\t\t\t\n");
      out.write("<td><input type=\"text\" name=\"name\"></td>\t\t\t\n");
      out.write("</tr> \t\t\t\t\t\n");
      out.write("<tr>\t\t\t\n");
      out.write("<td><b><u>Role:</u></b></td>                                  \n");
      out.write("<td><input type=\"radio\" name=\"role\" value=\"student\">student</td>                                 \n");
      out.write("<td><input type=\"radio\" name=\"role\" value=\"admin\">admin</td>\t\t\t\n");
      out.write("</tr>\t\t\t\n");
      out.write("<tr>\t\t\t\t\n");
      out.write("<td><b><u>Password:</u></b></td>\t\t\t\t\n");
      out.write("<td><input type=\"password\" name=\"password\"></td>                    \n");
      out.write("</tr>\t\t\t\n");
      out.write("<tr>\t\t\t\t\n");
      out.write("<td><b><u>Question:</u></b></td>                                 \n");
      out.write("<td>                         \n");
      out.write("<select name=\"qn\">                             \n");
      out.write("<option>ur best frd name</option>                            \n");
      out.write("<option>email id</option>                           \n");
      out.write("<option>mobile no</option>                             \n");
      out.write("<option>ur pet name</option>                             \n");
      out.write("</select>                             \n");
      out.write("</td>      \t\t\t\n");
      out.write("</tr>\t\t\t\n");
      out.write("<tr>\t\t\t\t\n");
      out.write("<td><b><u>Answer:</u></b></td>\t\t\t\t\n");
      out.write("<td><input type=\"password\" name=\"a\"></td>\t\t\t\n");
      out.write("</tr>\t\t\t\n");
      out.write("<tr>\t\t\t\t\n");
      out.write("<td colspan=\"3\"><center><input type=\"Submit\" name=\"btn_submit\" value=\"Submit\"></center></td>\t\t\t\n");
      out.write("</tr>\n");
      out.write("                \n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("<img src=\"footer.jpg\">\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("</body>\n");
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
