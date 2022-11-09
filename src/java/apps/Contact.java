package apps;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Contact extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>\n"
                    + "<html lang='en'>\n"
                    + "<head>\n"
                    + "    <meta charset='UTF-8'>\n"
                    + "    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n"
                    + "    <title>Document</title>\n"
                    + "    <style>\n"
                    + "         body {\n"
                    + "            margin: 0px;\n"
                    + "            padding: 0px;\n"
                    + "            background: url(Images/Student7.jpg);\n"
                    + "            background-repeat: no-repeat;\n"
                    + "            background-size: 1550px 800px;\n"
                    + "            color: white;\n"
                    + "            font-family: 'Baloo Bhaina 2', cursive;\n"
                    + "            background-color: rgba(0, 0, 0, 0.329);\n"
                    + "\n"
                    + "\n"
                    + "        }\n"
                    + "        .navbar {\n"
                    + "            display: inline-block;\n"
                    + "            /* border: 3px solid white; */\n"
                    + "            margin-left: 25%;\n"
                    + "            margin-top: 25px;\n"
                    + "            border-radius: 5px;\n"
                    + "        }\n"
                    + "\n"
                    + "        .navbar li {\n"
                    + "            display: inline-block;\n"
                    + "        }\n"
                    + "\n"
                    + "        .navbar li a {\n"
                    + "            color: white;\n"
                    + "            font-size: 23px;\n"
                    + "            padding: 33px 50px;\n"
                    + "            text-decoration: none;\n"
                    + "        }\n"
                    + "\n"
                    + "        .navbar li a:hover {\n"
                    + "\n"
                    + "            color: rgb(97, 7, 7);\n"
                    + "            font-size: 23px;\n"
                    + "            padding: 0px 50px;\n"
                    + "            text-decoration: none;\n"
                    + "            border-bottom: 2px solid orange;\n"
                    + "        }\n"
                    + "        .container{\n"
                    + "            width: 600px;\n"
                    + "            height: 500px;\n"
                    + "            border:orange;\n"
                    + "            border-radius: 5px solid orange;\n"
                    + "            margin-top: 100px;\n"
                    + "            margin-left: 500px;\n"
                    + "            margin-bottom: 100px;\n"
                    + "            /* background-color:red; */\n"
                    + "            font-size: 40px;\n"
                    + "           \n"
                    + "           display: inline-block;\n"
                    + "        }\n"
                    + "        \n"
                    + "    </style>\n"
                    + "</head>\n"
                    + "<body>\n"
                    + "    <header style=' background-color: rgb(0,0,0); /* Fallback color */\n"
                    + "background-color: rgba(0, 0, 0, 0.26);'>\n"
                    + "    <div class='navbar'>\n"
                    + "        <ul>\n"
                    + "            <li><a href='index.html'> Home</a> </li>\n"
                    + "            <li> <a href='Course'>Courses</a></li>\n"
                    + "            <li><a href='Registartion'>Registeration</a></li>\n"
                    + "            <li><a href='Contact'>Contact Us</a></li>\n"
                    + "        </ul>\n"
                    + "</header>\n"
                    + "<div class='container'>\n"
                    + " <center><h1>Contact us</h1></center>\n"
                    + " \n"
                    + "</div>\n"
                    + "<div>\n"
                    + "    <img src='Images/Placement - Copy.png' alt='>\n"
                    + "</div>\n"
                    + "\n"
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
