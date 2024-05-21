package DataTypes;

public class IntegersExercise {
    public static void main(String[] args) {
        calculatePerimeter(3,7);
        convertMinutesToSeconds(2);
        calculateArea(9);
    }

//    Calculate the Perimeter of a Rectangle:
//    Initialize two integers length and width with any values. Calculate and print the perimeter of a rectangle using these variables.
    public static int calculatePerimeter(int length, int width){

        int perimeter= 2*(length + width);
        System.out.println("The perimeter of a  rectangle is: "+ perimeter);
        return  perimeter;
    }
//    Convert Minutes into Seconds:
//    Initialize an integer minutes with any value. Convert this into seconds and print the result.
    public static int convertMinutesToSeconds(int minutes){
        int seconds= minutes* 60;
        System.out.println(minutes +"minutes  converted to seconds equals: "+ seconds);
        return seconds;

    }
//    Calculate the Area of a Square
//    Initialize an integer side representing the side of a square. Calculate and print the area of the square.
    public  static  int calculateArea(int side){
        int area= side*side;
        System.out.println("The area of a square with side " + side+ "is :" +area);
        return  area;

    }
}
