package com.juan;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        double principal = Console.readNumber("Principal (1,000 - 1,000,000): ", 1000, 1000000);
        double annualInterest = Console.readNumber("Annual Interest Rate (1 - 30): ", 1, 30);
        int years = (int) Console.readNumber("Period (Years 1 - 30): ", 1, 30);

        Mortgage newMortgage = new Mortgage(principal, annualInterest, years);
        double result = newMortgage.calculate();

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(result);
        System.out.println("\nMortgage: " + mortgageFormat);

    }
}
