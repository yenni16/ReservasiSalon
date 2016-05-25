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
public class TambahSaldo extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        ResultSet re;

        String user = request.getParameter("username");
        String saldom = request.getParameter("saldo");
        Member m = new Member();

        if (user == null || saldom == null) {
            RequestDispatcher rd = request.getRequestDispatcher("errorPageTambahSaldo.jsp");
            rd.forward(request, response);

        } else {
            Connection con = connection.Koneksi.open();
            Statement stat = con.createStatement();
            String query1 = "select saldo from member where username='" + user + "'";
            re = stat.executeQuery(query1);
            int saldoAwal = 0;
            while(re.next()) {
                saldoAwal = Integer.parseInt(re.getString("saldo"));
            }

            int saldo2 = Integer.parseInt(saldom);
            saldo2 = saldo2 + saldoAwal;


            System.out.println(saldo2);

            m.setSaldo_member(saldo2);
            String query3 = "update member set saldo=" + m.getSaldo_member() + " where username='" + user + "'";
            stat.executeUpdate(query3);
    RequestDispatcher rd = request.getRequestDispatcher("BerhasilTambahSaldo.jsp");
            rd.forward(request, response);

 out.close();
            stat.close();
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
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TambahSaldo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TambahSaldo.class.getName()).log(Level.SEVERE, null, ex);
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
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TambahSaldo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TambahSaldo.class.getName()).log(Level.SEVERE, null, ex);
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
