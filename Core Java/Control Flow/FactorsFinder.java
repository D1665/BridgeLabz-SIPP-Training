//  Create a program to find the factors of a number taken as user input. Hint => 1. Get the input value for a variable named number. Check if the number entered is a positive integer. 2. Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number is perfectly divisible by i. If true, print the value of i.
import java.util.Scanner;   
public class FactorsFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer to find its factors: ");
        int number = input.nextInt();
        
        // Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        System.out.println("Factors of " + number + ":");
        
        // Loop from 1 to number - 1
        for (int i = 1; i < number; i++) {
            // Check if i is a factor of number
            if (number % i == 0) {
                System.out.println(i); // Print the factor
            }
        }
    }
}