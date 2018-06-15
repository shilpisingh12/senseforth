package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import query1.*;
import java.sql.*;

public final class work_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("            .p1{\n");
      out.write("                 font-family:Andalus;font-size:35px;font-weight:bold\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                height:30px;font-size:14pt;\n");
      out.write("            }\n");
      out.write("            .d{\n");
      out.write("                font-size:30px;font-size:12pt;font-style:normal;font-weight:bolder \n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color:beige\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"work\" method=\"get\">\n");
      out.write("        <table  border=\"1\">\n");
      out.write("            <center><b class=\"p1\">Participation in Conference/Symposia/Workshop/Seminars</b></center>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("              \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                   <td><u><b><h2>Title</h2></b></u></td>\n");
      out.write("                    <td><input class=\"input\" type=\"text\" name=\"title\" size=\"30\" ></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td><h2><u><b>Place</b></u></h2></td>\n");
      out.write("                    <td><input class=\"input\" type=\"text\" name=\"place\" size=\"30\"  /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td><h2><u><b>Date</b></u></h2></td>\n");
      out.write("                    <td><input class=\"input\" type=\"text\" name=\"date\" size=\"30\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td><h2><u><b>Details</b></u></h2></td>\n");
      out.write("                    <td><input class=\"input\" type = \"text\" name = \"details\" size=\"30\" ></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr><td><h2><u><b>Credit Points</b></u></h2></td>\n");
      out.write("                    <td><input class=\"input\" type = \"text\" name = \"cp\" size=\"30\"  ></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td> <input  style=\"height:40px;font-size:14pt\" type=\"submit\" value=\"more\" name=\"more\" ></td>\n");
      out.write("                    <td> <input  style=\"height:40px;font-size:14pt\" type=\"submit\" value=\"next>>\" name=\"next\" ></td>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("           \n");
      out.write("                  ");
        session.getAttribute("userid");
                            session.getAttribute("year1");
                      if((request.getParameter("more") != null)||(request.getParameter("next") != null))
                      {
                          
           String title=request.getParameter("title");
           String place=request.getParameter("place");
           String date=request.getParameter("date");
           String details=request.getParameter("details");
           String cp=request.getParameter("cp");
                  // NewClass q1=new NewClass();
                  try
            {
          
                
          
            String str="insert into workshop (uid,title,place,date,details,Year,credit) values('"+session.getAttribute("userid")+"', '"+title+"','"+place+"','"+date+"','"+details+"','"+session.getAttribute("year1")+"','"+cp+"')";
                
            
          NewClass q=new NewClass();

          int s=q.insert_data(str);
           

                }
            catch(Exception e)
            {
            System.out.println(e);
            }
                  
                     
                     
                      if(request.getParameter("next") != null)
                      {
                      response.sendRedirect("complete.jsp");
                      }
                      else if(request.getParameter("more") != null)
                      {
                          response.sendRedirect("work.jsp");
                      }
                      
                      
                  
             
                 
                 
               
            }  
      out.write("       \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("       \n");
      out.write("        </form>     \n");
      out.write("       \n");
      out.write("           \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("  ");
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
