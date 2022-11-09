package Admin;

import DB.Db_Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String sname = request.getParameter("email"),
                password = request.getParameter("pswd");
        try {

            PrintWriter out = response.getWriter();

            out.println("<!DOCTYPE html>\n"
                    + "<html lang='en'>\n"
                    + "<head>\n"
                    + "    <meta charset='UTF-8'>\n"
                    + "    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n"
                    + "    <title>Document</title>\n"
                    + "    <style>\n"
                    + "        .box{\n"
                    + "            background-color:black;\n"
                    + "            width: 400px;\n"
                    + "            height: 450px;\n"
                    + "            border-radius: 5px;\n"
                    + "            margin-top: 100px;\n"
                    + "            box-shadow: 12px 12px yellow  ;\n"
                    + "         }\n"
                    + "         #login{\n"
                    + "             color:yellow;\n"
                    + "             padding-top: 20px;\n"
                    + "             \n"
                    + "         }\n"
                    + "         .table{\n"
                    + "             width: 300px;\n"
                    + "             height: 180px;\n"
                    + "            color: white;\n"
                    + "            padding: 30px;\n"
                    + "            font-size: 25px;\n"
                    + "            padding: 10px;\n"
                    + "            border: white;\n"
                    + "                     }\n"
                    + "                     #button{\n"
                    + "                         width: 300px;\n"
                    + "                         height:50px ;\n"
                    + "                         background: yellow ;\n"
                    + "                         border-radius: 13px;\n"
                    + "                         font-size: 33px;\n"
                    + "                          }\n"
                    + "                          #td input\n"
                    + "                          {\n"
                    + "                         width: 300px;\n"
                    + "                         height:43px ;\n"
                    + "                         background: white;\n"
                    + "                         border-radius: 13px;\n"
                    + "                         font-size: 33px;\n"
                    + "\n"
                    + "                          }\n"
                    + "                        #td select\n"
                    + "                        {\n"
                    + "                         width: 305px;\n"
                    + "                         height:43px ;\n"
                    + "                         background: white;\n"
                    + "                         border-radius: 13px;\n"
                    + "                         font-size: 33px; \n"
                    + "                        }\n"
                    + "                        \n"
                    + "    </style>\n"
                    + "</head> \n"
                    + "<body bgcolor='	#383838'>\n"
                    + "    \n"
                    + "   <center><div class='box'><h1 id='login'> Admin Login </h1><hr>\n"
                    + "<form action='AdminLogin' method='post'\n"
                    + "    <table class='table' id='td'>\n");

            out.println("<tr><td><input type='text' name='email' placeholder='Email'></td></tr>\n"
                    + "<tr><td><input type='password' name='pswd' placeholder='Password'></td></tr>\n"
                    + "</table>\n"
                    + " <input type='submit' name='login' value='Login' id='button'>\n"
                    + "    <hr>\n"
                    + "    <label style='color: white; margin-right: 120px; font-size: 17px;'>\n"
                    + "        <input type='checkbox' checked='checked' name='remember'> Remember me  </label> \n"
                    + "        <label style='color: white; font-size: 17px;'>Forget Password?\n"
                    + "      </label>\n"
                    + "    Forget Password?\n"
                    + "   \n"
                    + "</form>\n"
                    + "</div></center> </body>\n"
                    + "</html>");
            if (sname != null
                    || password != null) {
                Db_Connection db = new Db_Connection();
                String Query = "select email, password from login where email=? and password=? and usertype='Admin'";
                db.Pstmt = db.Con.prepareStatement(Query);
                db.Pstmt.setString(1, sname);
                db.Pstmt.setString(2, password);
                db.Rst = db.Pstmt.executeQuery();
                if (db.Rst.isBeforeFirst()) {
                    session.setAttribute("Admin", sname);
                    session.setMaxInactiveInterval(5 * 60);
                    response.sendRedirect("AdminHome");
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
