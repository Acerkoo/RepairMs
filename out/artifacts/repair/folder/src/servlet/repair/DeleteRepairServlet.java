package servlet.repair;

import service.repair.RepairImplService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteRepairServlet")
public class DeleteRepairServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        System.out.println("Delete: " + id);
        RepairImplService repairImplService = RepairImplService.getInstance();

        repairImplService.deleteRepairinfo(id);
        request.getRequestDispatcher("repairMain.jsp").forward(request, response);
    }
}
