package servlet.check;

import dao.prerepair.PreRepair;
import service.prerepair.PreRepairServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/QueryCheckStatusServlet")
public class QueryCheckStatusServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        String status = request.getParameter("status");
        PreRepairServiceImpl rrsi = PreRepairServiceImpl.getInstance();
        List<PreRepair> res = new ArrayList<>();
        List<PreRepair> query = rrsi.getAllRepairRecord();
        for (PreRepair cur: query) {
            if(cur.getRepairstatus().equals(status))
                res.add(cur);
        }

        request.setAttribute("arr", res);
        request.getRequestDispatcher("").forward(request, response);
    }
}
