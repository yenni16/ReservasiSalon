<%-- 
    Document   : LanjutReserv
    Created on : May 17, 2016, 9:17:12 AM
    Author     : Prasetya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
      <style type="text/css">
body{
background: url('images/wallpaper.jpg') no-repeat scroll;
background-size: 100% 100%;
min-height: 800px;
}
</style>
   
   <br>
   
    <center>
        <%

                        String s = (String) session.getAttribute("Username");
                     
                       

                    %>
                    
        <form action="LanjutRes">
                            <div class="bnr-one">
                                <div class="bnr-left">
                                    <p>Username Member</p>
                                </div>
                                <div class="bnr-right">
                                    <input type="text" name="user" placeholder="Username member" required=" " value="<%=s%>">
                                </div>
                                <div class="clearfix"></div>
                            </div>

        <h1><p><font color="white">ANDA BERHASIL RESERVASI</font></p></h1>
    <h1><p><font color="white">KLIK LANJUT UNTUK KONFIRMASI</font></p></h1>
    
    <div class="bnr-btn">
                                <input type="submit" value="Lanjut">
                            </div>
    </form>
     </center>
        
      </head>
</html>
