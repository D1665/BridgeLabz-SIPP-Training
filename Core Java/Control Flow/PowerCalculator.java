//  Create a program to find the power of a number. Hint => 1. Get integer input for two variables named number and power. 2. Create a result variable with an initial value of 1. 3. Create a temp variable counter and initialize to zero. Use the while loop till counter == power. 4. In each iteration of the loop, multiply the result with the number and assign the value to the result. Also increment the counter. 5. Finally, print the result
import java.util.Scanner;
public class PowerCalculator {
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
        int result = 1;
        int counter = 0;
        
        while (counter < power) {
            result *= number; // Multiply result by number
            counter++; // Increment counter
        }
        
        // Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
    }
}