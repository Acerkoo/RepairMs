package dao.settlement;

import utils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleBinaryOperator;

public class SettlementDaoImpl implements SettlementDao {

    @Override
    public Settlement querySettlementById(String id) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Settlement settlement = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "select * from settlement where wid = ?";
            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                settlement = new Settlement(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return settlement;
    }

    @Override
    public void insertSettlement(Settlement settlement) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "insert into settlement values (?, ?, ?, ?, ?, ?);";
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, settlement.getwId());
            pstmt.setString(2, settlement.getwPeoPrice());
            pstmt.setString(3, settlement.getwPartPrice());
            pstmt.setString(4, settlement.getWpromise());
            pstmt.setString(5, settlement.getCareThing());
            pstmt.setString(6, settlement.getBillDate());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
    }

    @Override
    public List querySettlementAll() {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Settlement> list = new ArrayList<>();

        try {
            connection = DbUtils.getConnection();
            String sql = "select * from settlement";
            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Settlement settlement = new Settlement(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
                list.add(settlement);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return list;
    }

    @Override
    public void deleteSettlement(String id) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "delete from settlement where wid = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
    }
}
