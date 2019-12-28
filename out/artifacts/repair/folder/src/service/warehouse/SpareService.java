package service.warehouse;

import dao.warehouse.Spare;

import java.util.List;

public interface SpareService {
    public void insertSpare(Spare spare);
    public void updateSpare(Spare spare);
//    public void outofWareHouse(String ID, String number);
//    public void insertSpareByID(String ID, String number);
    public void deleteSpare(String ID);
    public List getAllSpares();
    public Spare getSpareByID(String ID);
}
