package service.warehouse;

import dao.warehouse.SpareLog;
import dao.warehouse.SpareLogDaoImpl;

import java.util.List;

public class SpareLogServiceImpl implements SpareLogService{
    private static SpareLogServiceImpl instance = new SpareLogServiceImpl();
    private SpareLogServiceImpl() {}
    public static SpareLogServiceImpl getInstance() { return instance; }
    @Override
    public void insertSpareLog(SpareLog spareLog) {
        SpareLogDaoImpl spareLogDao = new SpareLogDaoImpl();
        spareLogDao.insertSpareLog(spareLog);
    }

    //@Override
    //public SpareLog getSpareLogByID(int ID) {
        //SpareLogDaoImpl spareLogDao = new SpareLogDaoImpl();
        //return spareLogDao.getSpareLogByFID(ID);
    //}

   //@Override
    //public List getAllSpareLog() {
        //SpareLogDaoImpl spareLogDao = new SpareLogDaoImpl();
        //return spareLogDao.getAllSpareLog();
    //}
}
