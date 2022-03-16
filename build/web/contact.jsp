<%
    if (request.getSession().getAttribute("unm") == null)//session.getAttribute("Userid")
    {
        response.sendRedirect("index.html");
    }
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>WebUni - Education Template</title>
        <meta charset="UTF-8">
        <meta name="description" content="WebUni Education Template">
        <meta name="keywords" content="webuni, education, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Favicon -->   
        <link href="img/favicon.ico" rel="shortcut icon"/>

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Raleway:400,400i,500,500i,600,600i,700,700i,800,800i" rel="stylesheet">

        <!-- Stylesheets -->
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/font-awesome.min.css"/>
        <link rel="stylesheet" href="css/owl.carousel.css"/>
        <link rel="stylesheet" href="css/style.css"/>

    </head>
    <body>
        <!-- Page Preloder -->
        <div id="preloder">
            <div class="loader"></div>
        </div>

        <!-- Header section -->
        <header class="header-section">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-3">
                        <div class="site-logo">
                            <img src="img/logo.png" alt="">
                        </div>
                        <div class="nav-switch">
                            <i class="fa fa-bars"></i>
                        </div>
                    </div>
                    <div class="col-lg-9 col-md-9">
                        <a href="logout.jsp" class="site-btn header-btn">LogOut</a>
                        <nav class="main-menu">
                            <ul>
                                <li><a href="welcome.jsp">Home</a></li>
                                <li><a href="vdofile.jsp">Video Session</a></li>
                                <li><a href="test.jsp">Course Test</a></li>
                                <li><a href="contact.jsp">Contact</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </header>
        <!-- Header section end -->


        <!-- Page info -->
        <div class="page-info-section set-bg" data-setbg="img/page-bg/4.jpg">
            <div class="container">
                <div class="site-breadcrumb">
                    <a href="#">Home</a>
                    <span>Contact</span>
                </div>
            </div>
        </div>

        <section class="contact-page spad pb-0">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4">
                        <div class="contact-info-area">
                            <div class="section-title text-left p-0">
                                <h2>Contact Info</h2>
                                <p></p>
                            </div>
                            <div class="phone-number">
                                <span>Direct Line</span>
                                <h2>+91 8978451269</h2>
                            </div>
                            <ul class="contact-list">
                                <li>Nashik Campus<br />Address:Trimbak Road, Nashik <br />Maharashtra, India.</li>
                                <li>1800-233-2714 / 1800-123-271</li>
                                <li>info@sandipfoundation.org</li>
                            </ul>
                            <div class="social-links">
                                <a href="#"><i class="fa fa-pinterest"></i></a>
                                <a href="#"><i class="fa fa-facebook"></i></a>
                                <a href="#"><i class="fa fa-twitter"></i></a>
                                <a href="#"><i class="fa fa-dribbble"></i></a>
                                <a href="#"><i class="fa fa-behance"></i></a>
                                <a href="#"><i class="fa fa-linkedin"></i></a>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </section>

        <!--====== Javascripts & Jquery ======-->
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/mixitup.min.js"></script>
        <script src="js/circle-progress.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/main.js"></script>


        <!-- load for map -->
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCWTIlluowDL-X4HbYQt3aDw_oi2JP0Krc&sensor=false"></script>
        <script src="js/map.js"></script>
    </body>
</html>