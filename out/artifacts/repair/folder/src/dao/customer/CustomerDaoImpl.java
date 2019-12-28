package dao.customer;

import dao.prerepair.PreRepair;
import utils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.DoubleBinaryOperator;

public class CustomerDaoImpl implements CustomerDao {


    public boolean insertCustomer(Customer customer) {

        Date t = new Date();
        java.sql.Timestamp time = new java.sql.Timestamp(t.getTime());
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");//定义文字显示格式
        SimpleDateFormat df2 = new SimpleDateFormat("yyyyMMddHHmmss");//定义文字显示格式，用这串编号作为编号
        String cusnum = df2.format(time);
        String ttime = df1.format(time);//time为要转换的时间。

        String idnum = customer.getIdnum();
        String cname = customer.getCusName();
        String cusnature = customer.getCusNature();
        String cuswork = customer.getCusWork();
        String custele = customer.getCusTele();
        String cusadd = customer.getCusAdd();
        String cusemail = customer.getCusEmail();

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String sql = "insert into customer values(?,?,?,?,?,?,?,?,?)";
            conn = DbUtils.getConnection();
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, cusnum);
            pstmt.setString(2, idnum);
            pstmt.setString(3, cname);
            pstmt.setString(4, cusnature);
            pstmt.setString(5, cuswork);
            pstmt.setString(6, custele);
            pstmt.setString(7, cusadd);
            pstmt.setString(8, cusemail);
            pstmt.setString(9, ttime);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, conn);
        }
        return true;
    }

    public boolean deleteCustomer(String id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DbUtils.getConnection();
            String sql = "delete  from customer where cid = ? ";

            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, conn);
        }
        return true;
    }

    @Override
    public void updateCustomer(String id, Customer curtomer) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "update customer set cname=? cnature=? cwork=? ctele=? caddr=? cemail=? where cid=?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, curtomer.getCusName());
            pstmt.setString(2, curtomer.getCusNature());
            pstmt.setString(3, curtomer.getCusWork());
            pstmt.setString(4, curtomer.getCusTele());
            pstmt.setString(5, curtomer.getCusAdd());
            pstmt.setString(6, curtomer.getCusEmail());
            pstmt.setString(7, curtomer.getIdnum());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
    }

    public Customer queryCustomerById(String id) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Customer customer = null;

        try{
            connection = DbUtils.getConnection();
            String sql = "select * from customer where cnum = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();

            if(rs.next()) {
                customer = new Customer(
                        rs.getString("cnum"),
                        rs.getString("cid"),
                        rs.getString("cname"),
                        rs.getString("cnature"),
                        rs.getString("cwork"),
                        rs.getString("ctele"),
                        rs.getString("caddr"),
                        rs.getString("cemail"),
                        rs.getString("ctime")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return customer;
    }

    @Override
    public Customer queryCustomerByName(String name) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Customer customer = null;

        try{
            connection = DbUtils.getConnection();
            String sql = "select * from customer where cname = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, name);
            rs = pstmt.executeQuery();

            if(rs.next()) {
                customer = new Customer(
                        rs.getString("cnum"),
                        rs.getString("cid"),
                        rs.getString("cname"),
                        rs.getString("cnature"),
                        rs.getString("cwork"),
                        rs.getString("ctele"),
                        rs.getString("caddr"),
                        rs.getString("cemail"),
                        rs.getString("ctime")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return customer;
    }

    @Override
    public List<Customer> queryCustomerALl() {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Customer> list = new ArrayList<>();

        try{
            connection = DbUtils.getConnection();
            String sql = "select * from customer";

            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while(rs.next()) {
                Customer customer = new Customer(
                        rs.getString("cnum"),
                        rs.getString("cid"),
                        rs.getString("cname"),
                        rs.getString("cnature"),
                        rs.getString("cwork"),
                        rs.getString("ctele"),
                        rs.getString("caddr"),
                        rs.getString("cemail"),
                        rs.getString("ctime")
                );
                list.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return list;
    }
}

