/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Prasetya
 */
public class Reserv extends HttpServlet {

 
     

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
        
        String tgl = request.getParameter("tgl");
        String jam = request.getParameter("jam");
        String user = request.getParameter("user");
        String jenis = request.getParameter("jenis");       
        String status = request.getParameter("status");
        String saldo = request.getParameter("saldo");
       
       // try {
        
        Connection con = connection.Koneksi.open();
           Statement st=con.createStatement();
          //String query = "SELECT * FROM DATAPESANAN";
            String query = "SELECT COUNT(tanggalTreatment) as jml from datapesanan where tanggalTreatment ='"+tgl+"'";
            System.out.println(query);
           ResultSet rs = st.executeQuery(query);
           
           
           
           //System.out.println("kkll");
           int a =0;
        while(rs.next()){
          //  a= rs.getString(1);
        a = rs.getInt("jml");
        
        
        }
        rs.close();
        st.close();
         con.close();   
         
//        Connection conne = connection.Koneksi.open();
//           Statement stat=con.createStatement();
//          //String query = "SELECT * FROM DATAPESANAN";
//            String query2 = "SELECT saldo from member where username ='"+user+"'";
//            System.out.println(query2);
//           ResultSet result = stat.executeQuery(query2);
//           int b =0;
//           while(result.next()){
//               b=Integer.parseInt(result.getString("saldo"));
//           }
//           b=b-15000;
//       // System.out.println(a);
//           result.close();
//           stat.close();
//           conne.close();
//           
        datapesanan dp = new datapesanan();
        dp.setTgl_treatment(tgl);
        dp.setJam_treatment(jam);
        dp.setUsername(user);        
        dp.setJns_treatment(jenis);
      // dp.setStatus(status);
//        Member mem = new Member();
//        mem.setSaldo_member(Integer.parseInt(saldo));
//        
           
       if(a<11){
          Connection conn = connection.Koneksi.open();
           Statement stt=conn.createStatement();
          
//           String query4="update member set saldo="+mem.getSaldo_member()+"where username='"+user+"'";
//           stt.executeUpdate(query4);
          String query3= "INSERT INTO DATAPESANAN(TANGGALTREATMENT, JAM_TREATMENT,USERNAMEM,NAMATREATMENT) VALUES"
                  + " ('"+dp.getTgl_treatment()+"','"+dp.getJam_treatment()+"','"+dp.getUsername()+"','"+dp.getJns_treatment()+"')";
//           +"('"+dp.getTgl_treatment()+"','"+dp.getJam_treatment()+"','"+dp.getUsername()+"','"+dp.getJns_treatment()+",booked')'";
          stt.executeUpdate(query3);
//         
           ///response.sendRedirect("Member.jsp");
          response.sendRedirect("LanjutReserv.jsp");
        out.close();
           stt.close();
           conn.close();
               
       }
       else if (a>10){
          RequestDispatcher rd= request.getRequestDispatcher("Member.jsp");
           rd.forward(request, response);
       
       
       }
           
       
        
       
       else{
            
          RequestDispatcher rd= request.getRequestDispatcher("Member.jsp");
           rd.forward(request, response);
                 
            
        }
       
       // }catch (SQLException ex) {
         //   Logger.getLogger(FilterLogin.class.getName()).log(Level.SEVERE, null, ex);
        //}
        
        
       
        
        
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
            Logger.getLogger(Reserv.class.getName()).log(Level.SEVERE, null, ex);
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
