package com.perepelitsya.model.bill.impls;

import com.perepelitsya.model.bill.interfaces.IBill;
import com.perepelitsya.model.customers.impls.Customer;
import com.perepelitsya.model.route.impls.Route;
import com.perepelitsya.model.voucher.impls.Voucher;

/**
 * Created by Andriu on 12.03.2017.
 */
public class Bill implements IBill {

    private int id;
    private Customer customer;
    private Voucher voucher;
    private Route route;

    public Bill(int id, Customer customer, Voucher voucher, Route route) {
        this.id = id;
        this.customer = customer;
        this.voucher = voucher;
        this.route = route;
    }

    public Bill() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public String getInfoAboutBill() {
        String s="";
        s+="******************************************\n";
        s+="Bill №: "+this.id+"\n";
        s+=customer.getInfo() + "\n";
        s+=voucher.getInfo() + "Your Discount = "  + voucher.getDiscount()+ "%" + "]" + "\n";
        s+=route.getInfo() + "You must pay " + getPriceOfAllDays() + "$]" +  "\n";
        s+= "\t" + "[" + "But you have a discount, and you must pay = " + getPriceWithDiscount() + "]" + "\n";
        return s;
    }

    public int getPriceOfAllDays() {
        return route.getPrice()*voucher.getNumber();
    }

    public int getPriceWithDiscount() {
        return getPriceOfAllDays() -  ((getPriceOfAllDays()/100)*voucher.getDiscount());
    }
}
