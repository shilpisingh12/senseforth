package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import query1.*;
import java.sql.*;

public final class o_005finter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       \n");
      out.write("   \n");
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
      out.write("         </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"work\" method=\"get\">\n");
      out.write("            <center><table  border=\"0\">\n");
      out.write("            <center><b class=\"p1\">Personal Details</b></center>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("              \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                   <td><u><b><h2>UserId</h2></b></u></td>\n");
      out.write("                    <td><input class=\"input\" type=\"text\" name=\"uid\" size=\"30\" ></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td><h2><u><b>Name</b></u></h2></td>\n");
      out.write("                    <td><input class=\"input\" type=\"text\" name=\"name\" size=\"30\"  /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td><h2><u><b>Designation</b></u></h2></td>\n");
      out.write("                    <td><input class=\"input\" type=\"text\" name=\"desig\" size=\"30\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td><h2><u><b>Salary</b></u></h2></td>\n");
      out.write("                    <td><input class=\"input\" type = \"text\" name = \"sal\" size=\"30\" ></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr><td><h2><u><b>Gender</b></u></h2></td>\n");
      out.write("                    <td><input class=\"input\" type = \"text\" name = \"gen\" size=\"30\"  ></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr><td><h2><u><b>Year</b></u></h2></td>\n");
      out.write("                    <td><input class=\"input\" type = \"text\" name = \"yr\" size=\"30\"  ></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td> <input  style=\"height:40px;font-size:14pt\" type=\"submit\" value=\"submit\" name=\"more\" ></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("           \n");
      out.write("                  ");
        
                      if((request.getParameter("more") != null))
                      {
                          
           String uid=request.getParameter("uid");
           String name=request.getParameter("name");
           String desig=request.getParameter("desig");
           String gen=request.getParameter("gen");
           String sal=request.getParameter("sal");
           String yr=request.getParameter("yr");
                  // NewClass q1=new NewClass();
                  try
            {
          
                
          
            String str="insert into personal_details (uid,Name,Desig,Salary,Gender,Year) values('"+uid+"', '"+name+"','"+desig+"',"+sal+",'"+gen+"',"+yr+")";         
            
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
                     
                      
                  
             
                 
                 
               
            }  
      out.write("       \n");
      out.write("            \n");
      out.write("                </table></center>\n");
      out.write("       \n");
      out.write("        </form>     \n");
      out.write("       \n");
      out.write("           \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write(" ");
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
