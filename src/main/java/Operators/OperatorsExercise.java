package Operators;

import java.util.Scanner;

public class OperatorsExercise {
    public static void main(String[] args) {
        aritmeticOperations(10, 0);
        checkTheNumber();
        compoundOperations(3, 2);
    }

    //Basic Arithmetic Operators:
// Create a Java program that takes two integers as input and prints their sum, difference, multiplication, and division.
// Make sure to handle division by zero gracefully.
    public static void aritmeticOperations(int a, int b) {
        System.out.printf("\nThe sum of %d and %d is %d", a, b, a + b);
        System.out.printf("\nThe difference of %d and %d is %d", a, b, a - b);
        System.out.printf("\nThe multiplication of %d and %d is %d", a, b, a * b);
        if (b != 0) {
            System.out.printf("\nThe division of %d and %d is %d", a, b, a / b);
        } else {
            System.out.println("\nDivision by 0 it is not posible");
        }
    }

    //Modulus Magic:
// Write a Java program that checks if a number (input from the user) is even or odd without using any conditional statements
// (hint: use the modulus operator).
    public static void checkTheNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a number:");
        int number = scanner.nextInt();
        boolean numberIsEven = number % 2 == 0;
        System.out.printf("It is %b that number is even", numberIsEven);
        scanner.close();
    }

    //Compound Assignment Operators:
// Create a program that demonstrates the use of compound assignment operators like +=, -=, *=, and /= with some integers.
// Print the result after each operation to see the effect.
    public static void compoundOperations(int a, int b) {
        System.out.printf("\nThe compound += it is equivalent to a=a+b,where a=%d and b=%d with the result %d", a, b, a += b);
        System.out.printf("\nThe compound -= it is equivalent to a=a-b where a=%d and b=%d with the result %d", a, b, a -= b);
        System.out.printf("\nThe compound *= it is equivalent to a=a*b where a=%d and b=%d with the result %d", a, b, a *= b);
        System.out.printf("\nThe compound /= it is equivalent to a=a/b where a=%d and b=%d with the result %d", a, b, a /= b);
    }
}
