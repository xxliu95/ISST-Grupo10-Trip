/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.17
 * Generated at: 2019-04-09 15:05:02 UTC
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
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(9);
    _jspx_dependants.put("jar:file:/D:/Dropbox/ISST/Trabajo/ISST-Grupo10-Trip/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Trip/WEB-INF/lib/shiro-web-1.4.0.jar!/META-INF/shiro.tld", Long.valueOf(1494006348000L));
    _jspx_dependants.put("jar:file:/D:/Dropbox/ISST/Trabajo/ISST-Grupo10-Trip/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Trip/WEB-INF/lib/standard-1.1.2.jar!/META-INF/fn.tld", Long.valueOf(1098703890000L));
    _jspx_dependants.put("/WEB-INF/lib/shiro-web-1.4.0.jar", Long.valueOf(1554125764558L));
    _jspx_dependants.put("/css/login.min.css", Long.valueOf(1554203401000L));
    _jspx_dependants.put("/css/style.min.css", Long.valueOf(1554203401000L));
    _jspx_dependants.put("/css/style.css", Long.valueOf(1554207313000L));
    _jspx_dependants.put("jar:file:/D:/Dropbox/ISST/Trabajo/ISST-Grupo10-Trip/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Trip/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098703890000L));
    _jspx_dependants.put("/css/login.css", Long.valueOf(1554822300356L));
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
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>");
      out.write("/*!\r\n");
      out.write(" * Start Bootstrap - Landing Page v5.0.3 (https://startbootstrap.com/template-overviews/landing-page)\r\n");
      out.write(" * Copyright 2013-2019 Start Bootstrap\r\n");
      out.write(" * Licensed under MIT (https://github.com/BlackrockDigital/startbootstrap-landing-page/blob/master/LICENSE)\r\n");
      out.write(" */body{font-family:Lato,'Helvetica Neue',Helvetica,Arial,sans-serif}h1,h2,h3,h4,h5,h6{font-family:Lato,'Helvetica Neue',Helvetica,Arial,sans-serif;font-weight:700}header.masthead{position:relative;background-color:#343a40;background:url(../img/bg-masthead.jpg) no-repeat center center;background-size:cover;padding-top:8rem;padding-bottom:8rem}header.masthead .overlay{position:absolute;background-color:#212529;height:100%;width:100%;top:0;left:0;opacity:.3}header.masthead h1{font-size:2rem}@media (min-width:768px){header.masthead{padding-top:12rem;padding-bottom:12rem}header.masthead h1{font-size:3rem}}.showcase .showcase-text{padding:3rem}.showcase .showcase-img{min-height:30rem;background-size:cover}@media (min-width:768px){.showcase .showcase-text{padding:7rem}}.features-icons{padding-top:7rem;padding-bottom:7rem}.features-icons .features-icons-item{max-width:20rem}.features-icons .features-icons-item .features-icons-icon{height:7rem}.features-icons .features-icons-item .features-icons-icon i{font-size:4.5rem}.features-icons .features-icons-item:hover .features-icons-icon i{font-size:5rem}.testimonials{padding-top:7rem;padding-bottom:7rem}.testimonials .testimonial-item{max-width:18rem}.testimonials .testimonial-item img{max-width:12rem;-webkit-box-shadow:0 5px 5px 0 #adb5bd;box-shadow:0 5px 5px 0 #adb5bd}.call-to-action{position:relative;background-color:#343a40;background:url(../img/bg-masthead.jpg) no-repeat center center;background-size:cover;padding-top:7rem;padding-bottom:7rem}.call-to-action .overlay{position:absolute;background-color:#212529;height:100%;width:100%;top:0;left:0;opacity:.3}footer.footer{padding-top:4rem;padding-bottom:4rem}");
      out.write("</style>\r\n");
      out.write("<style>");
      out.write("body {\r\n");
      out.write("    font-family: \"Lato\", sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidenav {\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    background-color: #000;\r\n");
      out.write("    background-image: url(\"/img/avion.jpg\");\r\n");
      out.write("    background-position: center;\r\n");
      out.write("    overflow-x: hidden;\r\n");
      out.write("    padding-top: 20px;\r\n");
      out.write("    z-index: 1;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("@media  (max-width: 768px) {\r\n");
      out.write("\r\n");
      out.write("    .sidenav {\r\n");
      out.write("        background-size: 100% auto;\r\n");
      out.write("        padding-top: 5vh;\r\n");
      out.write("    }\r\n");
      out.write("    .login-form{\r\n");
      out.write("        margin-top: 40vh;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .register-form{\r\n");
      out.write("        margin-top: 30vh;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media (min-width: 768px){\r\n");
      out.write("\r\n");
      out.write("    .sidenav {\r\n");
      out.write("        background-size: auto 100%;\r\n");
      out.write("        padding-top: 5vh;\r\n");
      out.write("        width: 45vw;\r\n");
      out.write("        position: fixed;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    .main{\r\n");
      out.write("        margin-left: 50vw\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".form-group{\r\n");
      out.write("    margin-bottom:2vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".login-main-text{\r\n");
      out.write("    color: #111;\r\n");
      out.write("    padding-top: 30vh;\r\n");
      out.write("    padding-bottom: 5vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".title-text{\r\n");
      out.write("    color: #fefefe;\r\n");
      out.write("    padding: 10vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-black{\r\n");
      out.write("    background-color: #000;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("}");
      out.write("</style>\r\n");
      out.write("<style>");
      out.write("/*!\r\n");
      out.write(" * Start Bootstrap - Landing Page v5.0.3 (https://startbootstrap.com/template-overviews/landing-page)\r\n");
      out.write(" * Copyright 2013-2019 Start Bootstrap\r\n");
      out.write(" * Licensed under MIT (https://github.com/BlackrockDigital/startbootstrap-landing-page/blob/master/LICENSE)\r\n");
      out.write(" */body{font-family:Lato,'Helvetica Neue',Helvetica,Arial,sans-serif}h1,h2,h3,h4,h5,h6{font-family:Lato,'Helvetica Neue',Helvetica,Arial,sans-serif;font-weight:700}header.masthead{position:relative;background-color:#343a40;background:url(../img/bg-masthead.jpg) no-repeat center center;background-size:cover;padding-top:8rem;padding-bottom:8rem}header.masthead .overlay{position:absolute;background-color:#212529;height:100%;width:100%;top:0;left:0;opacity:.3}header.masthead h1{font-size:2rem}@media (min-width:768px){header.masthead{padding-top:12rem;padding-bottom:12rem}header.masthead h1{font-size:3rem}}.showcase .showcase-text{padding:3rem}.showcase .showcase-img{min-height:30rem;background-size:cover}@media (min-width:768px){.showcase .showcase-text{padding:7rem}}.features-icons{padding-top:7rem;padding-bottom:7rem}.features-icons .features-icons-item{max-width:20rem}.features-icons .features-icons-item .features-icons-icon{height:7rem}.features-icons .features-icons-item .features-icons-icon i{font-size:4.5rem}.features-icons .features-icons-item:hover .features-icons-icon i{font-size:5rem}.testimonials{padding-top:7rem;padding-bottom:7rem}.testimonials .testimonial-item{max-width:18rem}.testimonials .testimonial-item img{max-width:12rem;-webkit-box-shadow:0 5px 5px 0 #adb5bd;box-shadow:0 5px 5px 0 #adb5bd}.call-to-action{position:relative;background-color:#343a40;background:url(../img/bg-masthead.jpg) no-repeat center center;background-size:cover;padding-top:7rem;padding-bottom:7rem}.call-to-action .overlay{position:absolute;background-color:#212529;height:100%;width:100%;top:0;left:0;opacity:.3}footer.footer{padding-top:4rem;padding-bottom:4rem}");
      out.write("</style>\r\n");
      out.write("<style>");
      out.write("/*** LIU ***/\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("    font-family: \"Lato\", sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".datos {\r\n");
      out.write("    padding: 30px;\r\n");
      out.write("    background-color: #fefefe\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".viaje{\r\n");
      out.write("    padding: 30px;\r\n");
      out.write("    background-color: #d1d1d1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".listaviajes{\r\n");
      out.write("    background-color: #dddddd;\r\n");
      out.write("    padding: 40px;\r\n");
      out.write("}\r\n");
      out.write(".descripcion{\r\n");
      out.write("     padding: 40px;\r\n");
      out.write(" }\r\n");
      out.write(".notificaciones {\r\n");
      out.write("    padding: 30px;\r\n");
      out.write("    background-color: #eeeeee;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media  (max-height: 768px) {\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media (min-width: 768px){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".requestForm{\r\n");
      out.write("    padding-top: 5em;\r\n");
      out.write("    padding-left: 20%;\r\n");
      out.write("    padding-right: 20%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-row{\r\n");
      out.write("    padding-bottom: 4%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-control{\r\n");
      out.write("    padding-top: 1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".IBAN {\r\n");
      out.write("  text-transform: uppercase;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-aceptar{\r\n");
      out.write("    background-color: #00adb5;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/** JESUS **/\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".body{\r\n");
      out.write("    background: #6c757d;\r\n");
      out.write("    text-decoration-color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".circulo{\r\n");
      out.write("    weight: 10rem;\r\n");
      out.write("    height: 10rem;\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form {\r\n");
      out.write("\tmargin-top: 4%;\r\n");
      out.write("\tpadding: 2%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-row .form-group-row .form-group{\r\n");
      out.write("\tmargin-top: 1%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".contenedor{\r\n");
      out.write("\tpadding: 3%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
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
