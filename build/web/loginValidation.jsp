<%@page import="java.sql.PreparedStatement"%>
<%@ include file="DB_Connection.jsp"%>
<%
    String usernm = request.getParameter("monileno");
    String pass = request.getParameter("passwrd");
    session.setAttribute("unm", usernm);
    
        try 
        {

            PreparedStatement pstmt = con.prepareStatement("select * from registration where cont=? and pass=?");
            pstmt.setString(1, usernm);
            pstmt.setString(2, pass);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) 
            {
                response.sendRedirect("welcome.jsp");
            }
            else
            {
                %>
                    <script>
                        alert("Please Enter Valid Detailed");
                        window.location = "index.html";
                    </script>
            <%
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e);
            %>
                <script>
                    alert("Please Enter Valid Detailed");
                    window.location = "index.html";
                </script>
            <%
        }
%>