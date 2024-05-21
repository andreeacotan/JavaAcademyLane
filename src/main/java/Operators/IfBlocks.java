package Operators;

import java.util.Scanner;

public class IfBlocks {
    public static void main(String[] args) {
        gradeCalculator();
        passwordChecker();
        checkTheYearIsLeap(2400);
    }


    // Grade Calculator:
// Write a Java program that takes a score (e.g., 87) as input and assigns a grade based on the score
// (A for 90 and above, B for 80-89, C for 70-79, D for 60-69, and F for below 60) using if-else blocks.
// Print the grade.
    public static void gradeCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a score( only numbers between 0 and 100 are allowed):");
        double score = scanner.nextDouble();
        if (score >= 90) {
            System.out.println("The grade obtained is A");
        } else if (score >= 80) {
            System.out.println("The grade obtained is B");
        } else if (score >= 70) {
            System.out.println("The grade obtained is C");
        } else if (score >= 60) {
            System.out.println("The grade obtained is D");
        } else if (score < 60 && score > 0) {
            System.out.println("The grade obtained is F");
        } else {
            System.out.println("Not a valid number, enter numbers between 0 and 100");
        }
    }

    // Password Checker:
// Implement a simple password strength checker in Java. If the password length is less than 8 characters,
// print "Weak Password". If it has 8 or more characters but doesn't contain any number, print "Moderate Password".
// If it meets both conditions, print "Strong Password".
    public static void passwordChecker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = scanner.nextLine();
        if (password.length() < 8) {
            System.out.println("Weak password");
        } else if (!password.matches(".*\\d.*")) {
            System.out.println("Moderate password");
        } else {
            System.out.println("Strong password");
        }
    }

// Leap Year Checker: Write a Java program to check whether a year (input from the user) is a leap year or not.
// Remember, a leap year is divisible by 4 but not by 100 unless it's also divisible by 400.

    public static void checkTheYearIsLeap(int year) {
        if (year % 400 == 0) {
            System.out.printf("\nThe year %d is leap", year);
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.printf("\nThe year %d is leap", year);
        } else {
            System.out.printf("\nThe year %d is not leap", year);
        }
    }
}
