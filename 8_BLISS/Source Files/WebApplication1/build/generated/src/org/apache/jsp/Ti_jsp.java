package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import query1.*;
import java.sql.*;

public final class Ti_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         \n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body bgcolor=\"beige\">\n");
      out.write("        <form name=\"Ti\" action=\"T_create1.jsp\">\n");
      out.write("         ");
   if((request.getParameter("sub") != null))
                      {
                          out.println("success");
           String class1=request.getParameter("class");
           String course=request.getParameter("course");
           String nos=request.getParameter("nos");
           String cont_ass=request.getParameter("cont_ass");
           
           int cp=5;
           int cp1=5;
           
                  // NewClass q1=new NewClass();
                  try
            { 
          NewClass q=new NewClass();
           String str="insert into continuous(uid,class,course,nos,cont_ass,Year) values('"+session.getAttribute("uid")+"', '"+class1+"','"+course+"',"+nos+",'"+cont_ass+"','"+session.getAttribute("yr")+"')";     
          int s=q.insert_data(str);
    
              out.println("success");
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
                         
                          
                          if(request.getParameter("detail").equals("class"))
                      {
      out.write("\n");
      out.write("                      \n");
      out.write("                      <a href=\"logout.jsp\">logout</a>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <BR>\n");
      out.write("                      \n");
      out.write("                      <center><font size=\"10px\">Class Update</font></center>\n");
      out.write("                       <br>\n");
      out.write("                      <br>\n");
      out.write("                      <BR>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                                            <BR>\n");
      out.write("                      <BR>\n");
      out.write("\n");
      out.write("                           <table align=\"center\">\n");
      out.write("    <tr>\n");
      out.write("        <th><font class=\"d\">Select Class </font></th>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                    <select class=\"input\" name=\"detail\" placeholder=\"select\">\n");
      out.write("                        <option>btech 3rd yr(CS) </option>\n");
      out.write("                        \n");
      out.write("                        <option>Btech 2nd yr(IT)\n");
      out.write("                         <option>mca 2nd yr(CS)\n");
      out.write("                         <option>btech 3rd yr(IT)\n");
      out.write("                             <option>B.tech v sem(cs)\n");
      out.write("                         <option>Mca 2nd yr\n");
      out.write("                         <option>Mca 3rd yr\n");
      out.write("                         <option>BCA I yr\n");
      out.write("                         <option>BCA II yr\n");
      out.write("                         <option>B.tech IV yr\n");
      out.write("                            <option> BCA III yr sem exam\n");
      out.write("                               <option> Btech 3rd yr\n");
      out.write("                         <option>Mca 1st yr\n");
      out.write("                         <option>Bca 1st yr\n");
      out.write("                             </option>\n");
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
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                 \n");
      out.write("        <th><font class=\"d\">Select Previous Class </font></th>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                    <select class=\"input\" name=\"detail1\">\n");
      out.write("                        <option selected>btech3rd year </option selected>\n");
      out.write("                        \n");
      out.write("                        <option>Mca\n");
      out.write("                         <option>B.tech v sem(cs)\n");
      out.write("                         <option>Btech 2nd yr\n");
      out.write("                             <option>B.tech v sem(cs)\n");
      out.write("                         <option>Mca 2nd yr\n");
      out.write("                         <option>Mca 3rd yr\n");
      out.write("                         <option>BCA I yr\n");
      out.write("                         <option>BCA II yr\n");
      out.write("                         <option>B.tech IV yr\n");
      out.write("                            <option> BCA III yr sem exam\n");
      out.write("                               <option> Btech 3rd yr\n");
      out.write("                         <option>Mca 1st yr\n");
      out.write("                         <option>Bca 1st yr\n");
      out.write("                             </option>\n");
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
      out.write("                <td></td>\n");
      out.write("                <th><font class=\"d\">Select Previous Course </font></th>\n");
      out.write("                             <td>\n");
      out.write("                    \n");
      out.write("                    <select class=\"input\" name=\"detail2\">\n");
      out.write("                        <option selected>OS </option selected>\n");
      out.write("                        \n");
      out.write("                        <option>OT\n");
      out.write("                         <option>DAA\n");
      out.write("                         <option>SE\n");
      out.write("                             <option>BDP & SAD\n");
      out.write("                         <option>CAO\n");
      out.write("                         <option>C++\n");
      out.write("                         <option>DS\n");
      out.write("                         <option>DCN\n");
      out.write("                         <option>OOP\n");
      out.write("                            <option>IWT\n");
      out.write("                               <option>Mathematics V\n");
      out.write("                                   <option>Mathematics IV\n");
      out.write("                         <option>TOC\n");
      out.write("                         <option>SAD\n");
      out.write("                             </option>\n");
      out.write("                              </option>\n");
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
      out.write("                             </td>\n");
      out.write("    </tr>\n");
      out.write("                           </table>\n");
      out.write("                ");
session.setAttribute("detail","class");
      out.write("\n");
      out.write("                <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                <center><input  style=\"height:40px;font-size:14pt\"type=\"submit\" value=\"Submit\" name=\"btn\" ></center>\n");
      out.write("                      ");
}
      out.write("\n");
      out.write("                 ");
if(request.getParameter("detail").equals("course"))
                {
      out.write("\n");
      out.write("                <a href=\"logout.jsp\">logout</a>\n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <center><font size=\"10px\">Course Update</font></center>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <th><font class=\"d\">Select Course </font></th>\n");
      out.write("                             <td>\n");
      out.write("                    \n");
      out.write("                    <select class=\"input\" name=\"detail\">\n");
      out.write("                        <option selected>OS </option selected>\n");
      out.write("                        \n");
      out.write("                        <option>OT\n");
      out.write("                         <option>DAA\n");
      out.write("                         <option>SE\n");
      out.write("                             <option>BDP & SAD\n");
      out.write("                         <option>CAO\n");
      out.write("                         <option>C++\n");
      out.write("                         <option>DS\n");
      out.write("                         <option>DCN\n");
      out.write("                         <option>OOP\n");
      out.write("                            <option>IWT\n");
      out.write("                               <option>Mathematics V\n");
      out.write("                                    <option>Mathematics IV\n");
      out.write("                         <option>TOC\n");
      out.write("                         <option>SAD\n");
      out.write("                             </option>\n");
      out.write("                             </option>\n");
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
      out.write("                <td></td>\n");
      out.write("                     <th><font class=\"d\">Select Previous Class </font></th>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                    <select class=\"input\" name=\"detail1\">\n");
      out.write("                        <option selected>btech3rd year </option selected>\n");
      out.write("                        \n");
      out.write("                        <option>Mca\n");
      out.write("                         <option>B.tech v sem(cs)\n");
      out.write("                         <option>Btech 2nd yr\n");
      out.write("                             <option>B.tech v sem(cs)\n");
      out.write("                         <option>Mca 2nd yr\n");
      out.write("                         <option>Mca 3rd yr\n");
      out.write("                         <option>BCA I yr\n");
      out.write("                         <option>BCA II yr\n");
      out.write("                         <option>B.tech IV yr\n");
      out.write("                            <option> BCA III yr sem exam\n");
      out.write("                               <option> Btech 3rd yr\n");
      out.write("                         <option>Mca 1st yr\n");
      out.write("                         <option>Bca 1st yr\n");
      out.write("                             </option>\n");
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
      out.write("                <td></td>\n");
      out.write("                <th><font class=\"d\">Select Previous Course </font></th>\n");
      out.write("                             <td>\n");
      out.write("                    \n");
      out.write("                    <select class=\"input\" name=\"detail2\">\n");
      out.write("                        <option selected>OS </option selected>\n");
      out.write("                        \n");
      out.write("                        <option>OT\n");
      out.write("                         <option>DAA\n");
      out.write("                         <option>SE\n");
      out.write("                             <option>BDP & SAD\n");
      out.write("                         <option>CAO\n");
      out.write("                         <option>C++\n");
      out.write("                         <option>DS\n");
      out.write("                         <option>DCN\n");
      out.write("                         <option>OOP\n");
      out.write("                            <option>IWT\n");
      out.write("                               <option>Mathematics IV\n");
      out.write("                                   <option>Mathematics V\n");
      out.write("                         <option>TOC\n");
      out.write("                         <option>SAD\n");
      out.write("                             </option>\n");
      out.write("                         </option>\n");
      out.write("                          </option>\n");
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
      out.write("                             </td>\n");
      out.write("    </tr>\n");
      out.write("                    \n");
      out.write("                     </table>\n");
      out.write("                    ");
session.setAttribute("detail","course");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <center><input  style=\"height:40px;font-size:14pt\"type=\"submit\" value=\"Submit\" name=\"btn\" ></center>\n");
      out.write("                ");
}
                if(request.getParameter("detail").equals("nos"))
                {
      out.write("\n");
      out.write("                    <a href=\"logout.jsp\">logout</a>\n");
      out.write("                <br>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <center><font size=\"10px\">No.Of Student Update</font></center>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      \n");
      out.write("                      <center><table>\n");
      out.write("                        <tr>\n");
      out.write("                            <th class=\"d\">Enter the number of student</th>\n");
      out.write("                            <th><input class=\"input1\" type=\"text\" name=\"nos\" /></th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr></tr>\n");
      out.write("                    <tr></tr>\n");
      out.write("                        <tr></tr>\n");
      out.write("                    <tr>\n");
      out.write("                     <th><font class=\"d\">Select Previous Course </font></th>\n");
      out.write("                             <td>\n");
      out.write("                    \n");
      out.write("                    <select class=\"input\" name=\"detail2\">\n");
      out.write("                        <option selected>OS </option selected>\n");
      out.write("                        \n");
      out.write("                        <option>OT\n");
      out.write("                         <option>DAA\n");
      out.write("                         <option>SE\n");
      out.write("                             <option>BDP & SAD\n");
      out.write("                         <option>CAO\n");
      out.write("                         <option>C++\n");
      out.write("                         <option>DS\n");
      out.write("                         <option>DCN\n");
      out.write("                         <option>OOP\n");
      out.write("                            <option>IWT\n");
      out.write("                               <option>Mathematics V\n");
      out.write("                                   <option>Mathematics IV\n");
      out.write("                         <option>TOC\n");
      out.write("                         <option>SAD\n");
      out.write("                             </option>\n");
      out.write("                             </option>\n");
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
      out.write("                             </td>\n");
      out.write("                             <th><font class=\"d\">Select Previous Class </font></th>\n");
      out.write("                             <td> <select class=\"input\" name=\"detail1\">\n");
      out.write("                        <option selected>btech3rd year </option selected>\n");
      out.write("                        \n");
      out.write("                        <option>Mca\n");
      out.write("                         <option>B.tech v sem(cs)\n");
      out.write("                         <option>Btech 2nd yr\n");
      out.write("                             <option>B.tech v sem(cs)\n");
      out.write("                         <option>Mca 2nd yr\n");
      out.write("                         <option>Mca 3rd yr\n");
      out.write("                         <option>BCA I yr\n");
      out.write("                         <option>BCA II yr\n");
      out.write("                         <option>B.tech IV yr\n");
      out.write("                            <option> BCA III yr sem exam\n");
      out.write("                               <option> Btech 3rd yr\n");
      out.write("                         <option>Mca 1st yr\n");
      out.write("                         <option>Bca 1st yr\n");
      out.write("                             </option>\n");
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
      out.write("                    </tr>\n");
      out.write("                    </table></center>\n");
      out.write("               ");
session.setAttribute("detail","nos");
      out.write("\n");
      out.write("               <br>\n");
      out.write("               <br>\n");
      out.write("               <br>\n");
      out.write("               <br>\n");
      out.write("               <center><input  style=\"height:40px;font-size:14pt\"type=\"submit\" value=\"Submit\" name=\"btn\" ></center>\n");
      out.write("                     ");
 }
                 if(request.getParameter("detail").equals("cont_ass"))
                {
      out.write("\n");
      out.write("               <a href=\"logout.jsp\">logout</a>\n");
      out.write("                <br>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <center><font size=\"10px\">Continuous Assessment Update</font></center>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      <br>\n");
      out.write("                      \n");
      out.write("                      <center><table>\n");
      out.write("                        <tr>\n");
      out.write("                            <th class=\"d\">Enter the Continuous Assessment</th>\n");
      out.write("                            <th> <input class=\"input1\" type=\"text\" name=\"cont_ass\" /></th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr></tr>\n");
      out.write("                        <tr></tr>\n");
      out.write("                        <tr></tr>\n");
      out.write("                        <tr>\n");
      out.write("                      <th><font class=\"d\">Select Previous Class </font></th>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                    <select class=\"input\" name=\"detail1\">\n");
      out.write("                        <option selected>btech3rd year </option selected>\n");
      out.write("                        \n");
      out.write("                        <option>Mca\n");
      out.write("                         <option>B.tech v sem(cs)\n");
      out.write("                         <option>Btech 2nd yr\n");
      out.write("                             <option>B.tech v sem(cs)\n");
      out.write("                         <option>Mca 2nd yr\n");
      out.write("                         <option>Mca 3rd yr\n");
      out.write("                         <option>BCA I yr\n");
      out.write("                         <option>BCA II yr\n");
      out.write("                         <option>B.tech IV yr\n");
      out.write("                            <option> BCA III yr sem exam\n");
      out.write("                               <option> Btech 3rd yr\n");
      out.write("                         <option>Mca 1st yr\n");
      out.write("                         <option>Bca 1st yr\n");
      out.write("                             </option>\n");
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
      out.write("                <td></td>\n");
      out.write("                <th><font class=\"d\">Select Previous Course </font></th>\n");
      out.write("                             <td>\n");
      out.write("                    \n");
      out.write("                    <select class=\"input\" name=\"detail2\">\n");
      out.write("                        <option selected>OS </option selected>\n");
      out.write("                        \n");
      out.write("                        <option>OT\n");
      out.write("                         <option>DAA\n");
      out.write("                         <option>SE\n");
      out.write("                             <option>BDP & SAD\n");
      out.write("                         <option>CAO\n");
      out.write("                         <option>C++\n");
      out.write("                         <option>DS\n");
      out.write("                         <option>DCN\n");
      out.write("                         <option>OOP\n");
      out.write("                            <option>IWT\n");
      out.write("                               <option>Mathematics V\n");
      out.write("                                   <option>Mathematics IV\n");
      out.write("                         <option>TOC\n");
      out.write("                         <option>SAD\n");
      out.write("                             </option>\n");
      out.write("                             </option>\n");
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
      out.write("                             </td>\n");
      out.write("    </tr>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                          </table></center>\n");
      out.write("                ");
session.setAttribute("detail","cont_ass");
      out.write("\n");
      out.write("                <center><input  style=\"height:40px;font-size:14pt\"type=\"submit\" value=\"Submit\" name=\"btn\" ></center>\n");
      out.write("              ");
 }
                      
                  
}
        
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html><\n");
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
