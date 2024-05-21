package DataTypes;

public class CharExercise {
    public static void main(String[] args) {
        //    Print a String
//    Write a program that initializes a String variable with a value and prints it.
        String myString= "String";
        System.out.println(myString);
//    Concatenate Two Strings
//    Create a program that concatenates two strings and prints the result.
        String myOtherString= "Learning";
        String concatenatedStrings= myString + " "+ myOtherString;
        System.out.println(concatenatedStrings);

//    Replace Characters
//    Write a program that replaces all occurrences of a specified character in a string with another character.
//    Challenge: Explore Java's built-in methods for various data types.
        String myStr="Guess the missing character ";
        char oldChar= 's';
        char newChar='*';
        String newString= myStr.replace(oldChar,newChar);
        System.out.println(newString);


    }

}
