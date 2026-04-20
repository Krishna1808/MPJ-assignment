package com.reg;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name  = req.getParameter("name");
        String email = req.getParameter("email");
        String pass  = req.getParameter("password");

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO users(name, email, password) VALUES(?,?,?)"
            );
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, pass);
            ps.executeUpdate();
            con.close();

            req.setAttribute("name", name);
            req.getRequestDispatcher("success.jsp").forward(req, res);

        } catch (Exception e) {
            res.getWriter().println("Error: " + e.getMessage());
        }
    }
}
