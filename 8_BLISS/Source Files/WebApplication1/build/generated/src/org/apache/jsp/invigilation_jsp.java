package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import query1.*;
import java.sql.*;

public final class invigilation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("     <style type=\"text/css\">\n");
      out.write("            .p1{\n");
      out.write("                font-family:Andalus;font-size:50px;font-weight:bold\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                height:50px;font-size:12pt;\n");
      out.write("            }\n");
      out.write("            .d{\n");
      out.write("                height:30px;font-size:14pt;font-style:normal;font-weight:bolder \n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color:beige\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("         <form name=\"invigilation\" method=\"get\"  action=\"departmental_respo.jsp\" >\n");
      out.write("        <table  align=\"center\" border=\"1\">\n");
      out.write("            <h1 align=\"center\"><b class=\"p1\">Invigilation</b></h1>\n");
      out.write("             <tr>\n");
      out.write("                 <th class=\"d\" bgcolor=\"silver\" rowspan=\"2\" size=\"20\">Exam</th>\n");
      out.write("            \n");
      out.write("                  <th class=\"d\" bgcolor=\"silver\" rowspan=\"2\" size=\"20\">Invigilation_Duties</th>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("                  \n");
      out.write("               <th class=\"d\" bgcolor=\"silver\" rowspan=\"2\">Duties_Attended</th>\n");
      out.write("            \n");
      out.write("                   \n");
      out.write("              <th class=\"d\" bgcolor=\"silver\" rowspan=\"2\" size=\"10\">Unauthorized_Absent</th>\n");
      out.write("              <th class=\"d\" bgcolor=\"silver\" rowspan=\"2\" size=\"10\">Quality_of_Invigilation</th> \n");
      out.write("              <th class=\"d\" bgcolor=\"silver\" colspan=\"2\">Credit_Points</th>\n");
      out.write("                   \n");
      out.write("                  \n");
      out.write("             </tr>\n");
      out.write("             <tr>\n");
      out.write("                 <th class=\"d\" bgcolor=\"silver\">Full</th>\n");
      out.write("                 <th class=\"d\" bgcolor=\"silver\">Obtained</th>\n");
      out.write("             </tr>\n");
      out.write("        \n");
      out.write("             ");

                 try{
               
             percon q=new percon();
           ResultSet rs=null,rs1=null;
       rs= q.get_data("select * from invigilation where uid='"+session.getAttribute("userid")+"'and Year="+session.getAttribute("year1")+"");
   while(rs.next())
   {
                 

      out.write("\n");
      out.write("<center>\n");
      out.write("  \n");
      out.write("             <tr >\n");
      out.write("                 <td><input class=\"input\" size=\"30\" type=\"text\" value=\"");
      out.print(rs.getString(2));
      out.write("\"></td>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                \n");
      out.write("                 <td><input class=\"input\" size=\"20\" type=\"text\" value=\"");
      out.print(rs.getString(3));
      out.write("\"></td>\n");
      out.write("            \n");
      out.write("                 \n");
      out.write("                 <td><input class=\"input\" size=\"15\" type=\"text\" value=\"");
      out.print(rs.getString(4));
      out.write("\"> </td>\n");
      out.write("                  <td><input class=\"input\" size=\"20\" type=\"text\" value=\"");
      out.print(rs.getString(5));
      out.write("\"></td>\n");
      out.write("                 <td><input class=\"input\"  size=\"25\" type=\"text\" value=\"");
      out.print(rs.getString(6));
      out.write("\"></td>\n");
      out.write("                 <td><input class=\"input\" size=\"5\" type=\"text\" value=\"");
      out.print(rs.getString(7));
      out.write("\"></td>\n");
      out.write("                  <td><input class=\"input\" size=\"10\" type=\"text\" value=\"");
      out.print(rs.getString(8));
      out.write("\"></td>\n");
      out.write("                   \n");
      out.write("            </tr>\n");
      out.write("           ");
 }
      out.write("\n");
      out.write("</center>\n");
      out.write("        </table>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("           \n");
      out.write("<center>  <input style=\"height:40px;font-size:14pt\" type=\"submit\" value=\"next>>\" />\n");
      out.write("           </center>\n");
      out.write("                  \n");
      out.write("           \n");
      out.write("       \n");
      out.write("          \n");
      out.write("          \n");
      out.write("    </body>\n");
      out.write("</html>\n");
 } catch(Exception e)
        {
        
        }
session.getAttribute("userid");

      out.write("\n");
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
