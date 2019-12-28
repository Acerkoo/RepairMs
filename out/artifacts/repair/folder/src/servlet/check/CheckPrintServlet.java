package servlet.check;

import dao.customer.Customer;
import dao.prerepair.PreRepair;
import service.customer.CustomerServiceImpl;
import service.prerepair.PreRepairServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/CheckPrintServlet")
public class CheckPrintServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset-8");
        Date t = new Date();
        java.sql.Timestamp time = new java.sql.Timestamp(t.getTime());
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");//定义文字显示格式

        String id = request.getParameter("id");
        PreRepairServiceImpl prsi = PreRepairServiceImpl.getInstance();
        PreRepair preRepair = prsi.getRepairRecordByRepairRecordno(id);

        if(preRepair == null) request.getRequestDispatcher("preRepairMain.jsp").forward(request, response);

        CustomerServiceImpl csi = CustomerServiceImpl.getInstance();
        Customer customer = csi.queryCustomerById(preRepair.getCustomernumber());
        if(customer == null) request.getRequestDispatcher("preRepairMain.jsp").forward(request, response);
        System.out.println(customer.toString());

        request.setAttribute("time", df1.format(time));
        request.setAttribute("id", id);
        request.setAttribute("type", preRepair.getProducttype());
        request.setAttribute("pinpai", preRepair.getMachinebrand());
        request.setAttribute("machine", preRepair.getMachinetype());
        request.setAttribute("xilie", preRepair.getSerialnumber());
        request.setAttribute("danwei", customer.getCusAdd());
        request.setAttribute("tele", customer.getCusTele());
        request.setAttribute("xianxiang", preRepair.getSymptom());
        request.setAttribute("lingjian", preRepair.getLackofcomponent());
        request.setAttribute("suiji", "无");

        request.getRequestDispatcher("checkprintoutput.jsp").forward(request, response);
    }
}
