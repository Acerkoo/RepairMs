package servlet.prerepair;

import dao.prerepair.PreRepair;
import service.prerepair.PreRepairServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UpdateRRbyIdServlet")
public class UpdateRRbyIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        String rn = request.getParameter("rn");
        String cn = request.getParameter("cn");
        String pt = request.getParameter("pt");
        String mb = request.getParameter("mb");
        String mt = request.getParameter("mt");
        String sn = request.getParameter("sn");
        String lo = request.getParameter("lo");
        String st = request.getParameter("st");
        String ft = request.getParameter("ft");
        String ac = request.getParameter("ac");
        String po = request.getParameter("po");
        String ii = request.getParameter("ii");
        String hd = request.getParameter("hd");
        String mm = request.getParameter("mm");
        String op = request.getParameter("op");
        String ad = request.getParameter("ad");
        String bt = request.getParameter("bt");
        String oc = request.getParameter("oc");
        String of = request.getParameter("of");
        String os = request.getParameter("os");
        String rt = request.getParameter("rt");
        String ep = request.getParameter("ep");
        String rs = request.getParameter("rs");
        String qs = request.getParameter("qs");
        PreRepair preRepair = new PreRepair(
                rn, cn, pt,mb, mt, sn, lo, st, ft, ac, po, ii, hd, mm, op, ad, bt, oc, of, os, rt, ep, "0"
        );

        PreRepairServiceImpl rrsi = PreRepairServiceImpl.getInstance();
        rrsi.deleteRepairRecord(rn);
        rrsi.insertRepairRecord(preRepair);

        request.getRequestDispatcher("preRepairMain.jsp").forward(request, response);
    }
}
