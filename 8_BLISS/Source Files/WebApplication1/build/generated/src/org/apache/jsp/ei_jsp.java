package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import query1.*;
import java.sql.*;

public final class ei_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 if(session.getAttribute("userid")!=null)
{

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("             .d{\n");
      out.write("                font-size:25px;font-style:normal;font-weight:bolder \n");
      out.write("            }\n");
      out.write("            .input{\n");
      out.write("                height:40px;font-size:14pt;\n");
      out.write("            }\n");
      out.write("             .input1{\n");
      out.write("                height:30px;font-size:14pt;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body bgcolor=\"beige\">\n");
      out.write("        <form name=\"ei\" action=\"e_create1.jsp\">\n");
      out.write("            <a href=\"logout.jsp\">logout</a>\n");
      out.write("         ");
   if((request.getParameter("sub") != null))
                      {
                          out.println("success");
           String exam=request.getParameter("exam");
           String invig=request.getParameter("invig");
           String duties=request.getParameter("duties");
           String unauth=request.getParameter("unauth");
           String quality=request.getParameter("quality");
           int cp=5;
           int cp1=5;
           
                  // NewClass q1=new NewClass();
                  try
            { 
          NewClass q=new NewClass();
           String str="insert into invigilation(uid,exam,invig_duties,Duties_attend,Unauth_absent,quality_invig,Full_cp,Obtained_cp,Year) values('"+session.getAttribute("uid")+"', '"+exam+"','"+invig+"',"+duties+","+unauth+",'"+quality+"',"+cp+","+cp1+",'"+session.getAttribute("yr")+"')";     
          int s=q.insert_data(str);
    
              //out.println("success");
             }
            catch(Exception e)
            {
            System.out.println(e);
            }
                      }
                  
        
        
      out.write("\n");
      out.write("           ");

                      if(request.getParameter("btn")!=null)
                      {
                          String uid=request.getParameter("uid");
                         String yr=request.getParameter("yr");
                        session.setAttribute("uid",uid) ;
                          session.setAttribute("yr",yr);
                          
                          if(request.getParameter("detail").equals("Exam"))
                      {
      out.write("\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      \n");
      out.write("                      <center><font size=\"10px\">Exam Update</font></center>\n");
      out.write("<br>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                      <center><table>\n");
      out.write("    <tr>\n");
      out.write("        <th><font class=\"d\">Select Exam Details</font></th>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                    <select class=\"input1\" name=\"detail\">\n");
      out.write("                        <option selected>btech 3rd yr periodical 1</option selected>\n");
      out.write("                        \n");
      out.write("                        <option>Btech 2nd yr semester exam\n");
      out.write("                         <option>mca 2nd yr semester exam\n");
      out.write("                         <option>btech 3rd yr semester exam\n");
      out.write("                             <option>btech 3rd yr periodical 1\n");
      out.write("                         <option>btech 1st yr periodical exam\n");
      out.write("                         <option>btech 2nd yr II periodical test\n");
      out.write("                         <option>BCA I yr semester exam\n");
      out.write("                         <option>BCA II yr periodical exam\n");
      out.write("                         <option>B.tech IV yr semester exam\n");
      out.write("                         <option> Bca 2nd yr semester exam\n");
      out.write("                            <option> BCA II yr sem exam\n");
      out.write("                               <option> Btech 3rd yr periodical 2\n");
      out.write("                         <option>Mca 1st yr periodical 1\n");
      out.write("                         <option>Bca 1st yr semester exam\n");
      out.write("                             </option>\n");
      out.write("                         </option>\n");
      out.write("                         </option>\n");
      out.write("                         </option>\n");
      out.write("                         </option>\n");
      out.write("                         </option>\n");
      out.write("                         </option>\n");
      out.write("                         </option>\n");
      out.write("                        .</option>\n");
      out.write("                         </option>\n");
      out.write("                         </option>\n");
      out.write("                         </option>                   \n");
      out.write("                         </option>\n");
      out.write("                         </option>\n");
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("                 </table></center>\n");
      out.write("                ");
session.setAttribute("detail","Exam");
      out.write("\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("    <center><input  style=\"height:40px;font-size:14pt\"type=\"submit\" value=\"Submit\" name=\"btn\" ></center>\n");
      out.write("                      ");
}
      out.write("\n");
      out.write("                 ");
if(request.getParameter("detail").equals("Duties_attend"))
                {
      out.write("\n");
      out.write("    <\n");
      out.write("    <center><font size=\"10px\">Duties Update</font></center>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <center><table>\n");
      out.write("                        <tr>\n");
      out.write("                            <th class=\"d\">Enter Duties Attended</th>\n");
      out.write("                            <td class=\"input1\"><input type=\"text\" name=\"duty\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("        </table></center>\n");
      out.write("                    ");
session.setAttribute("detail","Duties_attend");
      out.write("\n");
      out.write("                     <input  style=\"height:40px;font-size:14pt\"type=\"submit\" value=\"Submit\" name=\"btn\" >\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                 ");
      out.write("\n");
      out.write("                         \n");
      out.write("        \n");
      out.write("        ");
}
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
}
else
response.sendRedirect("login.jsp");

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
