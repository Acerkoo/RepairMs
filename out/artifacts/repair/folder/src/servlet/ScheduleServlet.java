package servlet;

import dao.professer.Professer;
import dao.professer.ProfesserDaoImpl;
import dao.repair.Repairinfo;
import service.repair.RepairImplService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@WebServlet("/ScheduleServlet")
public class ScheduleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RepairImplService ri = RepairImplService.getInstance();
        List<Repairinfo> list = ri.queryByStatus("0");

        ProfesserDaoImpl professerDao = new ProfesserDaoImpl();
        List<Professer> list1 = professerDao.queryAllProfesses();
        int pn = 0, len = list1.size();
        Iterator<Professer> iterator1 = list1.iterator();
        Professer []arr = new Professer[len];
        while(iterator1.hasNext()) {
            arr[pn] = new Professer();
            arr[pn++] = iterator1.next();
        }
        Random random = new Random();

        Iterator<Repairinfo> iter = list.iterator();
        List<Repairinfo> res = new ArrayList<>();

        while(iter.hasNext()) {
            Repairinfo repairinfo = iter.next();
            int pos = random.nextInt(len);
            repairinfo.setPeople(arr[pos].getName());
            repairinfo.setStatus("1");
            ri.deleteRepairinfo(repairinfo.getId());
            ri.insertRepairinfo(repairinfo);
            res.add(repairinfo);
        }

        request.setAttribute("arr", res);
        request.getRequestDispatcher("taskFun.jsp").forward(request, response);
    }
}
