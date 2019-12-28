package dao.flow;

import utils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlowDaoImpl implements FlowDao {
    @Override
    public void insertFlow(Flow flow) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "insert into flowinfo values(?,?,?,?,?,?)";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, flow.getFid());
            pstmt.setString(2, flow.getUsername());
            pstmt.setString(3, flow.getRank());
            pstmt.setString(4, flow.getFtime());
            pstmt.setString(5, flow.getTarget());
            pstmt.setString(6, flow.getThing());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
    }

    @Override
    public void deleteFlow(String fid) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "delete from flowinfo where fid = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, fid);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
    }

    @Override
    public List<Flow> queryFlowByUser(String name) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Flow> list = new ArrayList<>();

        try {
            connection = DbUtils.getConnection();
            String sql = "select * from flowinfo where fname = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, name);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Flow flow = new Flow(
                        rs.getString("fid"),
                        rs.getString("fname"),
                        rs.getString("frank"),
                        rs.getString("ftime"),
                        rs.getString("ftarget"),
                        rs.getString("fthing")
                );
                list.add(flow);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return list;
    }

    @Override
    public List<Flow> queryFlowByTarget(String target) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Flow> list = new ArrayList<>();

        try {
            connection = DbUtils.getConnection();
            String sql = "select * from flowinfo where ftarget = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1,target);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Flow flow = new Flow(
                        rs.getString("fid"),
                        rs.getString("fname"),
                        rs.getString("frank"),
                        rs.getString("ftime"),
                        rs.getString("ftarget"),
                        rs.getString("fthing")
                );
                list.add(flow);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return list;
    }

    @Override
    public List<Flow> queryFlowByThing(String thing) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Flow> list = new ArrayList<>();

        try {
            connection = DbUtils.getConnection();
            String sql = "select * from flowinfo where fthing = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1,thing);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Flow flow = new Flow(
                        rs.getString("fid"),
                        rs.getString("fname"),
                        rs.getString("frank"),
                        rs.getString("ftime"),
                        rs.getString("ftarget"),
                        rs.getString("fthing")
                );
                list.add(flow);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return list;
    }

    @Override
    public List<Flow> queryFlowByTime(String ftime) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Flow> list = new ArrayList<>();

        try {
            connection = DbUtils.getConnection();
            String sql = "select * from flowinfo where ftime = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1,ftime);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Flow flow = new Flow(
                        rs.getString("fid"),
                        rs.getString("fname"),
                        rs.getString("frank"),
                        rs.getString("ftime"),
                        rs.getString("ftarget"),
                        rs.getString("fthing")
                );
                list.add(flow);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return list;
    }
}
