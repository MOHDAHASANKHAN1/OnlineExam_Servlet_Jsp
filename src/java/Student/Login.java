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

public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String sname = request.getParameter("email"),
                password = request.getParameter("pswd");
        HttpSession session = request.getSession();
        if (session.getAttribute("Student") != null) {
            response.sendRedirect("Student");
        }
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>\n"
                    + "<html lang='en'>\n"
                    + "  <head>\n"
                    + "<meta charset='UTF-8'>\n"
                    + "    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n"
                    + "    <meta http-equiv='X-UA-Compatible' content='ie=edge'>\n"
                    + "    <title>ExamHub - Home</title>\n"
                    + "    <link rel='shortcut icon' href='Images/Plogo.png' type='image/x-icon'>\n"
                    + "    <link rel='apple-touch-icon' href='Images/Plogo.png'>    \n"
                    + "    <link rel='preconnect' href='https://fonts.gstatic.com'>\n"
                    + "    <link href='https://fonts.googleapis.com/css?family=Fredericka+the+Great|Josefin+Sans:400,400i,500,500i,600,600i,700,700i&display=swap' rel='stylesheet'>\n"
                    + "    <link rel='stylesheet' href='Css/bootstrap.css'>\n"
                    + "    <link rel='stylesheet' href='Css/odometer.css'>\n"
                    + "    <link rel='stylesheet' href='Css/lightcase.css'>\n"
                    + "    <link rel='stylesheet' href='Css/swiper.css'>\n"
                    + "    <link rel='stylesheet' href='Css/line.css'>\n"
                    + "    <link rel='stylesheet' href='Css/animate.css'>\n"
                    + "    <link rel='stylesheet' href='Css/style.css'>\n"
                    + "    <link rel='stylesheet' href='Css/basic.css' >\n"
                    + "    <script src='https://kit.fontawesome.com/fdf05f1614.js' crossorigin='anonymous'></script>\n"
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
                    + "      class='account-section section--bg bg-overlay-white bg_img'\n"
                    + "      data-background='Images/bg2.jpg'\n"
                    + "    >\n"
                    + "      <div class='container'>\n"
                    + "        <div class='row account-area align-items-center justify-content-center'>\n"
                    + "          <div class='col-lg-5'>\n"
                    + "            <div class='account-form-area'>\n"
                    + "              <div class='account-logo-area text-center'>\n"
                    + "                <div class='account-logo'>\n"
                    + "                  <a href='/OnlineExam'\n"
                    + "                    ><img src='Images/Plogo.png' alt='logo'\n"
                    + "                  /></a>\n"
                    + "                </div>\n"
                    + "              </div>\n"
                    + "              <div class='account-header text-center'>\n"
                    + "                <h2 class='title'>Login Your Account Now</h2>\n"
                    + "                <h3 class='sub-title'>\n"
                    + "                  Don't Have An Account ?\n"
                    + "                  <a href='Registartion'\n"
                    + "                    >Register Now</a\n"
                    + "                  >\n"
                    + "                </h3>\n"
                    + "              </div>\n"
                    + "              <form\n"
                    + "                class='account-form'\n"
                    + "                action='Login'\n"
                    + "                method='POST'\n"
                    + "              >\n"
                    + "                <div class='row ml-b-20'>\n"
                    + "                  <div class='col-lg-12 form-group'>\n"
                    + "                    <label>Username <span class='text-danger'>*</span></label>\n"
                    + "                    <input\n"
                    + "                      type='text'\n"
                    + "                      class='form-control form--control'\n"
                    + "                      name='email'\n"
                    + "                      required\n"
                    + "                    />\n"
                    + "                  </div>\n"
                    + "                  <div class='col-lg-12 form-group'>\n"
                    + "                    <label>Password <span>*</span></label>\n"
                    + "                    <input\n"
                    + "                      type='password'\n"
                    + "                      class='form-control form--control'\n"
                    + "                      name='pswd'\n"
                    + "                      required\n"
                    + "                    />\n"
                    + "                  </div>\n"
                    + "\n"
                    + "                  <div class='col-lg-12 form-group'>\n"
                    + "                    <div\n"
                    + "                      class='checkbox-wrapper d-flex flex-wrap align-items-center'\n"
                    + "                    >\n"
                    + "                      <div class='checkbox-item'>\n"
                    + "                        <label\n"
                    + "                          ><a\n"
                    + "                            href='Reset'\n"
                    + "                          >\n"
                    + "                            Forgot Password ?</a\n"
                    + "                          ></label\n"
                    + "                        >\n"
                    + "                      </div>\n"
                    + "                    </div>\n"
                    + "                  </div>\n"
                    + "                  <div class='col-lg-12 form-group text-center'>\n"
                    + "                    <button type='submit' class='submit-btn'>Login Now</button>\n"
                    + "                  </div>\n"
                    + "                </div>\n"
                    + "              </form>\n"
                    + "            </div>\n"
                    + "          </div>\n"
                    + "        </div>\n"
                    + "      </div>\n"
                    + "    </section>\n"
                    + "    <a href='#' class='scrollToTop'><i class='fa-solid fa-angles-up'></i></a>\n"
                    + "<script src='Js/jquery.js'></script>\n"
                    + "<script src='Js/bootstrap.js'></script>\n"
                    + "<script src='Js/swiper.js'></script>\n"
                    + "<script src='Js/viewport.js'></script>\n"
                    + "<script src='Js/odometer.js'></script>\n"
                    + "<script src='Js/lightcase.js'></script>\n"
                    + "<script src='Js/wow.js'></script>\n"
                    + "<script src='Js/main.js'></script>\n"
                    + "\n"
                    + "  </body>\n"
                    + "</html>");
            if (sname != null
                    || password != null) {
                Db_Connection db = new Db_Connection();
                String Query = "select email, password from login where email=? and password=? and usertype='Student'";
                db.Pstmt = db.Con.prepareStatement(Query);
                db.Pstmt.setString(1, sname);
                db.Pstmt.setString(2, password);
                db.Rst = db.Pstmt.executeQuery();
                if (db.Rst.isBeforeFirst()) {
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
