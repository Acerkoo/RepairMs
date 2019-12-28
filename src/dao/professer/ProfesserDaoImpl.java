package dao.professer;

import utils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProfesserDaoImpl implements ProfesserDao{
    @Override
    public void insertProfesser(Professer professer) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "insert into professer values(?,?,?)";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, professer.getId());
            pstmt.setString(2, professer.getName());
            pstmt.setString(3, professer.getTask());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
    }

    @Override
    public void deleteProfesser(String task) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "delete from professer where task = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, task);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
    }

    @Override
    public List queryAllProfesses() {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Professer> list = new ArrayList<>();

        try {
            connection = DbUtils.getConnection();
            String sql = "select * from professer";

            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while(rs.next()) {
                Professer professer = new Professer(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3)
                );
                list.add(professer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return list;
    }
}
