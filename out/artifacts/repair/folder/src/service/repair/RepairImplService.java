package service.repair;

import dao.repair.Repairinfo;
import dao.repair.RepairinfoImpl;

import java.util.List;

public class RepairImplService implements RepairService{
    private static RepairImplService instance = new RepairImplService();
    public static RepairImplService getInstance() {
        return instance;
    }
    private RepairImplService() {}
    @Override
    public Repairinfo queryById(String id) {
        RepairinfoImpl repairinfo = new RepairinfoImpl();
        return repairinfo.queryById(id);
    }

    @Override
    public List queryByPeople(String name) {
        RepairinfoImpl repairinfo = new RepairinfoImpl();
        return repairinfo.queryByPeople(name);
    }

    @Override
    public List queryByStatus(String status) {
        RepairinfoImpl repairinfo = new RepairinfoImpl();
        return repairinfo.queryByStatus(status);
    }

    @Override
    public List queryByMuli(String name, String status) {
        RepairImplService repairinfo = new RepairImplService();
        return repairinfo.queryByMuli(name, status);
    }

    @Override
    public List queryAll() {
        RepairinfoImpl repairinfo = new RepairinfoImpl();
        return repairinfo.queryAll();
    }

    @Override
    public void insertRepairinfo(Repairinfo repairinfo) {
        RepairinfoImpl repairinfo1 = new RepairinfoImpl();
        repairinfo1.insertRepairinfo(repairinfo);
    }

    @Override
    public void deleteRepairinfo(String id) {
        RepairinfoImpl repairinfo1 = new RepairinfoImpl();
        repairinfo1.deleteRepairinfo(id);
    }

    @Override
    public void updateRepairinfo(String id, String op) {
        RepairinfoImpl repairinfo1 = new RepairinfoImpl();
        repairinfo1.updateRepairinfo(id, op);
    }
}
