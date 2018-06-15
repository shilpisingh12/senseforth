package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import query1.*;

public final class personal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
 if(session.getAttribute("userid")!=null)
{

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("            .p1{\n");
      out.write("                font-family:Andalus;font-size:40px;font-weight:bold;\n");
      out.write("               }\n");
      out.write("            input{\n");
      out.write("                height:30px;font-size:14pt;\n");
      out.write("            }\n");
      out.write("            .d{\n");
      out.write("                font-size:20pt;font-style:normal;font-weight:bolder \n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color:beige\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center><b class=\"p1\">Personal Detail</b></center>\n");
      out.write("    <b>\n");
      out.write("        <a href=\"logout.jsp\">Logout</a>\n");
      out.write("    </b>\n");
      out.write("        <form name=\"Personal\" method=\"post\"   >\n");
      out.write("            <table align=\"center\">\n");
      out.write("            ");
 
                try
            {
                 
percon q=new percon();
ResultSet rs=null,rs1=null;

       rs= q.get_data("select * from personal_details where uid='"+session.getAttribute("userid")+"'");
   
        
       
      out.write("\n");
      out.write("       \n");
      out.write("\n");


                if(rs.next())
                {                              
                    
      out.write("                    \n");
      out.write("                    <tr><td><u><b><h2>Faculty id</h2></b></u></td>\n");
      out.write("                    <td><input class=\"input\" type=\"text\" name=\"faculty\" value=\"");
      out.print(rs.getString(1));
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td><h2><u><b>Name</b></u></h2></td>\n");
      out.write("                    <td><input class=\"input\" type=\"text\" name=\"Name\" value=\"");
      out.print(rs.getString(2));
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td><h2><u><b>Designation</b></u></h2></td>\n");
      out.write("                    <td><input class=\"input\" type=\"text\" name=\"Designation\" value=\"");
      out.print(rs.getString(3));
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr><td><h2><u><b>Gender</b></u></h2></td>\n");
      out.write("                    <td>   <input class=\"input\" type = \"text\" name = \"gender\" value =\"");
      out.print(rs.getString(5));
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("      \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("    \n");
      out.write("</html>\n");
 }} catch(Exception e)
        {
        
        }

      out.write('\n');

 session.getAttribute("userid");
   

      out.write('\n');
}
else
response.sendRedirect("login.jsp");

      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("    \n");
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
