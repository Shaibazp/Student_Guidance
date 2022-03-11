<%@ include file="DB_Connection.jsp"%>
<%
    String fname = request.getParameter("fname");
    String lname = request.getParameter("lname");
    String email = request.getParameter("email");
    String cont = request.getParameter("cont");
    String dept = request.getParameter("dept");
    String yrs = request.getParameter("yrs");
    String pass1 = request.getParameter("pass1");
    String pass2 = request.getParameter("pass2");
    
    if(pass1.equals(pass2))
    {
        try 
        {
            PreparedStatement pstmt = null;
            PreparedStatement pstn1 = con.prepareStatement("select * from registration where cont=?");
            pstn1.setString(1, cont);
            ResultSet rs = pstn1.executeQuery();
            if (!rs.next()) 
            {
                pstmt = con.prepareStatement("insert into registration(fname, lname, email, cont, dept, yrs, pass1) value(?,?,?,?,?,?,?)");
                pstmt.setString(1, fname);
                pstmt.setString(2, lname);
                pstmt.setString(3, email);
                pstmt.setString(4, cont);
                pstmt.setString(5, dept);
                pstmt.setString(6, yrs);
                pstmt.setString(7, pass1);
                pstmt.executeUpdate();
                %>
                    <script>
                        alert("Register Successfull");
                        window.location = "index.html";
                    </script>
                <%
            } 
            else 
            {
                %>
                    <script>
                        alert("User already exist");
                        window.location = "registration.jsp";
                    </script>
                <%
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e);
            %>
                <script>
                    alert("Please Enter Detail Again..............");
                    window.location = "registration.jsp";
                </script>
            <%
        }
    }
    else
    {
        %>
                <script>
                    alert("Please Enter Same Password..............");
                    window.location = "registration.jsp";
                </script>
        <%
    }

%>