package servlet.warehouse;

import dao.warehouse.SpareDaoImpl;
import service.warehouse.SpareServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteSpareServlet")
public class DeleteSpareServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        request.setCharacterEncoding("utf-8");
        String ID= request.getParameter("id");
        SpareDaoImpl spareService=SpareDaoImpl.getInstance();
        spareService.deleteSpare(ID);
        request.getRequestDispatcher("GetAllSparesServlet?Delete=true").forward(request, response);
    }
}
