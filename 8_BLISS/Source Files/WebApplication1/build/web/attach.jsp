
<%@page import="java.io.File"%>
  <%@page import="query1.*" %>
<%@page import="java.sql.*" %>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.io.output.*"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>insert_image Page</title>
    </head>
    <body>
        
        <%!
             String str,yr;
             String uid;
             String uploadFolder,uploadFolder1,filePath;
            File file;
            int maxsize=5000000;
            int maxfact=5000000;
            String path="D:/WebApplication1/web/cv";
            %>
        <%
            
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
            %>
            <%
                try{
                
                    NewClass q=new NewClass();
                    uid=(String)session.getAttribute("userid");
                       yr=(String)session.getAttribute("year1");
                      // uploadFolder1="D:/WebApplication1/web/cv/";
                       out.println(uid);
                    out.println(yr);
                     out.println("filepath  "+filePath);
                    String str1="update attach set path='"+filePath+"' where uid='"+uid+"' and year="+yr+"";
                     int s=q.update_data(str1); 
                      out.println("Data updated successfully");
                //PreparedStatement stm=con.prepareStatement(query);
                }
                
                catch(Exception e)
                {
                   
                    response.sendRedirect("upload1.jsp");
                }
                %>
    </body>
</html>
