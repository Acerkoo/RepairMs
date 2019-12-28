package servlet.warehouse;

import dao.warehouse.Spare;
import dao.warehouse.SpareDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/GetASparesByIDServlet")
public class GetASparesByIDServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        String ID = request.getParameter("ID");
//        System.out.println("OK!");
        SpareDaoImpl spareService = SpareDaoImpl.getInstance();
        Spare spare = spareService.getSpareByID(ID);
        if(spare.getID()==null)
        {
            request.getRequestDispatcher("GetAllSparesServlet?Chaxun=flase").forward(request, response);
        }
        else{
            request.setAttribute("item", spare);
            request.getRequestDispatcher("spareByID.jsp").forward(request, response);
        }
    }
}
