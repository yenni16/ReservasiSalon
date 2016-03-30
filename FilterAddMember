/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author YENNI
 */
public class FilterAddMember extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
               response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String nama = request.getParameter("nama");
        String alamat = request.getParameter("alamat");
        String username = request.getParameter("username");
        String pass = request.getParameter("pass");
        String id = request.getParameter("id");
        String nohp = request.getParameter("nohp");
        String ttl = request.getParameter("ttl");
        String saldo = request.getParameter("saldo");

Member m= new Member();
        if (m.getNama_member() == null) {
            RequestDispatcher rd = request.getRequestDispatcher("");
            rd.forward(request, response);
            if (m.getAlamat_member() == null) {
                RequestDispatcher r = request.getRequestDispatcher("");
                r.forward(request, response);
                if (m.getUsernameM()== null) {
                    RequestDispatcher d = request.getRequestDispatcher("");
                    d.forward(request, response);
                    if ((pass == null) || (id == null) || (nohp == null) || (ttl == null) || (saldo == null)) {
                        RequestDispatcher drr = request.getRequestDispatcher("");
                        drr.forward(request, response);
                    }
                }
            }
        } else {
//         INSERT DATA MEMBER
        Cookie ck1 = new Cookie("data1", username);
        Member mem = new Member();
      mem.setNama_member(nama);
      mem.setAlamat_member(alamat);
      mem.setUsernameM(username);
      mem.setPasswordM(pass);
      mem.setId_member(Integer.parseInt(id));
      mem.setNohp_member(Integer.parseInt(nohp));
      mem.setTgllahir_member(ttl);
      mem.setSaldo_member(Integer.parseInt(saldo));
        Connection con = connection.Koneksi.open();
            Statement stat = con.createStatement();
            String query2 =  "insert into MEMBER(NAMA_MEMBER,ALAMAT,USERNAME,PASSWORD,ID_MEMBER,NO_HP,TTL,SALDO) values"
                    + "('" + mem.getNama_member() + "','" + mem.getAlamat_member() + "','" + mem.getUsernameM() + "','" + mem.getPasswordM() + "','" 
                    + mem.getId_member()+ "','" + mem.getNohp_member() + "','" + mem.getTgllahir_member() + "','" + mem.getSaldo_member() + "')";
            stat.executeUpdate(query2);
            con.close();

            RequestDispatcher rd = request.getRequestDispatcher("");
            rd.forward(request, response);
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
        } catch (SQLException ex) {
            Logger.getLogger(FilterAddMember.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (SQLException ex) {
            Logger.getLogger(FilterAddMember.class.getName()).log(Level.SEVERE, null, ex);
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
