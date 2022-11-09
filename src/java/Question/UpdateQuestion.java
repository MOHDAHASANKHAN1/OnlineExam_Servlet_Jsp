package Question;

import DB.Db_Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateQuestion extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String upqueid = request.getParameter("upqueid"),
                queid = request.getParameter("queid"),
                que = request.getParameter("que"),
                opt1 = request.getParameter("opt1"),
                opt2 = request.getParameter("opt2"),
                opt3 = request.getParameter("opt3"),
                opt4 = request.getParameter("opt4"),
                ans = request.getParameter("ans"),
                check = request.getParameter("check");
        PrintWriter out = response.getWriter();

        try {

            if (upqueid != null) {
                Db_Connection db = new Db_Connection();
                String Query = "select * from quest_mstr where qid=?";
                db.Pstmt = db.Con.prepareStatement(Query);
                db.Pstmt.setString(1, upqueid);
                db.Rst = db.Pstmt.executeQuery();
                if (db.Rst.next()) {
                    if (check != null && check.equals("true")) {
                        response.sendRedirect("AdminHome?choice=UpdateQuestion&upqueid=" + upqueid);
                    }
                    out.println("\n"
                            + "  <div class='md:mx-20 md:my-16 sm:my-9 sm:mx-6 my-7 mx-5 w-full'>\n"
                            + "      <div class='bg-white rounded-lg shadow dark:border md:mt-0  xl:p-0 dark:bg-gray-800 dark:border-gray-700'>\n"
                            + "          <div class='px-6 sm:px-8 py-4'>\n"
                            + "              <h1 class='text-xl text-center font-bold leading-tight tracking-tight text-gray-900 md:text-2xl dark:text-white'>\n"
                            + "                  Update Questions\n"
                            + "              </h1>\n"
                            + "              <form class='space-y-2' action='UpdateQuestion' method='post'>\n"
                            + "                  <div>\n"
                            + "                      <label for='queid' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Question Id</label>\n"
                            + "                      <input value='"
                            + db.Rst.getString(1)
                            + "' type='number' name='queid' id='queid' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Question Id' required=''>\n"
                            + "                  </div>\n"
                            + "                  <div>\n"
                            + "                      <label for='que' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Question</label>\n"
                            + "                      <input value='"
                            + db.Rst.getString(2)
                            + "' type='text' name='que' id='que' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Question' required=''>\n"
                            + "                  </div>\n"
                            + "                  <div class='flex justify-between space-x-4'><div class='w-full'>\n"
                            + "                      <label for='opt1' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Option1</label>\n"
                            + "                      <input value='"
                            + db.Rst.getString(3)
                            + "' type='text' name='opt1' id='opt1' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Option1' required=''>\n"
                            + "                  </div>\n"
                            + "                  <div class='w-full'>\n"
                            + "                      <label for='opt2' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Option2</label>\n"
                            + "                      <input value='"
                            + db.Rst.getString(4)
                            + "' type='text' name='opt2' id='opt2' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Option2' required=''>\n"
                            + "                  </div></div>\n"
                            + "                  <div class='flex justify-between space-x-4'><div class='w-full'>\n"
                            + "                      <label for='opt3' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Option3</label>\n"
                            + "                      <input value='"
                            + db.Rst.getString(5)
                            + "' type='text' name='opt3' id='opt3' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Option3' required=''>\n"
                            + "                  </div>\n"
                            + "                  <div class='w-full'>\n"
                            + "                      <label for='opt4' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Option4</label>\n"
                            + "                      <input value='"
                            + db.Rst.getString(6)
                            + "' type='text' name='opt4' id='opt4' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Option4' required=''>\n"
                            + "                  </div></div>\n"
                            + "                  <div>\n"
                            + "                      <label for='ans' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Answer</label>\n"
                            + "                      <input value='"
                            + db.Rst.getString(7)
                            + "' type='text' name='ans' id='ans' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Answer' required=''>\n"
                            + "                  </div>\n"
                            + "                  <div>\n"
                            + "                       <input type='hidden' name='upqueid' value='"
                            + upqueid
                            + "'>\n"
                            + "                  </div>\n"
                            + "                  <button type='submit' class='w-full text-white bg-blue-600 hover:bg-blue-700 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800'>Update Question</button>\n"
                            + "              </form>\n"
                            + "          </div>\n"
                            + "      </div>\n"
                            + "  </div>\n"
                            + "");
                } else {
                    response.sendRedirect("AdminHome?choice=UpdateQuestion&msg=Wrong Question Id&msgtype=error");
                }
            } else {
                out.println("\n"
                        + "  <div class='md:mx-20 lg:my-36 md:my-28 sm:my-16 sm:mx-6 my-10 mx-5 w-full'>\n"
                        + "      <div class='bg-white rounded-lg shadow dark:border md:mt-0  xl:p-0 dark:bg-gray-800 dark:border-gray-700'>\n"
                        + "          <div class='px-6 sm:px-8 py-4'>\n"
                        + "              <h1 class='text-xl text-center font-bold leading-tight tracking-tight text-gray-900 md:text-2xl dark:text-white'>\n"
                        + "                  Need A Question Id To Update Question\n"
                        + "              </h1>\n"
                        + "              <form class='space-y-2' action='UpdateQuestion' method='post'>\n"
                        + "                  <div>\n"
                        + "                       <input type='hidden' name='check' value='true'>\n"
                        + "                  </div>\n"
                        + "                  <div>\n"
                        + "                      <label for='upqueid' class='block mb-2 text-sm font-medium text-gray-900 dark:text-white'>Question Id</label>\n"
                        + "                      <input type='number' name='upqueid' id='upqueid' class='bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500' placeholder='Please Enter Question Id' required=''>\n"
                        + "                  </div>\n"
                        + "                  <button type='submit' class='w-full text-white bg-blue-600 hover:bg-blue-700 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800'>Submit</button>\n"
                        + "              </form>\n"
                        + "          </div>\n"
                        + "      </div>\n"
                        + "  </div>\n"
                        + "");
            }

            if (queid != null
                    || que != null
                    || opt1 != null
                    || opt2 != null
                    || opt3 != null
                    || opt4 != null
                    || ans != null) {
                Db_Connection db = new Db_Connection();
                String Query = "update quest_mstr set qid=?, ques=?, opt1=?, opt2=?, opt3=?, opt4=?, ans=? where qid=?";
                db.Pstmt = db.Con.prepareStatement(Query);
                db.Pstmt.setString(1, queid);
                db.Pstmt.setString(2, que);
                db.Pstmt.setString(3, opt1);
                db.Pstmt.setString(4, opt2);
                db.Pstmt.setString(5, opt3);
                db.Pstmt.setString(6, opt4);
                db.Pstmt.setString(7, ans);
                db.Pstmt.setString(8, upqueid);
                int i = db.Pstmt.executeUpdate();
                if (i > 0) {
                    response.sendRedirect("AdminHome?choice=ViewQuestionList&msg=Question Successfully Updated&msgtype=success");
                } else {
                    response.sendRedirect("AdminHome?choice=ViewQuestionList&msg=Error In Question Updation&msgtype=error");
                }
            }

        } catch (SQLException | IOException e) {
            response.sendRedirect("AdminHome?choice=UpdateQuestion&msg=Question Id Should Be Unique&msgtype=error&upqueid=" + upqueid);
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
