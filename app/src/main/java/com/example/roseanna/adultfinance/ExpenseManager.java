package com.example.roseanna.adultfinance;

import java.util.ArrayList;

/**
 * Created by roseanna on 10/10/16.
 */
public class ExpenseManager {
    private ArrayList<Expense> expenses;
    public double monthlyExpenses   = 0;
    public double allowanceExpenses = 0;

    private void addExpense(Expense newExpense){
        expenses.add(newExpense);
        if (newExpense.monthly){
            monthlyExpenses += newExpense.cost;
        }else{
            allowanceExpenses+= newExpense.cost;
        }
    }

    public double getMonthlyExpenses(){
        return monthlyExpenses;
    }

    public double getAllowanceExpenses(){
        return allowanceExpenses;
    }

    public double getTotalExpenses(){
        return monthlyExpenses + allowanceExpenses;
    }
}
