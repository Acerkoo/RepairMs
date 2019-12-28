package dao.warehouse;

public class SpareLog {
    private String name;
    private String ID;
    private String fixID;
    private Integer number;
    private Double money;
    private String outofwarehouse;
    private String operate;

    public SpareLog(String name, String ID, String fixID, Integer number, Double money, String outofwarehouse, String operate) {
        this.name = name;
        this.ID = ID;
        this.fixID = fixID;
        this.number = number;
        this.money = money;
        this.outofwarehouse = outofwarehouse;
        this.operate = operate;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFixID() {
        return fixID;
    }

    public void setFixID(String fixID) {
        this.fixID = fixID;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getOutofwarehouse() {
        return outofwarehouse;
    }

    public void setOutofwarehouse(String outofwarehouse) {
        this.outofwarehouse = outofwarehouse;
    }

    public SpareLog(){}
    @Override
    public String toString() {
        return "SpareLog{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", fixID='" + fixID + '\'' +
                ", number='" + number + '\'' +
                ", money='" + money + '\'' +
                ", outofwarehouse='" + outofwarehouse + '\'' +
                ", operate='" + operate + '\'' +
                '}';
    }
}
