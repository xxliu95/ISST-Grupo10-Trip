/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.17
 * Generated at: 2019-04-30 11:41:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SolicitarViajeView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("<title>Trip-Solicitar</title>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<!-- Custom fonts for this template -->\n");
      out.write("<link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"vendor/simple-line-icons/css/simple-line-icons.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("<link href=\"css/login.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t\t<nav class=\"navbar navbar-expand-md navbar-light bg-light fixed-top\">\n");
      out.write("\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\"\n");
      out.write("\t\t\t\t\tstyle=\"color: #00adb5; letter-spacing: 3px\">Gestión de viajes</a>\n");
      out.write("\t\t\t\t<button class=\"navbar-toggler\" type=\"bottom\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\tdata-target=\"#navbarResponsive\">\n");
      out.write("\t\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("\t\t\t\t\t<ul class=\"navbar-nav ml-auto\">\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"LogoutServlet\">Cerrar sesión</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\t\t<div class=\"requestForm\">\n");
      out.write("\t\t\t<form action=\"CrearViajeServlet\" method=\"post\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<h1>Datos del solicitante</h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t<label for=\"exampleFormControlInput1\">Email</label> \n");
      out.write("\t\t\t\t\t\t<input\n");
      out.write("\t\t\t\t\t\t\trequired type=\"email\" class=\"form-control\" name=\"email\" id=\"exampleFormControlInput1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empleado.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t\t\t<!-- value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empleado.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" disabled/> -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-12\">\n");
      out.write("\t\t\t\t\t\t<label for=\"exampleFormControlInput1\">Nombre</label> <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empleado.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\trequired type=\"text\" class=\"form-control\"/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t<label for=\"exampleFormControlInput1\">DNI/NIF</label> <input\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" placeholder=\"DNI/NIF\"/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t<label for=\"exampleFormControlInput1\">Cargo</label> <input\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Puesto de trabajo dentro de la empresa\"/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t<label for=\"exampleFormControlInput1\">Telefono</label> <input\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Telefono fijo o móvil  \"/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-12\">\n");
      out.write("\t\t\t\t\t\t<label for=\"exampleFormControlInput1\">IBAN</label> <input\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" class=\"form-control IBAN\" placeholder=\"IBAN\"/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<h1>Datos del viaje</h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t<label for=\"exampleFormControlSelect1\">Tipo de viaje</label> <select\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"exampleFormControlSelect1\">\n");
      out.write("\t\t\t\t\t\t\t<option>Conferencia</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Proyecto</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Formativo</option>\n");
      out.write("\t\t\t\t\t\t</select>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-4\">\n");
      out.write("\t\t\t\t\t\t<label for=\"exampleFormControlSelect1\">Medio de transporte</label>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<select class=\"form-control\" id=\"exampleFormControlSelect1\">\n");
      out.write("\t\t\t\t\t\t\t<option>Taxi</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Avión</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Tren</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Metro</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Barco</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Bus</option>\n");
      out.write("\t\t\t\t\t\t</select> <select class=\"form-control\" id=\"exampleFormControlSelect1\">\n");
      out.write("\t\t\t\t\t\t\t<option>Taxi</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Avión</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Tren</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Metro</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Barco</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Bus</option>\n");
      out.write("\t\t\t\t\t\t</select> <select class=\"form-control\" id=\"exampleFormControlSelect1\">\n");
      out.write("\t\t\t\t\t\t\t<option>Taxi</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Avión</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Tren</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Metro</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Barco</option>\n");
      out.write("\t\t\t\t\t\t\t<option>Bus</option>\n");
      out.write("\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-8\">\n");
      out.write("\t\t\t\t\t\t<label for=\"exampleFormControlInput1\">Datos vehículo\n");
      out.write("\t\t\t\t\t\t\tpersonal</label>\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Matrícula\"/>\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Marca y modelo\"/>\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Titular\"/>\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>Fecha inicio</label> <input required type=\"date\" name=\"finicio\"\n");
      out.write("\t\t\t\t\t\t\t\tmax=\"3000-12-31\" min=\"1000-01-01\" class=\"form-control\"/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>Fecha fin</label> <input required type=\"date\" name=\"ffin\"\n");
      out.write("\t\t\t\t\t\t\t\tmin=\"1000-01-01\" max=\"3000-12-31\" class=\"form-control\"/>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label>Destino</label> <input type=\"text\" name=\"destino\"\n");
      out.write("\t\t\t\t\t\t\t\t class=\"form-control\"/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-12\">\n");
      out.write("\t\t\t\t\t\t<label for=\"exampleFormControlTextarea1\">Objeto del viaje</label>\n");
      out.write("\t\t\t\t\t\t<textarea class=\"form-control\" name=\"descripcion\" required id=\"exampleFormControlTextarea1\" rows=\"3\">\n");
      out.write("\t\t\t\t\t\t</textarea>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<h1>Gastos previstos</h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-12\">\n");
      out.write("\t\t\t\t\t\t<label for=\"exampleFormControlTextarea1\">Exponga aquí los\n");
      out.write("\t\t\t\t\t\t\tgastos previstos del viaje</label>\n");
      out.write("\t\t\t\t\t\t<textarea class=\"form-control\" id=\"exampleFormControlTextarea1\" rows=\"3\">\n");
      out.write("\t\t\t\t\t\t</textarea>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t<label for=\"inputEmail3\" class=\"col-form-label\">Gastos previstos</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-8\">\n");
      out.write("\t\t\t\t\t\t<input type=\"number\" name=\"presupuesto\" min=\"0\" step=\"0.01\"\n");
      out.write("\t\t\t\t\t\t\trequired data-number-to-fixed=\"2\" data-number-stepfactor=\"100\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control currency\" id=\"c2\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-row\">\n");
      out.write("\t\t\t\t\t<span class=\"col-6\"></span>\n");
      out.write("\t\t\t\t\t<a type=\"button\" class=\"col-3 btn\" href=\"HomeServlet?email=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empleado.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Cancelar</a>\t\t\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"col-3 btn btn-aceptar\">Guardar cambios</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
