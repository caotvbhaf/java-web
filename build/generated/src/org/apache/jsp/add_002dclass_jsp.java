package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_002dclass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html class=\"no-js\" lang=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Mirrored from www.radiustheme.com/demo/html/psdboss/akkhor/akkhor/add-class.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 10 Oct 2020 11:48:38 GMT -->\n");
      out.write("    <!-- Added by HTTrack --><meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\" /><!-- /Added by HTTrack -->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("        <title>AKKHOR | Add Class</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"img/favicon.png\">\n");
      out.write("        <!-- Normalize CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("        <!-- Main CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <!-- Fontawesome CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/all.min.css\">\n");
      out.write("        <!-- Flaticon CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/flaticon.css\">\n");
      out.write("        <!-- Animate CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.min.css\">\n");
      out.write("        <!-- Select 2 CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/select2.min.css\">\n");
      out.write("        <!-- Date Picker CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/datepicker.min.css\">\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <!-- Modernize js -->\n");
      out.write("        <script src=\"js/modernizr-3.6.0.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"dashboard-content-one\">\n");
      out.write("            <!-- Breadcubs Area Start Here -->\n");
      out.write("            <div class=\"breadcrumbs-area\">\n");
      out.write("                <h3>Classes</h3>\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"index.html\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>Add New Class</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- Breadcubs Area End Here -->\n");
      out.write("            <!-- Add Class Area Start Here -->\n");
      out.write("            <div class=\"card height-auto\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <div class=\"heading-layout1\">\n");
      out.write("                        <div class=\"item-title\">\n");
      out.write("                            <h3>Add New Class Schedule</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"dropdown\">\n");
      out.write("                            <a class=\"dropdown-toggle\" href=\"#\" role=\"button\" \n");
      out.write("                               data-toggle=\"dropdown\" aria-expanded=\"false\">...</a>\n");
      out.write("\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-times text-orange-red\"></i>Close</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-cogs text-dark-pastel-green\"></i>Edit</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-redo-alt text-orange-peel\"></i>Refresh</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <form class=\"new-added-form\" action=\"CourseController?action=add\" method=\"POST\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xl-3 col-lg-6 col-12 form-group\">\n");
      out.write("                                <label>Course Name *</label>\n");
      out.write("                                <input type=\"text\" placeholder=\"\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-3 col-lg-6 col-12 form-group\">\n");
      out.write("                                <label>Course ID </label>\n");
      out.write("                                <input type=\"text\" placeholder=\"\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-3 col-lg-6 col-12 form-group\">\n");
      out.write("                                <label>Category *</label>\n");
      out.write("                                <select class=\"select2\">\n");
      out.write("                                    <option value=\"\">Please Select</option>\n");
      out.write("                                    <option value=\"1\">Short Course</option>\n");
      out.write("                                    <option value=\"2\">Long Course</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-3 col-lg-6 col-12 form-group\">\n");
      out.write("                                <label>Topic</label>\n");
      out.write("                                <select class=\"select2\">\n");
      out.write("                                    <option value=\"\">Please Select*</option>\n");
      out.write("                                    <option value=\"C#\" name=\"txtTopic\">C#</option>\n");
      out.write("                                    <option value=\"PHP\" name=\"txtTopic\">PHP</option>\n");
      out.write("                                    <option value=\"JAVA\" name=\"txtTopic\">JAVA</option>\n");
      out.write("                                    <option value=\"JAVASCRIPT\" name=\"txtTopic\">JAVASCRIPT</option>\n");
      out.write("                                    <option value=\"REACTJS\" name=\"txtTopic\">REACTJS</option>\n");
      out.write("                                    <option value=\"NODEJS\" name=\"txtTopic\">NODEJS</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-3 col-lg-6 col-12 form-group\">\n");
      out.write("                                <label>Teacher Name *</label>\n");
      out.write("                                <select class=\"select2\">\n");
      out.write("                                    <option value=\"\">Please Select*</option>\n");
      out.write("                                    <option value=\"1\">English</option>\n");
      out.write("                                    <option value=\"2\">Mathmethics</option>\n");
      out.write("                                    <option value=\"3\">Physics</option>\n");
      out.write("                                    <option value=\"3\">Chemestry</option>\n");
      out.write("                                    <option value=\"3\">Biology</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-3 col-lg-6 col-12 form-group\">\n");
      out.write("                                <label>ID Teacher *</label>\n");
      out.write("                                <select class=\"select2\">\n");
      out.write("                                    <option value=\"\">Please Select *</option>\n");
      out.write("                                    <option value=\"1\">Pink</option>\n");
      out.write("                                    <option value=\"2\">Blue</option>\n");
      out.write("                                    <option value=\"3\">Bird</option>\n");
      out.write("                                    <option value=\"3\">Rose</option>\n");
      out.write("                                    <option value=\"3\">Red</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-3 col-lg-6 col-12 form-group\">\n");
      out.write("                                <label>Time To Start*</label>\n");
      out.write("                                <input type=\"text\" placeholder=\"dd/mm/yyyy\" class=\"form-control air-datepicker\" data-position=\"bottom right\">\n");
      out.write("                                <i class=\"far fa-calendar-alt\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-3 col-lg-6 col-12 form-group\">\n");
      out.write("                                <label>Time To End*</label>\n");
      out.write("                                <input type=\"text\" placeholder=\"dd/mm/yyyy\" class=\"form-control air-datepicker\" data-position=\"bottom right\">\n");
      out.write("                                <i class=\"far fa-calendar-alt\"></i>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-6 form-group\"></div>\n");
      out.write("                            <div class=\"col-12 form-group mg-t-8\">\n");
      out.write("                                <button type=\"submit\" class=\"btn-fill-lg btn-gradient-yellow btn-hover-bluedark\">Save</button>\n");
      out.write("                                <button type=\"reset\" class=\"btn-fill-lg bg-blue-dark btn-hover-yellow\">Reset</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Add Class Area End Here -->\n");
      out.write("            <footer class=\"footer-wrap-layout1\">\n");
      out.write("                <div class=\"copyright\">© Copyrights <a href=\"#\">akkhor</a> 2019. All rights reserved. Designed by <a href=\"#\">PsdBosS</a></div>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Page Area End Here -->\n");
      out.write("</div>\n");
      out.write("<!-- jquery-->\n");
      out.write("<script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<!-- Plugins js -->\n");
      out.write("<script src=\"js/plugins.js\"></script>\n");
      out.write("<!-- Popper js -->\n");
      out.write("<script src=\"js/popper.min.js\"></script>\n");
      out.write("<!-- Bootstrap js -->\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<!-- Select 2 Js -->\n");
      out.write("<script src=\"js/select2.min.js\"></script>\n");
      out.write("<!-- Date Picker Js -->\n");
      out.write("<script src=\"js/datepicker.min.js\"></script>\n");
      out.write("<!-- Scroll Up Js -->\n");
      out.write("<script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("<!-- Custom Js -->\n");
      out.write("<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Mirrored from www.radiustheme.com/demo/html/psdboss/akkhor/akkhor/add-class.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 10 Oct 2020 11:48:38 GMT -->\n");
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
