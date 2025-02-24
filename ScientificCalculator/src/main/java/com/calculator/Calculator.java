package com.calculator;
import java.util.Scanner;

public class Calculator {
    // Square Root Function
    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    // Factorial Function
    public static int factorial(int x) {
        if (x == 0) return 1;
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    // Natural Logarithm Function
    public static double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Input must be greater than zero.");
        }
        return Math.log(x);
    }

    // Power Function
    public static double power(double x, double b) {
        return Math.pow(x, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nScientific Calculator");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Log (ln(x))");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting Calculator...");
                break;
            }

            System.out.print("Enter the value of x: ");
            double x = scanner.nextDouble();
            double result = 0;

            switch (choice) {
                case 1:
                    result = squareRoot(x);
                    System.out.println("√" + x + " = " + result);
                    break;
                case 2:
                    int factResult = factorial((int) x);
                    System.out.println(x + "! = " + factResult);
                    break;
                case 3:
                    result = naturalLog(x);
                    System.out.println("ln(" + x + ") = " + result);
                    break;
                case 4:
                    System.out.print("Enter the value of b: ");
                    double b = scanner.nextDouble();
                    result = power(x, b);
                    System.out.println(x + "^" + b + " = " + result);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}

