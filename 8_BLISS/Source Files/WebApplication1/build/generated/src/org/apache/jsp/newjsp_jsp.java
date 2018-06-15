package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("import java.sql.*;\n");
      out.write("import java.util.*;\n");
      out.write("class newjsp\n");
      out.write("{\n");
      out.write("public void get_data()\n");
      out.write("{\n");
      out.write("try\n");
      out.write("{\n");
      out.write("System.out.println(\"OK\");\n");
      out.write("Class.forName(\"com.mysql.jdbc.Driver\");    \n");
      out.write("\n");
      out.write("\t Connection conn=DriverManager.getConnection(\"jdbc:mysql://localhost:3306/emp\",\"root\",\"\");\n");
      out.write("Statement stmt=conn.createStatement();\n");
      out.write("ResultSet rs=stmt.executeQuery(\"select * from emp1\");\n");
      out.write("while(rs.next())\n");
      out.write("{\n");
      out.write("System.out.println(rs.getString(1)+\"\\t\"+rs.getString(2));\n");
      out.write("}\n");
      out.write("conn.close();\n");
      out.write("}\n");
      out.write("catch(Exception ex)\n");
      out.write("{\n");
      out.write("ex.printStackTrace();\n");
      out.write("}\n");
      out.write("}\n");
      out.write("public static void main(String args[])\n");
      out.write("{\n");
      out.write("\n");
      out.write("newjsp e=new newjsp();\n");
      out.write(" e.get_data();\n");
      out.write("}\n");
      out.write("\n");
      out.write("}");
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
