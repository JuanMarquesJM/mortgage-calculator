package com.juan;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        scanner.useLocale(Locale.US);

        double principal = getValidPrincipal();
        double annualInterestRate = getValidAnnualInterestRate();
        int years = getValidPeriod();

        double mortgage = calculateMortgage(principal, annualInterestRate, years);

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("\nMortgage: " + mortgageFormat);
        scanner.close();

    }


    private static double getValidPrincipal() {
        double principal;
        do {
            System.out.print("Principal (1,000 - 1,000,000): ");
            principal = scanner.nextDouble();

            if (principal < 1_000 || principal > 1_000_000) {
                System.out.println("Enter a number between 1,000 and 1,000,000");
            }
        } while (principal < 1_000 || principal > 1_000_000);

        return principal;
    }

    private static double getValidAnnualInterestRate() {
        double annualInterestRate;
        do {
            System.out.print("Annual Interest Rate (1 - 30): ");
            annualInterestRate = scanner.nextDouble();

            if (annualInterestRate <= 0 || annualInterestRate > 30) {
                System.out.println("Enter a number greater than 0 and less than or equal to 30");
            }
        } while (annualInterestRate <= 0 || annualInterestRate > 30);

        return annualInterestRate;
    }

    private static int getValidPeriod() {
        int years;
        do {
            System.out.print("Period (Years 1 - 30): ");
            years = scanner.nextInt();

            if (years <= 1 || years > 30) {
                System.out.println("Enter a value between 1 and 30");
            }
        } while (years <= 1 || years > 30);

        return years;
    }


    public static double calculateMortgage(double principal, double annualInterestRate, int years) {
        double monthlyInterestRate = (annualInterestRate / PERCENT) / MONTHS_IN_YEAR;
        int numberPayments = years * MONTHS_IN_YEAR;
        double powerFactor = Math.pow(1 + monthlyInterestRate, numberPayments);

        return principal * (monthlyInterestRate * powerFactor) / (powerFactor - 1);
    }
}