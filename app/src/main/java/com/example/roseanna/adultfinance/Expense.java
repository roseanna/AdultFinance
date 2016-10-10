package com.example.roseanna.adultfinance;

/**
 * Created by roseanna on 10/10/16.
 */
public class Expense {
    private double cost;
    public String desc;
    public boolean monthly;
    public boolean isPaid;

    public Expense(String desc, Double cost, boolean monthly, boolean isPaid){
        this.cost       = cost;
        this.desc       = desc;
        this.monthly    = monthly;
        this.isPaid     = isPaid;
    }

    public double getCost() {
        return cost;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isMonthly() {
        return monthly;
    }

    public boolean getIsPaid() {
        return isPaid;
    }
    
    public void setCost(double amt) {
        cost = amt;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void changeCost(double amt) {
        cost = cost + amt;
    }
}
