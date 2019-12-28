package servlet.settlement;

import dao.settlement.Settlement;
import service.settlement.SettlementServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/querySettlementByIdServlet")
public class querySettlementByIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        SettlementServiceImpl settlementService = SettlementServiceImpl.getInstance();
        Settlement settlement = settlementService.querySettlementById(id);

        List<Settlement> list = new ArrayList<>();
        if(settlement != null) list.add(settlement);

        request.setAttribute("settlement", list);
        request.getRequestDispatcher("settlementQuery.jsp").forward(request, response);
    }
}
