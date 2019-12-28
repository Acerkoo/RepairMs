package servlet.repair;

import dao.prerepair.PreRepair;
import dao.professer.Professer;
import dao.professer.ProfesserDaoImpl;
import dao.repair.Repairinfo;
import dao.settlement.Settlement;
import dao.warehouse.Spare;
import dao.warehouse.SpareDaoImpl;
import dao.warehouse.SpareLog;
import service.prerepair.PreRepairServiceImpl;
import service.repair.RepairImplService;
import service.settlement.SettlementServiceImpl;
import service.warehouse.SpareLogServiceImpl;
import service.warehouse.SpareServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@WebServlet("/UpdateRepairServlet")
public class UpdateRepairServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
//        System.out.println("ID: " + id);
        int op = id % 4;
        id = id / 4;
        RepairImplService repairImplService = RepairImplService.getInstance();
        Repairinfo repairinfo = repairImplService.queryById(String.valueOf(id));

        if (repairinfo.getStatus().equals("1") || repairinfo.getStatus().equals("2") || repairinfo.getStatus().equals("3")) {
            request.getRequestDispatcher("repairMain.jsp").forward(request, response);
        }

        if (op == 1) {
            ProfesserDaoImpl professerDao = new ProfesserDaoImpl();
            List<Professer> list1 = professerDao.queryAllProfesses();
            int pn = 0, len = list1.size();
            Iterator<Professer> iterator1 = list1.iterator();
            Professer[] arr = new Professer[len];

            while (iterator1.hasNext()) {
                arr[pn] = new Professer();
                arr[pn++] = iterator1.next();
            }

            Random random = new Random();
            int pos = random.nextInt(len);
            repairImplService.deleteRepairinfo(repairinfo.getId());
            repairinfo.setPeople(arr[pos].getName());

            repairinfo.setStatus("1");
            repairImplService.insertRepairinfo(repairinfo);
        } else if (op == 2) {
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//定义文字显示格式，用这串编号作为编号

            Date t = new Date();
            repairImplService.deleteRepairinfo(repairinfo.getId());
            java.sql.Timestamp time = new java.sql.Timestamp(t.getTime());
            repairinfo.setJian(df.format(time));
            repairinfo.setStatus("2");

            repairImplService.insertRepairinfo(repairinfo);
        } else if (op == 3) {
            Date t = new Date();
            java.sql.Timestamp time = new java.sql.Timestamp(t.getTime());
            SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");//定义文字显示格式
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//定义文字显示格式，用这串编号作为编号

            repairImplService.deleteRepairinfo(repairinfo.getId());
            repairinfo.setWei(df.format(time));
            repairinfo.setTimee(df1.format(time));

            Random rand = new Random();
            repairinfo.setWorkTime(String.valueOf(rand.nextInt(10) + 1));
            repairinfo.setStatus("3");
            repairImplService.insertRepairinfo(repairinfo);

            PreRepairServiceImpl rrsi = PreRepairServiceImpl.getInstance();
            PreRepair rr = rrsi.getRepairRecordByRepairRecordno(repairinfo.getId());

            SpareDaoImpl spareService = SpareDaoImpl.getInstance();
            Spare spare = new Spare();
            double money = 0;
            spare.setName("无");
            spare.setID(String.valueOf(rand.nextInt(20)));
            spare.setNumber(0);
            spare.setWarnnumber(1000000);

            String qijian = repairinfo.getQijian();
            if(qijian != null && !qijian.equals("")){
                spare = spareService.getSpareByID(repairinfo.getQijian());
                money = Double.valueOf(spare.getMoney());
            }

            SpareLogServiceImpl slsi = SpareLogServiceImpl.getInstance();
            SpareLog spareLog = new SpareLog(
                    spare.getName(), spare.getID(), repairinfo.getId(), 1, Double.valueOf(money), df1.format(time), "0"
            );

            slsi.insertSpareLog(spareLog);
            int warnumber = spare.getWarnnumber();
            int number = spare.getNumber();
            String zhuangtai;
            if (number > warnumber) {
                zhuangtai = "正常";
            } else if (number == warnumber) {
                zhuangtai = "临界";
            } else if (number < warnumber && number != 0) {
                zhuangtai = "警示";
            } else {
                zhuangtai = "缺货";
            }
            spareService.outofWareHouse(spare.getID(), number, zhuangtai);
            Settlement settlement = new Settlement(
                    repairinfo.getId(), rr.getEstimateprice(), String.valueOf(money), "-", "-", "-"
            );
            SettlementServiceImpl sssi = SettlementServiceImpl.getInstance();
            sssi.insertSettlement(settlement);
        }
        request.getRequestDispatcher("repairMain.jsp").forward(request, response);
    }
}
