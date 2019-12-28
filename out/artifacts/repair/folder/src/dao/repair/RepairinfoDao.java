package dao.repair;

import java.util.List;

public interface RepairinfoDao {
    public Repairinfo queryById(String id);
    public List queryAll();
    public List queryByPeople(String name);
    public List queryByStatus(String status);
    public List queryByMuli(String name, String status);
    public void insertRepairinfo(Repairinfo repairinfo);
    public void deleteRepairinfo(String id);
    public void updateRepairinfo(String id, String op);
}
