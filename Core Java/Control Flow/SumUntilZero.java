// - Write a program to find the sum of numbers until the user enters 0.
import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Initialize total to 0.0
        double total = 0.0;
        double userInput;
        
        //for input
        System.out.print("Enter a number (0 to stop): ");
        userInput = input.nextDouble();
        
        //loop to sum numbers until user enters 0
        while (userInput != 0) {
            total += userInput; // Add user input to total
            System.out.print("Enter another number (0 to stop): ");
            userInput = input.nextDouble(); // Ask for next input
        }
        
        // Display the total value
        System.out.println("The total sum is: " + total);
    }
}