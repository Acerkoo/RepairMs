package servlet.repair;

import dao.repair.Repairinfo;
import service.repair.RepairImplService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/repair.html")
public class QueryByServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String Id = request.getParameter("id");
        String name = request.getParameter("name");
        String status = request.getParameter("status");
        RepairImplService ris = RepairImplService.getInstance();
        List<Repairinfo> list = new ArrayList<>();

        System.out.println("ID: " + Id + " name: " + name + " status: " + status);

        if(Id != null) {
            Repairinfo repairinfo = ris.queryById(Id);
            if(repairinfo != null) list.add(repairinfo);
            request.setAttribute("arr", list);
        } else if(status == null) {
            list = ris.queryByPeople(name);
            request.setAttribute("arr", list);
        } else if(name == null) {
            list = ris.queryByStatus(status);
            request.setAttribute("arr", list);
        } else if(name != null && status != null) {
            list = ris.queryByMuli(name, status);
            request.setAttribute("arr", list);
        }
        request.getRequestDispatcher("repairMain.jsp").forward(request, response);
    }
}
