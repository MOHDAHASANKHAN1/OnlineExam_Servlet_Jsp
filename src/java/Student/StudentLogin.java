package Student;

import DB.Db_Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class StudentLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String sname = request.getParameter("email"),
                password = request.getParameter("pswd");
        PrintWriter out = response.getWriter();
        try {
            if (sname != null
                    || password != null) {
                Db_Connection db = new Db_Connection();
                String Query = "select email, password from login where email=? and password=? and usertype='Student'";
                db.Pstmt = db.Con.prepareStatement(Query);
                db.Pstmt.setString(1, sname);
                db.Pstmt.setString(2, password);
                db.Rst = db.Pstmt.executeQuery();
                if (db.Rst.isBeforeFirst()) {
                    HttpSession session = request.getSession();
                    session.setAttribute("Student", sname);
                    session.setMaxInactiveInterval(5 * 60);
                    response.sendRedirect("Student");
                } else {
                    response.sendRedirect("index.html?msg=Invalid UserName Or Password");
                }
            }
        } catch (IOException | SQLException e) {
            System.out.println(e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
