// Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 

import java.util.Scanner;
public class AreaOfTriangleConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInInches = input.nextDouble();
        
        System.out.print("Enter the height of the triangle in inches: ");
        double heightInInches = input.nextDouble();
        
        // Calculate area in square inches
        double areaInSquareInches = 0.5 * baseInInches * heightInInches;
        
        // Convert to square centimeters (1 inch = 2.54 cm)
        double conversionFactor = 2.54 * 2.54; // for square conversion
        double areaInSquareCentimeters = areaInSquareInches * conversionFactor;
        
        System.out.printf("The area of the triangle is %.2f square inches or %.2f square centimeters.%n", areaInSquareInches, areaInSquareCentimeters);
    }
}