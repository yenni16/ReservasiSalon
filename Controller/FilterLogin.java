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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import javax.servlet.http TxtUsername;

@WebServlet(name = "FilterLogin", urlPatterns = {"/FilterLogin"})
public class FilterLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String user = request.getParameter("Username");
        String pass = request.getParameter("Password");

        try {
            String in = "select * from MEMBER where USERNAME ='" + user + "' and  PASSWORD ='" + pass + "'";

            Connection con = connection.Koneksi.open();
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery(in);


            if (rs.next()) {
                request.getSession(true).setAttribute("Username", rs.getString("username"));
                if (rs.getString("ROLE").equals("MEMBER")) {
                    response.sendRedirect("Member.jsp");
                } else if (rs.getString("ROLE").equals("CS")) {
                    response.sendRedirect("CS.jsp");
                }
            } else if (user.equals("owner") && pass.equals("ownerimut")) {
                response.sendRedirect("Owner.jsp");
            } else {
                response.sendRedirect("error_signin.jsp");
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
