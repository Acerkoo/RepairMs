package service.repair;


import dao.repair.Repairinfo;

import java.util.List;

public interface RepairService {
    public Repairinfo queryById(String id);
    public List queryByPeople(String name);
    public List queryByStatus(String status);
    public List queryByMuli(String name, String status);
    public List queryAll();
    public void insertRepairinfo(Repairinfo repairinfo);
    public void deleteRepairinfo(String id);
    public void updateRepairinfo(String id, String op);
}
