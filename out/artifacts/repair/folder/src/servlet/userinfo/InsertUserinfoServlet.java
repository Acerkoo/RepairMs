package servlet.userinfo;

import dao.professer.Professer;
import dao.professer.ProfesserDaoImpl;
import dao.userinfo.Userinfo;
import dao.userinfo.UserinfoDaoImpl;
import service.userinfo.UserinfoDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/InsertUserinfoServlet")
public class InsertUserinfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        UserinfoDaoImpl userinfoDao = new UserinfoDaoImpl();
        String id = String.valueOf(userinfoDao.getId());
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String position = request.getParameter("position");

        Userinfo userinfo = new Userinfo(id, username, password, position);
        userinfoDao.insertUserinfo(userinfo);

        if(position.equals("3")) {
            ProfesserDaoImpl pdi = new ProfesserDaoImpl();
            Professer professer = new Professer(id, username, "");
            pdi.insertProfesser(professer);
        }

        request.getRequestDispatcher("userinfoMain.jsp").forward(request, response);
    }
}
