package dao.warehouse;

import dao.warehouse.Spare;
import dao.warehouse.SpareDao;
import utils.DbUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SpareDaoImpl implements SpareDao {
    private  static  SpareDaoImpl instance=new SpareDaoImpl();
    public static  SpareDaoImpl  getInstance()
    {
        return  instance;
    }
    @Override
    public void insertSpare(Spare spare) {
        Connection conn=null;
        PreparedStatement pstmt = null;
        conn = DbUtils.getConnection();
        try {
            System.out.println(spare.getName());
            String  sql="insert  into  spareinfo(sname" //??????
                    + ",ID,"//????????
                    + "money," +
                    "number," +
                    "inofwarehouse," +
                    "warnnumber," +
                    "zhuangtai)"//??????
                    + "values(?,?,?,?,?,?,?)";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, spare.getName());
            pstmt.setString(2, spare.getID());
            pstmt.setDouble(3, spare.getMoney());
            pstmt.setInt(4,spare.getNumber());
            pstmt.setString(5,spare.getInofwarehouse());
            pstmt.setInt(6,spare.getWarnnumber());
            pstmt.setString(7,spare.getZhuangtai());
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
    public void updateSpare(Spare spare) {
        Connection  conn=null;
        PreparedStatement  pstmt=null;
        try {
            conn=DbUtils.getConnection();
            String  sql="update  spareinfo  set sname=?,money=?,number=?,inofwarehouse=?,warnnumber=? ,zhuangtai=? where ID=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, spare.getName());

            pstmt.setDouble(2, spare.getMoney());
            pstmt.setInt(3,spare.getNumber());
            pstmt.setString(4,spare.getInofwarehouse());
            pstmt.setInt(5,spare.getWarnnumber());
            pstmt.setString(6,spare.getZhuangtai());
            pstmt.setString(7, spare.getID());

            pstmt.executeUpdate();//
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
    public void outofWareHouse(String ID,int number,String zhuangtai) {
        Connection  conn=null;
        PreparedStatement  pstmt=null;
        try {
            System.out.println("OUTDAO!");
            System.out.println(ID);
            System.out.println(number);
            conn=DbUtils.getConnection();
            String  sql="update  spareinfo  set number=number - ?,zhuangtai = ? where ID=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,number);
            pstmt.setString(2,zhuangtai);
            pstmt.setString(3,ID);
            pstmt.executeUpdate();//
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
    public void insertSpareByID(String ID,int number,String zhuangtai) {
        Connection  conn=null;
        PreparedStatement  pstmt=null;
        try {
            conn=DbUtils.getConnection();
            String  sql="update  spareinfo  set number=number + ?, zhuangtai = ? where ID=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,number);
            pstmt.setString(2,zhuangtai);
            pstmt.setString(3,ID);
            pstmt.executeUpdate();//
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
    public void deleteSpare(String ID) {
        Connection  conn=null;
        PreparedStatement  pstmt=null;
        try {
            System.out.println("123");
            conn=DbUtils.getConnection();
            String  sql="delete  from  spareinfo where  ID=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, ID);

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
    public List<Spare> getAllSpares() {
        Connection  conn=null;
        PreparedStatement  pstmt=null;
        ResultSet rs=null;
        List<Spare>   spares=new ArrayList<>();
        try {

            //2.?????????
            conn=DbUtils.getConnection();
            // System.out.println("ok");
            //3.	?????????
            String  sql="select  *   from  spareinfo ";
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                Spare  spare=new Spare();
                setASpare(rs, spare);
                spares.add(spare);
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


        return spares;
    }
    @Override
    public Spare getSpareByID(String ID) {
        Connection  conn=null;
        PreparedStatement  pstmt=null;
        ResultSet  rs=null;
        Spare  spare=new Spare();
        try {
            System.out.println("chaxun"+ID);
            //2.?????????
            conn=DbUtils.getConnection();
            // System.out.println("ok");
            //3.	?????????
            String  sql="select  *   from  spareinfo  where  id=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, ID);


            rs=pstmt.executeQuery();
            while(rs.next())
            {
                setASpare(rs, spare);
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


        return spare;
    }

    private void setASpare(ResultSet rs, Spare spare) throws SQLException {
        spare.setName(rs.getString("sname"));
        spare.setID(rs.getString("ID"));
        spare.setMoney(rs.getDouble("money"));
        spare.setNumber(rs.getInt("number"));
        spare.setInofwarehouse(rs.getString("inofwarehouse"));
        spare.setWarnnumber(rs.getInt("warnnumber"));
        spare.setZhuangtai(rs.getString("zhuangtai"));
    }
}
