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

    public void subTotal(double amt) {
        this.total = total - amt;
    }

    public void addTotal(double amt) {
        this.total = total + amt;
    }
}
