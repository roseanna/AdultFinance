package com.example.roseanna.adultfinance;

/**
 * Created by minkim on 10/10/16.
 */
public class Calculator {
    private Bank checking;
    private Bank savings;
    private Expense allowance;
    private Expense monthly;

    public Calculator(Bank checking, Bank savings) {
        this.checking   = checking;
        this.savings    = savings;
    }
}
