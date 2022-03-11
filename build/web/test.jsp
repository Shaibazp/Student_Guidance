
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
        <!-- Hero section end -->

            <div class="container">
                <div class="section-title">
                    <h2>Question</h2>
                </div>
            </div>

        <form action="generateresult.jsp" method="post">
            <div class="container">
                <label>1. Which of the following is billionth of a second?</label>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio1" name="optradio1" value="Microsecond">Microsecond
                    <label class="form-check-label" for="radio1"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio2" name="optradio1" value="Nanosecond">Nanosecond
                    <label class="form-check-label" for="radio2"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio3" name="optradio1" value="Terabyte">Terabyte
                    <label class="form-check-label" for="radio3"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio4" name="optradio1" value="Gigabyte">Gigabyte
                    <label class="form-check-label" for="radio4"></label>
                </div>
            </div><br />
            <div class="container">
                <label>2. Internal hard disk is</label>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio1" name="optradio2" value="Removablebutnotfixed">Removable but not fixed
                    <label class="form-check-label" for="radio1"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio2" name="optradio2" value="Removable">Removable
                    <label class="form-check-label" for="radio2"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio3" name="optradio2" value="Notfixed">Not fixed
                    <label class="form-check-label" for="radio3"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio4" name="optradio2" value="Fixed">Fixed
                    <label class="form-check-label" for="radio4"></label>
                </div>
            </div><br />
            <div class="container">
                <label>3. Cache memory acts between</label>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio1" name="optradio3" value="CPUandHarddisk">CPU and Hard disk
                    <label class="form-check-label" for="radio1"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio2" name="optradio3" value="RAMandROM">RAM and ROM
                    <label class="form-check-label" for="radio2"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio3" name="optradio3" value="CPUandRAM">CPU and RAM
                    <label class="form-check-label" for="radio3"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio4" name="optradio3" value="Allofthese">All of these
                    <label class="form-check-label" for="radio4"></label>
                </div>
            </div><br />
            <div class="container">
                <label>4. CD-ROM stands for</label>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio1" name="optradio4" value="CompactableDiscReadOnlyMemory" >Compactable Disc Read Only Memory
                    <label class="form-check-label" for="radio1"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio2" name="optradio4" value="CompactDataReadOnlyMemory">Compact Data Read Only Memory
                    <label class="form-check-label" for="radio2"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio3" name="optradio4" value="CompactableReadOnlyMemory">Compactable Read Only Memory
                    <label class="form-check-label" for="radio3"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio4" name="optradio4" value="CompactDiscReadOnlyMemory">Compact Disc Read Only Memory
                    <label class="form-check-label" for="radio4"></label>
                </div>
            </div><br />
            <div class="container">
                <label>5. RAM is also called as</label>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio1" name="optradio5" value="Virtualmemory" >Virtual memory
                    <label class="form-check-label" for="radio1"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio2" name="optradio5" value="Volatilememory">Volatile memory
                    <label class="form-check-label" for="radio2"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio3" name="optradio5" value="Nonvolatilememory">Non volatile memory
                    <label class="form-check-label" for="radio3"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio4" name="optradio5" value="Cachememory">Cache memory
                    <label class="form-check-label" for="radio4"></label>
                </div>
            </div><br />
            <div class="container">
                <label>6. _____ has the shortest access times.</label>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio1" name="optradio6" value="VirtualMemory" >Virtual Memory
                    <label class="form-check-label" for="radio1"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio2" name="optradio6" value="SecondaryMemory">Secondary Memory
                    <label class="form-check-label" for="radio2"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio3" name="optradio6" value="CacheMemory">Cache Memory
                    <label class="form-check-label" for="radio3"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio4" name="optradio6" value="Alloftheabove">All of the above
                    <label class="form-check-label" for="radio4"></label>
                </div>
            </div><br />
            <div class="container">
                <label>7. Programs stored in ROM are called as</label>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio1" name="optradio7" value="Fireware" >Fireware
                    <label class="form-check-label" for="radio1"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio2" name="optradio7" value="Formware">Formware
                    <label class="form-check-label" for="radio2"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio3" name="optradio7" value="Farmware">Farmware
                    <label class="form-check-label" for="radio3"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio4" name="optradio7" value="Firmware">Firmware
                    <label class="form-check-label" for="radio4"></label>
                </div>
            </div><br />
            <div class="container">
                <label>8. We can make use of the wild card entries such as ___ in Windows Explorer.</label>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio1" name="optradio8" value="1" >#,@
                    <label class="form-check-label" for="radio1"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio2" name="optradio8" value="2">^,*
                    <label class="form-check-label" for="radio2"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio3" name="optradio8" value="3">?,*
                    <label class="form-check-label" for="radio3"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio4" name="optradio8" value="4">?,#
                    <label class="form-check-label" for="radio4"></label>
                </div>
            </div><br />
            <div class="container">
                <label>9. Using Microsoft word we can simply ___</label>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio1" name="optradio9" value="Pastepicture" >Paste picture
                    <label class="form-check-label" for="radio1"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio2" name="optradio9" value="Type">Type
                    <label class="form-check-label" for="radio2"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio3" name="optradio9" value="Formatatext">Format a text
                    <label class="form-check-label" for="radio3"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio4" name="optradio9" value="Alltheabovefunctions">All the above functions
                    <label class="form-check-label" for="radio4"></label>
                </div>
            </div><br />
            <div class="container">
                <label>10. The Binary Coded Decimal (BCD) uses</label>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio1" name="optradio10" value="6bits" >6 bits
                    <label class="form-check-label" for="radio1"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio2" name="optradio10" value="8bits">8 bits
                    <label class="form-check-label" for="radio2"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio3" name="optradio10" value="16bits">16bits
                    <label class="form-check-label" for="radio3"></label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" id="radio4" name="optradio10" value="32bits">32 bits
                    <label class="form-check-label" for="radio4"></label>
                </div>
            </div><br />
            <div class="container">
                <button class="btn btn-outline-primary" style="margin-left: 100px;">Submit</button><br /><br /><br /><br />
            </div>
        </form>
        <!--====== Javascripts & Jquery ======-->
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/mixitup.min.js"></script>
        <script src="js/circle-progress.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/main.js"></script>
</html>
<!--https://meritnotes.com/computer-quiz/basic-computer-quiz/1-472/-->