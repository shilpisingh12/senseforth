package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import query1.*;
import java.sql.*;

public final class workshop_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                font-family:Andalus;font-size:50px;font-weight:bold\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                height:50px;font-size:12pt;\n");
      out.write("            }\n");
      out.write("            .d{\n");
      out.write("                height:60px;font-size:15pt;font-style:normal;font-weight:bolder \n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color:beige\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"workshop\" method=\"get\">\n");
      out.write("        <center><h1><b class=\"p1\">Participation in Conference/Symposia/Workshop/Seminars</b></h1></center>  \n");
      out.write("        <table  border=\"1\" align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("               <th class=\"d\" bgcolor=\"silver\">Title</th>\n");
      out.write("               <th class=\"d\" bgcolor=\"silver\">Place</th>\n");
      out.write("               <th class=\"d\" bgcolor=\"silver\">Date</th>\n");
      out.write("               <th class=\"d\" bgcolor=\"silver\">Details</th>\n");
      out.write("               <th class=\"d\" bgcolor=\"silver\">Credit points</th>\n");
      out.write("            </tr>\n");
      out.write("           \n");
      out.write("              ");

                  
                  
                 try{
                     
               
             percon q=new percon();
ResultSet rs=null,rs1=null;
      rs= q.get_data("select * from workshop where uid='"+session.getAttribute("userid")+"'and Year="+session.getAttribute("year1")+"");
  if(rs.next())
  {
   do
   {
  




      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             <tr>\n");
      out.write("                 <td><input class=\"input\" size=\"20\" type=\"text\" height=\"10\" value=\"");
      out.print(rs.getString(2));
      out.write("\"></td>\n");
      out.write("            \n");
      out.write("                 <td><input class=\"input\" size=\"20\" type=\"text\" value=\"");
      out.print(rs.getString(3));
      out.write("\"></td>\n");
      out.write("            \n");
      out.write("                 <td><input class=\"input\" size=\"20\" type=\"text\" value=\"");
      out.print(rs.getString(4));
      out.write("\"> </td>\n");
      out.write("            \n");
      out.write("                 <td><input class=\"input\" size=\"20\" type=\"text\" value=\"");
      out.print(rs.getString(5));
      out.write("\"></td>\n");
      out.write("                 \n");
      out.write("                 <td><input class=\"input\" size=\"20\" type=\"text\" value=\"");
      out.print(rs.getString(7));
      out.write("\"></td>\n");
      out.write("                  \n");
      out.write("             </tr>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("             \n");
      out.write("           ");
 
               }
while(rs.next());
      out.write("\n");
      out.write(" \n");
  if (request.getParameter("submit") != null)
{
    response.sendRedirect("complete.jsp");
}
    }

          
           
           
               else 
               {
             
            response.sendRedirect("work.jsp");
              
              
      out.write("\n");
      out.write("\n");
      out.write("         <!--       <tr>\n");
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
      out.write("                    <td> <input  style=\"height:40px;font-size:14pt\" type=\"submit\" value=\"more..\" name=\"more\" ></td>\n");
      out.write("                    <td> <input  style=\"height:40px;font-size:14pt\" type=\"submit\" value=\"next>>\" name=\"next\" ></td>\n");
      out.write("                </tr>-->\n");
      out.write("               \n");
      out.write("           \n");
      out.write("                  ");

                     // if((request.getParameter("more") != null)||(request.getParameter("next") != null))
                      //{
                          
                     // String title=request.getParameter("title");
           /*String place=request.getParameter("place");
           String date=request.getParameter("date");
           String details=request.getParameter("details");
           String cp=request.getParameter("cp");
                  // NewClass q1=new NewClass();
                  try
            {
          
                
           Class.forName("com.mysql.jdbc.Driver");    //driver for MySQL
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bliss","root","");

            String str="insert into workshop values('"+ session.getAttribute("userid")+"', '"+title+"','"+place+"','"+date+"','"+details+"','"+session.getAttribute("year1")+"','"+cp+"')";
                
            PreparedStatement ps=conn.prepareStatement(str);

          
            int s=ps.executeUpdate();
            conn.close();
                

                }
            catch(Exception e)
            {
            System.out.println(e);
            }
                      }   
                      
                      if(request.getParameter("next") != null)
                      {
                      response.sendRedirect("complete.jsp");
                      }
                      else if(request.getParameter("more") != null)
                      {
                          response.sendRedirect("work.jsp");
                      }
                      
                  
             
                 
                 
               
         */   } 
      out.write("       \n");
      out.write("              \n");
      out.write("        </table><br><br>\n");
      out.write("         <center>  <input style=\"height:40px;font-size:14pt\" type=\"submit\" value=\"submit\" name=\"submit\"/> </center>\n");
      out.write("        </form>     \n");
      out.write("       ");
               
          } catch(Exception e)
        {
        
        }
 session.getAttribute("userid");
session.getAttribute("year1");

      out.write("\n");
      out.write("\n");
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
