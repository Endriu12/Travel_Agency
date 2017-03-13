package com.perepelitsya.model.route.impls;

import com.perepelitsya.model.route.impls.enums.Hotels;
import com.perepelitsya.model.route.interfaces.IRoute;

/**
 * Created by Andriu on 12.03.2017.
 */
public class Route implements IRoute {
    private int route_id;
    private String country;
    private String climate;
    private int days;
    private Hotels hotel;
    private int price;

    public Route() {}
    public Route(int route_id, String country, String climate, int days, Hotels hotel) {
        this.route_id = route_id;
        this.country = country;
        this.climate = climate;
        this.days = days;
        this.hotel = hotel;
    }

    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Hotels getHotel() {
        return hotel;
    }

    public void setHotel(Hotels hotel) {
        this.hotel = hotel;
    }

    public int getPrice() {
        if (this.getHotel() == Hotels.THREESTAR) {
            return this.price  = this.getDays() * 1500;
        } else if (this.getHotel() == Hotels.FOURSTAR) {
            return this.price  =  this.getDays() * 2000;
        }
        else if (this.getHotel() == Hotels.FIVESTAR) {
            return this.price  =  this.getDays() * 5000;
        }
        else if (this.getHotel() == Hotels.SEVENSTAR) {
            return this.price  =  this.getDays() * 8000;
        }
       return price;
    }

    @Override
    public String toString() {
        return "Route[" +
                "route_id=" + route_id +
                ", country='" + country + '\'' +
                ", climate='" + climate + '\'' +
                ", days=" + days +
                ", hotel=" + hotel  + " , ";
    }

    public String getInfo() {
        return this.toString();
    }


    //Путівки продаються на один, два або чотири тижні. Вартість путівки залежить від тривалості тура і готелю.
}