package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import query1.*;

public final class timetable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("          <style type=\"text/css\">\n");
      out.write("            .p1{\n");
      out.write("                 font-family:Andalus;font-size:50px;font-weight:bold\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                height:50px;font-size:12pt;\n");
      out.write("            }\n");
      out.write("            .d{\n");
      out.write("                font-size:15pt;font-style:normal;font-weight:bolder; height:60px\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color:beige\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"continuous\" method=\"get\">\n");
      out.write("        <table align=\"center\" border=\"1\">\n");
      out.write("            <h1 align=\"center\"><b class=\"p1\">Time Table</b></h1>\n");
      out.write("             <tr>\n");
      out.write("                 <th class=\"d\" bgcolor=\"silver\">Days</th>\n");
      out.write("            \n");
      out.write("                  <th class=\"d\" bgcolor=\"silver\">9:00-10:00</th>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("                  \n");
      out.write("               <th class=\"d\" bgcolor=\"silver\">10:00-11:00</th>\n");
      out.write("            \n");
      out.write("                   \n");
      out.write("              <th class=\"d\" bgcolor=\"silver\">11:00-12:00</th>\n");
      out.write("            \n");
      out.write("           <th class=\"d\" bgcolor=\"silver\">12:00-1:00</th>\n");
      out.write("            <th class=\"d\" bgcolor=\"silver\">1:00-3:00</th>\n");
      out.write("             <th class=\"d\" bgcolor=\"silver\">3:00-4:00</th>\n");
      out.write("              <th class=\"d\" bgcolor=\"silver\">4:00-5:00</th>\n");
      out.write("                   \n");
      out.write("                  \n");
      out.write("             </tr>\n");
      out.write("        \n");
      out.write("      ");
 try
      {
          boolean status=false;
      
NewClass q=new NewClass();
ResultSet rs=q.get_data("select * from timetable");
status=rs.next();
      while(rs.next())
   {
                 

      out.write("\n");
      out.write("<center>\n");
      out.write("  \n");
      out.write("             <tr >\n");
      out.write("                 <td><input  class=\"input\" size=\"30\" type=\"text\" height=\"10\" value=\"");
      out.print(rs.getString(1));
      out.write("\"></td>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                \n");
      out.write("                 <td><input class=\"input\" size=\"30\" type=\"text\" value=\"");
      out.print(rs.getString(2));
      out.write("\"></td>\n");
      out.write("            \n");
      out.write("                 \n");
      out.write("                 <td><input class=\"input\" size=\"30\" type=\"text\" value=\"");
      out.print(rs.getString(3));
      out.write("\"></td>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                 <td><input class=\"input\" size=\"40\" type=\"text\" value=\"");
      out.print(rs.getString(4));
      out.write("\"></td>\n");
      out.write("                    <td><input class=\"input\" size=\"40\" type=\"text\" value=\"");
      out.print(rs.getString(5));
      out.write("\"></td>\n");
      out.write("                       <td><input class=\"input\" size=\"40\" type=\"text\" value=\"");
      out.print(rs.getString(6));
      out.write("\"></td>\n");
      out.write("                          <td><input class=\"input\" size=\"40\" type=\"text\" value=\"");
      out.print(rs.getString(7));
      out.write("\"></td>\n");
      out.write("                          <td><input class=\"input\" size=\"40\" type=\"text\" value=\"");
      out.print(rs.getString(8));
      out.write("\"></td>\n");
      out.write("                          \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("           ");
 }
      out.write("\n");
      out.write("           \n");
      out.write("</center>\n");
      out.write("        </table>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        </form>     \n");
      out.write("          \n");
      out.write("    </body>\n");
      out.write("</html>\n");
 }
catch(Exception e)
        {
        
        }
      out.write("\n");
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
