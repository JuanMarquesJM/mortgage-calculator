package com.juan;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        double principal = Console.readDouble("Principal (1,000 - 1,000,000): ", 1000, 1000000);
        double annualInterest = Console.readDouble("Annual Interest Rate (1 - 30): ", 1, 30);
        int years = Console.readInt("Period (Years 1 - 30): ", 1, 30);

        Mortgage newMortgage = new Mortgage(principal, annualInterest, years);
        double result = newMortgage.calculate();

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(result);
        System.out.println("\nMortgage: " + mortgageFormat);

    }
}
