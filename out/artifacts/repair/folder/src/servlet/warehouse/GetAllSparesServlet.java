package servlet.warehouse;

import dao.warehouse.Spare;
import dao.warehouse.SpareDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/GetAllSparesServlet")
public class GetAllSparesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
//        System.out.println("OK!");
        SpareDaoImpl spareService = SpareDaoImpl.getInstance();
        List<Spare> spares=spareService.getAllSpares();
        request.setAttribute("spares",spares);
        request.getRequestDispatcher("spareMain.jsp").forward(request,response);
    }
}
