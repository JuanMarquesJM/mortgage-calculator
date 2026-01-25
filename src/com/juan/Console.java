package com.juan;

import java.util.Scanner;
import java.util.Locale;


public class Console {
    private static Scanner scanner = new Scanner(System.in);
    public static double readNumber(String prompt, double min, double max) {
        scanner.useLocale(Locale.US);
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
