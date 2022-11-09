package Student;

import DB.Db_Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registartion extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String email = request.getParameter("email"),
                sname = request.getParameter("name"),
                squa = request.getParameter("qua"),
                sdob = request.getParameter("dob"),
                sadd = request.getParameter("addr"),
                sgender = request.getParameter("gender"),
                scity = request.getParameter("city"),
                state = request.getParameter("state"),
                spin = request.getParameter("pin"),
                scont = request.getParameter("cont"),
                password = request.getParameter("pswd"),
                cpassword = request.getParameter("cpswd");

        try {
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
                    + "            /* font-family: 'Baloo Bhaina 2', cursive; */\n"
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
                    + "            width: 730px;\n"
                    + "            height: 690px;\n"
                    + "            /* border: 2px solid orange ; */\n"
                    + "            margin-left: 400px;\n"
                    + "            background-color:rgba(0, 0, 0, 0.918);\n"
                    + "           \n"
                    + "        }\n"
                    + "        .content{\n"
                    + "            color:white;\n"
                    + "            font-size: 25px;\n"
                    + "            padding-left: 100px;\n"
                    + "            \n"
                    + "            \n"
                    + "        }\n"
                    + "        .content input{\n"
                    + "            padding: 5px 27px;\n"
                    + "            margin: 5px;\n"
                    + "            border-radius: 5px;\n"
                    + "            width: 44%;\n"
                    + "            border-radius: 2px black;\n"
                    + "            font-size: 19px;\n"
                    + "            /* padding-left: 80px; */\n"
                    + "            padding-top: 10px;\n"
                    + "        }\n"
                    + "        .content select{\n"
                    + "            padding: 5px 20px;\n"
                    + "            margin: 5px;\n"
                    + "            border-radius: 5px;\n"
                    + "            width: 63%;\n"
                    + "            border-radius: 4px black;\n"
                    + "            font-size: 20px;\n"
                    + "            /* padding-left: 80px; */\n"
                    + "            padding-top: 10px;\n"
                    + "        }\n"
                    + "        \n"
                    + "        .btn {\n"
                    + "            margin: 5px;\n"
                    + "            color: white;\n"
                    + "            font-size: 20px;\n"
                    + "            padding: 14px 80px;\n"
                    + "            border-radius: 20px;\n"
                    + "            margin-left: 100px;\n"
                    + "            background-color: rgb(255, 166, 0);\n"
                    + "          \n"
                    + "        }\n"
                    + "        \n"
                    + "    </style>\n"
                    + "</head>\n"
                    + "<body>\n");
            out.println("<header style=' background-color: rgb(0,0,0); /* Fallback color */\n"
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
                    + " <center><h1><u>Registeration FORM</u></h1></center>\n");
            out.println("<form action='Registartion'method='get'>\n"
                    + " <table class='content'>\n");
            out.println("\n"
                    + "    <tr><td>Email ID/User</td><td>Student Name:</td></tr>\n"
                    + "\n"
                    + "    <tr><td><input type='email' name='email'></td><td><input type='text' name='name'></td></tr>\n"
                    + "\n"
                    + "      <tr><td> Qualification:</td><td>Date of Birth:</td></tr>\n"
                    + "\n"
                    + "    <tr><td><select name='qua'>\n"
                    + "        <option value='BCA'>BCA</option>\n"
                    + "        <option value='B.Tech'>B.Tech</option>\n"
                    + "        <option value='B.COM'>B.Com</option>\n"
                    + "        <option value='BBA'>BBA</option>\n"
                    + "        <option value='BSC'>BSC</option>\n"
                    + "        <option value='Diploma'>Diploma</option>\n"
                    + "        <option value='MBA'>MBA</option>\n"
                    + "        <option value='B.Voc'>B.Voc</option></select></td>\n"
                    + "        \n"
                    + "\n"
                    + "        <td><input type='date' name=dob></td></tr>\n"
                    + "    <tr><td>Address</td><td>Gender:</td></tr>\n"
                    + "    <td><input type='text' name='addr'></td>\n"
                    + "    \n"
                    + "    <td><input type='radio' name='gender' value='male'>\n"
                    + "        <label for='male'>Male</label>\n"
                    + "        <input type='radio' name='gender' value='female'>\n"
                    + "        <label for='female'>Female</label></td></tr>\n"
                    + "    \n"
                    + "\n"
                    + "    <tr><td>City</td><td>State</td></tr>\n"
                    + "\n"
                    + "    <tr><td><select name='city' >\n"
                    + "        <option value='Lucknow'>Lucknow</option>\n"
                    + "        <option value='Gonda'>Gonda</option>\n"
                    + "        <option value='Bahraich'>Bahraich</option>\n"
                    + "        <option value='Sitapur'>Sitapur</option>\n"
                    + "        </select></td>"
                    + "<td><select name='state' >\n"
                    + "        <option value='Andhra Pradesh'>Andhra Pradesh</option>\n"
                    + "        <option value='Andaman and Nicobar Islands'>Andaman and Nicobar Islands</option>\n"
                    + "        <option value='Arunachal Pradesh'>Arunachal Pradesh</option>\n"
                    + "        <option value='Assam'>Assam</option>\n"
                    + "        <option value='Bihar'>Bihar</option>\n"
                    + "        <option value='Chandigarh'>Chandigarh</option>\n"
                    + "        <option value='Chhattisgarh'>Chhattisgarh</option>\n"
                    + "        <option value='Dadar and Nagar Haveli'>Dadar and Nagar Haveli</option>\n"
                    + "        <option value='Daman and Diu'>Daman and Diu</option>\n"
                    + "        <option value='Delhi'>Delhi</option>\n"
                    + "        <option value='Lakshadweep'>Lakshadweep</option>\n"
                    + "        <option value='Puducherry'>Puducherry</option>\n"
                    + "        <option value='Goa'>Goa</option>\n"
                    + "        <option value='Gujarat'>Gujarat</option>\n"
                    + "        <option value='Haryana'>Haryana</option>\n"
                    + "        <option value='Himachal Pradesh'>Himachal Pradesh</option>\n"
                    + "        <option value='Jammu and Kashmir'>Jammu and Kashmir</option>\n"
                    + "        <option value='Jharkhand'>Jharkhand</option>\n"
                    + "        <option value='Karnataka'>Karnataka</option>\n"
                    + "        <option value='Kerala'>Kerala</option>\n"
                    + "        <option value='Madhya Pradesh'>Madhya Pradesh</option>\n"
                    + "        <option value='Maharashtra'>Maharashtra</option>\n"
                    + "        <option value='Manipur'>Manipur</option>\n"
                    + "        <option value='Meghalaya'>Meghalaya</option>\n"
                    + "        <option value='Mizoram'>Mizoram</option>\n"
                    + "        <option value='Nagaland'>Nagaland</option>\n"
                    + "        <option value='Odisha'>Odisha</option>\n"
                    + "        <option value='Punjab'>Punjab</option>\n"
                    + "        <option value='Rajasthan'>Rajasthan</option>\n"
                    + "        <option value='Sikkim'>Sikkim</option>\n"
                    + "        <option value='Tamil Nadu'>Tamil Nadu</option>\n"
                    + "        <option value='Telangana'>Telangana</option>\n"
                    + "        <option value='Tripura'>Tripura</option>\n"
                    + "        <option value='Uttar Pradesh'>Uttar Pradesh</option>\n"
                    + "        <option value='Uttarakhand'>Uttarakhand</option>\n"
                    + "        <option value='West Bengal'>West Bengal</option>\n"
                    + "        </select></td></tr> \n"
                    + "\n"
                    + "     <tr><td>Pin:</td><td>Contact:</td></tr>\n"
                    + "\n"
                    + "    <tr><td><input type='text' name=pin></td><td><input type='text' name=cont></td></tr>\n"
                    + "     <tr><td>Password:</td><td>Confirm Password:</td></tr>\n"
                    + "\n"
                    + "    <tr><td><input type='password' name=pswd></td><td><input type='password' name=cpswd></td></tr>\n"
                    + "\n"
                    + "    \n"
                    + "</table><hr>\n"
                    + "<input type=submit class='btn' value='SUBMIT'><input type=reset class='btn' value='Reset'>\n");
            out.println("</form>\n");
            out.println("</div>\n");
            out.println("</body>\n");
            out.println("</html>");

            if (email != null
                    || sname != null
                    || squa != null
                    || sadd != null
                    || sgender != null
                    || scity != null
                    || state != null
                    || spin != null
                    || password != null
                    || cpassword != null) {
                if (password.equals(cpassword)) {
                    Db_Connection db = new Db_Connection();
                    String Query = "insert into stu_info values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    String Query1 = "insert into login values(?, ?, 'Student')";
                    db.Pstmt = db.Con.prepareStatement(Query);
                    db.Pstmt.setString(1, email);
                    db.Pstmt.setString(2, sname);
                    db.Pstmt.setString(3, squa);
                    db.Pstmt.setString(4, sdob);
                    db.Pstmt.setString(5, sgender);
                    db.Pstmt.setString(6, sadd);
                    db.Pstmt.setString(7, scity);
                    db.Pstmt.setString(8, state);
                    db.Pstmt.setString(9, spin);
                    db.Pstmt.setString(10, scont);
                    db.Pstmt.setString(11, password);
                    int i1 = db.Pstmt.executeUpdate();
                    db.Pstmt = db.Con.prepareStatement(Query1);
                    db.Pstmt.setString(1, email);
                    db.Pstmt.setString(2, password);
                    int i2 = db.Pstmt.executeUpdate();
                    if (i1 > 0 && i2 > 0) {
                        response.sendRedirect("index.html?msg=You Are Successfully Registered");
                    }
                } else {
                    response.sendRedirect("Registartion?msg=Password Mismatch");
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
