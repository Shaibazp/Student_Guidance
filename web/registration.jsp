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
	<section class="signup-section spad">
		<div class="signup-bg set-bg" data-setbg="img/signup-bg.jpg"></div>
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-6">
					<div class="signup-warp">
						<div class="section-title text-white text-left">
							<h2>Student Registration</h2>
						</div>
						<!-- signup form -->
                                                <form class="signup-form" action="registrationdb.jsp" method="post">
                                                    <input type="text" placeholder="First Name" name="fname" required>
                                                    <input type="text" placeholder="Last Name" name="lname" required>
                                                    <input type="text" placeholder="E-mail Id" name="email" required>
                                                    <input type="text" placeholder="Mobile No" name="cont" required>
                                                    <input type="text" placeholder="Department" name="dept" required>
                                                    <input type="text" placeholder="Mention Year" name="yrs" required>
                                                    <input type="password" placeholder="Enter Password" name="pass1" required>
                                                    <input type="password" placeholder="Re-enter Password" name="pass2" required>
                                                    <button class="site-btn" type="submit">Register</button><br /><br /><a href="index.html" class="site-btn">Login</a>
						</form>
                                                
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