package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import entity.Product;

public final class ViewProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            ArrayList<Product> list = (ArrayList<Product>) request.getAttribute("pList");
            if (list == null) {
                response.sendRedirect("ProductControl?action=getData");
            } else {
        
      out.write("\n");
      out.write("\n");
      out.write("        <h1 style=\"text-align: center\">Product List</h1>\n");
      out.write("\n");
      out.write("        <table border=\"1\" align=\"center\" width=\"60%\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Id</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Price</th>\n");
      out.write("                <th>Action</th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");

                for (Product p : list) {
                    String id = p.getId();
                    String name = p.getName();
                    String price = p.getPrice();
            
      out.write("        \n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <th>");
      out.print(id);
      out.write("</th>\n");
      out.write("                <th>");
      out.print(name);
      out.write("</th>\n");
      out.write("                <th>");
      out.print(price);
      out.write("</th>\n");
      out.write("                <th>\n");
      out.write("                    <a href=\"ProductControl?action=edit&id=");
      out.print(id);
      out.write("\" value='");
      out.print(id);
      out.write("' />Edit</a>\n");
      out.write("                    <a href=\"ProductControl?action=delete&id=");
      out.print(id);
      out.write("\" value='");
      out.print(id);
      out.write("' />Delete</a>\n");
      out.write("                </th>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");

                    }
                }
            
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
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
