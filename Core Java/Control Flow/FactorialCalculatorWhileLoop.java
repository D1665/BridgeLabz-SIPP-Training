//  Write a Program to find the factorial of an integer entered by the user. Hint => 1. For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24. 2. Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer. 3. Using a while loop, compute the factorial. 4. Print the factorial at the end.
import java.util.Scanner;
public class FactorialCalculatorWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer to find its factorial: ");
        int number = input.nextInt();
        
        // Check if the number is positive
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; // Initialize factorial to 1
            int i = 1; // Start from 1
            
            // Compute the factorial using a while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }
            
            // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}