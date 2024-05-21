package Operators;

import java.util.Random;
import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        findTheDivisor();
        skipNegativeNumbers();
        guessTheNumber();
    }
//Find the First Positive Divisor:
// Write a Java program that finds the first positive divisor (other than 1) of a number entered by the user.
// Use a loop and a break statement when the divisor is found.

    public static void findTheDivisor() {
        System.out.println("***Find the divisor program***");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        // Check if the number is less than or equal to 1
        if (number <= 1) {
            System.out.println("Error: Please enter a number greater than 1.");
            return;
        }
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                System.out.printf("First positive divisor number of the %d is %d", number, i);
                break;
            }
        }
    }

    //Skip Negative Numbers:
// Create a program that sums up numbers entered by the user until the user enters 0.
// Use a continue statement to skip any negative numbers and print the final sum.
    public static void skipNegativeNumbers() {
        System.out.println("\n***Skip negative numbers program ***");
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        do {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            if (number < 0) {
                continue;
            }
            sum += number;
            System.out.println("Accumulated total:" + sum);
        } while (number != 0);
        System.out.println("Final sum: " + sum);
    }

    //Guess the Number Game:
// Implement a simple "guess the number" game where the program randomly selects a number between 1 and 10,
// and the user has a maximum of 5 attempts to guess it. Use a loop with a break statement to end the game if the user
// guesses correctly or uses up all attempts.
    public static void guessTheNumber() {
        System.out.println("\n***Guess the number game ***  ");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        int number = random.nextInt(10) + 1;
        for (int attempt = 1; attempt <= 5; attempt++) {
            System.out.println("Enter a number: ");
            userNumber = scanner.nextInt();
            if (userNumber == number) {
                System.out.println("You've guessed it.Congrats, the number was: " + number);
                break;
            }
            System.out.printf("%d/5 attempts\n", attempt);
            if (attempt == 5) {
                System.out.println("\nGame over! maybe next time :), btw the number was: " + number);
            }
        }
    }
}
