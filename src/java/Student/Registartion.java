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
        HttpSession session = request.getSession();
        if (session.getAttribute("Student") != null) {
            response.sendRedirect("Student");
        }
        try {
            out.println("<!DOCTYPE html>\n"
                    + "<html lang='en'>\n"
                    + "  <head>\n"
                    + "    <meta charset='UTF-8' />\n"
                    + "    <meta name='viewport' content='width=device-width, initial-scale=1.0' />\n"
                    + "    <meta http-equiv='X-UA-Compatible' content='ie=edge' />\n"
                    + "    <title>ExamHub - Registration</title>\n"
                    + "    <link rel='shortcut icon' href='Images/Plogo.png' type='image/x-icon' />\n"
                    + "    <link rel='apple-touch-icon' href='Images/Plogo.png' />\n"
                    + "    <link rel='preconnect' href='https://fonts.gstatic.com' />\n"
                    + "    <link\n"
                    + "      href='https://fonts.googleapis.com/css?family=Fredericka+the+Great|Josefin+Sans:400,400i,500,500i,600,600i,700,700i&display=swap'\n"
                    + "      rel='stylesheet'\n"
                    + "    />\n"
                    + "    <link rel='stylesheet' href='Css/bootstrap.css' />\n"
                    + "    <link rel='stylesheet' href='Css/odometer.css' />\n"
                    + "    <link rel='stylesheet' href='Css/lightcase.css' />\n"
                    + "    <link rel='stylesheet' href='Css/swiper.css' />\n"
                    + "    <link rel='stylesheet' href='Css/line.css' />\n"
                    + "    <link rel='stylesheet' href='Css/animate.css' />\n"
                    + "    <link rel='stylesheet' href='Css/style.css' />\n"
                    + "    <link rel='stylesheet' href='Css/basic.css' />\n"
                    + "    <script\n"
                    + "      src='https://kit.fontawesome.com/fdf05f1614.js'\n"
                    + "      crossorigin='anonymous'\n"
                    + "    ></script>\n"
                    + "    <style type='text/css'>\n"
                    + "      .country-code .input-group-prepend .input-group-text {\n"
                    + "        background-color: rgba(255, 255, 255, 0.1) !important;\n"
                    + "        border: 1px solid rgba(255, 255, 255, 0.2);\n"
                    + "      }\n"
                    + "      .country-code select {\n"
                    + "        border: none;\n"
                    + "        background-color: transparent;\n"
                    + "        color: #fff;\n"
                    + "      }\n"
                    + "      .country-code select:focus {\n"
                    + "        border: none;\n"
                    + "        outline: none;\n"
                    + "      }\n"
                    + "    </style>\n"
                    + "  </head>\n"
                    + "  <body>\n"
                    + "    <div class='preloader'>\n"
                    + "      <div class='loader book'>\n"
                    + "        <figure class='page'></figure>\n"
                    + "        <figure class='page'></figure>\n"
                    + "        <figure class='page'></figure>\n"
                    + "      </div>\n"
                    + "    </div>\n"
                    + "    <!--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                    + "    End Preloader\n"
                    + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-->\n"
                    + "\n"
                    + "    <section\n"
                    + "      class='account-section section--bg bg-overlay-white bg_img pt-50 pb-30'\n"
                    + "      data-background='Images/bg2.jpg'\n"
                    + "    >\n"
                    + "      <div class='container'>\n"
                    + "        <div class='row account-area align-items-center justify-content-center'>\n"
                    + "          <div class='col-lg-8'>\n"
                    + "            <div class='account-form-area'>\n"
                    + "              <div class='account-logo-area text-center'>\n"
                    + "                <div class='account-logo'>\n"
                    + "                  <a href='/OnlineExam'\n"
                    + "                    ><img src='Images/Plogo.png' alt='logo'\n"
                    + "                  /></a>\n"
                    + "                </div>\n"
                    + "              </div>\n"
                    + "              <div class='account-header text-center'>\n"
                    + "                <h2 class='title'>Register Your Account Now</h2>\n"
                    + "                <h3 class='sub-title'>\n"
                    + "                  Already Have An Account ?\n"
                    + "                  <a href='Login'>Login Now</a>\n"
                    + "                </h3>\n"
                    + "              </div>\n"
                    + "              <form class='account-form' method='post' action='Registartion'>\n"
                    + "                <div class='row ml-b-20'>\n"
                    + "                  <div class='col-lg-6 form-group'>\n"
                    + "                    <label>Email Id</label>\n"
                    + "                    <input\n"
                    + "                      class='form-control form--control'\n"
                    + "                      type='email'\n"
                    + "                      name='email'\n"
                    + "                      required\n"
                    + "                    />\n"
                    + "                  </div>\n"
                    + "                  <div class='col-lg-6 form-group'>\n"
                    + "                    <label>Student Name</label>\n"
                    + "                    <input\n"
                    + "                      class='form-control form--control'\n"
                    + "                      type='text'\n"
                    + "                      name='name'\n"
                    + "                      required\n"
                    + "                    />\n"
                    + "                  </div>\n"
                    + "\n"
                    + "                  <div class='col-lg-6 form-group'>\n"
                    + "                    <label>Qualification</label>\n"
                    + "                    <select name='qua' class='form-control form--control'>\n"
                    + "                      <option value='BCA'>BCA</option>\n"
                    + "                      <option value='B.Tech'>B.Tech</option>\n"
                    + "                      <option value='B.COM'>B.Com</option>\n"
                    + "                      <option value='BBA'>BBA</option>\n"
                    + "                      <option value='BSC'>BSC</option>\n"
                    + "                      <option value='Diploma'>Diploma</option>\n"
                    + "                      <option value='MBA'>MBA</option>\n"
                    + "                      <option value='B.Voc'>B.Voc</option>\n"
                    + "                    </select>\n"
                    + "                  </div>\n"
                    + "                  <div class='col-lg-6 form-group'>\n"
                    + "                    <label>Date Of Birth</label>\n"
                    + "                    <input\n"
                    + "                      class='form-control form--control'\n"
                    + "                      type='date'\n"
                    + "                      name='dob'\n"
                    + "                      required\n"
                    + "                    />\n"
                    + "                  </div>\n"
                    + "                  <div class='col-lg-6 form-group'>\n"
                    + "                    <label>Address</label>\n"
                    + "                    <textarea\n"
                    + "                      rows='1'\n"
                    + "                      class='form-control form--control'\n"
                    + "                      name='addr'\n"
                    + "                      required\n"
                    + "                    ></textarea>\n"
                    + "                  </div>\n"
                    + "                  <div class='col-lg-6 form-group'>\n"
                    + "                    <label>Gender</label>\n"
                    + "                    <div class='form-check'>\n"
                    + "                      <input\n"
                    + "                        class='form-check-input'\n"
                    + "                        type='radio'\n"
                    + "                        name='gender'\n"
                    + "                        value='male'\n"
                    + "                        checked\n"
                    + "                      />\n"
                    + "                      <label class='form-check-label' for='male'> Male </label>\n"
                    + "                    </div>\n"
                    + "                    <div class='form-check'>\n"
                    + "                      <input\n"
                    + "                        class='form-check-input'\n"
                    + "                        type='radio'\n"
                    + "                        name='gender'\n"
                    + "                        value='female'\n"
                    + "                      />\n"
                    + "                      <label class='form-check-label' for='female'>\n"
                    + "                        Female\n"
                    + "                      </label>\n"
                    + "                    </div>\n"
                    + "                  </div>\n"
                    + "\n"
                    + "                  <div class='col-lg-6 form-group'>\n"
                    + "                    <label>State</label>\n"
                    + "                    <select name='state' class='form-control form--control'>\n"
                    + "                      <option value='Andhra Pradesh'>Andhra Pradesh</option>\n"
                    + "                      <option value='Andaman and Nicobar Islands'>\n"
                    + "                        Andaman and Nicobar Islands\n"
                    + "                      </option>\n"
                    + "                      <option value='Arunachal Pradesh'>\n"
                    + "                        Arunachal Pradesh\n"
                    + "                      </option>\n"
                    + "                      <option value='Assam'>Assam</option>\n"
                    + "                      <option value='Bihar'>Bihar</option>\n"
                    + "                      <option value='Chandigarh'>Chandigarh</option>\n"
                    + "                      <option value='Chhattisgarh'>Chhattisgarh</option>\n"
                    + "                      <option value='Dadar and Nagar Haveli'>\n"
                    + "                        Dadar and Nagar Haveli\n"
                    + "                      </option>\n"
                    + "                      <option value='Daman and Diu'>Daman and Diu</option>\n"
                    + "                      <option value='Delhi'>Delhi</option>\n"
                    + "                      <option value='Lakshadweep'>Lakshadweep</option>\n"
                    + "                      <option value='Puducherry'>Puducherry</option>\n"
                    + "                      <option value='Goa'>Goa</option>\n"
                    + "                      <option value='Gujarat'>Gujarat</option>\n"
                    + "                      <option value='Haryana'>Haryana</option>\n"
                    + "                      <option value='Himachal Pradesh'>Himachal Pradesh</option>\n"
                    + "                      <option value='Jammu and Kashmir'>\n"
                    + "                        Jammu and Kashmir\n"
                    + "                      </option>\n"
                    + "                      <option value='Jharkhand'>Jharkhand</option>\n"
                    + "                      <option value='Karnataka'>Karnataka</option>\n"
                    + "                      <option value='Kerala'>Kerala</option>\n"
                    + "                      <option value='Madhya Pradesh'>Madhya Pradesh</option>\n"
                    + "                      <option value='Maharashtra'>Maharashtra</option>\n"
                    + "                      <option value='Manipur'>Manipur</option>\n"
                    + "                      <option value='Meghalaya'>Meghalaya</option>\n"
                    + "                      <option value='Mizoram'>Mizoram</option>\n"
                    + "                      <option value='Nagaland'>Nagaland</option>\n"
                    + "                      <option value='Odisha'>Odisha</option>\n"
                    + "                      <option value='Punjab'>Punjab</option>\n"
                    + "                      <option value='Rajasthan'>Rajasthan</option>\n"
                    + "                      <option value='Sikkim'>Sikkim</option>\n"
                    + "                      <option value='Tamil Nadu'>Tamil Nadu</option>\n"
                    + "                      <option value='Telangana'>Telangana</option>\n"
                    + "                      <option value='Tripura'>Tripura</option>\n"
                    + "                      <option value='Uttar Pradesh'>Uttar Pradesh</option>\n"
                    + "                      <option value='Uttarakhand'>Uttarakhand</option>\n"
                    + "                      <option value='West Bengal'>West Bengal</option>\n"
                    + "                    </select>\n"
                    + "                  </div>\n"
                    + "                  <div class='col-lg-6 form-group'>\n"
                    + "                    <label>City</label>\n"
                    + "                    <select name='city' class='form-control form--control'>\n"
                    + "                      <option value='Lucknow'>Lucknow</option>\n"
                    + "                      <option value='Gonda'>Gonda</option>\n"
                    + "                      <option value='Bahraich'>Bahraich</option>\n"
                    + "                      <option value='Sitapur'>Sitapur</option>\n"
                    + "                    </select>\n"
                    + "                  </div>\n"
                    + "                  <div class='col-lg-6 form-group'>\n"
                    + "                    <label>Pin</label>\n"
                    + "                    <input\n"
                    + "                      class='form-control form--control'\n"
                    + "                      type='text'\n"
                    + "                      name='pin'\n"
                    + "                      required\n"
                    + "                    />\n"
                    + "                  </div>\n"
                    + "                  <div class='col-lg-6 form-group'>\n"
                    + "                    <label>Contact</label>\n"
                    + "                    <input\n"
                    + "                      type='text'\n"
                    + "                      name='cont'\n"
                    + "                      class='form-control form--control'\n"
                    + "                      required\n"
                    + "                    />\n"
                    + "                  </div>\n"
                    + "\n"
                    + "                  <div class='col-lg-6 form-group'>\n"
                    + "                    <label>Password</label>\n"
                    + "                    <input\n"
                    + "                      class='form-control form--control'\n"
                    + "                      type='password'\n"
                    + "                      name='pswd'\n"
                    + "                      required\n"
                    + "                    />\n"
                    + "                  </div>\n"
                    + "                  <div class='col-lg-6 form-group'>\n"
                    + "                    <label>Confirm Password</label>\n"
                    + "                    <input\n"
                    + "                      class='form-control form--control'\n"
                    + "                      type='password'\n"
                    + "                      name='cpswd'\n"
                    + "                      required\n"
                    + "                    />\n"
                    + "                  </div>\n"
                    + "                  <div class='col-lg-12 form-group'>\n"
                    + "                    <div\n"
                    + "                      class='checkbox-wrapper d-flex flex-wrap align-items-center'\n"
                    + "                    >\n"
                    + "                      <div class='checkbox-item'>\n"
                    + "                        <input type='checkbox' id='c1' name='terms' required/>\n"
                    + "                        <label for='c1'\n"
                    + "                          >I have read agreed with the\n"
                    + "                          <a\n"
                    + "                            href='#'\n"
                    + "                            class='mr-2'\n"
                    + "                            >Terms and Condition</a\n"
                    + "                          >\n"
                    + "                          <a\n"
                    + "                            href='#'\n"
                    + "                            class='mr-2'\n"
                    + "                            >Privacy Policy</a\n"
                    + "                          >\n"
                    + "                        </label>\n"
                    + "                      </div>\n"
                    + "                    </div>\n"
                    + "                  </div>\n"
                    + "                  <div class='col-lg-12 form-group text-center'>\n"
                    + "                    <button type='submit' class='submit-btn'>\n"
                    + "                      Register Now\n"
                    + "                    </button>\n"
                    + "                  </div>\n"
                    + "                </div>\n"
                    + "              </form>\n"
                    + "            </div>\n"
                    + "          </div>\n"
                    + "        </div>\n"
                    + "      </div>\n"
                    + "    </section>\n"
                    + "    <a href='#' class='scrollToTop'><i class='fa-solid fa-angles-up'></i></a>\n"
                    + "    <script src='Js/jquery.js'></script>\n"
                    + "    <script src='Js/bootstrap.js'></script>\n"
                    + "    <script src='Js/swiper.js'></script>\n"
                    + "    <script src='Js/viewport.js'></script>\n"
                    + "    <script src='Js/odometer.js'></script>\n"
                    + "    <script src='Js/lightcase.js'></script>\n"
                    + "    <script src='Js/wow.js'></script>\n"
                    + "    <script src='Js/main.js'></script>\n"
                    + "  </body>\n"
                    + "</html>");

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
                        session.setAttribute("Student", sname);
                        session.setMaxInactiveInterval(5 * 60);
                        response.sendRedirect("Student?msg=You Are Successfully Registered");
                    }
                } else {
                    response.sendRedirect("Registartion?msg=Password Mismatch");
                }
            }
        } catch (IOException | SQLException e) {
            System.out.println(e);
            response.sendRedirect("Registartion?msg=User Already Exist");
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
