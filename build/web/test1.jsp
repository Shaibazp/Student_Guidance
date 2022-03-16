<%@page import="sun.font.Script"%>
<%@page import="javafx.scene.control.Alert"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@ include file="DB_Connection.jsp"%>
<!DOCTYPE html>
<html >
    <head>
        <meta charset="utf-8">
        <title>Example 1</title>
        <link rel="stylesheet" href="css/recipt.css" media="all" />
        <style> 
            input[type=submit] 
            {
                background-color: #4CAF50;
                border: none;
                color: white;
                padding: 16px 32px;
                text-decoration: none;

                margin: 4px 2px;
                cursor: pointer;
                float: right;
            }
        </style>
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
                    <div style="font-size: 13pt"><span>CANDIDATE NAME : <span id="BILL" size="05"  style="font-size: 12pt" required />sdcsdcsdcsdcsdc</span></span></div>
                    <div style="font-size: 13pt;margin-top: 10px;"><span>ENROLMENT NO : <span id="BILL" size="05"  style="font-size: 12pt" required />scsdcdcsdcsdcsdc</SPAN></SPAN><span style="margin-left: 150PX;">SEAT NO : <span><input type="text" id="seatno" value="eeeeee" name="seatno" size="05"  style="font-size: 12pt;border-style:none;" required /></span></span><span style="margin-left: 80PX;">YEAR : sdcsdcsdcsdcsdcd</span></div>
                    <div style="font-size: 13pt;margin-top: 10px;"><span>COURSE : <span id="BILL" size="05"  style="font-size: 12pt" required >dscsdcsdcsdc&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></span><SPAN>MASTER : ecececececececec</span></div>
                    <div style="font-size: 13pt;margin-top: 10px;"><span>EXAM SESSION : <span id="BILL" size="05"  style="font-size: 12pt" required >dcsdcsdcsdcsdcsdcsdc&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></span><SPAN style="margin-left: 100PX;">MSBTE CODE : ecececececece</span></div>
                </div>
            </header>
            <main>
                <table>
                    <tbody>
                        <tr>
                            <td  class="grand total" rowspan="2" style="text-align: center;" > DATE : 00/00/0000<BR  /><BR />SECRETARY<BR />(MAHARASHTRA STATE BOARD OF TECHNICAL EDUCATION)</td>
                            <td  class="grand total" style="font-size: 13pt">TOTAL</td>
                            <td  class="grand total" style="font-size: 13pt">RESULT WITH %</td>
                            <td  class="grand total" style="font-size: 13pt">TOTAL MARKS OBTAINED</td>
                        </tr>
                        <tr >
                            <td  class="grand total">sdcdcdsc</td>
                            <td class="grand total">dscsdcsdcsd</td>
                            <td class="grand total">scdscsdcsdcsdc</td>
                        </tr>
                        <tr>
                            <td colspan="4" class="grand total" style="font-size: 13pt">dcsdcsdcsdcsdcsd</td>
                        </tr>
                    </tbody>
                </table>
                <script LANGUAGE="JavaScript">
                    if (window.print)
                    {
                        window.focus();
                        document.write('<form><input type=submit name=print value="MARKSHEET ISSUE" onClick="window.print();"></form>')
                    }
                </script>
                <style>
                    input[type=submit]
                    {
                        margin-top: 30px;
                        background-color: #4CAF50;
                        border: none;
                        Color:white;
                        padding: 16px 32px;
                        text-decoration: none;
                        margin: 4px 2px;
                        cursor: pointer;
                        float: right;
                    }
                </style>
            </main>
    </body>
</html>
