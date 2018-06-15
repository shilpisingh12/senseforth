package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header_home.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"black\">\n");
      out.write("       <a href=\"home_demo.jsp\">&lt;&lt;Home</a>\n");
      out.write("        <H1 color=\"skyblue\">CONTACT US</H1><HR>\n");
      out.write("    <center>  <font color=\"white\">\n");
      out.write("        <b> Prof.Chitra Purohit:President Phone:228371 PBX Nos:303 Email</b>:pchitra@banasthali.ac.in<br><br>\n");
      out.write("        <b>   Prof Siddharth Shastri:Vice President Email</b>:siddhshastri@gmail.com,siddarthshastri@rediffmail.com<br><br>\n");
      out.write("        <b>   Phone<b>:01438-228477,228456<br>\n");
      out.write("            <table cellspacing=\"40\">\n");
      out.write("                <tr>\n");
      out.write("                    <th> </th> <th>Phone</th><th>PBX Nos.</th><th>Email</th>            \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Prof.Aditya Shastri,<br>Vice Chancellor</td><td>228787</td><td>301</td><td>saditya@banasthali.ac.in<br>adiytashastri2yahoo.com</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Prof Ina Shatri<br> Pro Vice Chancellor</td><td>228359</td><td>350</td><td>ina_shastri@yahoo.com</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Prof D.Kishore,<br>Offg Secretary</td><td>228456</td><td>340</td><td>kishoredharam@yahoo.com</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Prof Sudha Shastri,<br> treasuer</td><td>228523</td><td>305</td><td>shastri.sudha@yahoo.com</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Chief Warden</td><td>228355</td><td>325</td><td>cwarden@banasthali.ac.in</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Dean Administration</td><td>228456</td><td>338</td><td>deanadmin@banasthali.ac.in</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Mr. H.L.Mittal,<br>Addl. Registrar<br>(Academic & Exams)</td><td>228950</td><td>331</td><td>mittal_hl@yahoo.co.in</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Apaji Institute</td><td>228647</td><td>306</td><td>deanapaji@banasthali.ac.in<br>info@banasthali.ac.in</td>\n");
      out.write("                </tr>\n");
      out.write("            </table></center>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer_home.jsp", out, false);
      out.write("\n");
      out.write("        \n");
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
