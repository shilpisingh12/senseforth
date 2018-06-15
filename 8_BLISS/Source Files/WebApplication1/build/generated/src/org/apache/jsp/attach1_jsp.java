package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import query1.*;
import java.sql.*;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.output.*;
import java.util.Iterator;
import java.util.List;

public final class attach1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


             String str1,yr;
             String uid;
             String uploadFolder,uploadFolder1,filePath;
            File file;
            int maxsize=5000000;
            int maxfact=5000000;
            String path="D:/WebApplication1/web/cv";
            
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
      out.write("  \n");
      out.write("\n");
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
      out.write("        <title>insert_image Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            
            uid=(String)session.getAttribute("userid");
            //out.print(uid);
           String type=request.getContentType();
          
           //out.print("hi");
           if(type.indexOf("multipart/form-data")>=0)
           {
               out.println("its a multipart data");
               DiskFileItemFactory disfact=new DiskFileItemFactory();
               disfact.setSizeThreshold(maxfact);
               disfact.setRepository(new File("D:/WebApplication1/web/cv"));
               ServletFileUpload upload=new ServletFileUpload(disfact);
               upload.setSizeMax(maxsize);
               List lis=upload.parseRequest(request);
               Iterator itr=lis.iterator();
                uploadFolder="D:/WebApplication1/web/cv/";
                       //getServletContext().getRealPath("");
               while(itr.hasNext())
               {
                  
                   FileItem item=(FileItem)itr.next();
                   if(!item.isFormField())
                   {
                     /*str=item.getName();
                     
                    
                     out.println(str);
                     file=new File(str);
                     item.write(file);
                     out.println("uploaded");*/
                       String fileName=new File(item.getName()).getName();
                        filePath=uploadFolder + File.separator + fileName;
                       File uploadedFile= new File(filePath);
                       item.write(uploadedFile);
                     
                   }
                   
               }
           }
            
      out.write("\n");
      out.write("            ");

                try{
                
                    NewClass q=new NewClass();
                   
                    uid=(String)session.getAttribute("userid");
                       yr=(String)session.getAttribute("year1");
                      // uploadFolder1="D:/WebApplication1/web/cv/";
                       out.println(uid);
                    out.println(yr);
                     out.println("filepath  "+filePath);
                     str1="update attach set path='"+filePath+"' where uid='"+uid+"' and year="+yr+"";
                     int s=q.update_data(str1); 
                     out.println("s:"+s);
                      out.println("Data updated successfully");
                //PreparedStatement stm=con.prepareStatement(query);
                }
                
                catch(Exception e)
                {
                   
                    response.sendRedirect("upload1.jsp");
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
