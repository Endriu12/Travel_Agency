package com.perepelitsya.model.customers.impls;

import com.perepelitsya.model.customers.interfaces.ICustomer;

/**
 * Created by Andriu on 12.03.2017.
 */
public class Customer implements ICustomer {
    private int customer_id;
    private String firstname;
    private String lastname;
    private String address;
    private String mobilePhone;

    public Customer() {}

    public Customer(int customer_id, String firstname, String lastname, String address, String mobilePhone) {
        this.customer_id = customer_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.mobilePhone = mobilePhone;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Override
    public String toString() {
        return "Customer[" +
                "customer_id=" + customer_id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ']';
    }

    public String getInfo() {
       return   this.toString();
    }
}