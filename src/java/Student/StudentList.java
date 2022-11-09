package Student;

import DB.Db_Connection;
import Question.ViewQuestionList;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentList extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            Db_Connection db = new Db_Connection();
            String Query = "select * from stu_info";
            db.Pstmt = db.Con.prepareStatement(Query);
            db.Rst = db.Pstmt.executeQuery();

            out.println("<div class='overflow-x-auto shadow-md  sm:rounded-lg mx-3 my-3'>\n"
                    + "    <table class='w-full text-sm text-left text-gray-500 dark:text-gray-400 bg-red-700'>\n"
                    + "        <thead class='text-xs text-gray-700 bg-blue-600 uppercase dark:bg-gray-700 dark:text-gray-400'>\n"
                    + "            <tr>\n"
                    + "                <th scope='col' class='py-3 px-6'>\n"
                    + "                    Email\n"
                    + "                </th>\n"
                    + "                <th scope='col' class='py-3 px-6'>\n"
                    + "                    Name\n"
                    + "                </th>\n"
                    + "                <th scope='col' class='py-3 px-6'>\n"
                    + "                    Qualification\n"
                    + "                </th>\n"
                    + "                <th scope='col' class='py-3 px-6'>\n"
                    + "                    Dob\n"
                    + "                </th>\n"
                    + "                <th scope='col' class='py-3 px-6'>\n"
                    + "                    Gender\n"
                    + "                </th>\n"
                    + "                <th scope='col' class='py-3 px-6'>\n"
                    + "                    Address\n"
                    + "                </th>\n"
                    + "                <th scope='col' class='py-3 px-6'>\n"
                    + "                    City\n"
                    + "                <th scope='col' class='py-3 px-6'>\n"
                    + "                    State\n"
                    + "                </th>\n"
                    + "                <th scope='col' class='py-3 px-6'>\n"
                    + "                    Pin\n"
                    + "                </th>\n"
                    + "                <th scope='col' class='py-3 px-6'>\n"
                    + "                    Contact\n"
                    + "                </th>\n"
                    + "                <th scope='col' class='py-3 px-6'>\n"
                    + "                    Password\n"
                    + "                </th>\n"
                    + "                <th scope='col' class='py-3 px-6 text-center'>\n"
                    + "                    Action\n"
                    + "                </th>\n"
                    + "            </tr>\n"
                    + "        </thead>\n"
                    + "        <tbody>\n");
            if (db.Rst.isBeforeFirst()) {
                while (db.Rst.next()) {
                    out.println("            <tr class='bg-teal-400 border-y border-gray-500 dark:bg-gray-800 dark:border-gray-700 hover:bg-teal-200 dark:hover:bg-gray-600'>\n"
                            + "                <th scope='row' class='py-4 px-6 font-medium text-gray-900 whitespace-nowrap dark:text-white'>\n"
                            + db.Rst.getString(1)
                            + "                    \n"
                            + "                </th>\n"
                            + "                <td class='py-4 px-6'>\n"
                            + db.Rst.getString(2)
                            + "                    \n"
                            + "                </td>\n"
                            + "                <td class='py-4 px-6'>\n"
                            + db.Rst.getString(3)
                            + "                    \n"
                            + "                </td>\n"
                            + "                <td class='py-4 px-6'>\n"
                            + db.Rst.getString(4)
                            + "                    \n"
                            + "                </td>\n"
                            + "                <td class='py-4 px-6'>\n"
                            + db.Rst.getString(5)
                            + "                    \n"
                            + "                </td>\n"
                            + "                <td class='py-4 px-6'>\n"
                            + db.Rst.getString(6)
                            + "                    \n"
                            + "                </td>\n"
                            + "                <td class='py-4 px-6'>\n"
                            + db.Rst.getString(7)
                            + "                    \n"
                            + "                </td>\n"
                            + "                <td class='py-4 px-6'>\n"
                            + db.Rst.getString(8)
                            + "                    \n"
                            + "                </td>\n"
                            + "                <td class='py-4 px-6'>\n"
                            + db.Rst.getString(9)
                            + "                    \n"
                            + "                </td>\n"
                            + "                <td class='py-4 px-6'>\n"
                            + db.Rst.getString(10)
                            + "                    \n"
                            + "                </td>\n"
                            + "                <td class='py-4 px-6'>\n"
                            + db.Rst.getString(11)
                            + "                    \n"
                            + "                </td>\n"
                            + "                <td class='flex items-center py-4 px-6 space-x-3'>\n"
                            + "                    <a href='AdminHome?choice=UpdateStudent&upemail="
                            + db.Rst.getString(1)
                            + "' class='font-medium text-pink-600 dark:text-blue-500'><i class='fa-solid text-lg fa-user-pen'></i></a>\n"
                            + "                    <a href='DeleteStudent?delemail="
                            + db.Rst.getString(1)
                            + "' class='font-medium text-red-600 dark:text-red-500'><i class='fa-solid  text-lg fa-trash'></i></a>\n"
                            + "                </td>\n"
                            + "            </tr>\n");
                }
            }

            out.println("        </tbody>\n"
                    + "    </table>\n"
                    + "</div>");
        } catch (SQLException ex) {
            Logger.getLogger(ViewQuestionList.class.getName()).log(Level.SEVERE, null, ex);
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
