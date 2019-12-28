package servlet.warehouse;


import dao.warehouse.SpareLog;
import dao.warehouse.SpareLogDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/GetASpereLogByIDServlet")
public class GetASpereLogByIDServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        String ID = request.getParameter("ID");
        System.out.println("OK!");
        System.out.println(ID);
        SpareLogDaoImpl spareLogService =  new SpareLogDaoImpl();
        List<SpareLog> sparelogs=spareLogService.getSpareLogByID(ID);
        request.setAttribute("sparelogs",sparelogs);
        request.getRequestDispatcher("spareLogByID.jsp").forward(request,response);
    }
}
