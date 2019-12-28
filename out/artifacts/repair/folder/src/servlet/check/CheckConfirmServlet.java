package servlet.check;

import dao.prerepair.PreRepair;
import dao.repair.Repairinfo;
import service.prerepair.PreRepairServiceImpl;
import service.repair.RepairImplService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CheckConfirmServlet")
public class CheckConfirmServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");

        String id = request.getParameter("id");
        PreRepairServiceImpl rrsi = PreRepairServiceImpl.getInstance();
        rrsi.updateRepairRecord(id, "1");
        System.out.println("check: " + id);
        System.out.println(rrsi.getRepairRecordByRepairRecordno(id).toString());

        PreRepair preRepair = rrsi.getRepairRecordByRepairRecordno(id);

        Repairinfo repairinfo = new Repairinfo();
        repairinfo.setId(preRepair.getRepairnumber());
        repairinfo.setPeople("-");
        repairinfo.setJian("-");
        repairinfo.setWei("-");
        repairinfo.setTimee("-");
        repairinfo.setWorkTime("-");
        repairinfo.setQijian(preRepair.getLackofcomponent());
        repairinfo.setStatus("0");

        RepairImplService ris = RepairImplService.getInstance();
        ris.insertRepairinfo(repairinfo);

        request.getRequestDispatcher("preRepairMain.jsp").forward(request, response);
    }
}
