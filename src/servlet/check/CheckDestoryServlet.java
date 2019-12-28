package servlet.check;

import service.prerepair.PreRepairServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CheckDestoryServlet")
public class CheckDestoryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        String id = request.getParameter("id");
        PreRepairServiceImpl rrsi = PreRepairServiceImpl.getInstance();
        rrsi.deleteRepairRecord(id);

        request.getRequestDispatcher("").forward(request, response);
    }
}
