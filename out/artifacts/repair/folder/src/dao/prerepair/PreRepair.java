package dao.prerepair;

public class PreRepair {
    private String repairnumber;
    private String customernumber;
    private String producttype;//²úÆ·ÀàÐÍ
    private String machinebrand;//»úÆ÷Æ·ÅÆ
    private String machinetype;//»úÆ÷ÐÍºÅ
    private String serialnumber;//ÏµÁÐºÅ
    private String lackofcomponent;//È±ÉÙÁã¼þ
    private String symptom;//»úÆ÷¹ÊÕÏÏÖÏó
    private String faulttype;//¹ÊÕÏÀàÐÍ
    private String appearancechenk;//»úÆ÷Íâ¹Û¼ì²é
    private String poweronpassword;//¿ª»ú¿ÚÁî
    private String importantinfo;//ÖØÒª×ÊÁÏ
    private String hdd;//HDD
    private String memory;//ÄÚ´æ
    private String outlaypc;//ÍâÖÃPC¿¨
    private String acadapter;//ACÊÊÅäÆ÷
    private String battery;//µç³Ø
    private String outlaycddrive;//Íâ½Ó¹âÇý
    private String outlayfloppydriver;//Íâ½ÓÈíÇý
    private String others;//ÆäËû
    private String repairtime;//±¨ÐÞÊ±¼ä
    private String estimateprice;//Ô¤¹À¼Û¸ñ
    private String repairstatus;//±¨ÐÞ×´Ì¬

    public PreRepair() {}

    public PreRepair(String repairnumber, String customernumber, String producttype, String machinebrand, String machinetype, String serialnumber, String lackofcomponent, String symptom, String faulttype, String appearancechenk, String poweronpassword, String importantinfo, String hdd, String memory, String outlaypc, String acadapter, String battery, String outlaycddrive, String outlayfloppydriver, String others, String repairtime, String estimateprice, String repairstatus) {
        this.repairnumber = repairnumber;
        this.customernumber = customernumber;
        this.producttype = producttype;
        this.machinebrand = machinebrand;
        this.machinetype = machinetype;
        this.serialnumber = serialnumber;
        this.lackofcomponent = lackofcomponent;
        this.symptom = symptom;
        this.faulttype = faulttype;
        this.appearancechenk = appearancechenk;
        this.poweronpassword = poweronpassword;
        this.importantinfo = importantinfo;
        this.hdd = hdd;
        this.memory = memory;
        this.outlaypc = outlaypc;
        this.acadapter = acadapter;
        this.battery = battery;
        this.outlaycddrive = outlaycddrive;
        this.outlayfloppydriver = outlayfloppydriver;
        this.others = others;
        this.repairtime = repairtime;
        this.estimateprice = estimateprice;
        this.repairstatus = repairstatus;
    }

    public String getRepairnumber() {
        return repairnumber;
    }

    public void setRepairnumber(String repairnumber) {
        this.repairnumber = repairnumber;
    }

    public String getCustomernumber() {
        return customernumber;
    }

    public void setCustomernumber(String customernumber) {
        this.customernumber = customernumber;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getMachinebrand() {
        return machinebrand;
    }

    public void setMachinebrand(String machinebrand) {
        this.machinebrand = machinebrand;
    }

    public String getMachinetype() {
        return machinetype;
    }

    public void setMachinetype(String machinetype) {
        this.machinetype = machinetype;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getLackofcomponent() {
        return lackofcomponent;
    }

    public void setLackofcomponent(String lackofcomponent) {
        this.lackofcomponent = lackofcomponent;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getFaulttype() {
        return faulttype;
    }

    public void setFaulttype(String faulttype) {
        this.faulttype = faulttype;
    }

    public String getAppearancechenk() {
        return appearancechenk;
    }

    public void setAppearancechenk(String appearancechenk) {
        this.appearancechenk = appearancechenk;
    }

    public String getPoweronpassword() {
        return poweronpassword;
    }

    public void setPoweronpassword(String poweronpassword) {
        this.poweronpassword = poweronpassword;
    }

    public String getImportantinfo() {
        return importantinfo;
    }

    public void setImportantinfo(String importantinfo) {
        this.importantinfo = importantinfo;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getOutlaypc() {
        return outlaypc;
    }

    public void setOutlaypc(String outlaypc) {
        this.outlaypc = outlaypc;
    }

    public String getAcadapter() {
        return acadapter;
    }

    public void setAcadapter(String acadapter) {
        this.acadapter = acadapter;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getOutlaycddrive() {
        return outlaycddrive;
    }

    public void setOutlaycddrive(String outlaycddrive) {
        this.outlaycddrive = outlaycddrive;
    }

    public String getOutlayfloppydriver() {
        return outlayfloppydriver;
    }

    public void setOutlayfloppydriver(String outlayfloppydriver) {
        this.outlayfloppydriver = outlayfloppydriver;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getRepairtime() {
        return repairtime;
    }

    public void setRepairtime(String repairtime) {
        this.repairtime = repairtime;
    }

    public String getEstimateprice() {
        return estimateprice;
    }

    public void setEstimateprice(String estimateprice) {
        this.estimateprice = estimateprice;
    }

    public String getRepairstatus() {
        return repairstatus;
    }

    public void setRepairstatus(String repairstatus) {
        this.repairstatus = repairstatus;
    }

    @Override
    public String toString() {
        return "PreRepair{" +
                "repairnumber='" + repairnumber + '\'' +
                ", customernumber='" + customernumber + '\'' +
                ", producttype='" + producttype + '\'' +
                ", machinebrand='" + machinebrand + '\'' +
                ", machinetype='" + machinetype + '\'' +
                ", serialnumber='" + serialnumber + '\'' +
                ", lackofcomponent='" + lackofcomponent + '\'' +
                ", symptom='" + symptom + '\'' +
                ", faulttype='" + faulttype + '\'' +
                ", appearancechenk='" + appearancechenk + '\'' +
                ", poweronpassword='" + poweronpassword + '\'' +
                ", importantinfo='" + importantinfo + '\'' +
                ", hdd='" + hdd + '\'' +
                ", memory='" + memory + '\'' +
                ", outlaypc='" + outlaypc + '\'' +
                ", acadapter='" + acadapter + '\'' +
                ", battery='" + battery + '\'' +
                ", outlaycddrive='" + outlaycddrive + '\'' +
                ", outlayfloppydriver='" + outlayfloppydriver + '\'' +
                ", others='" + others + '\'' +
                ", repairtime='" + repairtime + '\'' +
                ", estimateprice='" + estimateprice + '\'' +
                ", repairstatus='" + repairstatus + '\'' +
                '}';
    }
}

