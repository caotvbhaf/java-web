package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class teacher_002ddetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Mirrored from www.radiustheme.com/demo/html/psdboss/akkhor/akkhor/teacher-details.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 10 Oct 2020 11:48:37 GMT -->\n");
      out.write("<!-- Added by HTTrack --><meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\" /><!-- /Added by HTTrack -->\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <title>AKKHOR | Teacher Details</title>\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"img/favicon.png\">\n");
      out.write("    <!-- Normalize CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("    <!-- Main CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <!-- Fontawesome CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/all.min.css\">\n");
      out.write("    <!-- Flaticon CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts/flaticon.css\">\n");
      out.write("    <!-- Animate CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.min.css\">\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <!-- Modernize js -->\n");
      out.write("    <script src=\"js/modernizr-3.6.0.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"dashboard-content-one\">\n");
      out.write("                <!-- Breadcubs Area Start Here -->\n");
      out.write("                <div class=\"breadcrumbs-area\">\n");
      out.write("                    <h3>Teacher</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"index.html\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>Teacher Details</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- Breadcubs Area End Here -->\n");
      out.write("                <!-- Student Table Area Start Here -->\n");
      out.write("                <div class=\"card height-auto\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"heading-layout1\">\n");
      out.write("                            <div class=\"item-title\">\n");
      out.write("                                <h3>About Me</h3>\n");
      out.write("                            </div>\n");
      out.write("                           <div class=\"dropdown\">\n");
      out.write("                                <a class=\"dropdown-toggle\" href=\"#\" role=\"button\" \n");
      out.write("                                data-toggle=\"dropdown\" aria-expanded=\"false\">...</a>\n");
      out.write("        \n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-times text-orange-red\"></i>Close</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-cogs text-dark-pastel-green\"></i>Edit</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-redo-alt text-orange-peel\"></i>Refresh</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"single-info-details\">\n");
      out.write("                            <div class=\"item-img\">\n");
      out.write("                                <img src=\"img/figure/teacher.jpg\" alt=\"teacher\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item-content\">\n");
      out.write("                                <div class=\"header-inline item-header\">\n");
      out.write("                                    <h3 class=\"text-dark-medium font-medium\">Steven Johnson</h3>\n");
      out.write("                                    <div class=\"header-elements\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"far fa-edit\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fas fa-print\"></i></a></li>\n");
      out.write("                                            <li><a href=\"#\"><i class=\"fas fa-download\"></i></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <p>Aliquam erat volutpat. Curabiene natis massa sedde lacu stiquen sodale \n");
      out.write("                                word moun taiery.Aliquam erat volutpaturabiene natis massa sedde  sodale \n");
      out.write("                                word moun taiery.</p>\n");
      out.write("                                <div class=\"info-table table-responsive\">\n");
      out.write("                                    <table class=\"table text-nowrap\">\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Name:</td>\n");
      out.write("                                                <td class=\"font-medium text-dark-medium\">Steven Johnson</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Gender:</td>\n");
      out.write("                                                <td class=\"font-medium text-dark-medium\">Male</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Father Name:</td>\n");
      out.write("                                                <td class=\"font-medium text-dark-medium\">Steve Jones</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Mother Name:</td>\n");
      out.write("                                                <td class=\"font-medium text-dark-medium\">Naomi Rose</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Religion:</td>\n");
      out.write("                                                <td class=\"font-medium text-dark-medium\">Islam</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Joining Date:</td>\n");
      out.write("                                                <td class=\"font-medium text-dark-medium\">07.08.2016</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>E-mail:</td>\n");
      out.write("                                                <td class=\"font-medium text-dark-medium\">stevenjohnson@gmail.com</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Subject:</td>\n");
      out.write("                                                <td class=\"font-medium text-dark-medium\">English</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Class:</td>\n");
      out.write("                                                <td class=\"font-medium text-dark-medium\">2</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Section:</td>\n");
      out.write("                                                <td class=\"font-medium text-dark-medium\">Pink</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>ID No:</td>\n");
      out.write("                                                <td class=\"font-medium text-dark-medium\">10005</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Address:</td>\n");
      out.write("                                                <td class=\"font-medium text-dark-medium\">House #10, Road #6, Australia</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Phone:</td>\n");
      out.write("                                                <td class=\"font-medium text-dark-medium\">+ 88 98568888418</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Student Table Area End Here -->\n");
      out.write("                <footer class=\"footer-wrap-layout1\">\n");
      out.write("                    <div class=\"copyright\">© Copyrights <a href=\"#\">akkhor</a> 2019. All rights reserved. Designed by <a href=\"#\">PsdBosS</a></div>\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Page Area End Here -->\n");
      out.write("    </div>\n");
      out.write("    <!-- jquery-->\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <!-- Plugins js -->\n");
      out.write("    <script src=\"js/plugins.js\"></script>\n");
      out.write("    <!-- Popper js -->\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <!-- Bootstrap js -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Scroll Up Js -->\n");
      out.write("    <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("    <!-- Custom Js -->\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Mirrored from www.radiustheme.com/demo/html/psdboss/akkhor/akkhor/teacher-details.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 10 Oct 2020 11:48:37 GMT -->\n");
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
