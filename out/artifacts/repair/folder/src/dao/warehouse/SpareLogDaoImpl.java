package dao.warehouse;

import utils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SpareLogDaoImpl implements SpareLogDao {
    private  static  SpareDaoImpl instance=new SpareDaoImpl();
    public static  SpareDaoImpl  getInstance()
    {
        return  instance;
    }
    @Override
    public void insertSpareLog(SpareLog spareLog) {

        Connection conn=null;
        PreparedStatement pstmt = null;
        conn = DbUtils.getConnection();
        try {
            System.out.println(spareLog.getName());
            String  sql="insert  into  sparelog(sname" //??????
                    + ",ID,"//????????
                    + "fixID," +
                    "number," +
                    "money," +
                    "outofwarehouse," +
                    "operate)"//??????
                    + "values(?,?,?,?,?,?,?)";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, spareLog.getName());
            pstmt.setString(2, spareLog.getID());
            pstmt.setString(3, spareLog.getFixID());
            pstmt.setInt(4,spareLog.getNumber());
            pstmt.setDouble(5,spareLog.getMoney());
            pstmt.setString(6,spareLog.getOutofwarehouse());
            pstmt.setString(7,spareLog.getOperate());
            pstmt.executeUpdate();//?????????
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally
        {
            DbUtils.closeStatement(pstmt);
            DbUtils.closeConnection(conn);
        }
    }

    @Override
    public List<SpareLog> getSpareLogByID(String ID) {
        Connection  conn=null;
        PreparedStatement  pstmt=null;
        ResultSet rs=null;
        List<SpareLog>   sparelogs=new ArrayList<>();
        try {

            //2.?????????
            conn=DbUtils.getConnection();
            // System.out.println("ok");
            //3.	?????????
            String  sql="select  *   from  sparelog  where  ID=?  ";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,ID);

            rs=pstmt.executeQuery();
            while(rs.next())
            {
                SpareLog  sparelog=new SpareLog();
                setASpareLog(rs, sparelog);
                sparelogs.add(sparelog);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{

            //4.????????
            DbUtils.closeResultSet(rs);
            DbUtils.closeStatement(pstmt);
            DbUtils.closeConnection(conn);
        }
        return sparelogs;
    }

    @Override
    public List<SpareLog> getSpareLogByFID(String ID) {
        Connection  conn=null;
        PreparedStatement  pstmt=null;
        ResultSet rs=null;
        List<SpareLog>   sparelogs=new ArrayList<>();
        try {

            //2.?????????
            conn=DbUtils.getConnection();
            // System.out.println("ok");
            //3.	?????????
            String  sql="select  *   from  sparelog  where  fixID=?  ";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,ID);

            rs=pstmt.executeQuery();
            while(rs.next())
            {
                SpareLog  sparelog=new SpareLog();
                setASpareLog(rs, sparelog);
                sparelogs.add(sparelog);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{

            //4.????????
            DbUtils.closeResultSet(rs);
            DbUtils.closeStatement(pstmt);
            DbUtils.closeConnection(conn);
        }
        return sparelogs;
    }

    @Override
    public List<SpareLog> getAllSpareLog() {
        Connection  conn=null;
        PreparedStatement  pstmt=null;
        ResultSet rs=null;
        List<SpareLog>   sparelogs=new ArrayList<>();
        try {

            //2.?????????
            conn=DbUtils.getConnection();
            // System.out.println("ok");
            //3.	?????????
            String  sql="select  *   from  sparelog ";
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                SpareLog  sparelog=new SpareLog();
                setASpareLog(rs, sparelog);
                sparelogs.add(sparelog);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{

            //4.????????
            DbUtils.closeResultSet(rs);
            DbUtils.closeStatement(pstmt);
            DbUtils.closeConnection(conn);
        }
        return sparelogs;
    }
    private void setASpareLog (ResultSet rs, SpareLog sparelog) throws SQLException {
        sparelog.setName(rs.getString("sname"));
        sparelog.setID(rs.getString("ID"));
        sparelog.setFixID(rs.getString("fixID"));
        sparelog.setNumber(rs.getInt("number"));
        sparelog.setMoney(rs.getDouble("money"));
        sparelog.setOutofwarehouse(rs.getString("outofwarehouse"));
    }
}
