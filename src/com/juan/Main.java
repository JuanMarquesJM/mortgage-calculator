package com.juan;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);


        double principal = readNumber(scanner, "Principal (1,000 - 1,000,000): ", 1000, 1000000);
        double annualInterest = readNumber(scanner, "Annual Interest Rate (1 - 30): ", 1, 30);
        int years = (int) readNumber(scanner, "Period (Years 1 - 30): ", 1, 30);

        Mortgage newMortgage = new Mortgage(principal, annualInterest, years);
        double result = newMortgage.calculate();

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(result);
        System.out.println("\nMortgage: " + mortgageFormat);

        scanner.close();
    }
    public static double readNumber(Scanner scanner, String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.println(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max) break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}