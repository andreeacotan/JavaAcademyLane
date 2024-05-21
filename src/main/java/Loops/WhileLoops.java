package Loops;

import java.util.Random;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        inputSummation();
        guessTheNumber();

        if(checkThePalindrome()){
            System.out.println("The word you introduced it is a palindrome");
        }else {
            System.out.println("The word you introduced is not a palindrome");
        }

    }

    //Input Summation:
    // Write a Java program that continuously takes numbers as input from the user and adds them to a sum.
    // The loop should continue until the user enters 0, at which point the program should print the final sum and exit.
    public static void inputSummation() {
        System.out.println("*** Input Summation ***");
        Scanner scanner = new Scanner(System.in);
        int number, sum = 0;
        do {
            System.out.println("Enter a number : ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);
        System.out.printf("Total sum is:%d. Exiting...", sum);
    }

    //Guessing Game:
    // Implement a guessing game where the program selects a random number between 1 and 100,
    // and the user has to guess it. Use a while loop to allow the user unlimited attempts until they guess the number
    // correctly. After each guess, the program should tell the user if the guess is too high or too low.
    public static void guessTheNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("*** Guessing Game ***");
        Scanner scanner = new Scanner(System.in);
        int guessingNumber;
        do {
            System.out.println("Enter a number : ");
            guessingNumber = scanner.nextInt();
            if (guessingNumber <= 0 || guessingNumber>100) {
                System.out.println("Error, enter a number between 1 and 100");

            } else if (guessingNumber < randomNumber - 10) {
                System.out.println("Too low");

            } else if (guessingNumber < randomNumber) {
                System.out.println("Too low but close");

            } else if (guessingNumber > randomNumber + 10) {
                System.out.println("Too high");
            } else if (guessingNumber > randomNumber) {
                System.out.println("Too high but close");

            }
        } while (guessingNumber != randomNumber);
        System.out.printf("Congrats! you have guess it, the number was: %d ", randomNumber);
        scanner.close();
    }

    //Palindrome Checker:
    // Create a Java program that checks if a given string is a palindrome.
    // Use a while loop to compare characters from the beginning and the end of the string, moving towards the center.
    // A palindrome reads the same backward as forward, like "radar" or "level"

    public static boolean checkThePalindrome() {
        System.out.println("*** Palindrome Checker ***");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word  to check if it is a palindrome: ");
        String word = scanner.nextLine();
        word.toLowerCase();
        int left=0;
        int right= word.length()-1;
      while(left<right){
          if(word.charAt(left)!= word.charAt(right)){
             return  false;
          }
       left++;
       right--;
      }
      return true;
    }
}
