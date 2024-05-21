package Loops;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        //findTheMaximum();
        //countTheVowels();
        sumEvenNumbers();

    }

    //Find the Maximum:
// Write a Java program that finds the maximum value in an array of integers.
// Use a for-each loop to iterate through the array.
// You can initialize the array with some values or take the input from the user.
    public static void findTheMaximum() {
        System.out.println("*** Find the Maximum ***");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int myArray[] = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("\rEnter element for the array :");
            myArray[i] = scanner.nextInt();
        }
        int max = myArray[0];
        for (int number : myArray) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("\nThe maximum number in your array is: " + max);
    }


//Count Vowels:
// Create a program that counts the number of vowels in a given string.
// Use a for-each loop to iterate through the characters of the string.
// Consider A, E, I, O, U as vowels for this exercise.

    public static void countTheVowels(){
        System.out.println("*** Count Vowels ***");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to start counting vowels ");
        String word= scanner.nextLine();
        word.toLowerCase();
        char vowels[]={'a','e','i','o','u'};
        int count=0;
        for (char character: word.toCharArray()){
            for (char vowel:vowels){
                if(character==vowel){
                    count++;
                    break;
                }
            }
        }
        System.out.printf("There are %d vowels in the word",count);
    }



//Sum of Even Numbers:
// Given an array of integers, write a Java program that calculates the sum of all even numbers in the array
// using a for-each loop. You can hardcode the array or take input from the user.

    public static void sumEvenNumbers(){
        System.out.println("*** Sum of Even Numbers ***");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int myArray[] = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("\rEnter element for the array :");
            myArray[i] = scanner.nextInt();
        }
        int sum=0;
        for(int numb: myArray){
            if(numb%2==0){
                sum+=numb;
            }
        }
        System.out.println("The sum of even numbers from your array is: "+sum);
    }


}
