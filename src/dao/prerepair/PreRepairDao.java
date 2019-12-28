package dao.prerepair;

import java.util.List;

public interface PreRepairDao {
    void insertRepairRecord(PreRepair rr);

    void updateRepairRecord(String repno, String value);

    void deleteRepairRecord(String repairnumber);

    List getAllRepairRecord();

    PreRepair getRepairRecordByRepairRecordno(String repairnumber);
}

