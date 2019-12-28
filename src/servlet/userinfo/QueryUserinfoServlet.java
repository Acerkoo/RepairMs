package servlet.userinfo;

import dao.userinfo.Userinfo;
import service.userinfo.UserinfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/QueryUserinfoServlet")
public class QueryUserinfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        request.setCharacterEncoding("UTF-8");

        String id = request.getParameter("id");
        UserinfoServiceImpl userinfoService = UserinfoServiceImpl.getInstance();
        Userinfo userinfo = userinfoService.queryUserinfoBy(id);

        List<Userinfo> list = new ArrayList<>();
        if(userinfo != null) list.add(userinfo);

        request.setAttribute("arr", list);
        request.getRequestDispatcher("userinfoMain.jsp").forward(request, response);
    }
}
