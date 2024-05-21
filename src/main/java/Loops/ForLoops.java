package Loops;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) throws InterruptedException {
        multiplicationForNumber();
        calculateFactorialForNumber();
        countdown();

    }
// Multiplication Table:
// Write a Java program that prints out the multiplication table for a number up to 10.
// For example, if the user inputs 3, your program should print the multiplication
// table for 3 (3 x 1 = 3, 3 x 2 = 6, ..., 3 x 10 = 30) using a for loop.

    public static void multiplicationForNumber() {
        System.out.println("*** Multiplication table ***");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to display the multiplication up to 10:");
        int number = scanner.nextInt();
        System.out.printf("\nMultiplication table for the number %d : ", number);
        for (int i = 0; i <= 10; i++) {
            System.out.printf("\n%d x %d = %d ", number, i, number * i);
        }
    }

    //Factorial Calculator:
// Create a program that calculates the factorial of a number provided by the user.
// Use a for loop to calculate the factorial.
// Remember, the factorial of n (n!) is the product of all positive integers less than or equal to n.
    public static void calculateFactorialForNumber() {
        System.out.println("***Calculate Factorial ***");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to display the factorial for:");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Not a valid operation!Enter a non-negative integer");
        } else {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            System.out.printf("\nFactorial of %d is %d", number, result);
        }
    }

    //Countdown Timer:
// Implement a countdown timer that takes a number from the user and counts down to 0,
// printing each number. Use a for loop for the countdown, and make sure to include a sleep of 1 second
// between each print to simulate a real timer.
    public static void countdown() throws InterruptedException {
        System.out.println("*** Countdown Timer***");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to start the countdown");
        int number = scanner.nextInt();
        int total;
        if (number < 0) {
            System.out.println("Error: Please enter a non-negative number.");
        } else {
            for (int i = number; i >= 0; i--) {
                System.out.print("\r" + i);
                Thread.sleep(1000);
            }
            System.out.println("\nCountdown complete!");
        }
    }
}
