package service.warehouse;

import dao.warehouse.Spare;
import dao.warehouse.SpareDaoImpl;

import java.util.List;

public class SpareServiceImpl implements SpareService{
    private static SpareServiceImpl spareService = new SpareServiceImpl();
    public static SpareServiceImpl getInstance() { return spareService; }
    private SpareServiceImpl() {}
    @Override
    public void insertSpare(Spare spare) {
        SpareDaoImpl spareDao = new SpareDaoImpl();
        spareDao.insertSpare(spare);
    }

    @Override
    public void updateSpare(Spare spare) {
        SpareDaoImpl spareDao = new SpareDaoImpl();
        spareDao.updateSpare(spare);
    }

//    @Override
//    public void outofWareHouse(String ID, String number) {
//        SpareDaoImpl spareDao = new SpareDaoImpl();
//        spareDao.outofWareHouse(ID, number);
//    }
//
//    @Override
//    public void insertSpareByID(String ID, String number) {
//        SpareDaoImpl spareDao = new SpareDaoImpl();
//        spareDao.insertSpareByID(ID, number);
//    }

    @Override
    public void deleteSpare(String ID) {
        SpareDaoImpl spareDao = new SpareDaoImpl();
        spareDao.deleteSpare(ID);
    }

    @Override
    public List getAllSpares() {
        SpareDaoImpl spareDao = new SpareDaoImpl();
        return spareDao.getAllSpares();
    }

    @Override
    public Spare getSpareByID(String ID) {
        SpareDaoImpl spareDao = new SpareDaoImpl();
        return spareDao.getSpareByID(ID);
    }
}
