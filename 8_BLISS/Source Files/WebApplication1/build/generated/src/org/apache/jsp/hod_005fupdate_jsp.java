package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import query1.*;

public final class hod_005fupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
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
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <form name=\"hod_update\" method=\"post\"  action=\"u_credit.jsp\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        \n");
      out.write("            ");
 
                try    
                    
            {
                
            
                 
  
   
       ResultSet rs=null,rs1=null; 
       
  
       if (request.getParameter("submit") != null)
       {
           String uid=request.getParameter("uid");
    String yr=request.getParameter("yr");
    session.setAttribute("uid",uid) ;
    session.setAttribute("yr",yr);
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
      out.write("                  \n");
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
      out.write("                 <td><input class=\"input\" size=\"30\" type=\"text\" size=\"30\" value=\"");
      out.print(rs.getString(3));
      out.write("\"</td> \n");
      out.write("                            \n");
      out.write("                           \n");
      out.write("        </tr>\n");
      out.write("          \n");
      out.write("</center>\n");
      out.write("   ");
} 
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table align=\"center\">\n");
      out.write("    <tr>\n");
      out.write("                    <th><font class=\"d\">Select Details</font></th>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                    <select class=\"input1\" name=\"detail\">\n");
      out.write("                        <option selected>Annual report Committee</option selected>\n");
      out.write("                        \n");
      out.write("                        <option>Cultural Committee\n");
      out.write("                         <option>Student taken for placement\t\n");
      out.write("                         <option>Cultural Committee of Mayukh\n");
      out.write("                         <option>Cultural Committee\n");
      out.write("                         <option>\n");
      out.write("                             Decor committee of Mayukh\n");
      out.write("                         <option>\n");
      out.write("                             Workshop conduct\n");
      out.write("                         <option>\n");
      out.write("                             Coordinator of placement\n");
      out.write("                         </option>\n");
      out.write("                         </option>\n");
      out.write("   </option>\n");
      out.write("                         </option>\n");
      out.write("                         </option>\n");
      out.write("                         </option></option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("                 <th><font class=\"d\">Select Credit Points</font></th>\n");
      out.write("                <td>\n");
      out.write("                    <select class=\"input1\" name=\"credit\">\n");
      out.write("                        <option selected>1</option selected>\n");
      out.write("                        \n");
      out.write("                        <option>2\n");
      out.write("                         <option>3\t\n");
      out.write("                         <option>4\n");
      out.write("                         <option>5\n");
      out.write("                         </option> </option>\n");
      out.write("                         </option>\n");
      out.write("                         </option></option>\n");
      out.write("                    </select>\n");
      out.write("                            \n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("</table>\n");
      out.write(" ");
session.setAttribute("table1","departmental_respo");
      out.write("\n");
      out.write("   <input type=\"submit\" value=\"update\" name=\"update\" /> \n");
      out.write("       ");
 } 

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    ");

         
       if(request.getParameter("table1").equals("invigilation"))
       {
           
      out.write("  \n");
      out.write("             \n");
      out.write("         \n");
      out.write("              \n");
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
      out.write("\n");
      out.write("        <table align=\"center\">\n");
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
      out.write("                 <th><font class=\"d\">Select Credit Points</font></th>\n");
      out.write("                <td>\n");
      out.write("                    <select class=\"input1\" name=\"credit\">\n");
      out.write("                        <option selected>1</option selected>\n");
      out.write("                        \n");
      out.write("                        <option>2\n");
      out.write("                         <option>3\t\n");
      out.write("                         <option>4\n");
      out.write("                         <option>5\n");
      out.write("                         </option> </option>\n");
      out.write("                         </option>\n");
      out.write("                         </option></option>\n");
      out.write("                    </select>\n");
      out.write("                            \n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("</table>\n");
      out.write("        ");
 session.setAttribute("table1","invigilation");
      out.write("\n");
      out.write("        <input type=\"submit\" value=\"update\" name=\"update\" /> \n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("      ");

              
    
    if(request.getParameter("table1").equals("other_academic_respo"))
       {
      out.write("\n");
      out.write("            <table  align=\"center\" border=\"1\">\n");
      out.write("            \n");
      out.write("            <h1 align=\"center\"><b class=\"p1\" size=\"10\">Other Academic Responsibilities</b></h1>\n");
      out.write("             <tr>\n");
      out.write("                 <th class=\"d\" bgcolor=\"silver\" rowspan=\"2\">Academic body/Committee</th>\n");
      out.write("            \n");
      out.write("                  <th class=\"d\" bgcolor=\"silver\" rowspan=\"2\">Meeting attended/held</th>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("                  \n");
      out.write("               <th class=\"d\"  bgcolor=\"silver\" rowspan=\"2\" size=\"20\">Role & responsibilities</th>\n");
      out.write("            \n");
      out.write("                   \n");
      out.write("              <th class=\"d\" bgcolor=\"silver\" rowspan=\"2\" size=\"10\">Quality of participation</th>\n");
      out.write("              <th class=\"d\" bgcolor=\"silver\" colspan=\"2\">Credit Points</th>\n");
      out.write("            \n");
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
 

       rs= q.get_data("select * from other_academic_respo where uid='"+request.getParameter("uid")+"'and Year="+request.getParameter("yr")+"");
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
      out.write("                 <td><input class=\"input\" size=\"27\" type=\"text\" value=\"");
      out.print(rs.getString(3));
      out.write("\"></td>\n");
      out.write("            \n");
      out.write("                 \n");
      out.write("                 <td><input class=\"input\" size=\"28\" type=\"text\" value=\"");
      out.print(rs.getString(4));
      out.write("\"> </td>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                 <td><input class=\"input\" size=\"30\" type=\"text\" value=\"");
      out.print(rs.getString(5));
      out.write("\"></td>\n");
      out.write("                 <td><input class=\"input\" size=\"5\" type=\"text\" value=\"");
      out.print(rs.getString(6));
      out.write("\"></td>\n");
      out.write("                 <td><input class=\"input\" size=\"8\" type=\"text\" value=\"");
      out.print(rs.getString(7));
      out.write("\"></td>\n");
      out.write("                 \n");
      out.write("            </tr>\n");
      out.write("           ");
 }
      out.write("\n");
      out.write("</center>\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("\n");
      out.write(" <table align=\"center\">\n");
      out.write("    <tr>\n");
      out.write("        <th><font class=\"d\">Roles and Responsibility</font></th>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                    <select class=\"input1\" name=\"detail\">\n");
      out.write("                        <option selected>syallbus designed</option selected>\n");
      out.write("                        \n");
      out.write("                        <option>Syllabus discussion\n");
      out.write("                         <option>time table design\n");
      out.write("                               </option>\n");
      out.write("                         </option>\n");
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("                 <th><font class=\"d\">Select Credit Points</font></th>\n");
      out.write("                <td>\n");
      out.write("                    <select class=\"input1\" name=\"credit\">\n");
      out.write("                        <option selected>1</option selected>\n");
      out.write("                        \n");
      out.write("                        <option>2\n");
      out.write("                         <option>3\t\n");
      out.write("                         <option>4\n");
      out.write("                         <option>5\n");
      out.write("                         </option> </option>\n");
      out.write("                         </option>\n");
      out.write("                         </option>\n");
      out.write("                    </select>\n");
      out.write("                            \n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("</table>\n");
      out.write("                         \n");
      out.write("\n");
      out.write("\n");
      out.write("  ");
 session.setAttribute("table1","other_academic_respo");
      out.write("\n");
      out.write("  <input type=\"submit\" value=\"update\" name=\"update\" /> \n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("        \n");
      out.write("        ");

          }
        
             if(request.getParameter("table1").equals("other_insti_respo"))
       {
        
      out.write("    <table  align=\"center\" border=\"1\">\n");
      out.write("           <h1 align=\"center\"><b class=\"p1\">Other Institutional Responsibilities Assigned</b></h1>\n");
      out.write("             <tr>\n");
      out.write("                 <th class=\"d\" bgcolor=\"silver\" rowspan=\"2\" size=\"30\">Responsibilities</th>\n");
      out.write("            \n");
      out.write("                  <th class=\"d\"  bgcolor=\"silver\" rowspan=\"2\">Quality</th>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("                  \n");
      out.write("               <th class=\"d\" bgcolor=\"silver\" colspan=\"2\"> Credit Points</th>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("             </tr>\n");
      out.write("             <tr>\n");
      out.write("                 <th class=\"d\" bgcolor=\"silver\"> Full</th>\n");
      out.write("                 <th class=\"d\" bgcolor=\"silver\">Obtained</th>\n");
      out.write("             </tr>\n");
      out.write("                       \n");
      out.write("                  \n");
      out.write("            \n");
      out.write("              ");

        
               
             percon q=new percon();

       rs= q.get_data("select * from other_insti_respo where uid='"+request.getParameter("uid")+"'and Year="+request.getParameter("yr")+" ");
   while(rs.next())
   {
                 

      out.write("\n");
      out.write("<center>\n");
      out.write("  \n");
      out.write("             <tr >\n");
      out.write("                 <td><input class=\"input\" size=\"30\" type=\"text\" value=\"");
      out.print(rs.getString(2));
      out.write("\"></td>\n");
      out.write("                 <td><input class=\"input\" size=\"30\" type=\"text\" value=\"");
      out.print(rs.getString(3));
      out.write("\"></td>\n");
      out.write("                 <td><input class=\"input\"size=\"5\" type=\"text\" value=\"");
      out.print(rs.getString(4));
      out.write("\"></td>\n");
      out.write("                 <td><input class=\"input\"size=\"10\" type=\"text\" value=\"");
      out.print(rs.getString(5));
      out.write("\"></td>\n");
      out.write("            \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("           ");
 }
      out.write("\n");
      out.write("           \n");
      out.write("</center>\n");
      out.write("        </table>\n");
      out.write("            \n");
      out.write("     <br>\n");
      out.write("<br> \n");
      out.write(" <table align=\"center\">\n");
      out.write("    <tr>\n");
      out.write("        <th><font class=\"d\">Responsibilities</font></th>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                    <select class=\"input1\" name=\"detail\">\n");
      out.write("                        <option selected>Convocation degree </option selected>\n");
      out.write("                        \n");
      out.write("                        <option>Apaji Mala dinner duty\n");
      out.write("                         <option>Admission Duty\n");
      out.write("                         <option>Annual function duty\n");
      out.write("                         <option>Workshop conduct\n");
      out.write("                         <option>Convocation duty   \n");
      out.write("                         <option>Apaji mela duty\n");
      out.write("                         <option>Placement duty\n");
      out.write("                         <option>Workshop duty</option>\n");
      out.write("                             \n");
      out.write("                    </option>\n");
      out.write("                         </option>\n");
      out.write("                         </option>\n");
      out.write("                         \n");
      out.write("                         </option>\n");
      out.write("                         </option>\n");
      out.write("                               </option>\n");
      out.write("                         </option>\n");
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("                 <th><font class=\"d\">Select Credit Points</font></th>\n");
      out.write("                <td>\n");
      out.write("                    <select class=\"input1\" name=\"credit\">\n");
      out.write("                        <option selected>1</option selected>\n");
      out.write("                        \n");
      out.write("                        <option>2\n");
      out.write("                         <option>3\t\n");
      out.write("                         <option>4\n");
      out.write("                         <option>5\n");
      out.write("                         </option> </option>\n");
      out.write("                         </option>\n");
      out.write("                         </option></option>\n");
      out.write("                    </select>\n");
      out.write("                            \n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("</table>\n");
      out.write("                         \n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
 session.setAttribute("table1","other_insti_respo");
        
      out.write("\n");
      out.write("        <input type=\"submit\" value=\"update\" name=\"update\" />    \n");
      out.write("      ");
}
       if(request.getParameter("table1").equals("workshop"))
       {
      out.write("\n");
      out.write("          <center><h1><b class=\"p1\">Participation in Conference/Symposia/Workshop/Seminars</b></h1></center>  \n");
      out.write("        <table  border=\"1\" align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("               <th class=\"d\" bgcolor=\"silver\">Title</th>\n");
      out.write("               <th class=\"d\" bgcolor=\"silver\">Place</th>\n");
      out.write("               <th class=\"d\" bgcolor=\"silver\">Date</th>\n");
      out.write("               <th class=\"d\" bgcolor=\"silver\">Details</th>\n");
      out.write("               <th class=\"d\" bgcolor=\"silver\">Credit points</th>\n");
      out.write("            </tr>\n");
      out.write("           \n");
      out.write("             ");

                  
                  
              
                     
               
             percon q=new percon();

      rs= q.get_data("select * from workshop where uid='"+request.getParameter("uid")+"'and Year="+request.getParameter("yr")+"");
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
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<table align=\"center\">\n");
      out.write("    <tr>\n");
      out.write("        <th><font class=\"d\">Details</font></th>\n");
      out.write("                <td>\n");
      out.write("                    \n");
      out.write("                    <select class=\"input1\" name=\"detail\">\n");
      out.write("                        <option selected>Big data Hadoop </option selected>\n");
      out.write("                        \n");
      out.write("                        <option>Networking\n");
      out.write("                         <option>Ethical hacking\n");
      out.write("                         \n");
      out.write("                         </option>\n");
      out.write("                         </option>\n");
      out.write("                              \n");
      out.write("                        \n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("                 <th><font class=\"d\">Select Credit Points</font></th>\n");
      out.write("                <td>\n");
      out.write("                    <select class=\"input1\" name=\"credit\">\n");
      out.write("                        <option selected>1</option selected>\n");
      out.write("                        \n");
      out.write("                        <option>2\n");
      out.write("                         <option>3\t\n");
      out.write("                         <option>4\n");
      out.write("                         <option>5\n");
      out.write("                         </option> </option>\n");
      out.write("                         </option>\n");
      out.write("                         </option></option>\n");
      out.write("                    </select>\n");
      out.write("                            \n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("</table>\n");
      out.write("                         \n");
      out.write("\n");
      out.write("     \n");
 session.setAttribute("table1","workshop");}
        
      out.write("\n");
      out.write(" \n");
      out.write("          \n");
      out.write("       \n");
      out.write("   \n");
      out.write("        \n");
      out.write("    \n");
      out.write("     \n");
      out.write("     \n");
      out.write("       \n");
      out.write("<input type=\"submit\" value=\"update\" name=\"update\" />\n");
      out.write("\n");



}
      out.write("\n");
      out.write(" \n");
      out.write(" ");

}
}

catch(Exception e)
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
