package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import query1.*;

public final class rfpinsertion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>successfully register</title>\n");
      out.write("    </head>  \n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\"><b> UR ARE SUCESSFULLY REGISTERED</b></h1> \n");
      out.write("<marquee>UR ARE SUCESSFULLY REGISTERED</marquee>\n");
      out.write("</body>\n");
      out.write("</html>\n");

    
   
           String eno=request.getParameter("eno"); //entries
           String dob=request.getParameter("dob");
           String fn=request.getParameter("fname");
           String lname=request.getParameter("lname");
           String faname=request.getParameter("faname");
           //String dob=request.getParameter("dob");
           String mbno=request.getParameter("mobil");
          // String eid=request.getParameter("email");
          // String tadd=request.getParameter("add");
           // String padd=request.getParameter("add");
          // String city=request.getParameter("city");
          // String state=request.getParameter("state");
           String s_id=request.getParameter("Stu_id");      //Under-Graduation Details
           String ci=request.getParameter("Course_id");
           String yr_10=request.getParameter("Year_of_10");
           String t_m_10=request.getParameter("Tot_marks_10");
           String mx_10=request.getParameter("Max_marks_10");
           String pr_10=request.getParameter("Per_10");
           String yr_12=request.getParameter("Year_of_12");
           String t_m_12=request.getParameter("Tot_marks_12");
           String mx_12=request.getParameter("Max_marks_12");
           String pr_12=request.getParameter("Per_12");
           String s1=request.getParameter("Sem1");
           String s2=request.getParameter("Sem2");
           String s3=request.getParameter("Sem3");
           String s4=request.getParameter("Sem4");
           String s5=request.getParameter("Sem5");
           String s6=request.getParameter("Sem6");

	   String Stu_id=request.getParameter("Stu_id");   //Post-Graduation Details
           String Course_id=request.getParameter("Course_id");
           String year_10=request.getParameter("10th_year");
           String Per_10=request.getParameter("Per_10");
           String year_12=request.getParameter("12th_year");
           String Per_12=request.getParameter("Per_12");
           String UG_year=request.getParameter("UG_year");
           String Per_UG=request.getParameter("Per_UG");
           String Sem1=request.getParameter("Sem1");
           String Sem2=request.getParameter("Sem2");
           String Sem3=request.getParameter("Sem3");
           String Sem4=request.getParameter("Sem4");
           
           
           
           
           String cid=request.getParameter("cid");
           String nm=request.getParameter("nm");
           if(request.getParameter("btn_add")!=null)
           {
           out.print(eno);
           NewClass q=new NewClass();
           String str= "insert into stud1(id,dob,fname,lname,faname,mbno)values('"+eno+"','"+dob+"','"+fn+"','"+lname+"','"+faname+"','"+mbno+"')";
          int x=q.insert_data(str); 
          out.print(x);
          
          
          String str1= "insert into ug(stu_id,course_id,Year_of_10,tot_marks_10,max_marks_10th,per_10th,year_of_12th,tot_marks_12th,max_marks_12th,per_12th,sem1,sem2,sem3,sem4,sem5,sem6)values('"+s_id+"','"+ci+"','"+yr_10+"','"+t_m_10+"','"+mx_10+"','"+pr_10+"','"+yr_12+"','"+t_m_12+"','"+mx_12+"','"+pr_12+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"')";
                  int y=q.insert_data(str1); 
                //  out.print(y);
           String str2= "insert into pg(Stu_id,Course_id,year_10,Per_10,year_12,Per_12,UG_year,Per_UG,Sem1,Sem2,Sem3,Sem4)values('"+Stu_id+"','"+Course_id+"','"+year_10+"','"+Per_10+"','"+year_12+"','"+Per_12+"','"+UG_year+"','"+Per_UG+"','"+Sem1+"','"+Sem2+"','"+Sem3+"','"+Sem4+"')";
          
                  int z=q.insert_data(str2); 
                 // out.print(z);
                  
                  
                  
                   String str3= "insert into course(course_id,course_name)values('"+cid+"','"+nm+"')";
          
                  int v=q.insert_data(str3); 
                 // out.print(v);
           }
    
    
      out.write("\n");
      out.write("    \n");
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
