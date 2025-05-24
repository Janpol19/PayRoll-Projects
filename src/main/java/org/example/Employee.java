package org.example;

public class Employee {

    private String ID, day,year,month, checkin, checkout,present,absent,late;

    public Employee(String ID, String day, String year, String month,  String present, String absent, String late) {
        this.ID = ID;
        this.day = day;
        this.year = year;
        this.month = month;
        this.checkin = checkin;
        this.checkout = checkout;
        this.present = present;
        this.absent = absent;
        this.late = late;
    }

    public String getID() {
        return ID;
    }

    public String getPresent() {
        return present;
    }

    public void setPresent(String present) {
        this.present = present;
    }

    public String getAbsent() {
        return absent;
    }

    public void setAbsent(String absent) {
        this.absent = absent;
    }

    public String getLate() {
        return late;
    }

    public void setLate(String late) {
        this.late = late;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }
}
