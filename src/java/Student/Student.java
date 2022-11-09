package Student;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Student extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession();
            if (session.getAttribute("Student") == null) {
                response.sendRedirect("index.html");
            }
            out.println("<!DOCTYPE html>\n"
                    + "<html lang='en'>\n"
                    + "<head>\n"
                    + "    <meta charset='UTF-8'>\n"
                    + "    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n"
                    + "    <title>Document</title>\n"
                    + "    <style>\n"
                    + "        /* CSS RESET  */\n"
                    + "        body{\n"
                    + "            margin: 0px;\n"
                    + "            padding: 0px;\n"
                    + "            background: url(Images/Student7.jpg);\n"
                    + "            background-repeat:no-repeat ;\n"
                    + "           background-size: 1550px 800px;\n"
                    + "           \n"
                    + "             \n"
                    + "           \n"
                    + "        }\n"
                    + "        .navbar\n"
                    + "        {\n"
                    + "         display: inline-block;\n"
                    + "         border: 3px solid white;\n"
                    + "        margin-left: 2%;\n"
                    + "         margin-top: 25px;\n"
                    + "         border-radius: 5px;\n"
                    + "         /* position: fixed; */\n"
                    + "        }\n"
                    + "        .navbar li{\n"
                    + "            display: inline-block;\n"
                    + "        }\n"
                    + "        .navbar li a{\n"
                    + "            color: white;\n"
                    + "            font-size: 23px;\n"
                    + "            padding:  60px;\n"
                    + "            text-decoration: none; \n"
                    + "        }\n"
                    + "        .navbar li a:hover{\n"
                    + "           \n"
                    + "            color: grey;\n"
                    + "            font-size: 23px;\n"
                    + "            padding:  60px;\n"
                    + "            text-decoration: none; \n"
                    + "        }\n"
                    + "\n"
                    + "    \n"
                    + "    </style>\n"
                    + "</head>\n"
                    + "<body>\n"
                    + "    <header>\n"
                    + "        <div class='navbar'>\n"
                    + "        <ul>\n"
                    + "        <li><a href=' '> Profile</a> </li>\n"
                    + "        <li><a href=''>Exam</a></li>\n"
                    + "        <li><a href=''>Result</a></li>\n"
                    + "        <li> <a href=''>Feedback</a></li>\n"
                    + "        <li><a href=''>Update Profile</a></li>\n"
                    + "        <li><a href=''>Feedback</a></li>\n"
                    + "        <li><a href=Logout>Logout</a></li>\n"
                    + "        </ul>\n"
                    + "    </div><hr>\n"
                    + "    </header>\n"
                    + "    \n"
                    + "</body>\n"
                    + "</html>");
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
