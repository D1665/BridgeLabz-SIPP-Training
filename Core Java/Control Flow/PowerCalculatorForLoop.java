// Create a program to find the power of a number. Hint => 1. Get integer input for two variables named number and power. 2. Create a result variable with an initial value of 1. 3. Use the for loop from i = 1 to i <= power. 4. In each iteration of the loop, multiply the result with the number and assign the value to the result. 5. Finally, print the result
import java.util.Scanner;
public class PowerCalculatorForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        
        // Check if the power is non-negative
        if (power < 0) {
            System.out.println("Power must be a non-negative integer.");
            return;
        }
        
        int result = 1; // Initialize result
        
        // Use a for loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by number
        }
        
        // Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
    }
}