<%-- 
    Document   : Member
    Created on : Apr 2, 2016, 3:47:52 PM
    Author     : Marcellina Fanny 
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<html>
    <head>
        <title>Halaman Member</title>
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
                            <li><a href ="FilterLogout" data-hover="Logout">Logout</a></li>

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

        <div class="banner">
            <div class="login">
                <center>   
                    <!-- session buat nampilin saldo (Yenni) -->
                    <%

                        String s = (String) session.getAttribute("username");
                     
                       

                    %>
                    <h1 style = "color: black;">Saldo = <%=session.getAttribute("saldo") %> </h1></center></div>
            <div class="container">
                <div class="banner-top">

                    <h1>Silahkan Reservasi Online </h1>
                    <div class="banner-bottom">
                        <form action="./Reservasi">

                            <div class="bnr-one">
                                <div class="bnr-left">
                                    <p>Pilih Tanggal</p>
                                </div>
                                <div class="bnr-right">
                                    <input class="date" name="tgl" id="datepicker" type="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {
                                        this.value = '';
                                    }" required=>
                                </div>
                                <div class="clearfix"></div>
                            </div>

                            <div class="bnr-one">
                                <div class="bnr-left">
                                    <p>Jam Pelayanan</p>
                                </div>
                                <div class="bnr-right">
                                    <input type="text" name="jam" placeholder="Jam Treatment" required=" ">
                                </div>
                                <div class="clearfix"></div>
                            </div>

                            <div class="bnr-one">
                                <div class="bnr-left">
                                    <p>Username Member</p>
                                </div>
                                <div class="bnr-right">
                                    <input type="text" name="user" placeholder="Username member" required=" " value="<%=s%>">
                                </div>
                                <div class="clearfix"></div>
                            </div>


                            <div class="bnr-one">
                                <div class="bnr-left">
                                    <p>Pelayanan</p>
                                </div>
                                <div class="bnr-right">
                                    <select name="jenis">
                                        <option  class="rm" value="volvo">Pilih</option>
                                        <option  class="rm" value="Rias Pengantin">Rias Pengantin</option>
                                        <option  class="rm" value="Rias Wisuda">Rias Wisuda</option>
                                        <option  class="rm" value="Rias Pengantin">Rias Pengantin</option>
                                        <option  class="rm" value="Potong Rambut">Potong Rambut</option>
                                        <option  class="rm" value="Creambath">Creambath</option>
                                        <option  class="rm" value="Cuci Blow">Cuci Blow</option>
                                        <option  class="rm" value="Hair Mask">Hair Mask</option>
                                        <option  class="rm" value="Rebonding">Rebonding</option>
                                        <option  class="rm" value="Toning">Toning</option>
                                        <option  class="rm" value="Colouring">Colouring</option>
                                        <option  class="rm" value="Bleaching">Bleaching</option>
                                    </select>
                                </div>
                                <div class="clearfix"></div>
                            </div>



                            <div class="bnr-btn">
                                <input type="submit" value="Simpan">
                            </div>
                        </form>

                    </div>
                </div>
            </div>
        </div>
        <!--end-banner-->
        <!---start-date-piker---->
        <link rel="stylesheet" href="css/jquery-ui.css" />
        <script src="js/jquery-ui.js"></script>
        <script>
        $(function() {
            $("#datepicker,#datepicker1").datepicker();
        });
        </script>
        <!---/End-date-piker---->
    </body>
</html>
