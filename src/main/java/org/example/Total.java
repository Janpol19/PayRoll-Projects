package org.example;

public class Total {
    public String grossPay;
    public String totalDeduc;
    public String netPay;


    public Total(String grossPay, String netPay, String totalDeduc) {
        this.grossPay = grossPay;
        this.totalDeduc = totalDeduc;
        this.netPay = netPay;
    }

    public String getGrossPay() {

        return grossPay;
    }

    public void setGrossPay(String grossPay) {
        this.grossPay = grossPay;
    }

    public String getTotalDeduc() {
        return totalDeduc;
    }

    public void setTotalDeduc(String totalDeduc) {
        this.totalDeduc = totalDeduc;
    }

    public String getNetPay() {
        return netPay;
    }

    public void setNetPay(String netPay) {
        this.netPay = netPay;
    }
}
