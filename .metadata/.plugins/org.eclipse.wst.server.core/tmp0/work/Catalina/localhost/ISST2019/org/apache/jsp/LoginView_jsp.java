/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.17
 * Generated at: 2019-04-09 10:56:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/D:/Dropbox/ISST/Trabajo/ISST-Grupo10-Trip/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Trip/WEB-INF/lib/shiro-web-1.4.0.jar!/META-INF/shiro.tld", Long.valueOf(1494006348000L));
    _jspx_dependants.put("jar:file:/D:/Dropbox/ISST/Trabajo/ISST-Grupo10-Trip/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Trip/WEB-INF/lib/standard-1.1.2.jar!/META-INF/fn.tld", Long.valueOf(1098703890000L));
    _jspx_dependants.put("/WEB-INF/lib/shiro-web-1.4.0.jar", Long.valueOf(1554125764558L));
    _jspx_dependants.put("jar:file:/D:/Dropbox/ISST/Trabajo/ISST-Grupo10-Trip/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Trip/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098703890000L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1554125775544L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fguest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fuser;

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
    _005fjspx_005ftagPool_005fshiro_005fguest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005fuser = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fshiro_005fguest.release();
    _005fjspx_005ftagPool_005fshiro_005fuser.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<title>Trip</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">   \t        \r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>   \r\n");
      out.write("<!-- Bootstrap core JavaScript -->\r\n");
      out.write("<script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("<link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom fonts for this template -->\r\n");
      out.write("<link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"vendor/simple-line-icons/css/simple-line-icons.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"css/login.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/login.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<title>Login View</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_shiro_005fguest_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_shiro_005fuser_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
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

  private boolean _jspx_meth_shiro_005fguest_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:guest
    org.apache.shiro.web.tags.GuestTag _jspx_th_shiro_005fguest_005f0 = (org.apache.shiro.web.tags.GuestTag) _005fjspx_005ftagPool_005fshiro_005fguest.get(org.apache.shiro.web.tags.GuestTag.class);
    boolean _jspx_th_shiro_005fguest_005f0_reused = false;
    try {
      _jspx_th_shiro_005fguest_005f0.setPageContext(_jspx_page_context);
      _jspx_th_shiro_005fguest_005f0.setParent(null);
      int _jspx_eval_shiro_005fguest_005f0 = _jspx_th_shiro_005fguest_005f0.doStartTag();
      if (_jspx_eval_shiro_005fguest_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t<div class=\"sidenav\">\r\n");
          out.write("\t\t\t<div class=\"title-text\">\r\n");
          out.write("\t\t\t\t<h1>Trip</h1>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t<div class=\"main\">\r\n");
          out.write("\t\t\t<div class=\"col-10\">\r\n");
          out.write("\t\t\t\t<div class=\"login-main-text\">\r\n");
          out.write("\t\t\t\t\t<h2>Gestión de viajes</h2>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t<div class=\"login-form\">\r\n");
          out.write("\t\t\t\t\t<form action=\"LoginServlet\" method=\"post\">\r\n");
          out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t<input name=\"email\" type=\"text\" class=\"form-control\" placeholder=\"Email\">\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t<input name=\"password\" type=\"password\" class=\"form-control\"\r\n");
          out.write("\t\t\t\t\t\t\t\tplaceholder=\"Contraseña\">\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"col-12 btn btn-black\">LOGIN</button>\r\n");
          out.write("\t\t\t\t\t\t<span class=\"col-12\"></span> \r\n");
          out.write("\t\t\t\t\t</form>\r\n");
          out.write("\t\t\t\t\t<form action=\"RegisterServlet\" method=\"get\">\r\n");
          out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"col-12 btn\">Registrar</button>\r\n");
          out.write("\t\t\t\t\t</form>\r\n");
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_shiro_005fguest_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_shiro_005fguest_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fshiro_005fguest.reuse(_jspx_th_shiro_005fguest_005f0);
      _jspx_th_shiro_005fguest_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_shiro_005fguest_005f0, _jsp_getInstanceManager(), _jspx_th_shiro_005fguest_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_shiro_005fuser_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:user
    org.apache.shiro.web.tags.UserTag _jspx_th_shiro_005fuser_005f0 = (org.apache.shiro.web.tags.UserTag) _005fjspx_005ftagPool_005fshiro_005fuser.get(org.apache.shiro.web.tags.UserTag.class);
    boolean _jspx_th_shiro_005fuser_005f0_reused = false;
    try {
      _jspx_th_shiro_005fuser_005f0.setPageContext(_jspx_page_context);
      _jspx_th_shiro_005fuser_005f0.setParent(null);
      int _jspx_eval_shiro_005fuser_005f0 = _jspx_th_shiro_005fuser_005f0.doStartTag();
      if (_jspx_eval_shiro_005fuser_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_shiro_005fuser_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_shiro_005fuser_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fshiro_005fuser.reuse(_jspx_th_shiro_005fuser_005f0);
      _jspx_th_shiro_005fuser_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_shiro_005fuser_005f0, _jsp_getInstanceManager(), _jspx_th_shiro_005fuser_005f0_reused);
    }
    return false;
  }
}
