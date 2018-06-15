package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faculty1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("                          <table> <tr>\n");
      out.write("                                     <td></td>\n");
      out.write("                                     <td > <a href=\"home_demo.jsp\">&lt;&lt;Home</a></td></tr>\n");
      out.write("                     <tr>\n");
      out.write("                                <td><img src=\"aim.jpeg\" align=\"left\"></td>\n");
      out.write("                                  <td> <font size=\"4\"> \n");
      out.write("                                      <h1>FACULTY</H1><HR> Banasthali University provides Undergraduate and Postgraduate courses in various faculties. Each faculty has number of departments under it and normally the courses running under the departments in a faculty have an interdisciplinary approach in theory as well as in practical. The design and implementation of each course strenghthen the University's philosophy of carving the student's personality.\n");
      out.write("\n");
      out.write("Curricula are generally framed, assessed and upgraded following the universally accepted standard procedures giving top priorities to regional and national interests as well as to the current trends of different disciplines. Designing of curricula starts from the Board of Studies of every discipline. It is then critically analyzed in the respective faculty and is recommended to the Academic Council for its critical analysis and approval. As a consequence of this, easy and fast implementation of the newly designed and upgraded curricula is possible. Usually the changes made in the curricula are implemented during the following academic year.\n");
      out.write("\n");
      out.write("Since its inception as a university in the year 1983, Banasthali University has always been on the march of introducing new courses of relevance to Women Students. The curricular changes are always made by taking into consideration both conceptual and practical aspects of the subject. It is very well reflected in the choice of foundation courses and the introduction of vocational courses at the graduate level. Besides, introduction and successful implementation of Post Graduate courses in emerging areas such as  M.Tech. (Remote Sensing), M.Tech. (VLSI Design), M.Sc. (Pharmaceutical Chemistry), M.Sc. (Bio-Informatics), MBA (Aviation Management),  M.Sc. (Electronics),  M.Sc. (Bio-Technology), MCA and  MBA; courses of interdisciplinary nature such as M.Sc.(Mathematical Sciences-specialization in Theoretical Computer Science), M.Phil in Social Sciences and introduction of innovative teacher education courses based on constructionist view (B.Ed.-Education) are examples worth mentioning. </font>\n");
      out.write("    \n");
      out.write("                                  </td>\n");
      out.write("                              </tr>\n");
      out.write("                          </table>\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer_home.jsp", out, false);
      out.write("\n");
      out.write("   ");

       
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>     \n");
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
