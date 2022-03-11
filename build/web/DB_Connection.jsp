<%@ page import="java.sql.*" %>

<%
    Connection con=null;
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentguidance", "root", "root");
        //System.out.println("Connection Successful.................. jsp page");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    
    
%>