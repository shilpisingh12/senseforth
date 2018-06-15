package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import query1.*;

public final class T_005fcreate1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <a href=\"T_create1.jsp\"></a>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            ");

              try
              {
              NewClass q=new NewClass();
             if (request.getParameter("btn")!= null)
           {out.println("success");
           String detail=request.getParameter("detail");
               String detail1=request.getParameter("detail1");
                   String detail2=request.getParameter("detail2");
                   String cont_ass=request.getParameter("cont_ass");
               if(session.getAttribute("detail").equals("class"))
               {   
                   out.println("success");
 String str1="update continuous set class='"+detail+"' where uid='"+session.getAttribute("uid")+"' and class='"+detail1+"' and course='"+detail2+"' and Year="+session.getAttribute("yr")+"";
            

         int s=q.update_data(str1);  
         if(s>0)
         
              out.println("success");
           }
             if(session.getAttribute("detail").equals("course"))
               {   
                   out.println("success");
 String str1="update continuous set course='"+request.getParameter("detail")+"' where uid='"+session.getAttribute("uid")+"' and class='"+request.getParameter("detail1")+"' and course='"+request.getParameter("detail2")+"' and Year='"+session.getAttribute("yr")+"'";
            
            

         int s=q.update_data(str1);      
         
              out.println("success");
           }
           if(session.getAttribute("detail").equals("nos"))
       {
         out.println("success");
            String str="update continuous set nos="+request.getParameter("nos")+" where uid='"+session.getAttribute("uid")+"'and class='"+detail1+"' and course='"+detail2+"'and Year='"+session.getAttribute("yr")+"'";
       
          int s=q.update_data(str);
          out.println("success");
          
              }
                  if(session.getAttribute("detail").equals("cont_ass"))
       {
         out.println("success");
            String str="update continuous set cont_ass='"+cont_ass+"' where uid='"+session.getAttribute("uid")+"'and class='"+detail1+"' and course='"+detail2+"' and Year='"+session.getAttribute("yr")+"'";
       
          int s=q.update_data(str);
          if(s>0)
          out.println("success");
          
              }
        }
             
              }
              catch(Exception e)
              {
                  
              }
              
      out.write("\n");
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
