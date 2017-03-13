package com.perepelitsya.model.bill.interfaces;

/**
 * Created by Andriu on 12.03.2017.
 */
public interface IBill {
    String getInfoAboutBill();
    int getPriceOfAllDays();
    int getPriceWithDiscount();

}
