package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sun.font.Script;
import javafx.scene.control.Alert;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public final class test1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String eno = request.getParameter("enrollmentno");
    String sno = request.getParameter("seatno");
    System.out.println(sno);
    System.out.println(eno);
    String seatno;

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement", "root", "root");
        Statement st = con.createStatement();
        System.out.println("Connectioon Successfulll...........");
//String sql ="select * from exp2 where name='aa'";
        ResultSet rst = st.executeQuery("select * from marksheet where SEAT_NO='" + sno + "' AND ENROLLMENT_NO='" + eno + "'");

        if (rst.next()) {
            String bb = rst.getString("ENROLLMENT_NO");
            String aa = rst.getString("SEAT_NO");
            String cc=rst.getString("cont");System.out.println(cc);
            String dd=rst.getString("Candidate_Name");System.out.println(dd);
            session.setAttribute("cont", cc);
            session.setAttribute("name", dd);
            System.out.println("id" + aa);
            if (aa.equals(sno) && bb.equals(eno)) {
                seatno = rst.getString("marksheetrecive");

                if (seatno.equals("NOT RECIVED")) {
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html >\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Example 1</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/recipt.css\" media=\"all\" />\n");
      out.write("        <style> \n");
      out.write("            input[type=submit] \n");
      out.write("            {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 16px 32px;\n");
      out.write("                text-decoration: none;\n");
      out.write("\n");
      out.write("                margin: 4px 2px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"updatestatus.jsp\" method=\"post\"> \n");
      out.write("            <header class=\"clearfix\">\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <img src=\"css/logo.png\">\n");
      out.write("                </div>\n");
      out.write("                <h1>K K WAGH COLLEGE NASHIK</h1>\n");
      out.write("                <div id=\"company\" class=\"clearfix\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"project\">\n");
      out.write("                    <div style=\"font-size: 13pt\"><span>CANDIDATE NAME : <span id=\"BILL\" size=\"05\"  style=\"font-size: 12pt\" required />");
      out.print(rst.getString("Candidate_Name"));
      out.write("</span></span></div>\n");
      out.write("                    <div style=\"font-size: 13pt;margin-top: 10px;\"><span>ENROLMENT NO : <span id=\"BILL\" size=\"05\"  style=\"font-size: 12pt\" required />");
      out.print(rst.getString("ENROLLMENT_NO"));
      out.write("</SPAN></SPAN><span style=\"margin-left: 150PX;\">SEAT NO : <span><input type=\"text\" id=\"seatno\" value=\"");
      out.print(rst.getString("SEAT_NO"));
      out.write("\" name=\"seatno\" size=\"05\"  style=\"font-size: 12pt;border-style:none;\" required /></span></span><span style=\"margin-left: 80PX;\">YEAR : ");
      out.print(rst.getString("YEAR"));
      out.write("</span></div>\n");
      out.write("                    <div style=\"font-size: 13pt;margin-top: 10px;\"><span>COURSE : <span id=\"BILL\" size=\"05\"  style=\"font-size: 12pt\" required >");
      out.print(rst.getString("COURSE"));
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></span><SPAN>MASTER : ");
      out.print(rst.getString("MASTER"));
      out.write("</span></div>\n");
      out.write("                    <div style=\"font-size: 13pt;margin-top: 10px;\"><span>EXAM SESSION : <span id=\"BILL\" size=\"05\"  style=\"font-size: 12pt\" required >");
      out.print(rst.getString("Exam_Session"));
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></span><SPAN style=\"margin-left: 100PX;\">MSBTE CODE : ");
      out.print(rst.getString("MSBTE_CODE"));
      out.write("</span></div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <main>\n");
      out.write("                <table>\n");
      out.write("\n");
      out.write("                    <tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td  class=\"grand total\" rowspan=\"2\" style=\"text-align: center;\" > DATE : 00/00/0000<BR  /><BR />SECRETARY<BR />(MAHARASHTRA STATE BOARD OF TECHNICAL EDUCATION)</td>\n");
      out.write("                            <td  class=\"grand total\" style=\"font-size: 13pt\">TOTAL</td>\n");
      out.write("                            <td  class=\"grand total\" style=\"font-size: 13pt\">RESULT WITH %</td>\n");
      out.write("                            <td  class=\"grand total\" style=\"font-size: 13pt\">TOTAL MARKS OBTAINED</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr >\n");
      out.write("\n");
      out.write("                            <td  class=\"grand total\">");
      out.print(rst.getString("TOTAL_MAX_MARKS"));
      out.write("</td>\n");
      out.write("                            <td class=\"grand total\">");
      out.print(rst.getString("RESULT_WITH_PER"));
      out.write("</td>\n");
      out.write("                            <td class=\"grand total\">");
      out.print(rst.getString("TOTAL_MARKS_OBTAINED"));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"4\" class=\"grand total\" style=\"font-size: 13pt\">");
      out.print(rst.getString("CLASS_AWARDED_FOR_DIPLOMA"));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("<!--                <div id=\"project\">\n");
      out.write("                    <div style=\"font-size: 13pt;margin-top: 20PX;\"><span>ENTER MOBILE NO : </span><input name=\"mobileno\" style=\"font-size: 13pt\" size=\"20\"   required /></div>\n");
      out.write("\n");
      out.write("                </div>-->\n");
      out.write("                <!--                    <input type=submit name=print value=\"MARKSHEET_ISSUE\" style=\"margin-top: 20px;\">-->\n");
      out.write("\n");
      out.write("                <script LANGUAGE=\"JavaScript\">\n");
      out.write("                    if(window.print)\n");
      out.write("                    {\n");
      out.write("                        window.focus();\n");
      out.write("                        document.write('<form><input type=submit name=print value=\"MARKSHEET ISSUE\" onClick=\"window.print();\"></form>')\n");
      out.write("                    }\n");
      out.write("                </script>\n");
      out.write("\n");
      out.write("                <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    input[type=submit]\n");
      out.write("                    {\n");
      out.write("                        margin-top: 30px;\n");
      out.write("                        background-color: #4CAF50;\n");
      out.write("                        border: none;\n");
      out.write("                        Color:white;\n");
      out.write("                        padding: 16px 32px;\n");
      out.write("                        text-decoration: none;\n");
      out.write("                        margin: 4px 2px;\n");
      out.write("                        cursor: pointer;\n");
      out.write("                        float: right;\n");
      out.write("                    }\n");
      out.write("                </style>\n");
      out.write("            </main>\n");
      out.write("        </form> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");

                } else {
                    //response.sendRedirect("issuemarksheet.jsp");
                    out.println("<script>alert('Already Issued.......');window.location.href='issuemarksheet.jsp';</script>");
                }
            }

        } else {
            System.out.println("fffff");
            out.println("<script>alert('Not Available.......');window.location.href='issuemarksheet.jsp';</script>");

        }

        con.close();
    } catch (Exception e) {
        System.out.println(e);
    }


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
