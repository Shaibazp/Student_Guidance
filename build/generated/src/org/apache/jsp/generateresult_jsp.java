package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class generateresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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


    String q1 = request.getParameter("optradio1");
    String q2 = request.getParameter("optradio2");
    String q3 = request.getParameter("optradio3");
    String q4 = request.getParameter("optradio4");
    String q5 = request.getParameter("optradio5");
    String q6 = request.getParameter("optradio6");
    String q7 = request.getParameter("optradio7");
    String q8 = request.getParameter("optradio8");
    String q9 = request.getParameter("optradio9");
    String q10 = request.getParameter("optradio10");
    
    int  cont1=0; int  cont2=0; int  cont3=0; int  cont4=0; 
    int  cont5=0; int  cont6=0; int  cont7=0; 
    int  cont8=0; int  cont9=0; int  cont10=0; 
    if(q1.equals("Nanosecond")){cont1++;}else {cont1 = cont1+0;}
    if(q2.equals("Fixed")){cont2++;}else {cont2 = cont2+0;}
    if(q3.equals("CPUandRAM")){cont3++;}else {cont3 = cont3+0;}
    if(q4.equals("CompactDiscReadOnlyMemory")){cont4++;}else {cont4 = cont4+0;}
    if(q5.equals("Volatilememory")){cont5++;}else {cont5 = cont5+0;}
    if(q6.equals("CacheMemory")){cont6++;}else {cont6 = cont6+0;}
    if(q7.equals("Firmware")){cont7++;}else {cont7 = cont7+0;}
    if(q8.equals("3")){cont8++;}else {cont8 = cont8+0;}
    if(q9.equals("Alltheabovefunctions")){cont9++;}else {cont9 = cont9+0;}
    if(q10.equals("6bits")){cont10++;}else {cont10 = cont10+0;}
    int sum = cont1+cont2+cont3+cont4+cont5+cont6+cont7+cont8+cont9+cont10;
    System.out.println(sum);
    

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
