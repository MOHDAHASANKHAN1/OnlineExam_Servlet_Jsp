package Student;

import DB.Db_Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateStudent extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String upemail = request.getParameter("upemail"),
                email = request.getParameter("email"),
                name = request.getParameter("name"),
                qua = request.getParameter("qua"),
                dob = request.getParameter("dob"),
                gender = request.getParameter("gender"),
                add = request.getParameter("add"),
                city = request.getParameter("city"),
                state = request.getParameter("state"),
                pin = request.getParameter("pin"),
                contact = request.getParameter("contact"),
                password = request.getParameter("password"),
                check = request.getParameter("check");
        PrintWriter out = response.getWriter();

        try {

            if (upemail != null) {
                Db_Connection db = new Db_Connection();
                String Query = "select * from stu_info where email=?";
                db.Pstmt = db.Con.prepareStatement(Query);
                db.Pstmt.setString(1, upemail);
                db.Rst = db.Pstmt.executeQuery();
                if (db.Rst.next()) {
                    if (check != null && check.equals("true")) {
                        response.sendRedirect("AdminHome?choice=UpdateStudent&upemail=" + upemail);
                    }
                    out.println("\n"
                            + "  <div class='md:mx-20 my-5 sm:mx-6 mx-5 w-full'>\n"
                            + "      <div class='bg-white rounded-lg shadow dark:border md:mt-0  xl:p-0 dark:bg-gray-800 dark:border-gray-700'>\n"
                            + "          <div class='px-6 sm:px-8 py-4'>\n"
                            + "              <h1 class='text-xl text-center font-bold leading-tight tracking-tight text-gray-900 md:text-2xl dark:text-white'>\n"
                            + "                  Update Student\n"
                            + "              </h1>\n"
                            + "              <form class='space-y-2' action='UpdateStudent' method='post'>\n"
                            + "                  <div>\n"
                            + "                      <label for='email' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Emali Id</label>\n"
                            + "                      <input value='"
                            + db.Rst.getString(1)
                            + "' type='email' name='email' id='email' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Question Id' required=''>\n"
                            + "                  </div>\n"
                            + "                  <div class='flex justify-between space-x-4'><div class='w-full'>\n"
                            + "                      <label for='name' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Name</label>\n"
                            + "                      <input value='"
                            + db.Rst.getString(2)
                            + "' type='text' name='name' id='name' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Question' required=''>\n"
                            + "                  </div>\n"
                            + "                  <div class='w-full'>\n"
                            + "                      <label for='qua' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Qualification</label>\n"
                            + "                      <input value='"
                            + db.Rst.getString(3)
                            + "' type='text' name='qua' id='qua' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Option1' required=''>\n"
                            + "                  </div></div>\n"
                            + "                  <div class='flex justify-between space-x-4'><div class='w-full'>\n"
                            + "                      <label for='dob' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Date Of Birth</label>\n"
                            + "                      <input value='"
                            + db.Rst.getString(4)
                            + "' type='text' name='dob' id='dob' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Option2' required=''>\n"
                            + "                  </div>\n"
                            + "                  <div class='w-full'>\n"
                            + "                      <label for='gender' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Gender</label>\n"
                            + "                      <input value='"
                            + db.Rst.getString(5)
                            + "' type='text' name='gender' id='gender' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Option3' required=''>\n"
                            + "                  </div></div>\n"
                            + "                  <div>\n"
                            + "                      <label for='add' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Address</label>\n"
                            + "                      <textarea  type='text' name='add' id='add' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Option4' required=''>"
                            + db.Rst.getString(6)
                            + "</textarea>\n"
                            + "                  </div>\n"
                            + "                  <div class='flex justify-between space-x-4'><div class='w-full'>\n"
                            + "                      <label for='city' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>City</label>\n"
                            + "                      <input value='"
                            + db.Rst.getString(7)
                            + "' type='text' name='city' id='city' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Answer' required=''>\n"
                            + "                  </div>\n"
                            + "                  <div class='w-full'>\n"
                            + "                      <label for='state' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>State</label>\n"
                            + "                      <input value='"
                            + db.Rst.getString(8)
                            + "' type='text' name='state' id='state' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Answer' required=''>\n"
                            + "                  </div>\n"
                            + "                  <div class='w-full'>\n"
                            + "                      <label for='pin' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Pin</label>\n"
                            + "                      <input value='"
                            + db.Rst.getString(9)
                            + "' type='text' name='pin' id='pin' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Answer' required=''>\n"
                            + "                  </div></div>\n"
                            + "                  <div class='flex justify-between space-x-4'><div class='w-full'>\n"
                            + "                      <label for='contact' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Contact</label>\n"
                            + "                      <input value='"
                            + db.Rst.getString(10)
                            + "' type='text' name='contact' id='contact' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Answer' required=''>\n"
                            + "                  </div>\n"
                            + "                  <div class='w-full'>\n"
                            + "                      <label for='password' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Password</label>\n"
                            + "                      <input value='"
                            + db.Rst.getString(11)
                            + "' type='text' name='password' id='password' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Answer' required=''>\n"
                            + "                  </div></div>\n"
                            + "                  <div>\n"
                            + "                       <input type='hidden' name='upemail' value='"
                            + upemail
                            + "'>\n"
                            + "                  </div>\n"
                            + "                  <button type='submit' class='w-full text-white bg-blue-600 hover:bg-blue-700 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800'>Update Student</button>\n"
                            + "              </form>\n"
                            + "          </div>\n"
                            + "      </div>\n"
                            + "  </div>\n"
                            + "");
                } else {
                    response.sendRedirect("AdminHome?choice=UpdateStudent&msg=Wrong Email Id&msgtype=error");
                }
            } else {
                out.println("\n"
                        + "  <div class='md:mx-20 lg:my-36 md:my-28 sm:my-16 sm:mx-6 my-10 mx-5 w-full'>\n"
                        + "      <div class='bg-white rounded-lg shadow dark:border md:mt-0  xl:p-0 dark:bg-gray-800 dark:border-gray-700'>\n"
                        + "          <div class='px-6 sm:px-8 py-4'>\n"
                        + "              <h1 class='text-xl text-center font-bold leading-tight tracking-tight text-gray-900 md:text-2xl dark:text-white'>\n"
                        + "                  Need A Emali Id To Update Student\n"
                        + "              </h1>\n"
                        + "              <form class='space-y-2' action='UpdateStudent' method='post'>\n"
                        + "                  <div>\n"
                        + "                       <input type='hidden' name='check' value='true'>\n"
                        + "                  </div>\n"
                        + "                  <div>\n"
                        + "                      <label for='upemail' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Email Id</label>\n"
                        + "                      <input type='email' name='upemail' id='upemail' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Email Id' required=''>\n"
                        + "                  </div>\n"
                        + "                  <button type='submit' class='w-full text-white bg-blue-600 hover:bg-blue-700 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800'>Submit</button>\n"
                        + "              </form>\n"
                        + "          </div>\n"
                        + "      </div>\n"
                        + "  </div>\n"
                        + "");
            }

            if (email != null
                    || name != null
                    || qua != null
                    || gender != null
                    || add != null
                    || city != null
                    || pin != null
                    || contact != null
                    || password != null
                    || state != null
                    || dob != null) {
                Db_Connection db = new Db_Connection();
                String Query = "update stu_info set email=?, sname=?, squa=?, sdob=?, sgender=?, sadd=?, scity=?, spin=?, state=?, scont=?, password=? where email=?";
                db.Pstmt = db.Con.prepareStatement(Query);
                db.Pstmt.setString(1, email);
                db.Pstmt.setString(2, name);
                db.Pstmt.setString(3, qua);
                db.Pstmt.setString(4, dob);
                db.Pstmt.setString(5, gender);
                db.Pstmt.setString(6, add);
                db.Pstmt.setString(7, city);
                db.Pstmt.setString(8, pin);
                db.Pstmt.setString(9, state);
                db.Pstmt.setString(10, contact);
                db.Pstmt.setString(11, password);
                db.Pstmt.setString(12, upemail);
                int i = db.Pstmt.executeUpdate();
                if (i > 0) {
                    response.sendRedirect("AdminHome?choice=StudentList&msg=Student Successfully Updated&msgtype=success");
                } else {
                    response.sendRedirect("AdminHome?choice=StudentList&msg=Error In Student Updation&msgtype=error");
                }
            }

        } catch (SQLException | IOException e) {
            response.sendRedirect("AdminHome?choice=UpdateStudent&msg=Email Should Be Unique&msgtype=error&upemail=" + upemail);
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
