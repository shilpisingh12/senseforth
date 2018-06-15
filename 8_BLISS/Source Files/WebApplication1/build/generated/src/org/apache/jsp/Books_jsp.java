package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import query1.*;
import java.sql.*;

public final class Books_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table  align=\"center\" border=\"1\">\n");
      out.write("            <h1 align=\"center\"><u><b>Books</b></u></h1>\n");
      out.write("             <tr>\n");
      out.write("                 <th  size=\"30\">Books Type</th>\n");
      out.write("            \n");
      out.write("                  <th  size=\"30\">Title</th>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("                  \n");
      out.write("                  <th> Author(s)</th>\n");
      out.write("                 <th> Name of publishers</th>\n");
      out.write("                 <th>Date of publication</th>\n");
      out.write("                 <th>Credit Points</th>\n");
      out.write("             </tr>\n");
      out.write("        \n");
      out.write("             ");

                 try{
               
             percon q=new percon();
ResultSet rs=null,rs1=null;
       rs= q.get_data("select * from continuous where uid='"+session.getAttribute("userid")+"'");
   while(rs.next())
   {
                 

      out.write("\n");
      out.write("<center>\n");
      out.write("  \n");
      out.write("             <tr >\n");
      out.write("                 <td><input size=\"30\" type=\"text\" value=\"");
      out.print(rs.getString(2));
      out.write("\"></td>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                \n");
      out.write("                 <td><input size=\"30\" type=\"text\" value=\"");
      out.print(rs.getString(3));
      out.write("\"></td>\n");
      out.write("            \n");
      out.write("                 \n");
      out.write("                 <td><input size=\"30\" type=\"text\" value=\"");
      out.print(rs.getString(4));
      out.write("\"> </td>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                 <td><input size=\"30\" type=\"text\" value=\"");
      out.print(rs.getString(5));
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("           ");
 }
      out.write("\n");
      out.write("</center>\n");
      out.write("        </table>\n");
      out.write("           \n");
      out.write("        \n");
      out.write("       \n");
      out.write("          \n");
      out.write("          \n");
      out.write("    </body>\n");
      out.write("</html>\n");
 } catch(Exception e)
        {
        
        }

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("  \n");
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
