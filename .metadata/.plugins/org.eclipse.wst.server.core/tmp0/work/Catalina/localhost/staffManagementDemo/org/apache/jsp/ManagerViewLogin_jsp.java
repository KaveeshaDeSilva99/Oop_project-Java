/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.53
 * Generated at: 2021-10-15 04:17:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ManagerViewLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("background: black;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("/*adding a box*/\r\n");
      out.write(".box99{\r\n");
      out.write("width: 450px;\r\n");
      out.write("height: 450px;\r\n");
      out.write("background-image:url(back1.jpg);\r\n");
      out.write("margin: 30px auto;\r\n");
      out.write("box-shadow: 10px 15px 40px white;\r\n");
      out.write("padding: 50px;\r\n");
      out.write("}\r\n");
      out.write("/*styles for text boxes*/\r\n");
      out.write(".box99 input{\r\n");
      out.write("width: 100%;\r\n");
      out.write("border: 1px solid #000000;\r\n");
      out.write("font-size: 15px;\r\n");
      out.write("padding: 8px 10px; }\r\n");
      out.write("/*styles for lables*/\r\n");
      out.write(".input label{\r\n");
      out.write("color:white;\r\n");
      out.write("width: 80px;\r\n");
      out.write("margin-right: 10px;\r\n");
      out.write("font-size: 20px;\r\n");
      out.write("float: left;\r\n");
      out.write("padding-bottom: 10px;\r\n");
      out.write("padding-left: 8 px;\r\n");
      out.write("}\r\n");
      out.write("/*styles for forgot password*/\r\n");
      out.write(".forgot{\r\n");
      out.write("float: right;\r\n");
      out.write("font-size: 10px;\r\n");
      out.write("}\r\n");
      out.write(".forgot a{\r\n");
      out.write("color: black;\r\n");
      out.write("}\r\n");
      out.write("/*styles for login button*/\r\n");
      out.write(".btn1{\r\n");
      out.write("width: 100%;\r\n");
      out.write("padding: 8px 10px;\r\n");
      out.write("font-size: 15px;\r\n");
      out.write("background: #1c1f4c;\r\n");
      out.write("cursor: pointer;\r\n");
      out.write("display: inline;\r\n");
      out.write("float: left;\r\n");
      out.write("color: white;\r\n");
      out.write("margin-top: 30px;\r\n");
      out.write("border: 0;\r\n");
      out.write("}\r\n");
      out.write(".btn1:hover{\r\n");
      out.write("background-color: #fec20f;}\r\n");
      out.write("/*styles for heading*/\r\n");
      out.write(".header{\r\n");
      out.write("font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("color :white;\r\n");
      out.write("text-shadow: 5px 5px 7px #000000;\r\n");
      out.write("font-size: 40px;\r\n");
      out.write("text-transform: uppercase;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"box99\">\r\n");
      out.write("<h1 class=\"header\">Login</h1>\r\n");
      out.write("<div class=\"alert-light text-danger text-center py-3\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!------------------------------login form------------------->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form method=\"post\" action=\"managerview\">\r\n");
      out.write("<div class=\"input\">\r\n");
      out.write("<label>Username</label>\r\n");
      out.write("<input type=\"text\" placeholder=\"Username\" name=\"username\" required>\r\n");
      out.write("<br><br>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"input\">\r\n");
      out.write("<label>Password</label>\r\n");
      out.write("<input type=\"password\" placeholder=\"Password\" name=\"password\" required>\r\n");
      out.write("<br>\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("<button type=\"submit\" name=\"Login\" class=\"btn1\"> LOGIN </button>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
