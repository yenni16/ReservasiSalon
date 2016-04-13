/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class FilterAddSaldo extends HttpServlet {

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
        String saldo = request.getParameter("saldo");
        Member m = new Member();

        if (username == null || saldo == null) {
            RequestDispatcher rd = request.getRequestDispatcher("TambahSaldo.jsp");
            rd.forward(request, response);

        } else {
            Connection con = connection.Koneksi.open();
            Statement stat = con.createStatement();
            String query1 = "select saldo from member where username='" + username + "'";
            re = stat.executeQuery(query1);
            int saldoAwal = 0;
            while(re.next()) {
//                 saldoAwal = Integer.parseInt(re.getString("saldo"));
                saldoAwal = Integer.parseInt(re.getString("saldo"));
            }

            int saldo2 = Integer.parseInt(saldo);
//            int query2 = Integer.parseInt(re.getString("saldo"));

            saldo2 = saldo2 + saldoAwal;

            System.out.println(saldo2);
//            System.out.println(saldo2+" ditambah "+query2);
            m.setSaldo_member(saldo2);
            String query3 = "update member set saldo=" + m.getSaldo_member() + " where username='" + username + "'";
            stat.executeUpdate(query3);
            out.println("<html><head></head><body><h2>Saldo berhasil ditambahkan....</h2><a href='CS.jsp'>Kembali</a></body></html>");

            con.close();
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
