package dao.settlement;

import java.util.List;

public interface SettlementDao {
    public Settlement querySettlementById(String id);
    public void insertSettlement(Settlement settlement);
    public List querySettlementAll();
    public void deleteSettlement(String id);
}
