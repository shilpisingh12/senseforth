package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import query1.*;
import java.sql.*;

public final class li_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
 if(session.getAttribute("userid")!=null)
{

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("             .d{\n");
      out.write("                font-size:25px;font-style:normal;font-weight:bolder \n");
      out.write("            }\n");
      out.write("            .input{\n");
      out.write("                height:40px;font-size:14pt;\n");
      out.write("            }\n");
      out.write("             .input1{\n");
      out.write("                height:30px;font-size:14pt;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body bgcolor=\"beige\">\n");
      out.write("        <form name=\"ei\" action=\"l_create2.jsp\">\n");
      out.write("            <a href=\"logout.jsp\">logout</a>\n");
      out.write("          ");
 if(request.getParameter("sub")!=null) 
      out.write("\n");
      out.write("        \n");
      out.write("           ");

                      if(request.getParameter("btn")!=null)
                      {
                         /* String uid=request.getParameter("uid");
                         String yr=request.getParameter("yr");
                        session.setAttribute("uid",uid) ;
                          session.setAttribute("yr",yr);*/
                          
                          if(request.getParameter("detail").equals("Medical"))
                      {
      out.write("\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      \n");
      out.write("                      <center><font size=\"10px\">Medical Leave Update</font></center>\n");
      out.write("<br>\n");
      out.write("                       <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <center><table>\n");
      out.write("                        <tr>\n");
      out.write("                            <th class=\"d\">Enter Medical Leave</th>\n");
      out.write("                            <td class=\"input1\"><input type=\"text\" name=\"m\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("        </table></center>\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                                        \n");
      out.write("                ");
session.setAttribute("detail","Medical");
      out.write("\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("    <center><input  style=\"height:40px;font-size:14pt\" type=\"submit\" value=\"Submit\" name=\"btn\" ></center>\n");
      out.write("                      ");
}
      out.write("\n");
      out.write("                 ");
if(request.getParameter("detail").equals("Earn"))
                {
      out.write("\n");
      out.write("    \n");
      out.write("    <center><font size=\"10px\">Earn Leave Update</font></center>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write("    <center><table>\n");
      out.write("                        <tr>\n");
      out.write("                            <th class=\"d\">Enter Earn Leave</th>\n");
      out.write("                            <td class=\"input1\"><input type=\"text\" name=\"el\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("        </table></center>\n");
      out.write("                    ");
session.setAttribute("detail","Earn");
      out.write("\n");
      out.write("                    <center>  <input  style=\"height:40px;font-size:14pt\" type=\"submit\" value=\"Submit\" name=\"btn\" ></center>\n");
      out.write("                ");
}
              if(request.getParameter("detail").equals("Casual"))
                {
      out.write("\n");
      out.write("    \n");
      out.write("    <center><font size=\"10px\">Casual Leave Update</font></center>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write("    <center><table>\n");
      out.write("                        <tr>\n");
      out.write("                            <th class=\"d\">Enter Casual Leave</th>\n");
      out.write("                            <td class=\"input1\"><input type=\"text\" name=\"c\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("        </table></center>\n");
      out.write("                    ");
session.setAttribute("detail","Casual");
      out.write("\n");
      out.write("                    <center>  <input  style=\"height:40px;font-size:14pt\" type=\"submit\" value=\"Submit\" name=\"btn\" ></center>\n");
      out.write("                ");
}    
        }
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
}
else
response.sendRedirect("login.jsp");

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
