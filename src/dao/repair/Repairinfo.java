package dao.repair;

public class Repairinfo {
    private String id; // 维修编号
    private String people; // 维修人员
    private String jian; // 检测记录
    private String wei; //维修记录
    private String timee; //检测维修时间
    private String workTime; //工作量
    private String qijian; //器件
    private String status; //状态

    public Repairinfo() {
    }

    public Repairinfo(String id, String people, String jian, String wei, String time, String workTime, String qijian, String status) {
        this.id = id;
        this.people = people;
        this.jian = jian;
        this.wei = wei;
        this.timee = time;
        this.workTime = workTime;
        this.qijian = qijian;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getJian() {
        return jian;
    }

    public void setJian(String jian) {
        this.jian = jian;
    }

    public String getWei() {
        return wei;
    }

    public void setWei(String wei) {
        this.wei = wei;
    }

    public String getTimee() {
        return timee;
    }

    public void setTimee(String timee) {
        this.timee = timee;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getQijian() {
        return qijian;
    }

    public void setQijian(String qijian) {
        this.qijian = qijian;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String
    toString() {
        return "Repairinfo{" +
                "id=" + id +
                ", people='" + people + '\'' +
                ", jian='" + jian + '\'' +
                ", wei='" + wei + '\'' +
                ", timee='" + timee + '\'' +
                ", workTime=" + workTime +
                ", qijian='" + qijian + '\'' +
                ", status=" + status +
                '}';
    }
}
