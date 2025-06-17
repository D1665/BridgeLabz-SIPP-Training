// Create a program to print the greatest factor of a number beside itself using a loop. Hint => 1. Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1 2. Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1. 3. Inside the loop, check if the number is perfectly divisible by i then assign i to greatestFactor variable and break the loop. 4. Display the greatestFactor variable outside the loop
import java.util.Scanner;
public class GreatestFactorCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer to find its greatest factor (besides itself): ");
        int number = input.nextInt();
        
        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        int greatestFactor = 1; // Initialize greatestFactor to 1
        
        // Loop from number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            // Check if i is a factor of number
            if (number % i == 0) {
                greatestFactor = i; // Assign i to greatestFactor
                break; // Exit the loop once the greatest factor is found
            }
        }
        
        // Print the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
    }
}