package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import entity.Teacher;

public final class all_002dclass_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("<!doctype html>\n");
      out.write("<html class=\"no-js\" lang=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Mirrored from www.radiustheme.com/demo/html/psdboss/akkhor/akkhor/all-class.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 10 Oct 2020 11:48:38 GMT -->\n");
      out.write("    <!-- Added by HTTrack --><meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\" /><!-- /Added by HTTrack -->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("        <title>AKKHOR | All Classes</title>\n");
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
      out.write("        <!-- Data Table CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.dataTables.min.css\">\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <!-- Modernize js -->\n");
      out.write("        <script src=\"js/modernizr-3.6.0.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Mirrored from www.radiustheme.com/demo/html/psdboss/akkhor/akkhor/all-class.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 10 Oct 2020 11:48:38 GMT -->\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty requestScope['cList']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        if (true) {
          _jspx_page_context.forward("CourseController?action=getData");
          return true;
        }
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
        out.write("\n");
        out.write("                    <div class=\"dashboard-content-one\">\n");
        out.write("                        <!-- Breadcubs Area Start Here -->\n");
        out.write("                        <div class=\"breadcrumbs-area\">\n");
        out.write("                            <h3>Classes</h3>\n");
        out.write("                            <ul>\n");
        out.write("                                <li>\n");
        out.write("                                    <a href=\"index.html\">Home</a>\n");
        out.write("                                </li>\n");
        out.write("                                <li>All Classes</li>\n");
        out.write("                            </ul>\n");
        out.write("                        </div>\n");
        out.write("                        <!-- Breadcubs Area End Here -->\n");
        out.write("                        <!-- Class Table Area Start Here -->\n");
        out.write("                        <div class=\"card height-auto\">\n");
        out.write("                            <div class=\"card-body\">\n");
        out.write("                                <div class=\"heading-layout1\">\n");
        out.write("                                    <div class=\"item-title\">\n");
        out.write("                                        <h3>All Class Schedules</h3>\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"dropdown\">\n");
        out.write("                                        <a class=\"dropdown-toggle\" href=\"#\" role=\"button\" \n");
        out.write("                                           data-toggle=\"dropdown\" aria-expanded=\"false\">...</a>\n");
        out.write("\n");
        out.write("                                        <div class=\"dropdown-menu dropdown-menu-right\">\n");
        out.write("                                            <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-times text-orange-red\"></i>Close</a>\n");
        out.write("                                            <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-cogs text-dark-pastel-green\"></i>Edit</a>\n");
        out.write("                                            <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-redo-alt text-orange-peel\"></i>Refresh</a>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                                <form class=\"mg-b-20\" >\n");
        out.write("                                    <div class=\"row gutters-8\">\n");
        out.write("                                        <div class=\"col-3-xxxl col-xl-3 col-lg-3 col-12 form-group\">\n");
        out.write("                                            <input type=\"text\" placeholder=\"Search by ID ...\" class=\"form-control\">\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"col-4-xxxl col-xl-4 col-lg-3 col-12 form-group\">\n");
        out.write("                                            <input type=\"text\" placeholder=\"Search by Name ...\" class=\"form-control\">\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"col-4-xxxl col-xl-3 col-lg-3 col-12 form-group\">\n");
        out.write("                                            <input type=\"text\" placeholder=\"Search by Class ...\" class=\"form-control\">\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"col-1-xxxl col-xl-2 col-lg-3 col-12 form-group\">\n");
        out.write("                                            <button type=\"submit\" class=\"fw-btn-fill btn-gradient-yellow\">SEARCH</button>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                </form>\n");
        out.write("                                <div class=\"table-responsive\">\n");
        out.write("                                    <table class=\"table display data-table text-nowrap\">\n");
        out.write("                                        <thead>\n");
        out.write("                                            <tr>\n");
        out.write("                                                <th> \n");
        out.write("                                                    <div class=\"form-check\">\n");
        out.write("                                                        <input type=\"checkbox\" class=\"form-check-input checkAll\">\n");
        out.write("                                                        <label class=\"form-check-label\">ID</label>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </th>\n");
        out.write("                                                <th>Photo</th>\n");
        out.write("                                                <th>Name</th>\n");
        out.write("                                                <th>Gender</th>\n");
        out.write("                                                <th>Class</th>\n");
        out.write("                                                <th>Section</th>\n");
        out.write("                                                <th>Time To Start</th>\n");
        out.write("                                                <th>Time To End</th>\n");
        out.write("                                                <th>Phone</th>\n");
        out.write("                                                <th>E-mail</th>\n");
        out.write("                                                <th>Action</th>\n");
        out.write("                                            </tr>\n");
        out.write("                                        </thead>\n");
        out.write("                                        <tbody>\n");
        out.write("                                            <tr>\n");
        out.write("                                                <td>\n");
        out.write("                                                    <div class=\"form-check\">\n");
        out.write("                                                        <input type=\"checkbox\" class=\"form-check-input\">\n");
        out.write("                                                        <label class=\"form-check-label\">#0021</label>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </td>\n");
        out.write("                                                <td class=\"text-center\"><img src=\"img/figure/student2.png\" alt=\"student\"></td>\n");
        out.write("                                                <td>Mark Willy</td>\n");
        out.write("                                                <td>Male</td>\n");
        out.write("                                                <td>2</td>\n");
        out.write("                                                <td>A</td>\n");
        out.write("                                                <td>02/05/2001</td>\n");
        out.write("                                                <td>10.00 am - 11.30 am</td>\n");
        out.write("                                                <td>+ 123 9988568</td>\n");
        out.write("                                                <td>kazifahim93@gmail.com</td>\n");
        out.write("                                                <td>\n");
        out.write("                                                    <div class=\"dropdown\">\n");
        out.write("                                                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
        out.write("                                                            <span class=\"flaticon-more-button-of-three-dots\"></span>\n");
        out.write("                                                        </a>\n");
        out.write("                                                        <div class=\"dropdown-menu dropdown-menu-right\">\n");
        out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-times text-orange-red\"></i>Close</a>\n");
        out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-cogs text-dark-pastel-green\"></i>Edit</a>\n");
        out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-redo-alt text-orange-peel\"></i>Refresh</a>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </td>\n");
        out.write("                                            </tr>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                            <tr>\n");
        out.write("                                                <td>\n");
        out.write("                                                    <div class=\"form-check\">\n");
        out.write("                                                        <input type=\"checkbox\" class=\"form-check-input\">\n");
        out.write("                                                        <label class=\"form-check-label\">#0030</label>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </td>\n");
        out.write("                                                <td class=\"text-center\"><img src=\"img/figure/student6.png\" alt=\"student\"></td>\n");
        out.write("                                                <td>Jessia Rose</td>\n");
        out.write("                                                <td>Female</td>\n");
        out.write("                                                <td>1</td>\n");
        out.write("                                                <td>A</td>\n");
        out.write("                                                <td>02/05/2001</td>\n");
        out.write("                                                <td>11.00 am - 12.30 am</td>\n");
        out.write("                                                <td>+ 123 9988568</td>\n");
        out.write("                                                <td>kazifahim93@gmail.com</td>\n");
        out.write("                                                <td>\n");
        out.write("                                                    <div class=\"dropdown\">\n");
        out.write("                                                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
        out.write("                                                            <span class=\"flaticon-more-button-of-three-dots\"></span>\n");
        out.write("                                                        </a>\n");
        out.write("                                                        <div class=\"dropdown-menu dropdown-menu-right\">\n");
        out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-times text-orange-red\"></i>Close</a>\n");
        out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-cogs text-dark-pastel-green\"></i>Edit</a>\n");
        out.write("                                                            <a class=\"dropdown-item\" href=\"#\"><i class=\"fas fa-redo-alt text-orange-peel\"></i>Refresh</a>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </td>\n");
        out.write("                                            </tr>\n");
        out.write("                                        </tbody>\n");
        out.write("                                    </table>\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                        <!-- Class Table Area End Here -->\n");
        out.write("                        <footer class=\"footer-wrap-layout1\">\n");
        out.write("                            <div class=\"copyright\">© Copyrights <a href=\"#\">akkhor</a> 2019. All rights reserved. Designed by <a href=\"#\">PsdBosS</a></div>\n");
        out.write("                        </footer>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("                <!-- Page Area End Here -->\n");
        out.write("            </div>\n");
        out.write("            <!-- jquery-->\n");
        out.write("            <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
        out.write("            <!-- Plugins js -->\n");
        out.write("            <script src=\"js/plugins.js\"></script>\n");
        out.write("            <!-- Popper js -->\n");
        out.write("            <script src=\"js/popper.min.js\"></script>\n");
        out.write("            <!-- Bootstrap js -->\n");
        out.write("            <script src=\"js/bootstrap.min.js\"></script>\n");
        out.write("            <!-- Scroll Up Js -->\n");
        out.write("            <script src=\"js/jquery.scrollUp.min.js\"></script>\n");
        out.write("            <!-- Data Table Js -->\n");
        out.write("            <script src=\"js/jquery.dataTables.min.js\"></script>\n");
        out.write("            <!-- Custom Js -->\n");
        out.write("            <script src=\"js/main.js\"></script>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
