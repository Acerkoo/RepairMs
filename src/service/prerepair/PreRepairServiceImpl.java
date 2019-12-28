package service.prerepair;

import dao.prerepair.PreRepair;
import dao.prerepair.PreRepairDao;
import dao.prerepair.PreRepairDaoImpl;

import java.util.List;

public class PreRepairServiceImpl implements PreRepairService {
	private  static PreRepairServiceImpl instance=new PreRepairServiceImpl();
	public static PreRepairServiceImpl getInstance() { return  instance; }
	private PreRepairServiceImpl() {}

	@Override
	public void insertRepairRecord(PreRepair rr) {
		// TODO Auto-generated methods stub
		PreRepairDao rrDao=new PreRepairDaoImpl();
		rrDao.insertRepairRecord(rr);
	}

	@Override
	public void updateRepairRecord(String repno, String value) {
		// TODO Auto-generated method stub
		PreRepairDao rrDao=new PreRepairDaoImpl();
		rrDao.updateRepairRecord(repno, value);
	}

	@Override
	public void deleteRepairRecord(String repairnumber) {
		// TODO Auto-generated method stub
		PreRepairDao rrDao=new PreRepairDaoImpl();
		rrDao.deleteRepairRecord(repairnumber);
	}

	@Override
	public List getAllRepairRecord() {
		// TODO Auto-generated method stub
		PreRepairDao rrDao=new PreRepairDaoImpl();
		return rrDao.getAllRepairRecord();
	}

	@Override
	public PreRepair getRepairRecordByRepairRecordno(String repairnumber) {
		// TODO Auto-generated method stub
		PreRepairDao rrDao=new PreRepairDaoImpl();
		System.out.println("service: " + repairnumber);
		return rrDao.getRepairRecordByRepairRecordno(repairnumber);
	}
}
