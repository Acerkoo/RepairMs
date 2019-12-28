package servlet.customer;

import dao.customer.Customer;
import service.customer.CustomerServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CustomerInsertServlet")
public class InsertCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String idnum = request.getParameter("pid");
        String cname = request.getParameter("name");
        String nature = request.getParameter("methods");
        String work = request.getParameter("work");
        String tele = request.getParameter("tele");
        String add = request.getParameter("addr");
        String email = request.getParameter("email");

        Customer customer = new Customer();
        customer.setIdnum(idnum);
        customer.setCusName(cname);
        customer.setCusNature(nature);
        customer.setCusWork(work);
        customer.setCusTele(tele);
        customer.setCusAdd(add);
        customer.setCusEmail(email);

        CustomerServiceImpl customerService = CustomerServiceImpl.getInstance();
        customerService.insertCustomer(customer);
        request.getRequestDispatcher("customerMain.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request, response);
    }
}
