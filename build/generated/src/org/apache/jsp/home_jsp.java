package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/checkSession.jsp");
  }

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

    if (session.getAttribute("user") == null) {
        response.sendRedirect("Login.jsp");
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html class=\"no-js\" lang=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Mirrored from www.radiustheme.com/demo/html/psdboss/akkhor/akkhor/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 10 Oct 2020 11:47:56 GMT -->\n");
      out.write("<!-- Added by HTTrack --><meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\" /><!-- /Added by HTTrack -->\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <title>AKKHOR | Home 1</title>\n");
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
      out.write("    <!-- Full Calender CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/fullcalendar.min.css\">\n");
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
      out.write("                    <h3>Admin Dashboard</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"home.jsp\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>Admin</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- Breadcubs Area End Here -->\n");
      out.write("               \n");
      out.write("                <!-- Dashboard Content Start Here -->\n");
      out.write("                <div class=\"row gutters-20\">\n");
      out.write("                    <div class=\"col-12 col-xl-8 col-6-xxxl\">\n");
      out.write("                        <div class=\"card dashboard-card-one pd-b-20\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"heading-layout1\">\n");
      out.write("                                    <div class=\"item-title\">\n");
      out.write("                                        <h3>Earnings</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"dropdown\">\n");
      out.write("                                        <a class=\"dropdown-toggle\" href=\"#\" role=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                                            aria-expanded=\"false\">...</a>\n");
      out.write("\n");
      out.write("                                        <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\"><i\n");
      out.write("                                                    class=\"fas fa-times text-orange-red\"></i>Close</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\"><i\n");
      out.write("                                                    class=\"fas fa-cogs text-dark-pastel-green\"></i>Edit</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\"><i\n");
      out.write("                                                    class=\"fas fa-redo-alt text-orange-peel\"></i>Refresh</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"earning-report\">\n");
      out.write("                                    <div class=\"item-content\">\n");
      out.write("                                        <div class=\"single-item pseudo-bg-blue\">\n");
      out.write("                                            <h4>Total Collections</h4>\n");
      out.write("                                            <span>75,000</span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"single-item pseudo-bg-red\">\n");
      out.write("                                            <h4>Fees Collection</h4>\n");
      out.write("                                            <span>15,000</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"dropdown\">\n");
      out.write("                                        <a class=\"date-dropdown-toggle\" href=\"#\" role=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                                            aria-expanded=\"false\">Jan 20, 2019</a>\n");
      out.write("                                        <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\">Jan 20, 2019</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\">Jan 20, 2021</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\">Jan 20, 2020</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"earning-chart-wrap\">\n");
      out.write("                                    <canvas id=\"earning-line-chart\" width=\"660\" height=\"320\"></canvas>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-xl-4 col-3-xxxl\">\n");
      out.write("                        <div class=\"card dashboard-card-two pd-b-20\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"heading-layout1\">\n");
      out.write("                                    <div class=\"item-title\">\n");
      out.write("                                        <h3>Expenses</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"dropdown\">\n");
      out.write("                                        <a class=\"dropdown-toggle\" href=\"#\" role=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                                            aria-expanded=\"false\">...</a>\n");
      out.write("\n");
      out.write("                                        <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\"><i\n");
      out.write("                                                    class=\"fas fa-times text-orange-red\"></i>Close</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\"><i\n");
      out.write("                                                    class=\"fas fa-cogs text-dark-pastel-green\"></i>Edit</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\"><i\n");
      out.write("                                                    class=\"fas fa-redo-alt text-orange-peel\"></i>Refresh</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"expense-report\">\n");
      out.write("                                    <div class=\"monthly-expense pseudo-bg-Aquamarine\">\n");
      out.write("                                        <div class=\"expense-date\">Jan 2019</div>\n");
      out.write("                                        <div class=\"expense-amount\"><span>$</span> 15,000</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"monthly-expense pseudo-bg-blue\">\n");
      out.write("                                        <div class=\"expense-date\">Feb 2019</div>\n");
      out.write("                                        <div class=\"expense-amount\"><span>$</span> 10,000</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"monthly-expense pseudo-bg-yellow\">\n");
      out.write("                                        <div class=\"expense-date\">Mar 2019</div>\n");
      out.write("                                        <div class=\"expense-amount\"><span>$</span> 8,000</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"expense-chart-wrap\">\n");
      out.write("                                    <canvas id=\"expense-bar-chart\" width=\"100\" height=\"300\"></canvas>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-xl-6 col-3-xxxl\">\n");
      out.write("                        <div class=\"card dashboard-card-three pd-b-20\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"heading-layout1\">\n");
      out.write("                                    <div class=\"item-title\">\n");
      out.write("                                        <h3>Students</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"dropdown\">\n");
      out.write("                                        <a class=\"dropdown-toggle\" href=\"#\" role=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                                            aria-expanded=\"false\">...</a>\n");
      out.write("\n");
      out.write("                                        <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\"><i\n");
      out.write("                                                    class=\"fas fa-times text-orange-red\"></i>Close</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\"><i\n");
      out.write("                                                    class=\"fas fa-cogs text-dark-pastel-green\"></i>Edit</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\"><i\n");
      out.write("                                                    class=\"fas fa-redo-alt text-orange-peel\"></i>Refresh</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"doughnut-chart-wrap\">\n");
      out.write("                                    <canvas id=\"student-doughnut-chart\" width=\"100\" height=\"300\"></canvas>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"student-report\">\n");
      out.write("                                    <div class=\"student-count pseudo-bg-blue\">\n");
      out.write("                                        <h4 class=\"item-title\">Female Students</h4>\n");
      out.write("                                        <div class=\"item-number\">45,000</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"student-count pseudo-bg-yellow\">\n");
      out.write("                                        <h4 class=\"item-title\">Male Students</h4>\n");
      out.write("                                        <div class=\"item-number\">1,05,000</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-xl-6 col-4-xxxl\">\n");
      out.write("                        <div class=\"card dashboard-card-four pd-b-20\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"heading-layout1\">\n");
      out.write("                                    <div class=\"item-title\">\n");
      out.write("                                        <h3>Event Calender</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"dropdown\">\n");
      out.write("                                        <a class=\"dropdown-toggle\" href=\"#\" role=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                                            aria-expanded=\"false\">...</a>\n");
      out.write("\n");
      out.write("                                        <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\"><i\n");
      out.write("                                                    class=\"fas fa-times text-orange-red\"></i>Close</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\"><i\n");
      out.write("                                                    class=\"fas fa-cogs text-dark-pastel-green\"></i>Edit</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\"><i\n");
      out.write("                                                    class=\"fas fa-redo-alt text-orange-peel\"></i>Refresh</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"calender-wrap\">\n");
      out.write("                                    <div id=\"fc-calender\" class=\"fc-calender\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                <!-- Dashboard Content End Here -->\n");
      out.write("                 <!-- Dashboard summery Start Here -->\n");
      out.write("                <div class=\"row gutters-20\">\n");
      out.write("                    <div class=\"col-xl-3 col-sm-6 col-12\">\n");
      out.write("                        <div class=\"dashboard-summery-one mg-b-20\">\n");
      out.write("                            <div class=\"row align-items-center\">\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"item-icon bg-light-green \">\n");
      out.write("                                        <i class=\"flaticon-classmates text-green\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"item-content\">\n");
      out.write("                                        <div class=\"item-title\">Students</div>\n");
      out.write("                                        <div class=\"item-number\"><span class=\"counter\" data-num=\"150000\">1,50,000</span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-3 col-sm-6 col-12\">\n");
      out.write("                        <div class=\"dashboard-summery-one mg-b-20\">\n");
      out.write("                            <div class=\"row align-items-center\">\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"item-icon bg-light-blue\">\n");
      out.write("                                        <i class=\"flaticon-multiple-users-silhouette text-blue\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"item-content\">\n");
      out.write("                                        <div class=\"item-title\">Teachers</div>\n");
      out.write("                                        <div class=\"item-number\"><span class=\"counter\" data-num=\"2250\">2,250</span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-3 col-sm-6 col-12\">\n");
      out.write("                        <div class=\"dashboard-summery-one mg-b-20\">\n");
      out.write("                            <div class=\"row align-items-center\">\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"item-icon bg-light-yellow\">\n");
      out.write("                                        <i class=\"flaticon-couple text-orange\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"item-content\">\n");
      out.write("                                        <div class=\"item-title\">Parents</div>\n");
      out.write("                                        <div class=\"item-number\"><span class=\"counter\" data-num=\"5690\">5,690</span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-3 col-sm-6 col-12\">\n");
      out.write("                        <div class=\"dashboard-summery-one mg-b-20\">\n");
      out.write("                            <div class=\"row align-items-center\">\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"item-icon bg-light-red\">\n");
      out.write("                                        <i class=\"flaticon-money text-red\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <div class=\"item-content\">\n");
      out.write("                                        <div class=\"item-title\">Earnings</div>\n");
      out.write("                                        <div class=\"item-number\"><span>$</span><span class=\"counter\" data-num=\"193000\">1,93,000</span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Dashboard summery End Here -->\n");
      out.write("                <!-- Social Media Start Here -->\n");
      out.write("                <div class=\"row gutters-20\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <!-- Social Media End Here -->\n");
      out.write("                <!-- Footer Area Start Here -->\n");
      out.write("                <footer class=\"footer-wrap-layout1\">\n");
      out.write("                    <div class=\"copyright\">© Copyrights <a href=\"#\">akkhor</a> 2019. All rights reserved. Designed by <a\n");
      out.write("                            href=\"#\">PsdBosS</a></div>\n");
      out.write("                </footer>\n");
      out.write("                <!-- Footer Area End Here -->\n");
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
      out.write("    <!-- Counterup Js -->\n");
      out.write("    <script src=\"js/jquery.counterup.min.js\"></script>\n");
      out.write("    <!-- Moment Js -->\n");
      out.write("    <script src=\"js/moment.min.js\"></script>\n");
      out.write("    <!-- Waypoints Js -->\n");
      out.write("    <script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("    <!-- Scroll Up Js -->\n");
      out.write("    <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("    <!-- Full Calender Js -->\n");
      out.write("    <script src=\"js/fullcalendar.min.js\"></script>\n");
      out.write("    <!-- Chart Js -->\n");
      out.write("    <script src=\"js/Chart.min.js\"></script>\n");
      out.write("    <!-- Custom Js -->\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Mirrored from www.radiustheme.com/demo/html/psdboss/akkhor/akkhor/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 10 Oct 2020 11:48:20 GMT -->\n");
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
