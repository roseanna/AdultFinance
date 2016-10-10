package com.example.roseanna.adultfinance;

/**
 * Created by roseanna on 10/10/16.
 */
public class Expense {
    public double cost;
    public String desc;
    public boolean monthly;
    public boolean isPaid;

    public Expense(String desc, Double cost, boolean monthly, boolean isPaid){
        this.cost       = cost;
        this.desc       = desc;
        this.monthly    = monthly;
        this.isPaid     = isPaid;
    }
}
