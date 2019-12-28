package dao.schedule;

public interface ScheduleDao {
    public void autoSchedule();
    public void addToPeople(String id, String task);
}
