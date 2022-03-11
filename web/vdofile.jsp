
<%
    if (request.getSession().getAttribute("unm") == null)//session.getAttribute("Userid")
    {
        response.sendRedirect("index.html");
    }
%><!DOCTYPE html>
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


        <!-- Hero section -->
        <section class="hero-section set-bg" data-setbg="img/bg.jpg">
        </section>

        <br />
        <div class="section-title">
            <h2>Video Session</h2>
        </div>

        <a href="#"  class="see-video  bg-current border-0 " style="margin-left: 100px;color: red"type="button" data-toggle="modal" data-target="#aboutVideo">1. What is Civil Engineering?</a><br /><br />
        <div class="modal fade" id="aboutVideo" tabindex="-1" role="dialog" aria-labelledby="aboutVideoLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-body">
                        <iframe id="myFrame" class="aboutPlayer" width="100%" height="400" src="https://www.youtube-nocookie.com/embed/bFljMHTQ1QY" frameborder="0"  ></iframe>
                    </div>
                </div>
            </div>
        </div>
        
        <a href="#"  class="see-video  bg-current border-0 " style="margin-left: 100px;color: red"type="button" data-toggle="modal" data-target="#aboutVideo2">2. Electronics & Communication Engineering</a><br /><br />
        <div class="modal fade" id="aboutVideo2" tabindex="-1" role="dialog" aria-labelledby="aboutVideoLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-body">
                        <iframe id="myFrame" class="aboutPlayer" width="100%" height="400" src="https://www.youtube-nocookie.com/embed/_alet5HS9P0" frameborder="0"  ></iframe>
                    </div>
                </div>
            </div>
        </div>
        
        <a href="#"  class="see-video  bg-current border-0 " style="margin-left: 100px;color: red"type="button" data-toggle="modal" data-target="#aboutVideo3">3. What is Hotel Management</a><br /><br />
        <div class="modal fade" id="aboutVideo3" tabindex="-1" role="dialog" aria-labelledby="aboutVideoLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-body">
                        <iframe id="myFrame" class="aboutPlayer" width="100%" height="400" src="https://www.youtube.com/embed/FhKaAXteFtc" frameborder="0"  ></iframe>
                    </div>
                </div>
            </div>
        </div>
        
        <a href="#"  class="see-video  bg-current border-0 " style="margin-left: 100px;color: red"type="button" data-toggle="modal" data-target="#aboutVideo4">4. B-tech vs B.E</a><br /><br />
        <div class="modal fade" id="aboutVideo4" tabindex="-1" role="dialog" aria-labelledby="aboutVideoLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-body">
                        <iframe id="myFrame" class="aboutPlayer" width="100%" height="400" src="https://www.youtube-nocookie.com/embed/ylIZYr99Z7A" frameborder="0"  ></iframe>
                    </div>
                </div>
            </div>
        </div>
        
        <a href="#"  class="see-video  bg-current border-0 " style="margin-left: 100px;color: red"type="button" data-toggle="modal" data-target="#aboutVideo5">5. B-tech vs B.E</a><br /><br />
        <div class="modal fade" id="aboutVideo5" tabindex="-1" role="dialog" aria-labelledby="aboutVideoLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-body">
                        <iframe id="myFrame" class="aboutPlayer" width="100%" height="400" src="https://www.youtube-nocookie.com/embed/hY5D4BI5KX0" frameborder="0"  ></iframe>
                    </div>
                </div>
            </div>
        </div>
        <!--====== Javascripts & Jquery ======-->
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/mixitup.min.js"></script>
        <script src="js/circle-progress.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/main.js"></script>
</html>