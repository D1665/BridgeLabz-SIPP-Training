// Write a program to find the side of the square whose parameter you read from user 
import java.util.Scanner;
public class FindSideOfSquare_UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        
        // Calculate the side length
        double side = perimeter / 4;
        
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n", side, perimeter);
    }
}