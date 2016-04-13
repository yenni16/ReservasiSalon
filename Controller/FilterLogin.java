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

public class FilterLogin extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String user = request.getParameter("user");
        String pass = request.getParameter("pass");

        Connection con = connection.Koneksi.open();
        Statement stat = con.createStatement();
        String in = "select * from MEMBER where PASSWORD ='"+ pass +"'";
        ResultSet rs=stat.executeQuery(in);
        String a=null;
        String b=null;
        while(rs.next()){
            a = rs.getString("USERNAME");
            b = rs.getString("PASSWORD");
        }
        if((a != null) && (b != null)){
            
            RequestDispatcher req = request.getRequestDispatcher("Member.jsp");
            req.forward(request, response);
        }else if((a == null) && (b == null)){
            RequestDispatcher req = request.getRequestDispatcher("error_signin.jsp");
            req.forward(request, response);
        }else if((a != null) && (b == null)){
            RequestDispatcher req = request.getRequestDispatcher("error_signin.jsp");
            req.forward(request, response);
    }else if((a == null) && (b != null)){
            RequestDispatcher req = request.getRequestDispatcher("error_signin.jsp");
            req.forward(request, response);
    }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            try {
                processRequest(request, response);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FilterLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FilterLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            try {
                processRequest(request, response);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FilterLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FilterLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
