package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import query1.*;

public final class u_005fhod_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <style type=\"text/css\">\n");
      out.write("            .p1{\n");
      out.write("                color:indigo; font-family:Andalus;font-size:50px;font-weight:bold\n");
      out.write("               }\n");
      out.write("            input{\n");
      out.write("                height:30px;font-size:14pt;\n");
      out.write("            }\n");
      out.write("            .d{\n");
      out.write("                font-size:20pt;font-style:normal;font-weight:bolder \n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color:beige\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <form name=\"u_hod\" method=\"post\"  >\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        \n");
      out.write("            ");
 
                try
            {
                 
   
ResultSet rs=null,rs1=null; 
       if (request.getParameter("submit") != null)
       {
          if(request.getParameter("table1").equals("departmental_respo"))
       {
             String str="select * from departmental_respo where uid='"+request.getParameter("uid")+"' and Year='"+request.getParameter("yr")+"'";
            NewClass q=new NewClass();
   
          rs=q.get_data(str);
       
         
          
      out.write("\n");
      out.write("           <table  align=\"center\" border=\"1\">\n");
      out.write("            <h1 align=\"center\"><b class=\"p1\"><b>Departmental_Responsibilities</b></h1>\n");
      out.write("             <tr>\n");
      out.write("                 \n");
      out.write("            \n");
      out.write("                  <th class=\"d\" bgcolor=\"silver\">Details</th>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("                  \n");
      out.write("                  <th  class=\"d\" bgcolor=\"silver\">Credit_Points</th>       \n");
      out.write("                  <th class=\"d\" bgcolor=\"silver\">Click</th>\n");
      out.write("             </tr>\n");
      out.write("       ");
   while(rs.next())
   {
   
        

      out.write("\n");
      out.write(" \n");
      out.write("<center>\n");
      out.write("  \n");
      out.write("             <tr >\n");
      out.write("                 <td><input class=\"input\" size=\"30\" type=\"text\" size=\"30\" value=\"");
      out.print(rs.getString(2));
      out.write("\"></td>                \n");
      out.write("                 <td><input class=\"input\" size=\"30\" type=\"text\" size=\"30\" ></td> \n");
      out.write("                           \n");
      out.write("        </tr>\n");
      out.write("          \n");
      out.write("</center>\n");
      out.write("   ");
} 
      out.write("\n");
      out.write("</table>\n");
      out.write("      ");
} 
      out.write("\n");
      out.write("   <input style=\"height:40px;font-size:14pt\" type=\"submit\" value=\"Update\" name=\"B1\">\n");
      out.write("  \n");
      out.write("         ");

             if (request.getParameter("B1")!= null)
           {
               out.println("success");
              response.sendRedirect("u_credit.jsp");
           }
          
       
      else if(request.getParameter("table1").equals("invigilation"))
       {
         
            // String str="update invigilation set Obtained_cp='"+request.getParameter("credit")+"' where uid='"+request.getParameter("uid")+"' and Year='"+request.getParameter("yr")+"'";
             //NewClass q=new NewClass();

         // int s=q.update_data(str);
            // response.sendRedirect("u_credit.jsp");
      out.write("\n");
      out.write("           <table  align=\"center\" border=\"1\">\n");
      out.write("            <h1 align=\"center\"><b class=\"p1\">Invigilation</b></h1>\n");
      out.write("             <tr>\n");
      out.write("                 <th class=\"d\" bgcolor=\"silver\" rowspan=\"2\" size=\"20\">Exam</th>\n");
      out.write("            \n");
      out.write("                  <th class=\"d\" bgcolor=\"silver\" rowspan=\"2\" size=\"20\">Invigilation_Duties</th>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("                  \n");
      out.write("               <th class=\"d\" bgcolor=\"silver\" rowspan=\"2\">Duties_Attended</th>\n");
      out.write("            \n");
      out.write("                   \n");
      out.write("              <th class=\"d\" bgcolor=\"silver\" rowspan=\"2\" size=\"10\">Unauthorized_Absent</th>\n");
      out.write("              <th class=\"d\" bgcolor=\"silver\" rowspan=\"2\" size=\"10\">Quality_of_Invigilation</th> \n");
      out.write("              <th class=\"d\" bgcolor=\"silver\" colspan=\"2\">Credit_Points</th>\n");
      out.write("                   \n");
      out.write("                  \n");
      out.write("             </tr>\n");
      out.write("             <tr>\n");
      out.write("                 <th class=\"d\" bgcolor=\"silver\">Full</th>\n");
      out.write("                 <th class=\"d\" bgcolor=\"silver\">Obtained</th>\n");
      out.write("             </tr>\n");
      out.write("        \n");
      out.write("             ");

                 
               
          NewClass q=new NewClass();            
       rs= q.get_data("select * from invigilation where  uid='"+request.getParameter("uid")+"' and Year='"+request.getParameter("yr")+"'");
   while(rs.next())
   {
                 

      out.write("\n");
      out.write("<center>\n");
      out.write("  \n");
      out.write("             <tr >\n");
      out.write("                 <td><input class=\"input\" size=\"30\" type=\"text\" value=\"");
      out.print(rs.getString(2));
      out.write("\"></td>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                \n");
      out.write("                 <td><input class=\"input\" size=\"20\" type=\"text\" value=\"");
      out.print(rs.getString(3));
      out.write("\"></td>\n");
      out.write("            \n");
      out.write("                 \n");
      out.write("                 <td><input class=\"input\" size=\"15\" type=\"text\" value=\"");
      out.print(rs.getString(4));
      out.write("\"> </td>\n");
      out.write("                  <td><input class=\"input\" size=\"20\" type=\"text\" value=\"");
      out.print(rs.getString(5));
      out.write("\"></td>\n");
      out.write("                 <td><input class=\"input\"  size=\"25\" type=\"text\" value=\"");
      out.print(rs.getString(6));
      out.write("\"></td>\n");
      out.write("                 <td><input class=\"input\" size=\"5\" type=\"text\" value=\"");
      out.print(rs.getString(7));
      out.write("\"></td>\n");
      out.write("                  <td><input class=\"input\" size=\"10\" type=\"text\" value=\"");
      out.print(rs.getString(8));
      out.write("\"></td>\n");
      out.write("                   \n");
      out.write("            </tr>\n");
      out.write("           ");
 }
      out.write("\n");
      out.write("</center>\n");
      out.write("        </table>\n");
      out.write("      ");
 }
      else if(request.getParameter("table1")=="other_academic_respo")
       {
        
             String str="update other_academic_respo set Obtained_cp='"+request.getParameter("credit")+"' where uid='"+request.getParameter("uid")+"' and Year='"+request.getParameter("yr")+"'";
           NewClass q=new NewClass();

          int s=q.update_data(str);
             response.sendRedirect("u_credit.jsp");
       }
      else if(request.getParameter("table1")=="other_insti_respo")
       {
             String str="update other_insti_respo set Obtained_cp='"+request.getParameter("credit")+"' where uid='"+request.getParameter("uid")+"' and Year='"+request.getParameter("yr")+"'";
          NewClass q=new NewClass();

          int s=q.update_data(str);
             response.sendRedirect("u_credit.jsp");
       }
      else if(request.getParameter("table1")=="workshop")
       {
          
             String str="update workshop set credit='"+request.getParameter("credit")+"' where uid='"+request.getParameter("uid")+"' and Year='"+request.getParameter("yr")+"'";
           NewClass q=new NewClass();

          int s=q.update_data(str);
             response.sendRedirect("u_credit.jsp");
       }
   
      // rs= q.get_data("select * from personal_details where uid='"+request.getParameter("uid") +"'and Year='"+request.getParameter("yr")+"'");  
      
      out.write("\n");
      out.write("       \n");
      out.write("\n");
 }
}catch(Exception e)
        {
        
        }

      out.write("\n");
      out.write(" </body>\n");
      out.write("    </form>\n");
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
