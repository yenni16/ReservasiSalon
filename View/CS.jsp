<%-- 
    Document   : CS
    Created on : Apr 2, 2016, 2:35:16 PM
    Author     : Marcellina Fanny 
--%>
<html>
    <head>
        <title>Halaman Customer Service</title>     
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Beautyou  Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
        <script type="applisalonion/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <!-- Custom Theme files -->
        <link href="css/style_1.css" rel='stylesheet' type='text/css' />	
        <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
        <link href="css/swipebox.css" rel='stylesheet' type='text/css' />
        <script src="js/jquery-1.11.1.min.js"></script>
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <!--/web-font-->
        <link href='//fonts.googleapis.com/css?family=Open+Sans:400,700,600,600italic,800' rel='stylesheet' type='text/css'>
        <!--/script-->
        <script type="text/javascript">
            jQuery(document).ready(function($) {
                $(".scroll").click(function(event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 900);
                });
            });
        </script>
        <link rel="stylesheet" href="css/swipebox.css">
        <script src="js/jquery.swipebox.min.js"></script> 
        <script type="text/javascript">
            jQuery(function($) {
                $(".swipebox").swipebox();
            });
        </script>

    </head>
    <body>

        <!--start-home-->
        <div class="banner two" id="home">
            <div class="container">
                <div class="head-top">
                    <!--logo-->
                    <div class="logo">
                        <a href="index.html"><h1>Parama Salon</h1></a>
                    </div>
                    <div class="phone"><i class="glyphicon glyphicon-phone"></i><p>081804005541</p>
                        <h5>Hubungi</h5>
                    </div>
                    <div class="clearfix"></div>
                    <!--//logo-->
                </div>
                <div class="banner-inner second">
                    <h2 class="sec-head">SELAMAT DATANG !</h2>

                </div>
            </div>
        </div>
        <div class="header-bottom">
            <div class="fixed-header">
                <div class="menu">Menu</div>
                <span class="menu"> </span>
                <div class="top-menu">
                    <nav>
                        <ul class="cl-effect-16">
                            <li><a class="active" href="CS.jsp" data-hover="HOME">HOME</a></li> 
                            <li><a href="DaftarPemesanan.jsp" data-hover="Daftar Pemesanan">Daftar Pemesanan</a></li>
                            <li><a href="UbahStatus.jsp" data-hover="Update Status Member">Update Status Member</a></li>							
                            <li><a href="TambahMember.jsp" data-hover="Tambah Member">Tambah Member</a></li>							
                            <li><a href="TambahSaldo.jsp" data-hover="Tambah Saldo">Tambah Saldo</a></li>
                            <li><a href="FilterLogout" data-hover="Logout">Logout</a></li>
                        </ul>

                    </nav>		
                </div>
                <div class="clearfix"></div>
                <!-- script for menu -->
                <script>
                    $("span.menu").click(function() {
                        $(".top-menu").slideToggle("slow", function() {
                            // Animation complete.
                        });
                    });
                </script>
                <!-- script for menu -->
                <script>
                    $(document).ready(function() {
                        var navoffeset = $(".header-bottom").offset().top;
                        $(window).scroll(function() {
                            var scrollpos = $(window).scrollTop();
                            if (scrollpos >= navoffeset) {
                                $(".header-bottom").addClass("fixed");
                            } else {
                                $(".header-bottom").removeClass("fixed");
                            }
                        });

                    });
                </script>
            </div>
        </div>
        <!--/products-->
        <div class="products">
            <div class="container">
                <h3 class="tittle">Kami Melayani</h3>
                <div class="tip-main">

                    <div class="hair-section">
                        <div class="container">
                            <div class="grid">
                                <div class="col-md-4 h-f">
                                    <figure class="effect-jazz">
                                        <img src="images/potong.jpg" alt="img25" style="width:300px;height:350px;"/>
                                        <figcaption>
                                            <h4>Potong <span>Rambut</span></h4>

                                        </figcaption>			
                                    </figure>
                                    <div class="hf-text"><h5>Potong Rambut</h5><p></p></div>
                                </div>
                                <div class="col-md-4 h-f">
                                    <figure class="effect-jazz">
                                        <img src="images/keramas.jpg" alt="img25" style="width:300px;height:350px;"/>
                                        <figcaption>
                                            <h4>Cuci<span>Blow</span></h4>

                                        </figcaption>			
                                    </figure>
                                    <div class="hf-text"><h5>Cuci Blow</h5><p></p></div>
                                </div>
                                <div class="col-md-4 h-f">
                                    <figure class="effect-jazz">
                                        <img src="images/hairmask.jpg" alt="img25" style="width:300px;height:350px;"/>
                                        <figcaption>
                                            <h4>Hair <span>Mask</span></h4>

                                        </figcaption>			
                                    </figure>
                                    <div class="hf-text"><h5>Hair Mask</h5><p></p></div>
                                </div>
                                <div class="col-md-4 h-f one">
                                    <figure class="effect-jazz">
                                        <img src="images/creambath.jpg" alt="img25" style="width:300px;height:350px;"/>
                                        <figcaption>
                                            <h4>Cream <span>bath</span></h4>

                                        </figcaption>			
                                    </figure>
                                    <div class="hf-text"><h5>Creambath</h5><p></p></div>
                                </div>
                                <div class="col-md-4 h-f">
                                    <figure class="effect-jazz">
                                        <img src="images/keriting.jpg" alt="img25" style="width:300px;height:350px;" />
                                        <figcaption>
                                            <h4>Keri<span>ting</span></h4>

                                        </figcaption>			
                                    </figure>
                                    <div class="hf-text"><h5>Keriting</h5><p></p></div>
                                </div>
                                <div class="col-md-4 h-f one">
                                    <figure class="effect-jazz">
                                        <img src="images/rebonding.jpg" alt="img25" style="width:300px;height:350px;" />

                                        <figcaption>
                                            <h4>Rebon<span>ding</span></h4>

                                        </figcaption>			
                                    </figure>
                                    <div class="hf-text"><h5>Rebonding</h5><p></p></div>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>

                        <div class="clearfix"> </div>


                        <div class="copy">
                            <p><font color = "black">&copy; 2015 Parama Salon. All Rights Reserved </font> </p>
                        </div>
                    </div>
                </div>
            </div>
            <!--start-smooth-scrolling-->
            <script type="text/javascript">
                $(document).ready(function() {
                    /*
                     var defaults = {
                     containerID: 'toTop', // fading element id
                     containerHoverID: 'toTopHover', // fading element hover id
                     scrollSpeed: 1200,
                     easingType: 'linear' 
                     };
                     */

                    $().UItoTop({easingType: 'easeOutQuart'});

                });
            </script>
            <!--end-smooth-scrolling-->
            <a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
        </div>
    </body>
</html>
