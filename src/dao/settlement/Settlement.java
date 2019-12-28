package dao.settlement;

import dao.prerepair.PreRepair;
import dao.warehouse.Spare;

import java.util.Iterator;
import java.util.List;

public class Settlement {
    private String wId;
    private String wPeoPrice;
    private String wPartPrice;
    private String wpromise;
    private String CareThing;
    private String BillDate;

    public Settlement() {}

    public Settlement(String wId, String wPeoPrice, String wPartPrice, String wpromise, String careThing, String billDate) {
        this.wId = wId;
        this.wPeoPrice = wPeoPrice;
        this.wPartPrice = wPartPrice;
        this.wpromise = wpromise;
        CareThing = careThing;
        BillDate = billDate;
    }

    public String getwId() {
        return wId;
    }

    public void setwId(String wId) {
        this.wId = wId;
    }

    public String getwPeoPrice() {
        return wPeoPrice;
    }

    public void setwPeoPrice(PreRepair repair) {
        this.wPeoPrice = repair.getEstimateprice();
    }

    public String getwPartPrice() {
        return wPartPrice;
    }

    public void setwPartPrice(List<Spare> spare) {
        double price = 0;
        Iterator<Spare> iterator = spare.iterator();
        while(iterator.hasNext()) {
            Spare spare1 = iterator.next();
            double p1 = Double.valueOf(spare1.getMoney())*Double.valueOf(spare1.getNumber());
            price += p1;
        }
        this.wPartPrice = String.valueOf(price);
    }

    public String getWpromise() {
        return wpromise;
    }

    public void setWpromise(String wpromise) {
        this.wpromise = wpromise;
    }

    public String getCareThing() {
        return CareThing;
    }

    public void setCareThing(String careThing) {
        CareThing = careThing;
    }

    public String getBillDate() {
        return BillDate;
    }

    public void setBillDate(String billDate) {
        BillDate = billDate;
    }

    @Override
    public String toString() {
        return "Settlement{" +
                "wId='" + wId + '\'' +
                ", wPeoPrice='" + wPeoPrice + '\'' +
                ", wPartPrice='" + wPartPrice + '\'' +
                ", wpromise='" + wpromise + '\'' +
                ", CareThing='" + CareThing + '\'' +
                ", BillDate='" + BillDate + '\'' +
                '}';
    }
}
