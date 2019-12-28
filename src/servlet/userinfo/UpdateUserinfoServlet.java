package servlet.userinfo;

import dao.userinfo.Userinfo;
import dao.userinfo.UserinfoDaoImpl;
import service.userinfo.UserinfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UpdateUserinfoServlet")
public class UpdateUserinfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        String id = request.getParameter("id");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String position = request.getParameter("position");

        UserinfoServiceImpl userinfoService = UserinfoServiceImpl.getInstance();
        userinfoService.deleteUserinfo(id);

        Userinfo userinfo = new Userinfo(id, username, password, position);
        userinfoService.insertUserinfo(userinfo);

        request.getRequestDispatcher("userinfoMain.jsp").forward(request, response);
    }
}
