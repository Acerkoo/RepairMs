package dao.userinfo;

import utils.DbUtils;

import java.lang.constant.Constable;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserinfoDaoImpl implements UserinfoDao{

    public int getId() {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int sz = 0;

        try {
            connection = DbUtils.getConnection();
            String sql = "select * from userinfo";

            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();
            if(rs != null) {
                rs.last();
                sz = rs.getRow();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        System.out.println("size: "+ (sz+1));
        return sz + 1;
    }

    @Override
    public void insertUserinfo(Userinfo userinfo) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "insert into userinfo values(?,?,?,?)";
            pstmt = connection.prepareStatement(sql);

            pstmt.setString(1,userinfo.getUserid());
            pstmt.setString(2,userinfo.getUsername());
            pstmt.setString(3, userinfo.getPassword());
            pstmt.setString(4,userinfo.getPosition());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
    }

    @Override
    public void deleteUserinfo(String uid) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "delete from userinfo where id = ?";
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, uid);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
    }

    @Override
    public Userinfo queryUserinfoById(String uid) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Userinfo userinfo = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "select * from userinfo where id = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, uid);
            rs = pstmt.executeQuery();

            if(rs.next()) {
                userinfo = new Userinfo(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return userinfo;
    }

    @Override
    public Userinfo loginUserinfo(String username, String password) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Userinfo userinfo = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "select * from userinfo where username = ? and pwd = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();

            if(rs.next()) {
                userinfo = new Userinfo(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return userinfo;
    }

    @Override
    public List queryAllUserinfo() {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Userinfo> list = new ArrayList<>();

        try {
            connection = DbUtils.getConnection();
            String sql = "select * from userinfo";

            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while(rs.next()) {
                Userinfo userinfo = new Userinfo(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
                list.add(userinfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
        return list;
    }
}
