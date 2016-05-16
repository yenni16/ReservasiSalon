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
import javax.servlet.jsp.JspException;

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
            throws ServletException, IOException, SQLException, ClassNotFoundException, JspException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
try{
        String nama = request.getParameter("nama");
        String alamat = request.getParameter("alamat");
        String username = request.getParameter("username");
        String nohp = request.getParameter("nohp");
        String pass = request.getParameter("pw");
        String ttl = request.getParameter("ttl");
        String saldo = request.getParameter("saldo");
        String status = request.getParameter("Role");

        Member m = new Member();
        m.setNama_member(nama);
        m.setTgllahir_member(ttl);
        if (m.getNama_member() == null) {
            RequestDispatcher rd = request.getRequestDispatcher("TambahMember.jsp");
            rd.forward(request, response);
        } else if (m.getTgllahir_member() == null) {
            RequestDispatcher rd = request.getRequestDispatcher("TambahMember.jsp");
            rd.forward(request, response);
        } else {
//         INSERT DATA MEMBER

            Member mem = new Member();
            mem.setNama_member(nama);
            mem.setAlamat_member(alamat);
            mem.setUsernameM(username);
            mem.setNohp_member(nohp);
            mem.setPasswordM(pass);

            mem.setTgllahir_member(ttl);
            mem.setSaldo_member(Integer.parseInt(saldo));
mem.setRole(status);

            Connection con = connection.Koneksi.open();
            Statement stat = con.createStatement();
            String query2 = "insert into MEMBER(NAMA_MEMBER,ALAMAT,USERNAME,NO_HP,PASSWORD,TTL,SALDO,ROLE) values"
                    + "('" + mem.getNama_member() + "','" + mem.getAlamat_member() + "','" + mem.getUsernameM()
                    + "','" + mem.getNohp_member() + "','" + mem.getPasswordM() + "','" + mem.getTgllahir_member()
                    + "','" + mem.getSaldo_member() +"','"+mem.getRole()+ "')";
            stat.executeUpdate(query2);
            out.println("<html><head></head><body><h2>Data berhasil ditambahkan....</h2><a href='CS.jsp'>Kembali</a></body></html>");

            con.close();
        }
//            RequestDispatcher rd = request.getRequestDispatcher("CS.jsp");
            //          rd.forward(request, response);
        }
catch (java.io.IOException ex) 
        {
            throw new JspException("Error in NewTagHandler tag", ex);
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
                try {
                    processRequest(request, response);
                } catch (JspException ex) {
                    Logger.getLogger(FilterAddMember.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FilterAddMember.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            try {
                try {
                    processRequest(request, response);
                } catch (JspException ex) {
                    Logger.getLogger(FilterAddMember.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FilterAddMember.class.getName()).log(Level.SEVERE, null, ex);
            }
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
