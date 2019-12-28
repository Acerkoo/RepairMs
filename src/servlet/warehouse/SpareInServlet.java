package servlet.warehouse;

import dao.warehouse.SpareDaoImpl;
import dao.warehouse.SpareLog;
import dao.warehouse.SpareLogDaoImpl;
import servlet.repair.InsertRepairServlet;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/SpareInServlet")
public class SpareInServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String ID = request.getParameter("ID");
        int innumber = Integer.parseInt(request.getParameter("innumber"));
        int yuannumber = Integer.parseInt(request.getParameter("number"));
        String fixID = request.getParameter("fixID");
        String inofwarehouse = request.getParameter("inofwarehouse");
        Double money= Double.parseDouble(request.getParameter("money"));
        SpareDaoImpl spareService = new SpareDaoImpl();
        int warnumber = Integer.parseInt(request.getParameter("warnnumber"));
        String zhuangtai;
        int number = yuannumber+innumber;
        if (number> warnumber) {
            zhuangtai="正常";
        } else if (number== warnumber) {
            zhuangtai="临界";
        } else if (((number < warnumber)&&(number!=0))) {
            zhuangtai="警示";
        } else {
            zhuangtai="缺货";
        }
        spareService.insertSpareByID(ID,innumber,zhuangtai);
        SpareLogDaoImpl spareLogService = new SpareLogDaoImpl();
        SpareLog spareLog = new SpareLog(name,ID,fixID,innumber,money,inofwarehouse,"追加入库");
        spareLogService.insertSpareLog(spareLog);
        request.getRequestDispatcher("GetAllSparesServlet?InByID=true").forward(request,response);
    }
}
