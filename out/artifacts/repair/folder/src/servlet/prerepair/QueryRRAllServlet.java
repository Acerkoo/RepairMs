package servlet.prerepair;

import dao.prerepair.PreRepair;
import service.prerepair.PreRepairServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/QueryRRAllServlet")
public class QueryRRAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        PreRepairServiceImpl rrsi = PreRepairServiceImpl.getInstance();
        List<PreRepair> list = rrsi.getAllRepairRecord();

        request.setAttribute("arr", list);
        request.getRequestDispatcher("").forward(request, response);
    }
}
