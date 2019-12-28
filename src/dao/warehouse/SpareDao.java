package dao.warehouse;

import java.util.List;

public interface SpareDao {
    void insertSpare(Spare spare);
    void updateSpare(Spare spare);
    void outofWareHouse(String ID,int number,String zhuangtai);
    void insertSpareByID(String ID,int number,String zhuangtai);
    void deleteSpare(String ID);
    List<Spare> getAllSpares();
    Spare getSpareByID(String ID);
}
