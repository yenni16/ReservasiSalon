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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author YENNI
 */
public class FilterAddCS extends HttpServlet {

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
        

        String username = request.getParameter("username");
        String pass = request.getParameter("pw");
        String nama = request.getParameter("nama");
        CS cs = new CS();
        cs.setUsername(username);
cs.setPassword(pass);
cs.setNamaCS(nama);
        if (cs.getUsername() == null) {
            RequestDispatcher rd = request.getRequestDispatcher("TambahMember.jsp");
            rd.forward(request, response);
        } else if (cs.getPassword() == null || cs.getNamaCS()== null ) {
            RequestDispatcher rd = request.getRequestDispatcher("TambahMember.jsp");
            rd.forward(request, response);
        } else {
//         INSERT DATA CS
 CS c = new CS();
c.setUsername(username);
c.setPassword(pass);
c.setNamaCS(nama);


            Connection con = connection.Koneksi.open();
            Statement stat = con.createStatement();
            String query2 = "insert into CS(USERNAME,PASSWORD,NAMACS) values"
                    + "('" +c.getUsername() + "','" + c.getPassword() + "','" + c.getNamaCS()
                    + "')";
            stat.executeUpdate(query2);
            out.println("<html><head></head><body><h2>Data CS berhasil ditambahkan....</h2><a href='CS.jsp'>Kembali</a></body></html>");

            con.close();
    }}

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
            Logger.getLogger(FilterAddCS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FilterAddCS.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(FilterAddCS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FilterAddCS.class.getName()).log(Level.SEVERE, null, ex);
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
