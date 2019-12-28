package dao.prerepair;

import utils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PreRepairDaoImpl implements PreRepairDao {

    @Override
    public void insertRepairRecord(PreRepair rr) {
        // TODO Auto-generated method stub
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = DbUtils.getConnection();
            String sql = "insert into repairrecord values(?,?,?,?,?,?,?,?,?,?" + //10
                    ",?,?,?, ?,?,?,?,?, ?,?,?,?,?)"; // 13

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, rr.getRepairnumber());
            pstmt.setString(2, rr.getCustomernumber());
            pstmt.setString(3, rr.getProducttype());
            pstmt.setString(4, rr.getMachinebrand());
            pstmt.setString(5, rr.getMachinetype());
            pstmt.setString(6, rr.getSerialnumber());
            pstmt.setString(7, rr.getLackofcomponent());
            pstmt.setString(8, rr.getSymptom());
            pstmt.setString(9, rr.getFaulttype());
            pstmt.setString(10, rr.getAppearancechenk());
            pstmt.setString(11, rr.getPoweronpassword());
            pstmt.setString(12, rr.getImportantinfo());
            pstmt.setString(13, rr.getHdd());
            pstmt.setString(14, rr.getMemory());
            pstmt.setString(15, rr.getOutlaypc());
            pstmt.setString(16, rr.getAcadapter());
            pstmt.setString(17, rr.getBattery());
            pstmt.setString(18, rr.getOutlaycddrive());
            pstmt.setString(19, rr.getOutlayfloppydriver());
            pstmt.setString(20, rr.getOthers());
            pstmt.setString(21, rr.getRepairtime());
            pstmt.setString(22, rr.getEstimateprice());
            pstmt.setString(23, rr.getRepairstatus());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(rs, pstmt, conn);
        }
    }

    @Override
    public void updateRepairRecord(String repno, String value) {
        // TODO Auto-generated method stub
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DbUtils.getConnection();
            String sql = "update  repairrecord  set repairstatus=? where repairno=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, value);
            pstmt.setString(2, repno);
            pstmt.executeUpdate();//
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            DbUtils.closeStatement(pstmt);
            DbUtils.closeConnection(conn);
        }
    }

    @Override
    public void deleteRepairRecord(String repairnumber) {
        // TODO Auto-generated method stub
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DbUtils.getConnection();
            String sql = "delete  from  repairrecord  where  repairno=?";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, repairnumber);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            DbUtils.closeStatement(pstmt);
            DbUtils.closeConnection(conn);
        }
    }

    @Override
    public List getAllRepairRecord() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<PreRepair> rrs = new ArrayList<>();

        try {
            conn = DbUtils.getConnection();
            String sql = "select * from repairrecord";
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                PreRepair rr = new PreRepair();
                rr.setRepairnumber(rs.getString(1));
                rr.setCustomernumber(rs.getString(2));
                rr.setProducttype(rs.getString(3));
                rr.setMachinebrand(rs.getString(4));
                rr.setMachinetype(rs.getString(5));
                rr.setSerialnumber(rs.getString(6));
                rr.setLackofcomponent(rs.getString(7));
                rr.setSymptom(rs.getString(8));
                rr.setFaulttype(rs.getString(9));
                rr.setAppearancechenk(rs.getString(10));
                rr.setPoweronpassword(rs.getString(11));
                rr.setImportantinfo(rs.getString(12));
                rr.setHdd(rs.getString(13));
                rr.setMemory(rs.getString(14));
                rr.setOutlaypc(rs.getString(15));
                rr.setAcadapter(rs.getString(16));
                rr.setBattery(rs.getString(17));
                rr.setOutlaycddrive(rs.getString(18));
                rr.setOutlayfloppydriver(rs.getString(19));
                rr.setOthers(rs.getString(20));
                rr.setRepairtime(rs.getString(21));
                rr.setEstimateprice(rs.getString(22));
                rr.setRepairstatus(rs.getString(23));
                rrs.add(rr);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            DbUtils.closeResultSet(rs);
            DbUtils.closeStatement(pstmt);
            DbUtils.closeConnection(conn);
        }
        return rrs;
    }

    @Override
    public PreRepair getRepairRecordByRepairRecordno(String repairnumber) {
        // TODO Auto-generated method stub
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        PreRepair rr = null;

        try {
            conn = DbUtils.getConnection();
            String sql = "select * from repairrecord where repairno=?";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, repairnumber);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                rr = new PreRepair();
                rr.setRepairnumber(rs.getString(1));
                rr.setCustomernumber(rs.getString(2));
                rr.setProducttype(rs.getString(3));
                rr.setMachinebrand(rs.getString(4));
                rr.setMachinetype(rs.getString(5));
                rr.setSerialnumber(rs.getString(6));
                rr.setLackofcomponent(rs.getString(7));
                rr.setSymptom(rs.getString(8));
                rr.setFaulttype(rs.getString(9));
                rr.setAppearancechenk(rs.getString(10));
                rr.setPoweronpassword(rs.getString(11));
                rr.setImportantinfo(rs.getString(12));
                rr.setHdd(rs.getString(13));
                rr.setMemory(rs.getString(14));
                rr.setOutlaypc(rs.getString(15));
                rr.setAcadapter(rs.getString(16));
                rr.setBattery(rs.getString(17));
                rr.setOutlaycddrive(rs.getString(18));
                rr.setOutlayfloppydriver(rs.getString(19));
                rr.setOthers(rs.getString(20));
                rr.setRepairtime(rs.getString(21));
                rr.setEstimateprice(rs.getString(22));
                rr.setRepairstatus(rs.getString(23));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            DbUtils.closeResultSet(rs);
            DbUtils.closeStatement(pstmt);
            DbUtils.closeConnection(conn);
        }
        return rr;
    }
}

