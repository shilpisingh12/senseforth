package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import query1.*;

public final class leave_005finter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <form name=\"l_inter\" method=\"post\"  action=\"linsert.jsp\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        \n");
      out.write("            ");
 
                try    
                    
            {
                
            
                 
  
   
       ResultSet rs;//=null,rs1=null; 
       
  
       if (request.getParameter("submit")!= null)
       {
      out.println("asd");
           String uid=request.getParameter("uid");
    String yr=request.getParameter("yr");
    session.setAttribute("uid",uid) ;
    session.setAttribute("yr",yr);
      out.write("\n");
      out.write("     \n");
      out.write("            ");
 out.println(uid);
            out.println(yr);
             NewClass q=new NewClass();
              boolean status=false;
      out.write("\n");
      out.write("             \n");
      out.write("           <table  align=\"center\" border=\"1\">\n");
      out.write("            <h1 align=\"center\"><b class=\"p1\">Leave</b></h1>\n");
      out.write("            <tr>   <th>Casual Leave</th>\n");
      out.write("            <th>Earn Leave</th>\n");
      out.write("            <th>Medical Leave</th>\n");
      out.write("            <th>Total Leave Taken</th></tr>\n");
      out.write("             ");

                 
               
                
       rs= q.get_data("select * from login1"); //where uid='BTBTF12345'");
 if(rs.next())
     
   {
                

      out.write("\n");
      out.write("\n");
      out.write("             <tr>\n");
      out.write("                 <td><input  size=\"30\" type=\"text\" value=\"");
      out.print(rs.getString(2));
      out.write("\"></td>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                \n");
      out.write("                 <td><input  size=\"20\" type=\"text\" value=\"");
      out.print(rs.getString(3));
      out.write("\"></td>\n");
      out.write("            \n");
      out.write("                 \n");
      out.write("                 <td><input  size=\"20\" type=\"text\" value=\"");
      out.print(rs.getString(4));
      out.write("\"> </td>\n");
      out.write("               <td><input  size=\"20\" type=\"text\" value=\"");
      out.print(rs.getString(5));
      out.write(" \"> </td>\n");
      out.write("            </tr>\n");
      out.write("           ");
 }
      out.write("\n");
      out.write("         \n");
      out.write("        </table>\n");
      out.write("            <input style=\"height:40px;font-size:14pt\" type=\"submit\" value=\"insert\" name=\"submit\"/>\n");
      out.write("          <input style=\"height:40px;font-size:14pt\" type=\"submit\" value=\"Update\" name=\"submit1\"/>\n");
      out.write("\n");
      out.write("          ");
   }
}
            catch(Exception e)
            {
            out.println(e);
            }
                  
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
