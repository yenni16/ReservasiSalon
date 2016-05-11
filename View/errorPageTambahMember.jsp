<%-- 
    Document   : errorPage
    Created on : May 5, 2016, 12:42:11 PM
    Author     : Marcellina Fanny 
--%>

<html>
    <head>
        <title>Halaman Error</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Paix Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/styleReservasi.css" rel='stylesheet' type='text/css' />

        <link href="css/style.css" rel='stylesheet' type='text/css' />	
        	
        <script src="js/jquery.min.js"></script>
        <!---- start-smoth-scrolling---->
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function($) {
                $(".scroll").click(function(event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        <!--start-smoth-scrolling-->
    </head>
    <body>
        <!--start-header-->
        <!--start-home-->
        <div class="banner three" id="home">
            <div class="container">
                <div class="head-top">
                    <!--logo-->
                    <div class="logo">
                        <h1>Salon Parama</h1>
                    </div>
                    <div class="phone"><i class="glyphicon glyphicon-phone"></i><p> 7758 2068 892</p>
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
                            <li><a class="active" href="TambahMember.jsp" data-hover="Tambah Member">Tambah Member</a></li>							
                            <li><a href="TambahSaldo.jsp" data-hover="Tambah Saldo">Tambah Saldo</a></li>
                              <li><a href="HalamanUtama.jsp" data-hover="Logout">Logout</a></li>
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
    <!--start-banner-->
    <div>
            <center>               
                <br>
                <br>
                <h1 style = "color: black;">Tambah member gagal. Harap cek kembali.</h1>
                <br>
                <a href= "TambahMember.jsp">kembali</a>
                </center></div>
    <!--end-banner-->
</body>
</html>