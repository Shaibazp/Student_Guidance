package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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


    if (request.getSession().getAttribute("unm") == null)//session.getAttribute("Userid")
    {
        response.sendRedirect("index.html");
    }

      out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("\t  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\n");
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
      out.write("\t\t\t\t\t<a href=\"\" class=\"site-btn header-btn\">Login</a>\n");
      out.write("\t\t\t\t\t<nav class=\"main-menu\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">About us</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"courses.html\">Courses</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"blog.html\">News</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\t<!-- Header section end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Page info -->\n");
      out.write("\t<div class=\"page-info-section set-bg\" data-setbg=\"img/page-bg/4.jpg\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"site-breadcrumb\">\n");
      out.write("\t\t\t\t<a href=\"#\">Home</a>\n");
      out.write("\t\t\t\t<span>Contact</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Page info end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- search section -->\n");
      out.write("\t<section class=\"search-section ss-other-page\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"search-warp\">\n");
      out.write("\t\t\t\t<div class=\"section-title text-white\">\n");
      out.write("\t\t\t\t\t<h2><span>Search your course</span></h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-10 offset-lg-1\">\n");
      out.write("\t\t\t\t\t\t<!-- search form -->\n");
      out.write("\t\t\t\t\t\t<form class=\"course-search-form\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Course\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"last-m\" placeholder=\"Category\">\n");
      out.write("\t\t\t\t\t\t\t<button class=\"site-btn btn-dark\">Search Couse</button>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- search section end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Page -->\n");
      out.write("\t<section class=\"contact-page spad pb-0\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-8\">\n");
      out.write("\t\t\t\t\t<div class=\"contact-form-warp\">\n");
      out.write("\t\t\t\t\t\t<div class=\"section-title text-white text-left\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Get in Touch</h2>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec malesuada lorem maximus mauris scelerisque, at rutrum nulla dictum. Ut ac ligula sapien. </p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<form class=\"contact-form\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Your Name\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Your E-mail\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Subject\">\n");
      out.write("\t\t\t\t\t\t\t<textarea placeholder=\"Message\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t<button class=\"site-btn\">Sent Message</button>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-4\">\n");
      out.write("\t\t\t\t\t<div class=\"contact-info-area\">\n");
      out.write("\t\t\t\t\t\t<div class=\"section-title text-left p-0\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Contact Info</h2>\n");
      out.write("\t\t\t\t\t\t\t<p>Donec malesuada lorem maximus mauris scelerisque, at rutrum nulla dictum. Ut ac ligula sapien. Suspendi sse cursus faucibus finibus.</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"phone-number\">\n");
      out.write("\t\t\t\t\t\t\t<span>Direct Line</span>\n");
      out.write("\t\t\t\t\t\t\t<h2>+53 345 7953 32453</h2>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<ul class=\"contact-list\">\n");
      out.write("\t\t\t\t\t\t\t<li>1481 Creekside Lane <br>Avila Beach, CA 931</li>\n");
      out.write("\t\t\t\t\t\t\t<li>+53 345 7953 32453</li>\n");
      out.write("\t\t\t\t\t\t\t<li>yourmail@gmail.com</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<div class=\"social-links\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-pinterest\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-behance\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"map-canvas\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- Page end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- banner section -->\n");
      out.write("\t<section class=\"banner-section spad\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"section-title mb-0 pb-2\">\n");
      out.write("\t\t\t\t<h2>Join Our Community Now!</h2>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec malesuada lorem maximus mauris scelerisque, at rutrum nulla dictum. Ut ac ligula sapien. Suspendisse cursus faucibus finibus.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"text-center pt-5\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"site-btn\">Register Now</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- banner section end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- footer section -->\n");
      out.write("\t<footer class=\"footer-section spad pb-0\">\n");
      out.write("\t\t<div class=\"footer-top\">\n");
      out.write("\t\t\t<div class=\"footer-warp\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"widget-item\">\n");
      out.write("\t\t\t\t\t\t<h4>Contact Info</h4>\n");
      out.write("\t\t\t\t\t\t<ul class=\"contact-list\">\n");
      out.write("\t\t\t\t\t\t\t<li>1481 Creekside Lane <br>Avila Beach, CA 931</li>\n");
      out.write("\t\t\t\t\t\t\t<li>+53 345 7953 32453</li>\n");
      out.write("\t\t\t\t\t\t\t<li>yourmail@gmail.com</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"widget-item\">\n");
      out.write("\t\t\t\t\t\t<h4>Engeneering</h4>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Applied Studies</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Computer Engeneering</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Software Engeneering</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Informational Engeneering</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">System Engeneering</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"widget-item\">\n");
      out.write("\t\t\t\t\t\t<h4>Graphic Design</h4>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Applied Studies</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Computer Engeneering</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Software Engeneering</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Informational Engeneering</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">System Engeneering</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"widget-item\">\n");
      out.write("\t\t\t\t\t\t<h4>Development</h4>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Applied Studies</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Computer Engeneering</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Software Engeneering</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">Informational Engeneering</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">System Engeneering</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"widget-item\">\n");
      out.write("\t\t\t\t\t\t<h4>Newsletter</h4>\n");
      out.write("\t\t\t\t\t\t<form class=\"footer-newslatter\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"email\" placeholder=\"E-mail\">\n");
      out.write("\t\t\t\t\t\t\t<button class=\"site-btn\">Subscribe</button>\n");
      out.write("\t\t\t\t\t\t\t<p>*We don?t spam</p>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"footer-bottom\">\n");
      out.write("\t\t\t<div class=\"footer-warp\">\n");
      out.write("\t\t\t\t<ul class=\"footer-menu\">\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Terms & Conditions</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Register</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Privacy</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<div class=\"copyright\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer> \n");
      out.write("\t<!-- footer section end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!--====== Javascripts & Jquery ======-->\n");
      out.write("\t<script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/mixitup.min.js\"></script>\n");
      out.write("\t<script src=\"js/circle-progress.min.js\"></script>\n");
      out.write("\t<script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- load for map -->\n");
      out.write("\t<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCWTIlluowDL-X4HbYQt3aDw_oi2JP0Krc&sensor=false\"></script>\n");
      out.write("\t<script src=\"js/map.js\"></script>\n");
      out.write("</body>\n");
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
