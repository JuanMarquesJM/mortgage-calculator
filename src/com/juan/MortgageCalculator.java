package com.juan;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Period (Years): ");
        int years = scanner.nextInt();

        double mortgage = calculateMortgage(principal, annualInterestRate, years);

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormat);
    }

    public static double calculateMortgage(double principal, double annualInterestRate, int years) {

        double monthlyInterestRate = (annualInterestRate / PERCENT) / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double powerFactor = Math.pow(1 + monthlyInterestRate, numberOfPayments);

        return principal * (monthlyInterestRate * powerFactor) / (powerFactor - 1);
    }
}