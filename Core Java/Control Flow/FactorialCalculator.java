//  Write a Program to find the factorial of an integer entered by the user.
import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input value for the factorial calculation
        System.out.print("Enter a positive integer to find its factorial: ");
        int number = input.nextInt();
        
        // Check if the number is positive
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; // Initialize factorial to 1
            
            // Compute the factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            
            // print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}