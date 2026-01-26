package com.juan;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class Console {
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
    }

    public static double readDouble(String prompt, double min, double max) {
        double value = 0;
        String errorMessage = "Enter a value between " + min + " and " + max;
        while (true) {
            try {
                System.out.println(prompt);
                value = scanner.nextDouble();
                if (value >= min && value <= max) break;
                System.out.println(errorMessage);
            } catch (InputMismatchException e) {
                System.out.println(errorMessage);
                scanner.nextLine();
            }
        }
        return value;
    }

    public static int readInt (String prompt, int min, int max) {
        int value = 0;
        while (true) {
            String errorMessage = "Enter a value between " + min + " and " + max;
            try {
                System.out.println(prompt);
                value = scanner.nextInt();
                if (value >= min && value <= max) break;
                System.out.println(errorMessage);
            } catch (InputMismatchException e) {
                System.out.println(errorMessage);
                scanner.nextLine();
            }

        }
        return value;
    }
}
