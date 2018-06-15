package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import query1.*;

public final class studupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> your record successfully updated</title>\n");
      out.write("    </head>  \n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\"><b> UR RECORD ARE SUCESSFULLY UPDATED</b></h1> \n");
      out.write("<marquee>UR ARE SUCESSFULLY UPDATED</marquee>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
  
   
String eno=request.getParameter("id");
String idk=request.getParameter("name");
//out.println(eno);
NewClass q=new NewClass();
    if (request.getParameter("submit1")!= null)
    {   
         
        //   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          // Connection conn=DriverManager.getConnection("Jdbc:Odbc:mydsn");  
   // PreparedStatement ps=conn.prepareStatement("update stud1 set fname='"+idk+"' where id='"+eno+"' ");
   //  ps.executeUpdate();
        
      //  out.println("success");
        String str="update stud1 set fname='"+idk+"' where id='"+eno+"' ";
        int s=q.delete_data(str);
         //out.println("record updated successfully");
        // out.println(s);
   
    }

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
