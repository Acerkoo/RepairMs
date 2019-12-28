package servlet.warehouse;

import dao.warehouse.Spare;
import dao.warehouse.SpareDaoImpl;
import dao.warehouse.SpareLog;
import dao.warehouse.SpareLogDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/SpareOutServlet")
public class SpareOutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sessionofOutKu  = request.getSession();
        String ID = (String) sessionofOutKu.getAttribute("spareID");
        int outnumber = Integer.parseInt(request.getParameter("outnumber"));
        int number = Integer.parseInt(request.getParameter("number"));
        String fixID = request.getParameter("fixID");
        String outofwarehouse = request.getParameter("outofwarehouse");
        String name = (String) sessionofOutKu.getAttribute("spareName");
        Double money = Double.parseDouble((String)sessionofOutKu.getAttribute("spareMoney"));
        SpareDaoImpl spareService = new SpareDaoImpl();
        int warnumber =  Integer.parseInt((String)sessionofOutKu.getAttribute("spareWarnnumber"));
        String zhuangtai;
        if (number> warnumber) {
            zhuangtai="正常";
        } else if (number== warnumber) {
            zhuangtai="临界";
        } else if (((number < warnumber)&&(number!=0))) {
            zhuangtai="警示";
        } else {
            zhuangtai="缺货";
        }
        spareService.outofWareHouse(ID,outnumber,zhuangtai);
        SpareLogDaoImpl spareLogService = new SpareLogDaoImpl();
        SpareLog spareLog = new SpareLog(name,ID,fixID,outnumber,money,outofwarehouse,"出库");
        spareLogService.insertSpareLog(spareLog);
        request.getRequestDispatcher("GetAllSparesServlet?OutKu=true").forward(request,response);
    }
}
