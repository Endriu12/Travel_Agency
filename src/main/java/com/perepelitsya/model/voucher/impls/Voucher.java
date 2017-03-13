package com.perepelitsya.model.voucher.impls;


import com.perepelitsya.model.voucher.interfaces.IVoucher;

/**
 * Created by Andriu on 12.03.2017.
 */

public class Voucher implements IVoucher {
    private int route_id;
    private int customer_id;
    private String date;
    private int number;//the number of peple with me, number of tikets
    private int discount;

    public Voucher() {
    }

    public Voucher(int route_id, int customer_id, String date, int number)
    {
        this.route_id = route_id;
        this.customer_id = customer_id;
        this.date = date;
        this.number = number;


    }

    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDiscount() {
        int count = 0;
        if (this.getNumber() > 1) {
            for (int i = 1; i < this.getNumber(); i++) {
                count += 5;
            }
            return  count;
        }
        return count;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Voucher[" +
                " date ='" + date + '\'' +
                ", numberOfVoucher = " + number + ", ";
    }

    public String getInfo() {
        return this.toString();
    }
}