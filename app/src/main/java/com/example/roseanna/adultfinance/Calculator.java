package com.example.roseanna.adultfinance;

/**
 * Created by minkim on 10/10/16.
 */
public class Calculator {
    private Bank checking;
    private Bank savings;
    private Expense allowance;
    private Expense monthly;

    public Calculator(Bank checking, Bank savings, Expense allowance, Expense monthly) {
        this.checking   = new Bank(0.0);
        this.savings    = new Bank(0.0);
        this.allowance  = new Expense("", 0.0, false, false);
        this.monthly    = new Expense("", 0.0, true, false);
    }
}
