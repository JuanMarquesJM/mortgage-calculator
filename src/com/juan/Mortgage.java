package com.juan;

public class Mortgage {
    private double principal;
    private double annualInterestRate;
    private int years;

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public Mortgage(double principal, double annualInterestRate, int years){
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;

    }
    public double calculate(){
        double monthlyInterestRate = (annualInterestRate / PERCENT) / MONTHS_IN_YEAR;
        int numberPayments = years * MONTHS_IN_YEAR;
        double powerFactor = Math.pow(1 + monthlyInterestRate, numberPayments);

        return principal * (monthlyInterestRate * powerFactor) / (powerFactor - 1);
    }
}
