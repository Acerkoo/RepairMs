package dao.repair;

import utils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepairinfoImpl implements RepairinfoDao {
    @Override
    public Repairinfo queryById(String id) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Repairinfo repairinfo = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "select * from repairinfo where id = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                repairinfo = new Repairinfo(
                        rs.getString("id"),
                        rs.getString("people"),
                        rs.getString("jian"),
                        rs.getString("wei"),
                        rs.getString("timee"),
                        rs.getString("workTime"),
                        rs.getString("qijian"),
                        rs.getString("statuss")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return repairinfo;
    }

    @Override
    public List queryAll() {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Repairinfo> list = new ArrayList<Repairinfo>();
        try {
            connection = DbUtils.getConnection();
            String sql = "select * from repairinfo";

            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Repairinfo repairinfo = new Repairinfo(
                        rs.getString("id"),
                        rs.getString("people"),
                        rs.getString("jian"),
                        rs.getString("wei"),
                        rs.getString("timee"),
                        rs.getString("workTime"),
                        rs.getString("qijian"),
                        rs.getString("statuss")
                );
                list.add(repairinfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return list;
    }

    @Override
    public List queryByPeople(String name) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Repairinfo> list = new ArrayList<Repairinfo>();
        try {
            connection = DbUtils.getConnection();
            String sql = "select * from repairinfo where people = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, name);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Repairinfo repairinfo = new Repairinfo(
                        rs.getString("id"),
                        rs.getString("people"),
                        rs.getString("jian"),
                        rs.getString("wei"),
                        rs.getString("timee"),
                        rs.getString("workTime"),
                        rs.getString("qijian"),
                        rs.getString("statuss")
                );
                list.add(repairinfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return list;
    }

    @Override
    public List queryByStatus(String status) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Repairinfo> list = new ArrayList<Repairinfo>();
        try {
            connection = DbUtils.getConnection();
            String sql = "select * from repairinfo where statuss = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, status);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Repairinfo repairinfo = new Repairinfo(
                        rs.getString("id"),
                        rs.getString("people"),
                        rs.getString("jian"),
                        rs.getString("wei"),
                        rs.getString("timee"),
                        rs.getString("workTime"),
                        rs.getString("qijian"),
                        rs.getString("statuss")
                );
                list.add(repairinfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return list;
    }

    @Override
    public List queryByMuli(String name, String status) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Repairinfo> list = new ArrayList<Repairinfo>();
        try {
            connection = DbUtils.getConnection();
            String sql = "select * from repairinfo where statuss = ? and people = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, status);
            pstmt.setString(2, name);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Repairinfo repairinfo = new Repairinfo(
                        rs.getString("id"),
                        rs.getString("people"),
                        rs.getString("jian"),
                        rs.getString("wei"),
                        rs.getString("timee"),
                        rs.getString("workTime"),
                        rs.getString("qijian"),
                        rs.getString("statuss")
                );
                list.add(repairinfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return list;
    }

    public void insertRepairinfo(Repairinfo repairinfo) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "insert into repairinfo values(?,?,?,?,?,?,?,?)";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, repairinfo.getId());
            pstmt.setString(2, repairinfo.getPeople());
            pstmt.setString(3, repairinfo.getJian());
            pstmt.setString(4, repairinfo.getWei());
            pstmt.setString(5, repairinfo.getTimee());
            pstmt.setString(6, repairinfo.getWorkTime());
            pstmt.setString(7, repairinfo.getQijian());
            pstmt.setString(8, repairinfo.getStatus());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
    }

    public void deleteRepairinfo(String id) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "delete from repairinfo where id = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
    }

    @Override
    public void updateRepairinfo(String id, String op) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "update repairinfo set statuss = ? where id = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, op);
            pstmt.setString(2, id);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
    }
}
