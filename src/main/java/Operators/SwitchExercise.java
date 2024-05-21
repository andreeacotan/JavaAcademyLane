package Operators;

import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        checkTheDay();
        simpleCalculator(5, 7, '/');
        checkTheTrafficLight("red");

    }

    // Day of the Week:
// Write a Java program that asks the user for a number (1-7) and prints the day of the week corresponding to that number
// using a switch statement (1 for Monday, 2 for Tuesday, etc.).
    public static void checkTheDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7: ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Not available");

        }
    }

    //Simple Calculator:
// Create a Java program that acts as a simple calculator.
// The program should take three inputs: two numbers and an operator(+, -, *, /)and perform the operation
// using a switch statement.
    public static void simpleCalculator(int a, int b, char operator) {
        switch (operator) {
            case '+':
                System.out.printf("%d / %d = %d%n", a, b, a + b);
                break;
            case '-':
                System.out.printf("%d / %d = %d%n", a, b, a - b);
                break;
            case '*':
                System.out.printf("%d / %d = %d%n", a, b, a * b);
                break;
            case '/':
                if (b != 0) {
                    System.out.printf("%d / %d = %d%n", a, b, a / b);
                } else {
                    System.out.println("Error: Division by 0");
                }
                break;
            default:
                System.out.println("Not a valid operator");
        }
    }

//Traffic Light Simulator:
// Simulate a traffic light using a switch statement.
// The user inputs one of three colors (red, yellow, green), and the program prints out what a driver should do
// (e.g., "Stop" for red).

    public static void checkTheTrafficLight(String color) {
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "green":
                System.out.println("Keep going");
                break;
            case "yellow":
                System.out.println("prepare to stop");
                break;
        }

    }
}
