package DataTypes;

public class DoubleExercise {
    public static void main(String[] args) {
        calculateVolumeOfCylinder(4, 5);
        convertFahrenheitToCelsius(79);
        calculateHypotenuse(5, 5);
    }

    //    Calculate the Volume of a Cylinder
//    Initialize two doubles radius and height for a cylinder.
//    Calculate and print the volume of the cylinder (use Math.PI for π).
    public static double calculateVolumeOfCylinder(double radius, double height) {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of a cylinder with radius " + radius + "and height " + height + " is " + volume);
        return volume;

    }

    //    Convert Fahrenheit to Celsius
//    Initialize a double Fahrenheit with any value. Convert this to Celsius and print the result.
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("Converting %.2f fahrenheit to celsius is %.2f ", fahrenheit, celsius);
        return celsius;
    }

    //    Calculate the Hypotenuse of a Right-Angled Triangle
//    Given the lengths of the two shorter sides of a right-angled triangle, calculate the length of the hypotenuse.
//    Remember, the hypotenuse of a right-angled triangle can be found using Pythagoras theorem,
//    which states that the square of the hypotenuse is equal to the sum of the squares of the other two sides.
    public static double calculateHypotenuse(double side1, double side2) {
        double hypotenuseSquared = side1 * side1 + side2 * side2;
        double hypotenuse = Math.sqrt(hypotenuseSquared);
        System.out.printf("\nHypotenuse of a Right-Angled Triangle with sides %.0f and %.0f is %.0f", side1, side2, hypotenuse);
        return hypotenuse;

    }
}
