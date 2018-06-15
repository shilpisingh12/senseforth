package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_0020us_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head> \n");
      out.write("    <body bgcolor=\"black\">\n");
      out.write("                <table><tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td > <a href=\"sample.jsp\"><font color=\"grey\" size=\"5\">&lt;&lt;Home</font></a></td></tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><img src=\"aim.jpeg\" align=\"left\"></td><td rowspan=\"2\"><H1><font color=\"skyblue\">ABOUT US</font></H1><HR><font color=\"white\" >Banasthali Vidyapith is a fully residential women's university which offers an integrated system extending from the primary to the Ph.D. level. \n");
      out.write("            It was on October 6, 1935 that Smt. Ratan Shastri and Pandit Hiralal Shastri founded Banasthali to fill up the vacuum caused by the sudden death of their highly talented and promising daughter Shantabai. They had high expectations that she would work for women's cause when she would grow up.<br> But  destiny  ordained  otherwise. \n");
      out.write("Thus, Banasthali  owes its existence neither to the zeal of an educationist, nor to that of a social reformer. It is also not the creation of a Philanthropist's purse. It has arisen like the fabled phoenix from the ashes of a blossoming flower Shantabai. \n");
      out.write("Banasthali is one of the five universities in India meant exclusively for Women. Over these seventy five years Banasthali has developed into a National Centre for women's education.Banasthali's educational programme aims at an all-round development of the student's personality. To achieve its objective of 'synthesis of spiritual values and scientific achievements of the East and the West', it has evolved Five-fold Educational Programme (Panchmukhi Shiksha) comprising of  the following aspects :\n");
      out.write("<br>(i) Physical<br> (ii) Practical<br>(iii) Aesthetic<br> (iv) Moral <br> (v) Intellectual. <br>This way the students develop an integrated and balanced personality.\n");
      out.write("\n");
      out.write("The rural ambience of Banasthali Vidyapith is very conducive for promoting the ideology of simple living, and for imbibing and internalizing the values of self-reliance and tolerance.<br> Following the philosophy of the balanced Panchmukhi system of education, the institute provides ample opportunities for integrated development of the personality. The stress on the positive aspects of the Indian heritage has resulted in a climate which has contributed significantly to the task of the upliftment of women to enable them to take on leadership roles with confidence.\n");
      out.write("\n");
      out.write("<br>This institute has made full use of the autonomy provided under the deemed university status and has innovatively restructured the courses offered which include subjects ranging from the traditional as well tthe emerging areas to the highest level of research (leading to the doctoral degree). Banasthali has been accredited by National Assessment and Accreditation Council (NAAC) with 'A' Grade (Five star Rating). Banasthali is a recipient of SANTBAL Award in the year 2000 for the services in the field of all round education of women.</font></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("    \n");
      out.write("    <td><image src=\"index.jpg\"></td>\n");
      out.write("</tr>\n");
      out.write("    \n");
      out.write("</table>\n");
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
