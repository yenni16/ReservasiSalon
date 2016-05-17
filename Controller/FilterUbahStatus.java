    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author YENNI
 */
public class FilterUbahStatus extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ResultSet re;

        String username = request.getParameter("username");
        String tgl = request.getParameter("tgl");
        String status = request.getParameter("status");
        String saldo = request.getParameter("saldo");
                Member mem = new Member();
        datapesanan d = new datapesanan();

         Connection cont = connection.Koneksi.open();
        Statement stt = cont.createStatement();
        
       String query1 = "select saldo from member where username='" + username + "'";
            re = stt.executeQuery(query1);
            int c = 0;
            while(re.next()) {
//                 saldoAwal = Integer.parseInt(re.getString("saldo"));
                c = Integer.parseInt(re.getString("saldo"));
            }

            
//            int query2 = Integer.parseInt(re.getString("saldo"));

            c=c+5000;

            System.out.println(c);
//            System.out.println(saldo2+" ditambah "+query2);
            mem.setSaldo_member(c);
            String query2 = "update member set saldo=" + mem.getSaldo_member() + " where username='" + username + "'";
            stt.executeUpdate(query2);
            
        if (username == null || status == null) {
            RequestDispatcher rd = request.getRequestDispatcher("UbahStatus.jsp");
            rd.forward(request, response);

        } else {
            Connection con = connection.Koneksi.open();
            Statement stat = con.createStatement();
           // String query1 = "select STATUS from DATAPESANAN where USERNAMEM='" + username + "'";
           // re = stat.executeQuery(query1);
           
          //  System.out.println(status);
//            System.out.println(saldo2+" ditambah "+query2);
            d.setStatus(status);
            String query3 = "UPDATE DATAPESANAN SET STATUS='" + d.getStatus()+ "' where usernamem='" + username + "' AND tanggaltreatment='"+tgl+"'";
            stat.executeUpdate(query3);
            
          //  mem.setSaldo_member(Integer.parseInt(saldo));
            //String query4 = "update member set saldo=saldo-10000 where  ;
            
            out.println("<html><head></head><body><h2><center>STATUS BERHASIL DIUBAH</center></h2><a href='CS.jsp'>Kembali</a></body></html>");
            con.close();
            
            
//             Connection conn = connection.Koneksi.open();
//            Statement state = con.createStatement();
//            
//            mem.setSaldo_member(Integer.parseInt(saldo));
//            String query4="update member set saldo"
//            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            try {
                processRequest(request, response);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FilterAddSaldo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FilterAddSaldo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            try {
                processRequest(request, response);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FilterAddSaldo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FilterAddSaldo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}