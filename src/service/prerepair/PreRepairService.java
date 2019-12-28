package service.prerepair;
import dao.prerepair.PreRepair;

import java.util.List;
public interface PreRepairService {
	public void  insertRepairRecord(PreRepair rr);
	public void  updateRepairRecord(String repno, String value);
	public void deleteRepairRecord(String repairnumber);
	public List getAllRepairRecord();
	public PreRepair getRepairRecordByRepairRecordno(String repairnumber);

}
