
<%    
    if(request.getSession().getAttribute("unm") == null)//session.getAttribute("Userid")
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
	<!-- Hero section end -->


	<!-- categories section -->
	<section class="categories-section spad">
		<div class="container">
			<div class="section-title">
				<h2>Our Course Categories</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec malesuada lorem maximus mauris scelerisque, at rutrum nulla dictum. Ut ac ligula sapien. Suspendisse cursus faucibus finibus.</p>
			</div>
			<div class="row">
				<!-- categorie -->
				<div class="col-lg-4 col-md-6">
					<div class="categorie-item">
						<div class="ci-thumb set-bg" data-setbg="img/categories/1.jpg"></div>
						<div class="ci-text">
							<h5>IT Development</h5>
							<p>Lorem ipsum dolor sit amet, consectetur</p>
							<span>120 Courses</span>
						</div>
					</div>
				</div>
				<!-- categorie -->
				<div class="col-lg-4 col-md-6">
					<div class="categorie-item">
						<div class="ci-thumb set-bg" data-setbg="img/categories/2.jpg"></div>
						<div class="ci-text">
							<h5>Web Design</h5>
							<p>Lorem ipsum dolor sit amet, consectetur</p>
							<span>70 Courses</span>
						</div>
					</div>
				</div>
				<!-- categorie -->
				<div class="col-lg-4 col-md-6">
					<div class="categorie-item">
						<div class="ci-thumb set-bg" data-setbg="img/categories/3.jpg"></div>
						<div class="ci-text">
							<h5>Illustration & Drawing</h5>
							<p>Lorem ipsum dolor sit amet, consectetur</p>
							<span>55 Courses</span>
						</div>
					</div>
				</div>
				<!-- categorie -->
				<div class="col-lg-4 col-md-6">
					<div class="categorie-item">
						<div class="ci-thumb set-bg" data-setbg="img/categories/4.jpg"></div>
						<div class="ci-text">
							<h5>Social Media</h5>
							<p>Lorem ipsum dolor sit amet, consectetur</p>
							<span>40 Courses</span>
						</div>
					</div>
				</div>
				<!-- categorie -->
				<div class="col-lg-4 col-md-6">
					<div class="categorie-item">
						<div class="ci-thumb set-bg" data-setbg="img/categories/5.jpg"></div>
						<div class="ci-text">
							<h5>Photoshop</h5>
							<p>Lorem ipsum dolor sit amet, consectetur</p>
							<span>220 Courses</span>
						</div>
					</div>
				</div>
				<!-- categorie -->
				<div class="col-lg-4 col-md-6">
					<div class="categorie-item">
						<div class="ci-thumb set-bg" data-setbg="img/categories/6.jpg"></div>
						<div class="ci-text">
							<h5>Cryptocurrencies</h5>
							<p>Lorem ipsum dolor sit amet, consectetur</p>
							<span>25 Courses</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- course section -->
	<section class="course-section spad">
		<div class="container">
			<div class="section-title mb-0">
				<h2>Featured Courses</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec malesuada lorem maximus mauris scelerisque, at rutrum nulla dictum. Ut ac ligula sapien. Suspendisse cursus faucibus finibus.</p>
			</div>
		</div>
		<div class="course-warp">
			<ul class="course-filter controls">
				<li class="control active" data-filter="all">All</li>
				<li class="control" data-filter=".finance">Finance</li>
				<li class="control" data-filter=".design">Design</li>
				<li class="control" data-filter=".web">Web Development</li>
				<li class="control" data-filter=".photo">Photography</li>
			</ul>                                       
			<div class="row course-items-area">
				<!-- course -->
				<div class="mix col-lg-3 col-md-4 col-sm-6 finance">
					<div class="course-item">
						<div class="course-thumb set-bg" data-setbg="img/courses/1.jpg">
							<div class="price">Price: $15</div>
						</div>
						<div class="course-info">
							<div class="course-text">
								<h5>Art & Crafts</h5>
								<p>Lorem ipsum dolor sit amet, consectetur</p>
								<div class="students">120 Students</div>
							</div>
							<div class="course-author">
								<div class="ca-pic set-bg" data-setbg="img/authors/1.jpg"></div>
								<p>William Parker, <span>Developer</span></p>
							</div>
						</div>
					</div>
				</div>
				<!-- course -->
				<div class="mix col-lg-3 col-md-4 col-sm-6 design">
					<div class="course-item">
						<div class="course-thumb set-bg" data-setbg="img/courses/2.jpg">
							<div class="price">Price: $15</div>
						</div>
						<div class="course-info">
							<div class="course-text">
								<h5>IT Development</h5>
								<p>Lorem ipsum dolor sit amet, consectetur</p>
								<div class="students">120 Students</div>
							</div>
							<div class="course-author">
								<div class="ca-pic set-bg" data-setbg="img/authors/2.jpg"></div>
								<p>William Parker, <span>Developer</span></p>
							</div>
						</div>
					</div>
				</div>
				<!-- course -->
				<div class="mix col-lg-3 col-md-4 col-sm-6 web">
					<div class="course-item">
						<div class="course-thumb set-bg" data-setbg="img/courses/3.jpg">
							<div class="price">Price: $15</div>
						</div>
						<div class="course-info">
							<div class="course-text">
								<h5>Graphic Design</h5>
								<p>Lorem ipsum dolor sit amet, consectetur</p>
								<div class="students">120 Students</div>
							</div>
							<div class="course-author">
								<div class="ca-pic set-bg" data-setbg="img/authors/3.jpg"></div>
								<p>William Parker, <span>Developer</span></p>
							</div>
						</div>
					</div>
				</div>
				<!-- course -->
				<div class="mix col-lg-3 col-md-4 col-sm-6 photo">
					<div class="course-item">
						<div class="course-thumb set-bg" data-setbg="img/courses/4.jpg">
							<div class="price">Price: $15</div>
						</div>
						<div class="course-info">
							<div class="course-text">
								<h5>IT Development</h5>
								<p>Lorem ipsum dolor sit amet, consectetur</p>
								<div class="students">120 Students</div>
							</div>
							<div class="course-author">
								<div class="ca-pic set-bg" data-setbg="img/authors/4.jpg"></div>
								<p>William Parker, <span>Developer</span></p>
							</div>
						</div>
					</div>
				</div>
				<!-- course -->
				<div class="mix col-lg-3 col-md-4 col-sm-6 finance">
					<div class="course-item">
						<div class="course-thumb set-bg" data-setbg="img/courses/5.jpg">
							<div class="price">Price: $15</div>
						</div>
						<div class="course-info">
							<div class="course-text">
								<h5>IT Development</h5>
								<p>Lorem ipsum dolor sit amet, consectetur</p>
								<div class="students">120 Students</div>
							</div>
							<div class="course-author">
								<div class="ca-pic set-bg" data-setbg="img/authors/5.jpg"></div>
								<p>William Parker, <span>Developer</span></p>
							</div>
						</div>
					</div>
				</div>
				<!-- course -->
				<div class="mix col-lg-3 col-md-4 col-sm-6 design">
					<div class="course-item">
						<div class="course-thumb set-bg" data-setbg="img/courses/6.jpg">
							<div class="price">Price: $15</div>
						</div>
						<div class="course-info">
							<div class="course-text">
								<h5>Socia Media</h5>
								<p>Lorem ipsum dolor sit amet, consectetur</p>
								<div class="students">120 Students</div>
							</div>
							<div class="course-author">
								<div class="ca-pic set-bg" data-setbg="img/authors/6.jpg"></div>
								<p>William Parker, <span>Developer</span></p>
							</div>
						</div>
					</div>
				</div>
				<!-- course -->
				<div class="mix col-lg-3 col-md-4 col-sm-6 web">
					<div class="course-item">
						<div class="course-thumb set-bg" data-setbg="img/courses/7.jpg">
							<div class="price">Price: $15</div>
						</div>
						<div class="course-info">
							<div class="course-text">
								<h5>IT Development</h5>
								<p>Lorem ipsum dolor sit amet, consectetur</p>
								<div class="students">120 Students</div>
							</div>
							<div class="course-author">
								<div class="ca-pic set-bg" data-setbg="img/authors/7.jpg"></div>
								<p>William Parker, <span>Developer</span></p>
							</div>
						</div>
					</div>
				</div>
				<!-- course -->
				<div class="mix col-lg-3 col-md-4 col-sm-6 photo">
					<div class="course-item">
						<div class="course-thumb set-bg" data-setbg="img/courses/8.jpg">
							<div class="price">Price: $15</div>
						</div>
						<div class="course-info">
							<div class="course-text">
								<h5>HTML 5</h5>
								<p>Lorem ipsum dolor sit amet, consectetur</p>
								<div class="students">120 Students</div>
							</div>
							<div class="course-author">
								<div class="ca-pic set-bg" data-setbg="img/authors/8.jpg"></div>
								<p>William Parker, <span>Developer</span></p>
							</div>
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
</html>