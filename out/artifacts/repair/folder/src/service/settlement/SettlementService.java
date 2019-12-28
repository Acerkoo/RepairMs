package service.settlement;

import dao.settlement.Settlement;

import java.util.List;

public interface SettlementService {
    public Settlement querySettlementById(String id);
    public void insertSettlement(Settlement settlement);
    public List querySettlementAll();
    public void delteteSettlement(String id);
}
