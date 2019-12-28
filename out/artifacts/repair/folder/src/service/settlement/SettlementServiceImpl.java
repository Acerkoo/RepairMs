package service.settlement;

import dao.settlement.Settlement;
import dao.settlement.SettlementDao;
import dao.settlement.SettlementDaoImpl;

import java.util.List;

public class SettlementServiceImpl implements SettlementService{
    private static SettlementServiceImpl instance = new SettlementServiceImpl();
    private SettlementServiceImpl() {}
    public static SettlementServiceImpl getInstance() { return instance; }

    @Override
    public Settlement querySettlementById(String id) {
        SettlementDaoImpl settlementDao = new SettlementDaoImpl();
        return settlementDao.querySettlementById(id);
    }

    @Override
    public void insertSettlement(Settlement settlement) {
        SettlementDaoImpl settlementDao = new SettlementDaoImpl();
        settlementDao.insertSettlement(settlement);
    }

    @Override
    public List querySettlementAll() {
        SettlementDaoImpl settlementDao = new SettlementDaoImpl();
        return settlementDao.querySettlementAll();
    }

    @Override
    public void delteteSettlement(String id) {
        SettlementDaoImpl settlementDao = new SettlementDaoImpl();
        settlementDao.deleteSettlement(id);
    }
}
