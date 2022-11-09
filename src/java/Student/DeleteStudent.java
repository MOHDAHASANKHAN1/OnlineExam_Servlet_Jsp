package Student;

import DB.Db_Connection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteStudent extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String email = request.getParameter("delemail");
        PrintWriter out = response.getWriter();
        try {
            if (email != null) {
                Db_Connection db = new Db_Connection();
                String Query = "select * from stu_info where email=?";
                String DelQuery = "delete from stu_info where email=?";
                db.Pstmt = db.Con.prepareStatement(Query);
                db.Pstmt.setString(1, email);
                db.Rst = db.Pstmt.executeQuery();
                if (db.Rst.next()) {
                    db.Pstmt = db.Con.prepareStatement(DelQuery);
                    db.Pstmt.setString(1, email);
                    int i = db.Pstmt.executeUpdate();
                    if (i > 0) {
                        response.sendRedirect("AdminHome?choice=StudentList&msg=Student Successfully Deleted&msgtype=delete");
                    } else {
                        response.sendRedirect("AdminHome?choice=StudentList&msg=Error In Student Deletion&msgtype=error");
                    }
                } else {
                    response.sendRedirect("AdminHome?choice=DeleteStudent&msg=Wrong Email Id&msgtype=error");
                }
            } else {
                out.println("\n"
                        + "  <div class='md:mx-20 lg:my-36 md:my-28 sm:my-16 sm:mx-6 my-10 mx-5 w-full'>\n"
                        + "      <div class='bg-white rounded-lg shadow dark:border md:mt-0  xl:p-0 dark:bg-gray-800 dark:border-gray-700'>\n"
                        + "          <div class='px-6 sm:px-8 py-4'>\n"
                        + "              <h1 class='text-xl text-center font-bold leading-tight tracking-tight text-gray-900 md:text-2xl dark:text-white'>\n"
                        + "                  Need A Email Id To Delete Student\n"
                        + "              </h1>\n"
                        + "              <form class='space-y-2' action='DeleteStudent' method='post'>\n"
                        + "                  <div>\n"
                        + "                      <label for='delemail' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Email Id</label>\n"
                        + "                      <input type='email' name='delemail' id='delemail' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Email Id' required=''>\n"
                        + "                  </div>\n"
                        + "                  <button type='submit' class='w-full text-white bg-blue-600 hover:bg-blue-700 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800'>Delete</button>\n"
                        + "              </form>\n"
                        + "          </div>\n"
                        + "      </div>\n"
                        + "  </div>\n"
                        + "");
            }
        } catch (Exception e) {
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
