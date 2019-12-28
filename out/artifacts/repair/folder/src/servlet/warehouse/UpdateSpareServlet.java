package servlet.warehouse;

import dao.warehouse.Spare;
import dao.warehouse.SpareDaoImpl;
import service.warehouse.SpareServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UpdateSpareServlet")
public class UpdateSpareServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String ID = request.getParameter("ID");
        Double money = Double.parseDouble(request.getParameter("money"));
        int number = Integer.parseInt(request.getParameter("number"));
        String inofwarehouse= request.getParameter("inofwarehouse");
        int warnumber= Integer.parseInt(request.getParameter("warnumber"));
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
        Spare spare = new Spare(name,ID,money,number,inofwarehouse,warnumber,zhuangtai);
        SpareDaoImpl spareService = new SpareDaoImpl();
        spareService.updateSpare(spare);
        request.getRequestDispatcher("GetAllSparesServlet?Update=true").forward(request,response);
    }
}
