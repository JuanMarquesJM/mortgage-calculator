package com.juan;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main (String[] args) {
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();

        float divideMonth = (annualInterestRate / PERCENT) / MONTHS_IN_YEARS;

        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();
        int numberPayments = period * MONTHS_IN_YEARS;

        double mortgage = principal * (divideMonth * Math.pow(1 + divideMonth, numberPayments)) / (Math.pow(1 + divideMonth, numberPayments) - 1);

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormat);
    }
}