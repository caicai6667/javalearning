package com.caicai.Tax;

public class NormalIncome implements Income {

    private double income;

    public NormalIncome(double income) {
        this.income = income;
    }

    @Override
    public double getTax() {
        return income * 0.1;
    }
}
