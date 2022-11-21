package Admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminHome extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        Object name = session.getAttribute("Admin");

        String msg = request.getParameter("msg"),
                msgtype = request.getParameter("msgtype"),
                choice = request.getParameter("choice");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!doctype html>\n"
                    + "<html>\n"
                    + "<head>\n"
                    + "  <meta charset='UTF-8'>\n"
                    + "  <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n"
                    + "  <script src=\"https://unpkg.com/flowbite@1.5.3/dist/flowbite.js\"></script>\n"
                    + "<script src=\"https://cdn.tailwindcss.com\"></script>"
                    + "<script src=\"https://kit.fontawesome.com/fdf05f1614.js\" crossorigin=\"anonymous\"></script>"
                    + "</head>\n"
                    + "<body class='bg-gray-400'>\n");
            out.println("<nav class='bg-purple-600 px-2 sm:px-20 py-2.5 rounded dark:bg-gray-900'>\n"
                    + "  <div class='flex flex-wrap justify-between items-center mx-auto'>\n"
                    + "  <a href='AdminHome' class='flex items-center'>\n"
                    + "      <img src='Images/Plogo.png' class='mr-3 h-6 sm:h-9' alt='Flowbite Logo'>\n"
                    + "  </a>\n"
                    + "  <div class='flex items-center md:order-2'>\n"
                    + "      <button type='button' class='flex mr-3 text-sm bg-gray-800 rounded-full md:mr-0 focus:ring-4 focus:ring-gray-300 dark:focus:ring-gray-600' id='user-menu-button' aria-expanded='false' data-dropdown-toggle='user-dropdown' data-dropdown-placement='bottom'>\n"
                    + "        <span class='sr-only'>Open user menu</span>\n"
                    + "        <img class='w-8 h-8 rounded-full' src='Images/AdminImg.jpg' alt='user photo'>\n"
                    + "      </button>\n"
                    + "      <!-- Dropdown menu -->\n"
                    + "      <div class='hidden z-50 my-4 text-base list-none bg-white rounded divide-y divide-gray-100 shadow dark:bg-gray-700 dark:divide-gray-600' id='user-dropdown' data-popper-reference-hidden='' data-popper-escaped='' data-popper-placement='bottom' style='position: absolute; inset: 0px auto auto 0px; margin: 0px; transform: translate3d(0px, 10.4px, 0px);'>\n"
                    + "        <div class='py-3 px-4'>\n"
                    + "          <span class='block text-sm text-gray-900 dark:text-white'>Mohd Ahasan Khan</span>\n"
                    + "          <span class='block text-sm font-medium text-gray-500 truncate dark:text-gray-400'>"
                    + name
                    + "</span>\n"
                    + "        </div>\n"
                    + "        <ul class='py-1' aria-labelledby='user-menu-button'>\n"
                    + "          <li>\n"
                    + "            <a href='AdminHome?choice=Profile' class='block py-2 px-4 text-sm text-gray-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:text-gray-200 dark:hover:text-white'>Profile</a>\n"
                    + "          </li>\n"
                    + "          <li>\n"
                    + "            <a href='AdminHome?choice=UpdateProfile' class='block py-2 px-4 text-sm text-gray-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:text-gray-200 dark:hover:text-white'>Update Profile</a>\n"
                    + "          </li>\n"
                    + "          <li>\n"
                    + "            <a href='AdminHome?choice=ChangePassword' class='block py-2 px-4 text-sm text-gray-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:text-gray-200 dark:hover:text-white'>Change Password</a>\n"
                    + "          </li>\n"
                    + "          <li>\n"
                    + "            <a href='Logout' class='block py-2 px-4 text-sm text-gray-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:text-gray-200 dark:hover:text-white'>Logout</a>\n"
                    + "          </li>\n"
                    + "        </ul>\n"
                    + "      </div>\n"
                    + "      <button data-collapse-toggle='mobile-menu-2' type='button' class='inline-flex items-center p-2 ml-1 text-sm text-gray-500 rounded-lg md:hidden hover:bg-gray-100 focus:outline-none focus:ring-2 focus:ring-gray-200 dark:text-gray-400 dark:hover:bg-gray-700 dark:focus:ring-gray-600' aria-controls='mobile-menu-2' aria-expanded='false'>\n"
                    + "        <span class='sr-only'>Open main menu</span>\n"
                    + "        <svg class='w-6 h-6' aria-hidden='true' fill='currentColor' viewBox='0 0 20 20' xmlns='http://www.w3.org/2000/svg'><path fill-rule='evenodd' d='M3 5a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 10a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 15a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1z' clip-rule='evenodd'></path></svg>\n"
                    + "    </button>\n"
                    + "  </div>\n"
                    + "  <div class='hidden justify-between items-center w-full md:flex md:w-auto md:order-1' id='mobile-menu-2'>\n"
                    + "    <ul class='flex flex-col p-4 mt-4 bg-orange-400 rounded-lg  md:flex-row md:space-x-8 md:mt-0 md:text-sm md:font-medium dark:bg-gray-800 md:dark:bg-gray-900 '>\n"
                    + "      <li>\n"
                    + "        <a href='AdminHome?choice=DashBoard' class='block py-2 pr-4 pl-3 text-gray-700 rounded hover:bg-gray-100 md:hover:bg-transparent hover:text-blue-700 md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent '>Home</a>\n"
                    + "      </li>\n"
                    + "<li>\n"
                    + "            <button id='dropdownNavbarLink' data-dropdown-toggle='DropdownExams' class='flex justify-between items-center py-2 pr-4 pl-3 w-full font-medium text-gray-700  hover:bg-gray-50 md:hover:bg-transparent  hover:text-blue-700 md:p-0 md:w-auto dark:text-gray-400 dark:hover:text-white dark:focus:text-white  dark:hover:bg-gray-700 md:dark:hover:bg-transparent'>Manage Exams <svg class='ml-1 w-4 h-4' aria-hidden='true' fill='currentColor' viewBox='0 0 20 20' xmlns='http://www.w3.org/2000/svg'><path fill-rule='evenodd' d='M5.293 7.293a1 1 0 011.414 0L10 10.586l3.293-3.293a1 1 0 111.414 1.414l-4 4a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414z' clip-rule='evenodd'></path></svg></button>\n"
                    + "            <!-- Dropdown menu -->\n"
                    + "            <div id='DropdownExams' class='hidden z-10 w-44 font-normal bg-white rounded divide-y divide-gray-100 shadow dark:bg-gray-700 dark:divide-gray-600'>\n"
                    + "                <ul class='py-1 text-sm text-gray-700 dark:text-gray-400' aria-labelledby='dropdownLargeButton'>\n"
                    + "                  <li>\n"
                    + "                    <a href='AdminHome?choice=AddQuestion' class='block py-2 px-4 hover:text-blue-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white'>Add Questions</a>\n"
                    + "                  </li>\n"
                    + "                  <li>\n"
                    + "                    <a href='AdminHome?choice=UpdateQuestion' class='block py-2 px-4 hover:text-blue-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white'>Update Questions</a>\n"
                    + "                  </li>\n"
                    + "                  <li>\n"
                    + "                    <a href='AdminHome?choice=DeleteQuestion' class='block py-2 px-4 hover:text-blue-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white'>Delete Questions</a>\n"
                    + "                  </li>\n"
                    + "                  <li>\n"
                    + "                    <a href='AdminHome?choice=ViewQuestionList' class='block py-2 px-4 hover:text-blue-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white'>Question List</a>\n"
                    + "                  </li>\n"
                    + "                    <a href='AdminHome?choice=ViewFeedback' class='block py-2 px-4 hover:text-blue-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white'>View Feedback</a>\n"
                    + "                  </li>\n"
                    + "                </ul>\n"
                    + "            </div>\n"
                    + "        </li>"
                    + "<li>\n"
                    + "            <button id='dropdownNavbarLink' data-dropdown-toggle='DropdownStudents' class='flex justify-between items-center py-2 pr-4 pl-3 w-full font-medium text-gray-700 hover:bg-gray-50 md:hover:bg-transparent  hover:text-blue-700 md:p-0 md:w-auto dark:text-gray-400 dark:hover:text-white dark:focus:text-white  dark:hover:bg-gray-700 md:dark:hover:bg-transparent'>Manage Students <svg class='ml-1 w-4 h-4' aria-hidden='true' fill='currentColor' viewBox='0 0 20 20' xmlns='http://www.w3.org/2000/svg'><path fill-rule='evenodd' d='M5.293 7.293a1 1 0 011.414 0L10 10.586l3.293-3.293a1 1 0 111.414 1.414l-4 4a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414z' clip-rule='evenodd'></path></svg></button>\n"
                    + "            <!-- Dropdown menu -->\n"
                    + "            <div id='DropdownStudents' class='hidden z-10 w-44 font-normal bg-white rounded divide-y divide-gray-100 shadow dark:bg-gray-700 dark:divide-gray-600'>\n"
                    + "                <ul class='py-1 text-sm text-gray-700 dark:text-gray-400' aria-labelledby='dropdownLargeButton'>\n"
                    + "                  <li>\n"
                    + "                    <a href='AdminHome?choice=StudentList' class='block py-2 px-4 hover:text-blue-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white'>Students List</a>\n"
                    + "                  </li>\n"
                    + "                  <li>\n"
                    + "                    <a href='AdminHome?choice=UpdateStudent' class='block py-2 px-4 hover:text-blue-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white'>Update Student</a>\n"
                    + "                  </li>\n"
                    + "                  <li>\n"
                    + "                    <a href='AdminHome?choice=DeleteStudent' class='block py-2 px-4 hover:text-blue-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white'>Delete Student</a>\n"
                    + "                  </li>\n"
                    + "                </ul>\n"
                    + "            </div>\n"
                    + "        </li>"
                    + "      <li>\n"
                    + "        <a href='AdminHome?choice=Result' class='block py-2 pr-4 pl-3 text-gray-700 rounded hover:bg-gray-100 md:hover:bg-transparent hover:text-blue-700 md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent '>Result</a>\n"
                    + "      </li>\n"
                    + "    </ul>\n"
                    + "  </div>\n"
                    + "  </div>\n"
                    + "</nav>");
            if (msg != null) {
                if (msgtype != null) {
                    if (msgtype.equals("success")) {
                        out.println("<div class='relative w-full'>"
                                + "<div id='toast-success' class='absolute top-5 right-5 flex items-center p-4 mb-4 w-full max-w-xs text-white text-bold bg-green-400 rounded-lg shadow dark:text-gray-400 dark:bg-gray-800' role='alert'>\n"
                                + "    <div class='inline-flex flex-shrink-0 justify-center items-center w-8 h-8 text-green-500 bg-green-100 rounded-lg dark:bg-green-800 dark:text-green-200'>\n"
                                + "        <svg aria-hidden='true' class='w-5 h-5' fill='currentColor' viewBox='0 0 20 20' xmlns='http://www.w3.org/2000/svg'><path fill-rule='evenodd' d='M16.707 5.293a1 1 0 010 1.414l-8 8a1 1 0 01-1.414 0l-4-4a1 1 0 011.414-1.414L8 12.586l7.293-7.293a1 1 0 011.414 0z' clip-rule='evenodd'></path></svg>\n"
                                + "        <span class='sr-only'>Check icon</span>\n"
                                + "    </div>\n"
                                + "    <div class='ml-3 text-sm font-normal'>"
                                + msg
                                + "</div>\n"
                                + "    <button type='button' class='ml-auto -mx-1.5 -my-1.5 bg-white text-gray-400 hover:text-gray-900 rounded-lg focus:ring-2 focus:ring-gray-300 p-1.5 hover:bg-gray-100 inline-flex h-8 w-8 dark:text-gray-500 dark:hover:text-white dark:bg-gray-800 dark:hover:bg-gray-700' data-dismiss-target='#toast-success' aria-label='Close'>\n"
                                + "        <span class='sr-only'>Close</span>\n"
                                + "        <svg aria-hidden='true' class='w-5 h-5' fill='currentColor' viewBox='0 0 20 20' xmlns='http://www.w3.org/2000/svg'><path fill-rule='evenodd' d='M4.293 4.293a1 1 0 011.414 0L10 8.586l4.293-4.293a1 1 0 111.414 1.414L11.414 10l4.293 4.293a1 1 0 01-1.414 1.414L10 11.414l-4.293 4.293a1 1 0 01-1.414-1.414L8.586 10 4.293 5.707a1 1 0 010-1.414z' clip-rule='evenodd'></path></svg>\n"
                                + "    </button>\n"
                                + "</div>"
                                + "</div>");
                    } else if (msgtype.equals("error")) {
                        out.println("<div class='relative w-full'><div id='toast-warning' class='absolute top-5 right-5 flex items-center p-4 w-full max-w-xs text-white bg-red-600 rounded-lg shadow dark:text-gray-400 dark:bg-gray-800' role='alert'>\n"
                                + "    <div class='inline-flex flex-shrink-0 justify-center items-center w-8 h-8 text-orange-500 bg-red-100 rounded-lg dark:bg-orange-700 dark:text-orange-200'>\n"
                                + "        <svg xmlns='http://www.w3.org/2000/svg' class='w-8 h-8 text-red-600' viewBox='0 0 20 20' fill='currentColor'>\n"
                                + "      <path fill-rule='evenodd'\n"
                                + "        d='M18 10a8 8 0 11-16 0 8 8 0 0116 0zm-7 4a1 1 0 11-2 0 1 1 0 012 0zm-1-9a1 1 0 00-1 1v4a1 1 0 102 0V6a1 1 0 00-1-1z'\n"
                                + "        clip-rule='evenodd' />\n"
                                + "    </svg>\n"
                                + "<span class='sr-only'>Warning icon</span>\n"
                                + "    </div>\n"
                                + "    <div class='ml-3 text-sm font-normal'>"
                                + msg
                                + "</div>\n"
                                + "    <button type='button' class='ml-auto -mx-1.5 -my-1.5 bg-white text-gray-400 hover:text-gray-900 rounded-lg focus:ring-2 focus:ring-gray-300 p-1.5 hover:bg-gray-100 inline-flex h-8 w-8 dark:text-gray-500 dark:hover:text-white dark:bg-gray-800 dark:hover:bg-gray-700' data-dismiss-target='#toast-warning' aria-label='Close'>\n"
                                + "        <span class='sr-only'>Close</span>\n"
                                + "        <svg aria-hidden='true' class='w-5 h-5' fill='currentColor' viewBox='0 0 20 20' xmlns='http://www.w3.org/2000/svg'><path fill-rule='evenodd' d='M4.293 4.293a1 1 0 011.414 0L10 8.586l4.293-4.293a1 1 0 111.414 1.414L11.414 10l4.293 4.293a1 1 0 01-1.414 1.414L10 11.414l-4.293 4.293a1 1 0 01-1.414-1.414L8.586 10 4.293 5.707a1 1 0 010-1.414z' clip-rule='evenodd'></path></svg>\n"
                                + "    </button>\n"
                                + "</div></div>");
                    } else if (msgtype.equals("delete")) {
                        out.println("<div class='relative w-full'><div id='toast-danger' class='absolute top-5 right-5 flex items-center p-4 mb-4 w-full max-w-xs text-white bg-pink-600 rounded-lg shadow dark:text-gray-400 dark:bg-gray-800' role='alert'>\n"
                                + "    <div class='inline-flex flex-shrink-0 justify-center items-center w-8 h-8 text-red-500 bg-pink-100 rounded-lg dark:bg-red-800 dark:text-red-200'>\n"
                                + "       <svg aria-hidden=\"true\" class=\"w-5 h-5\" fill=\"currentColor\" viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\"><path fill-rule=\"evenodd\" d=\"M4.293 4.293a1 1 0 011.414 0L10 8.586l4.293-4.293a1 1 0 111.414 1.414L11.414 10l4.293 4.293a1 1 0 01-1.414 1.414L10 11.414l-4.293 4.293a1 1 0 01-1.414-1.414L8.586 10 4.293 5.707a1 1 0 010-1.414z\" clip-rule=\"evenodd\"></path></svg>\n"
                                + "        \n"
                                + "      <path fill-rule='evenodd'\n"
                                + "        d='M18 10a8 8 0 11-16 0 8 8 0 0116 0zm-7 4a1 1 0 11-2 0 1 1 0 012 0zm-1-9a1 1 0 00-1 1v4a1 1 0 102 0V6a1 1 0 00-1-1z'\n"
                                + "        clip-rule='evenodd' />\n"
                                + "    </svg>\n"
                                + "<span class='sr-only'>Error icon</span>\n"
                                + "    </div>\n"
                                + "    <div class='ml-3 text-sm font-normal'>"
                                + msg
                                + "</div>\n"
                                + "    <button type='button' class='ml-auto -mx-1.5 -my-1.5 bg-white text-gray-400 hover:text-gray-900 rounded-lg focus:ring-2 focus:ring-gray-300 p-1.5 hover:bg-gray-100 inline-flex h-8 w-8 dark:text-gray-500 dark:hover:text-white dark:bg-gray-800 dark:hover:bg-gray-700' data-dismiss-target='#toast-danger' aria-label='Close'>\n"
                                + "        <span class='sr-only'>Close</span>\n"
                                + "        <svg aria-hidden='true' class='w-5 h-5' fill='currentColor' viewBox='0 0 20 20' xmlns='http://www.w3.org/2000/svg'><path fill-rule='evenodd' d='M4.293 4.293a1 1 0 011.414 0L10 8.586l4.293-4.293a1 1 0 111.414 1.414L11.414 10l4.293 4.293a1 1 0 01-1.414 1.414L10 11.414l-4.293 4.293a1 1 0 01-1.414-1.414L8.586 10 4.293 5.707a1 1 0 010-1.414z' clip-rule='evenodd'></path></svg>\n"
                                + "    </button>\n"
                                + "</div></div>");

                    }
                }
            }
            out.println("<div class='flex justify-center'>");

            if (name != null) {

                if (choice != null) {
                    switch (choice) {
                        case "UpdateQuestion":
                            RequestDispatcher rd = request.getRequestDispatcher("UpdateQuestion");
                            rd.include(request, response);
                            break;
                        case "ViewQuestionList":
                            RequestDispatcher rd1 = request.getRequestDispatcher("ViewQuestionList");
                            rd1.include(request, response);
                            break;
                        case "AddQuestion":
                            RequestDispatcher rd2 = request.getRequestDispatcher("AddQuestion");
                            rd2.include(request, response);
                            break;
                        case "DeleteQuestion":
                            RequestDispatcher rd4 = request.getRequestDispatcher("DeleteQuestion");
                            rd4.include(request, response);
                            break;
                        case "ViewFeedback":
                            RequestDispatcher rd5 = request.getRequestDispatcher("ViewFeedback");
                            rd5.include(request, response);
                            break;
                        case "Result":
                            RequestDispatcher rd6 = request.getRequestDispatcher("Result");
                            rd6.include(request, response);
                            break;
                        case "StudentList":
                            RequestDispatcher rd7 = request.getRequestDispatcher("StudentList");
                            rd7.include(request, response);
                            break;
                        case "UpdateStudent":
                            RequestDispatcher rd8 = request.getRequestDispatcher("UpdateStudent");
                            rd8.include(request, response);
                            break;
                        case "DeleteStudent":
                            RequestDispatcher rd9 = request.getRequestDispatcher("DeleteStudent");
                            rd9.include(request, response);
                            break;
                        case "ChangePassword":
                            RequestDispatcher rd12 = request.getRequestDispatcher("ChangePassword");
                            rd12.include(request, response);
                            break;
                        case "Profile":
                            RequestDispatcher rd13 = request.getRequestDispatcher("Profile");
                            rd13.include(request, response);
                            break;
                        case "UpdateProfile":
                            RequestDispatcher rd14 = request.getRequestDispatcher("UpdateProfile");
                            rd14.include(request, response);
                            break;
                        default:
                            RequestDispatcher rd3 = request.getRequestDispatcher("AdminDashBoard");
                            rd3.include(request, response);
                    }
                } else {
                    response.sendRedirect("AdminHome?choice=AdminDashBoard");

                }
            } else {
                response.sendRedirect("/OnlineExam");
            }

            out.println("</div></body>\n"
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
