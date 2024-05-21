package DataTypes;

public class BooleanExercise {
    public static void main(String[] args) {
        printBoolean();
        compareTwoIntegers(2,3);
        weatherConditions(true, true, false);
    }
//    Boolean Value Assignment and Printing
//    Create a program that declares a boolean variable, assigns a value to it, and then prints it.
//    This exercise helps you understand how to work with boolean variables.
    public static void printBoolean(){
        boolean myBoolean= true;
        System.out.println("This is my boolean");
    }
//    Boolean Comparison
//    Write a program that compares two integers using relational operators (e.g., <, >, <=, >=) and stores the result in a boolean variable.
//    Then, print the result.
//    This exercise demonstrates how comparison operations result in boolean values.
    public static  void compareTwoIntegers(int a, int b){
        boolean results;
        if(a==b){
            results=true;
        }else
            results=false;
        System.out.printf("The affirmation that %d and %d are equal it is %b", a,b, results );

    }

//    Checking Weather Conditions
//    Write a program to decide if you should go out based on the weather conditions.
//    The decision is based on three factors: if it's sunny, if there's a chance of rain, and if it's warm.
//    You should only go out if it's sunny and warm.
//    However, even if it's not sunny, you might still consider going out if it's warm but only if there's no chance of rain.
//            Instructions:
//    Create three boolean variables: isSunny, isWarm, and chanceOfRain.
//    Use logical operators to evaluate the conditions under which you should go out.
//    Store the result in a boolean variable named shouldGoOut.
//    Print the value of shouldGoOut.
public static void weatherConditions(boolean isSunny, boolean warm, boolean chanceOfRain) {
    boolean shouldGoOut;

    if ((isSunny && warm) && !chanceOfRain) {
        shouldGoOut = true;
    } else if (!isSunny && warm && !chanceOfRain) {
        shouldGoOut = true;
    } else {
        shouldGoOut = false;
    }

    System.out.printf("\nBecause it is sunny is  %b, warm is %b, and there is a chance of rain is %b, should I go out it is %b%n",
            isSunny, warm, chanceOfRain, shouldGoOut);
}
}
