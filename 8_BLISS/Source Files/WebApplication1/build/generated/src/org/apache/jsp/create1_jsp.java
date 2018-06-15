package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import query1.*;

public final class create1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=ISO-8859-1");
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
      out.write("\n");
      out.write("<html><head>\n");

try
        
 {
    
    
if (request.getParameter("submit") != null)
       {
    String userid=request.getParameter("uid");
String uid1=request.getParameter("uid");
String pwd=request.getParameter("psw");

boolean status=false;
NewClass q=new NewClass();
ResultSet rs=q.get_data("select * from login where uid='"+uid1+"' and pwd='"+pwd+"'");
status=rs.next();

      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <form name=\"myform\"></form>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("      var str;\n");
      out.write("    str=window.prompt(\"YOU HAVE LOGIN SUCCESSFULLY\");\n");
      out.write("        \n");
      out.write("        //  alert(\"ID OR PASSWORD IS WRONG\");\n");
      out.write("  </script>\n");
      out.write("</html>\n");
      out.write("  ");

             
char ch = uid1.charAt(4);

if((status)&&(ch=='D'))
       {
    
session.setAttribute("userid", userid);
           response.sendRedirect("d_frame.jsp");
      }
else if((status)&&(ch=='H'))
{
    session.setAttribute("userid", userid);
    response.sendRedirect("h_frame.jsp");
}
else if((status)&&(ch=='F'))
{
    session.setAttribute("userid", userid);
    response.sendRedirect("f_interface.jsp");
}

    else if ((status)&&(ch=='A'))
{
    session.setAttribute("userid", userid);
    response.sendRedirect("A_frame.jsp");
}
      else if ((status)&&(ch=='L'))
{
    session.setAttribute("userid", userid);
    response.sendRedirect("l_frame.jsp");
}
        else if ((status)&&(ch=='T'))
{
    session.setAttribute("userid", userid);
    response.sendRedirect("T_frame.jsp");
}
          else if ((status)&&(ch=='E'))
{
    session.setAttribute("userid", userid);
    response.sendRedirect("e_frame.jsp");
}
 else if ((status)&&(ch=='O'))
{
    session.setAttribute("userid", userid);
    response.sendRedirect("office_2.jsp");
}          
else
    {
    response.sendRedirect("login.jsp");
    }
      
    }

     }
catch(Exception e)
{e.printStackTrace();
}


      out.write('\n');
      out.write('\n');
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
