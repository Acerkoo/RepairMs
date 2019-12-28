package servlet.customer;

import dao.customer.Customer;
import service.customer.CustomerServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/QueryCustomerByServlet")
public class QueryCustomerByServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        CustomerServiceImpl ris = CustomerServiceImpl.getInstance();
        List<Customer> list = new ArrayList<>();

//        System.out.println("ID: " + Id + " name: " + name + " status: " + status);
        Customer customer = ris.queryCustomerByName(name);

        if(customer != null)
            list.add(customer);
//        System.out.println(customer.toString());
        request.setAttribute("arr", list);

        request.getRequestDispatcher("customerMain.jsp").forward(request, response);
    }
}
