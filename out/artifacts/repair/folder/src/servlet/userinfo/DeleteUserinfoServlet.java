package servlet.userinfo;

import dao.userinfo.UserinfoDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteUserinfoServlet")
public class DeleteUserinfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");

        String id = request.getParameter("id");
        UserinfoDaoImpl userinfoDao = new UserinfoDaoImpl();
        userinfoDao.deleteUserinfo(id);

        request.getRequestDispatcher("userinfoMain.jsp").forward(request, response);
    }
}
