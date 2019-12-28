package dao.customer;

public class Customer {
    private String curId;       // 用户ID
    private String idnum;       // 用户身份证号
    private String cusName;     // 用户姓名
    private String cusNature;   // 用户性质
    private String cusWork;     // 工作单位
    private String cusTele;     // 电话
    private String cusAdd;      // 地址
    private String cusEmail;    // 邮箱
    private String curTime;     // 插入时间

    public Customer(){}

    public String getCurId() {
        return curId;
    }

    public void setCurId(String curId) {
        this.curId = curId;
    }

    public String getCurTime() {
        return curTime;
    }

    public void setCurTime(String curTime) {
        this.curTime = curTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idnum='" + idnum + '\'' +
                ", cusName='" + cusName + '\'' +
                ", cusNature='" + cusNature + '\'' +
                ", cusWork='" + cusWork + '\'' +
                ", cusTele='" + cusTele + '\'' +
                ", cusAdd='" + cusAdd + '\'' +
                ", cusEmail='" + cusEmail + '\'' +
                '}';
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusNature() {
        return cusNature;
    }

    public void setCusNature(String cusNature) {
        this.cusNature = cusNature;
    }

    public String getCusWork() {
        return cusWork;
    }

    public void setCusWork(String cusWork) {
        this.cusWork = cusWork;
    }

    public String getCusTele() {
        return cusTele;
    }

    public void setCusTele(String cusTele) {
        this.cusTele = cusTele;
    }

    public String getCusAdd() {
        return cusAdd;
    }

    public void setCusAdd(String cusAdd) {
        this.cusAdd = cusAdd;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public Customer(String curId, String idnum, String cusName, String cusNature, String cusWork,
                    String cusTele, String cusAdd, String cusEmail, String curTime) {
        this.curId = curId;
        this.idnum = idnum;
        this.cusName = cusName;
        this.cusNature = cusNature;
        this.cusWork = cusWork;
        this.cusTele = cusTele;
        this.cusAdd = cusAdd;
        this.cusEmail = cusEmail;
        this.curTime = curTime;
    }
}

