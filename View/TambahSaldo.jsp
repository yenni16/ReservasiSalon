<%-- 
    Document   : TambahSaldo
    Created on : Apr 2, 2016, 9:26:50 PM
    Author     : Marcellina Fanny 
--%>
<html>
    <head>
        <title> Halaman Customer Service </title>     
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
        <div class="banner three" id="home">
            <div class="container">
                <div class="head-top">
                    <!--logo-->
                    <div class="logo">
                        <h1>Salon Parama</h1>
                    </div>
                    <div class="phone"><i class="glyphicon glyphicon-phone"></i><p>081804005541</p>
                        <h5>Hubungi kami</h5>
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
                            <li><a href="CS.jsp" data-hover="HOME">HOME</a></li> 
                            <li><a href="DaftarPemesanan.jsp" data-hover="Daftar Pemesanan">Daftar Pemesanan</a></li>
                            <li><a  href="UbahStatus.jsp" data-hover="Update Status Member">Update Status Member</a></li>							
                            <li><a   href="TambahMember.jsp" data-hover="Tambah Member">Tambah Member</a></li>							
                            <li><a class="active" href="TambahSaldo.jsp" data-hover="Tambah Saldo">Tambah Saldo</a></li>
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
    <head>
        <meta charset="UTF-8">

        <link rel="stylesheet" href="css/login.css">    
        <link rel="stylesheet" href="css/style register.css"> 

    </head>


    <body>
        
<!-- main -->
    <div class="main">
        <div class="login-head">
             </div>
        <div  class="wrap">
            <div class="Regisration">
                <div class="Regisration-head">
                    <h2><span></span>Tambah Saldo</h2>
                </div>
                                        <form action="./TambahSaldo">
                                                <input type="text" name="username" value="Username" onfocus="" onblur="" >
                                                <input type="text" name="saldo" value="Saldo" onfocus="" onblur="" >
						<input type="submit" value="Simpan">
					</form>
					
				</div>
			</div>
    </body>
</html>
