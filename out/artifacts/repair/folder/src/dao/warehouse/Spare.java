package dao.warehouse;

public class Spare {
    private String name;
    private String ID;
    private Double money;
    private Integer number;
    private String inofwarehouse;
    private Integer warnnumber;
    private String zhuangtai;

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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getInofwarehouse() {
        return inofwarehouse;
    }

    public void setInofwarehouse(String inofwarehouse) {
        this.inofwarehouse = inofwarehouse;
    }

    public Integer getWarnnumber() {
        return warnnumber;
    }

    public void setWarnnumber(Integer warnnumber) {
        this.warnnumber = warnnumber;
    }

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    public Spare(){}
    public Spare(String name,String ID,Double money,int number,String inofwarehouse,int warnnumber,String zhuangtai){
        this.name = name;
        this.ID = ID;
        this.money = money;
        this.number = number;
        this.inofwarehouse = inofwarehouse;
        this.warnnumber = warnnumber;
        this.zhuangtai = zhuangtai;
    }
    @Override
    public String toString() {
        return "Spare{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", money='" + money + '\'' +
                ", number='" + number + '\'' +
                ", inofwarehouse='" + inofwarehouse + '\'' +
                ", warnnumber='" + warnnumber + '\'' +
                ", zhuangtai='" + zhuangtai + '\'' +
                '}';
    }
}
