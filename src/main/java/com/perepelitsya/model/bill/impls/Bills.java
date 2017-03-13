package com.perepelitsya.model.bill.impls;

import com.perepelitsya.model.bill.interfaces.IBills;

import java.util.ArrayList;

/**
 * Created by Andriu on 12.03.2017.
 */
public class Bills implements IBills {
    private ArrayList<Bill> bills;

    public ArrayList<Bill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<Bill> bills) {
        this.bills = bills;
    }

    public int getTotalSum() {
        int sum  = 0;
        for (Bill bill:this.bills) {
            sum+=bill.getPriceWithDiscount();
        }
        return sum;
    }
}
