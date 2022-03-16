<%@ include file="DB_Connection.jsp"%>
<%
    String uno = (String)request.getSession().getAttribute("unm").toString();
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
    
    try
    {
        PreparedStatement pstmt = null;
        PreparedStatement pstn1 = con.prepareStatement("select * from registration where cont=?");
        pstn1.setString(1, uno);
        ResultSet rs = pstn1.executeQuery();
        while (rs.next()) 
        { 

          %>
            
            <!DOCTYPE html>
            <html >
                <head>
                    <meta charset="utf-8">
                    <title>Example 1</title>
                    <link rel="stylesheet" href="css/recipt.css" media="all" />
                </head>
                <body >
                        <header class="clearfix">
                            <div id="logo">
                                <img src="img/logo.png">
                            </div>
                            <h1>WebUni Education</h1>
                            <div id="company" class="clearfix">
                            </div>
                            <div id="project">
                                <div style="font-size: 13pt"><span>CANDIDATE NAME : <span id="BILL" size="05"  style="font-size: 12pt" required /><%= rs.getString(2)%>&nbsp;<%= rs.getString(3)%></span></span></div>
                                <div style="font-size: 13pt;margin-top: 10px;"><span>YEAR : <%= rs.getString(7)%></span></div>
                                <div style="font-size: 13pt;margin-top: 10px;"><span>COURSE : <span id="BILL" size="05"  style="font-size: 12pt" required ><%= rs.getString(6)%></div>
                                
                            </div>
                        </header>
                        <main>
                            <table>
                                <tbody>
                                    <tr>
                                        <td  class="grand total" rowspan="2" style="text-align: center;" > DATE : 00/00/0000<BR  /><BR />SECRETARY<BR />(MAHARASHTRA STATE BOARD OF TECHNICAL EDUCATION)</td>
                                        <td  class="grand total" style="font-size: 13pt">TOTAL</td>
                                        <td  class="grand total" style="font-size: 13pt"></td>
                                        <td  class="grand total" style="font-size: 13pt">TOTAL MARKS OBTAINED</td>
                                    </tr>
                                    <tr >
                                        <td  class="grand total">10</td>
                                        <td class="grand total"></td>
                                        <td class="grand total"><%= sum%></td>
                                    </tr>
                                    <tr>
                                        <td colspan="4" class="grand total" style="font-size: 13pt"></td>
                                    </tr>
                                </tbody>
                            </table>
                                    <a href="test.jsp" style="margin-top: 30px;
                                    background-color: #4CAF50;
                                    border: none;
                                    Color:white;
                                    padding: 16px 32px;
                                    text-decoration: none;
                                    margin: 4px 2px;
                                    cursor: pointer;
                                    float: right;">Home Page
                                    </a>
                        </main>
                </body>
            </html>
<%
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    
%>