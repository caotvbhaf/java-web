package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html class=\"no-js\" lang=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Mirrored from www.radiustheme.com/demo/html/psdboss/akkhor/akkhor/login.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 10 Oct 2020 11:48:30 GMT -->\n");
      out.write("<!-- Added by HTTrack --><meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\" /><!-- /Added by HTTrack -->\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <title>AKKHOR | Login</title>\n");
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
      out.write("    <!-- Preloader Start Here -->\n");
      out.write("    <div id=\"preloader\"></div>\n");
      out.write("    <!-- Preloader End Here -->\n");
      out.write("    <!-- Login Page Start Here -->\n");
      out.write("    <div class=\"login-page-wrap\">\n");
      out.write("        <div class=\"login-page-content\">\n");
      out.write("            <div class=\"login-box\">\n");
      out.write("                <div class=\"item-logo\">\n");
      out.write("                    <img src=\"img/logo2.png\" alt=\"logo\">\n");
      out.write("                </div>\n");
      out.write("                <form action=\"Controller\" method=\"POST\" class=\"login-form\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Username</label>\n");
      out.write("                        <input type=\"text\" name=\"txtUser\" placeholder=\"Enter usrename\" class=\"form-control\">\n");
      out.write("                        <i class=\"far fa-envelope\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Password</label>\n");
      out.write("                        <input type=\"password\" name=\"txtPass\" placeholder=\"Enter password\" class=\"form-control\">\n");
      out.write("                        <i class=\"fas fa-lock\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group d-flex align-items-center justify-content-between\">\n");
      out.write("                        <div class=\"form-check\">\n");
      out.write("                            <input type=\"checkbox\" class=\"form-check-input\" id=\"remember-me\">\n");
      out.write("                            <label for=\"remember-me\" class=\"form-check-label\">Remember Me</label>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"#\" class=\"forgot-btn\">Forgot Password?</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <button type=\"submit\" class=\"login-btn\">Login</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"login-social\">\n");
      out.write("                    <p>or sign in with</p>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\" class=\"bg-fb\"><i class=\"fab fa-facebook-f\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\" class=\"bg-twitter\"><i class=\"fab fa-twitter\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\" class=\"bg-gplus\"><i class=\"fab fa-google-plus-g\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\" class=\"bg-git\"><i class=\"fab fa-github\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"sign-up\">Don't have an account ? <a href=\"#\">Signup now!</a></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Login Page End Here -->\n");
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
      out.write("<!-- Mirrored from www.radiustheme.com/demo/html/psdboss/akkhor/akkhor/login.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 10 Oct 2020 11:48:30 GMT -->\n");
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
