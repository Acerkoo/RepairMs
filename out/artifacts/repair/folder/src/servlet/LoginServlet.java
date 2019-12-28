package servlet;

import dao.userinfo.Userinfo;
import dao.userinfo.UserinfoDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
//        System.out.println(username + "  " + password);

        UserinfoDaoImpl userinfoDao = new UserinfoDaoImpl();
        Userinfo userinfo = userinfoDao.loginUserinfo(username, password);

        if(userinfo != null) {
            HttpSession session = request.getSession();
            session.setAttribute("userinfo", userinfo);
            session.setAttribute("user", username);
            session.setAttribute("position", Integer.parseInt(userinfo.getPosition()));
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
