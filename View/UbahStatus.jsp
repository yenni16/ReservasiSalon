<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Reservasi</title>     
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
        <style>
            table, th, td {
                border: 1px solid black;
                border-collapse: collapse;
            }
            th, td {
                padding: 4px;
            }
        </style>
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
                    <h2 class="sec-head">Welcome</h2>
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

        <div class="products">
            <div class="container">
                <h3 class="tittle">Reservasi Salon</h3>
                <div class="tip-main">
                    <div class="col-md-6 top-grid">					 							
                        <div class="clearfix"> </div>
                    </div>
<head>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
 
  <script>
  $(document).ready(function() {
    $("#datepicker").datepicker();
  });
  </script>
</head>

<body>
    <center>                                
        
  <form action="">
      <h2> Pilih Tanggal </h2>
      
    <input id="datepicker" />

      
        <tr>
        <h2>
        </h2>
        
       
        <h2>Username</h2> 
        <h2>
        </h2>
        <td><input type="text" name="status" value="" placeholder="Username"></td></tr>  
          <h2>
        </h2>
  <input type="radio" name="sudahdilayani" value="Ubah"> Sudah dilayani<br>
  <h2>
  </h2>
    <p class="submit"><input type="submit" name="commit" value="OK"></p>
  </form>
      
</center>
 </body>
</html>
