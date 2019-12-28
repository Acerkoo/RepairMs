package dao.schedule;

import dao.professer.Professer;
import dao.professer.ProfesserDaoImpl;
import dao.repair.Repairinfo;
import dao.userinfo.Userinfo;
import utils.DbUtils;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ScheduleDaoImpl implements ScheduleDao{
    @Override
    public void autoSchedule() {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "select * from repair where statuss = '0'";

            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();
            List<Repairinfo> list = new ArrayList<>();
            while(rs.next()) {
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
            String sqll = "select * from userinfo where position = 1";
            pstmt = connection.prepareStatement(sqll);
            rs = pstmt.executeQuery();
            List<Userinfo> list2 = new ArrayList<>();
            while(rs.next()) {
                Userinfo userinfo = new Userinfo(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
                list2.add(userinfo);
            }

            int len = list2.size();
            Userinfo []arr = new Userinfo[len];
            int p = 0;
            Iterator<Userinfo> iterator = list2.iterator();
            while(iterator.hasNext()) {
                arr[p++] = iterator.next();
            }

            Iterator<Repairinfo> iterator1 = list.iterator();
            Professer professer = null;
            ProfesserDaoImpl professerDao = new ProfesserDaoImpl();
            Random rand = new Random();
            while(iterator1.hasNext()) {
                Repairinfo repairinfo = iterator1.next();
                int pos = rand.nextInt(len);
                Userinfo userinfo = arr[pos];
                String id = userinfo.getUserid();
                String name = userinfo.getUsername();
                String task = repairinfo.getId();
                professer = new Professer( id, name, task );
                professerDao.insertProfesser(professer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, connection);
        }
    }

    @Override
    public void addToPeople(String id, String task) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = DbUtils.getConnection();
            String sql = "select * from userinfo where id = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();
            Userinfo userinfo = null;
            if(rs.next()) {
                userinfo = new Userinfo(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
            }
            ProfesserDaoImpl professerDao = new ProfesserDaoImpl();
            Professer professer = new Professer(userinfo.getUserid(), userinfo.getUsername(), task);
            professerDao.insertProfesser(professer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
