package com.caicai.Tax;



public class totalTax {
    public static double totalTax(Income[] incomes) {
        double total = 0;
        for (Income income : incomes) {
            total += income.getTax();
        }
        return total;
    }
}