package com.perepelitsya;

import com.perepelitsya.model.bill.impls.Bill;
import com.perepelitsya.model.bill.impls.Bills;
import com.perepelitsya.model.customers.impls.Customer;
import com.perepelitsya.model.route.impls.Route;
import com.perepelitsya.model.route.impls.enums.Hotels;
import com.perepelitsya.model.voucher.impls.Voucher;

import java.util.ArrayList;

/**
 * Created by Andriu on 12.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Bill> bills = new ArrayList<Bill>();
        //Create the first Customer
        Customer customer1 = new Customer(1, "Andriu", "Perepelitsya", "Fedkovicha 23 st", "0966575432");
        Route route1 = new Route(1, "USA", "subtropical", 14, Hotels.SEVENSTAR);
        Voucher voucher1 = new Voucher(1, 1, "12.03.2017", 2);
        //Create the second Customer
        Customer customer2 = new Customer(2, "Yura", "Perepelitsya", "Golovna 12 st", "0605434523");
        Route route2 = new Route(2, "Paris", "subtropical", 7, Hotels.THREESTAR);
        Voucher voucher2 = new Voucher(2, 2, "20.03.2017", 4);
        //Create the third Customer
        Customer customer3 = new Customer(3, "Vlad", "Tereshko", "Komarova 83 st", "0509712645");
        Route route3         = new Route(3, "Poland", "subtropical", 28, Hotels.FOURSTAR);
        Voucher voucher3 = new Voucher(3, 3, "12.04.2017", 2);
        Bill bill1 = new Bill(1, customer1, voucher1, route1);
        Bill bill2 = new Bill(2, customer2, voucher2, route2);
        Bill bill3 = new Bill(3, customer3, voucher3, route3);
        bills.add(bill1);
        bills.add(bill2);
        bills.add(bill3);

        Bills totalDay = new Bills();
        totalDay.setBills(bills);

        for (Bill bill11 : bills) {
            System.out.println(bill11.getInfoAboutBill());
        }

        System.out.println("******************************************");
        System.out.println("For today you earn: " + totalDay.getTotalSum() + "$");

        /**
         * Створити 10 чеків + створити 10 методів для IBill
         */


//        System.out.println(v.getInfo());
//        System.out.println(v.getDiscount());
//        System.out.println(b.getBill());
//        System.out.println(r.getPrice());
//        System.out.println(b.getPriceOfAllDays());
//        System.out.println(b.getPriceWithDiscount());
    }
}
