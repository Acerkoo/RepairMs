package dao.warehouse;

import java.util.List;

public interface SpareLogDao {
    void insertSpareLog(SpareLog spareLog);
    List<SpareLog> getSpareLogByID(String ID);
    List<SpareLog> getSpareLogByFID(String ID);
    List<SpareLog> getAllSpareLog();
}
