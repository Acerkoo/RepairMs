package servlet.repair;

import dao.repair.Repairinfo;
import service.repair.RepairImplService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UpdateOneRepairServlet")
public class UpdateOneRepairServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String people = request.getParameter("people");
        String jian = request.getParameter("jian");
        String wei = request.getParameter("wei");
        String timee = request.getParameter("timee");
        String workTime = request.getParameter("worktime");
        String qijian = request.getParameter("qijian");
        String status = "0";

        Repairinfo repairinfo = new Repairinfo(id, people, jian, wei, timee, workTime, qijian, status);
        RepairImplService ris = RepairImplService.getInstance();
        ris.deleteRepairinfo(id);

        ris.insertRepairinfo(repairinfo);
        request.getRequestDispatcher("repairMain.jsp").forward(request, response);
    }
}
