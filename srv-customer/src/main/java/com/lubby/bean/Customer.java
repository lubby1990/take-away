package com.lubby.bean;

/**
 * Created by lubby on 2015/10/2.
 */
public class Customer {
    private String customer;

    public Customer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer='" + customer + '\'' +
                '}';
    }
}
