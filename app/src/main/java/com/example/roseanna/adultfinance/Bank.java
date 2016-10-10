package com.example.roseanna.adultfinance;

/**
 * Created by minkim on 10/10/16.
 */
public class Bank {
    private double total;

    public Bank(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double amt) {
        total = amt;
    }

    public void changeTotal(double amt) {
        total = total + amt;
    }
}
