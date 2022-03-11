package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
    
    if(request.getSession().getAttribute("unm") == null)//session.getAttribute("Userid")
    {
        response.sendRedirect("index.html");
    }

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title>WebUni - Education Template</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"description\" content=\"WebUni Education Template\">\n");
      out.write("\t<meta name=\"keywords\" content=\"webuni, education, creative, html\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<!-- Favicon -->   \n");
      out.write("\t<link href=\"img/favicon.ico\" rel=\"shortcut icon\"/>\n");
      out.write("\n");
      out.write("\t<!-- Google Fonts -->\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Raleway:400,400i,500,500i,600,600i,700,700i,800,800i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t<!-- Stylesheets -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.carousel.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- Page Preloder -->\n");
      out.write("\t<div id=\"preloder\">\n");
      out.write("\t\t<div class=\"loader\"></div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- Header section -->\n");
      out.write("\t<header class=\"header-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-3\">\n");
      out.write("\t\t\t\t\t<div class=\"site-logo\">\n");
      out.write("\t\t\t\t\t\t<img src=\"img/logo.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"nav-switch\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-bars\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-9 col-md-9\">\n");
      out.write("                                    <a href=\"logout.jsp\" class=\"site-btn header-btn\">LogOut</a>\n");
      out.write("\t\t\t\t\t<nav class=\"main-menu\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("                                                    <li><a href=\"welcome.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"vdofile.jsp\">Video Session</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"test.jsp\">Course Test</a></li>\n");
      out.write("                                                        <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\t<!-- Header section end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Hero section -->\n");
      out.write("\t<section class=\"hero-section set-bg\" data-setbg=\"img/bg.jpg\">\n");
      out.write("\t</section>\n");
      out.write("\t<!-- Hero section end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- categories section -->\n");
      out.write("\t<section class=\"categories-section spad\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"section-title\">\n");
      out.write("\t\t\t\t<h2>Our Course Categories</h2>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec malesuada lorem maximus mauris scelerisque, at rutrum nulla dictum. Ut ac ligula sapien. Suspendisse cursus faucibus finibus.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<!-- categorie -->\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-6\">\n");
      out.write("\t\t\t\t\t<div class=\"categorie-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"ci-thumb set-bg\" data-setbg=\"img/categories/1.jpg\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"ci-text\">\n");
      out.write("\t\t\t\t\t\t\t<h5>IT Development</h5>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur</p>\n");
      out.write("\t\t\t\t\t\t\t<span>120 Courses</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- categorie -->\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-6\">\n");
      out.write("\t\t\t\t\t<div class=\"categorie-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"ci-thumb set-bg\" data-setbg=\"img/categories/2.jpg\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"ci-text\">\n");
      out.write("\t\t\t\t\t\t\t<h5>Web Design</h5>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur</p>\n");
      out.write("\t\t\t\t\t\t\t<span>70 Courses</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- categorie -->\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-6\">\n");
      out.write("\t\t\t\t\t<div class=\"categorie-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"ci-thumb set-bg\" data-setbg=\"img/categories/3.jpg\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"ci-text\">\n");
      out.write("\t\t\t\t\t\t\t<h5>Illustration & Drawing</h5>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur</p>\n");
      out.write("\t\t\t\t\t\t\t<span>55 Courses</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- categorie -->\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-6\">\n");
      out.write("\t\t\t\t\t<div class=\"categorie-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"ci-thumb set-bg\" data-setbg=\"img/categories/4.jpg\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"ci-text\">\n");
      out.write("\t\t\t\t\t\t\t<h5>Social Media</h5>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur</p>\n");
      out.write("\t\t\t\t\t\t\t<span>40 Courses</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- categorie -->\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-6\">\n");
      out.write("\t\t\t\t\t<div class=\"categorie-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"ci-thumb set-bg\" data-setbg=\"img/categories/5.jpg\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"ci-text\">\n");
      out.write("\t\t\t\t\t\t\t<h5>Photoshop</h5>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur</p>\n");
      out.write("\t\t\t\t\t\t\t<span>220 Courses</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- categorie -->\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-6\">\n");
      out.write("\t\t\t\t\t<div class=\"categorie-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"ci-thumb set-bg\" data-setbg=\"img/categories/6.jpg\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"ci-text\">\n");
      out.write("\t\t\t\t\t\t\t<h5>Cryptocurrencies</h5>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur</p>\n");
      out.write("\t\t\t\t\t\t\t<span>25 Courses</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\t<!-- course section -->\n");
      out.write("\t<section class=\"course-section spad\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"section-title mb-0\">\n");
      out.write("\t\t\t\t<h2>Featured Courses</h2>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec malesuada lorem maximus mauris scelerisque, at rutrum nulla dictum. Ut ac ligula sapien. Suspendisse cursus faucibus finibus.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"course-warp\">\n");
      out.write("\t\t\t<ul class=\"course-filter controls\">\n");
      out.write("\t\t\t\t<li class=\"control active\" data-filter=\"all\">All</li>\n");
      out.write("\t\t\t\t<li class=\"control\" data-filter=\".finance\">Finance</li>\n");
      out.write("\t\t\t\t<li class=\"control\" data-filter=\".design\">Design</li>\n");
      out.write("\t\t\t\t<li class=\"control\" data-filter=\".web\">Web Development</li>\n");
      out.write("\t\t\t\t<li class=\"control\" data-filter=\".photo\">Photography</li>\n");
      out.write("\t\t\t</ul>                                       \n");
      out.write("\t\t\t<div class=\"row course-items-area\">\n");
      out.write("\t\t\t\t<!-- course -->\n");
      out.write("\t\t\t\t<div class=\"mix col-lg-3 col-md-4 col-sm-6 finance\">\n");
      out.write("\t\t\t\t\t<div class=\"course-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"course-thumb set-bg\" data-setbg=\"img/courses/1.jpg\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"price\">Price: $15</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"course-info\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-text\">\n");
      out.write("\t\t\t\t\t\t\t\t<h5>Art & Crafts</h5>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"students\">120 Students</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-author\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ca-pic set-bg\" data-setbg=\"img/authors/1.jpg\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<p>William Parker, <span>Developer</span></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- course -->\n");
      out.write("\t\t\t\t<div class=\"mix col-lg-3 col-md-4 col-sm-6 design\">\n");
      out.write("\t\t\t\t\t<div class=\"course-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"course-thumb set-bg\" data-setbg=\"img/courses/2.jpg\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"price\">Price: $15</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"course-info\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-text\">\n");
      out.write("\t\t\t\t\t\t\t\t<h5>IT Development</h5>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"students\">120 Students</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-author\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ca-pic set-bg\" data-setbg=\"img/authors/2.jpg\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<p>William Parker, <span>Developer</span></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- course -->\n");
      out.write("\t\t\t\t<div class=\"mix col-lg-3 col-md-4 col-sm-6 web\">\n");
      out.write("\t\t\t\t\t<div class=\"course-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"course-thumb set-bg\" data-setbg=\"img/courses/3.jpg\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"price\">Price: $15</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"course-info\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-text\">\n");
      out.write("\t\t\t\t\t\t\t\t<h5>Graphic Design</h5>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"students\">120 Students</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-author\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ca-pic set-bg\" data-setbg=\"img/authors/3.jpg\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<p>William Parker, <span>Developer</span></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- course -->\n");
      out.write("\t\t\t\t<div class=\"mix col-lg-3 col-md-4 col-sm-6 photo\">\n");
      out.write("\t\t\t\t\t<div class=\"course-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"course-thumb set-bg\" data-setbg=\"img/courses/4.jpg\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"price\">Price: $15</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"course-info\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-text\">\n");
      out.write("\t\t\t\t\t\t\t\t<h5>IT Development</h5>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"students\">120 Students</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-author\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ca-pic set-bg\" data-setbg=\"img/authors/4.jpg\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<p>William Parker, <span>Developer</span></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- course -->\n");
      out.write("\t\t\t\t<div class=\"mix col-lg-3 col-md-4 col-sm-6 finance\">\n");
      out.write("\t\t\t\t\t<div class=\"course-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"course-thumb set-bg\" data-setbg=\"img/courses/5.jpg\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"price\">Price: $15</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"course-info\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-text\">\n");
      out.write("\t\t\t\t\t\t\t\t<h5>IT Development</h5>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"students\">120 Students</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-author\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ca-pic set-bg\" data-setbg=\"img/authors/5.jpg\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<p>William Parker, <span>Developer</span></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- course -->\n");
      out.write("\t\t\t\t<div class=\"mix col-lg-3 col-md-4 col-sm-6 design\">\n");
      out.write("\t\t\t\t\t<div class=\"course-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"course-thumb set-bg\" data-setbg=\"img/courses/6.jpg\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"price\">Price: $15</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"course-info\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-text\">\n");
      out.write("\t\t\t\t\t\t\t\t<h5>Socia Media</h5>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"students\">120 Students</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-author\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ca-pic set-bg\" data-setbg=\"img/authors/6.jpg\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<p>William Parker, <span>Developer</span></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- course -->\n");
      out.write("\t\t\t\t<div class=\"mix col-lg-3 col-md-4 col-sm-6 web\">\n");
      out.write("\t\t\t\t\t<div class=\"course-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"course-thumb set-bg\" data-setbg=\"img/courses/7.jpg\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"price\">Price: $15</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"course-info\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-text\">\n");
      out.write("\t\t\t\t\t\t\t\t<h5>IT Development</h5>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"students\">120 Students</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-author\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ca-pic set-bg\" data-setbg=\"img/authors/7.jpg\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<p>William Parker, <span>Developer</span></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- course -->\n");
      out.write("\t\t\t\t<div class=\"mix col-lg-3 col-md-4 col-sm-6 photo\">\n");
      out.write("\t\t\t\t\t<div class=\"course-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"course-thumb set-bg\" data-setbg=\"img/courses/8.jpg\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"price\">Price: $15</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"course-info\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-text\">\n");
      out.write("\t\t\t\t\t\t\t\t<h5>HTML 5</h5>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"students\">120 Students</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course-author\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ca-pic set-bg\" data-setbg=\"img/authors/8.jpg\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<p>William Parker, <span>Developer</span></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\t<!--====== Javascripts & Jquery ======-->\n");
      out.write("\t<script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/mixitup.min.js\"></script>\n");
      out.write("\t<script src=\"js/circle-progress.min.js\"></script>\n");
      out.write("\t<script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("</html>");
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
