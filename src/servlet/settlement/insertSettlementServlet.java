package servlet.settlement;

import dao.prerepair.PreRepair;
import dao.settlement.Settlement;
import dao.warehouse.Spare;
import dao.warehouse.SpareDaoImpl;
import service.prerepair.PreRepairServiceImpl;
import service.settlement.SettlementServiceImpl;
import service.warehouse.SpareServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/insertSettlementServlet")
public class insertSettlementServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        PreRepairServiceImpl repairRecordService = PreRepairServiceImpl.getInstance();
        PreRepair preRepair = repairRecordService.getRepairRecordByRepairRecordno(id);

        SpareDaoImpl spareService=SpareDaoImpl.getInstance();
        Spare spare = spareService.getSpareByID(preRepair.getLackofcomponent());

//        System.out.println("~~Spare: " );
//        if(spare != null) System.out.println(spare.toString());

        Date t = new Date();
        java.sql.Timestamp time = new java.sql.Timestamp(t.getTime());
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");//定义文字显示格式


        Settlement settlement = new Settlement(
                id, preRepair.getEstimateprice(),
                String.valueOf(Double.valueOf(spare.getMoney())* Double.valueOf(spare.getNumber())),
                "", "", df1.format(time)
        );

        SettlementServiceImpl ssi = SettlementServiceImpl.getInstance();
        ssi.delteteSettlement(id);
        ssi.insertSettlement(settlement);

        request.setAttribute("arr", settlement);
        request.getRequestDispatcher("settlementInsert.jsp").forward(request, response);
    }
}
