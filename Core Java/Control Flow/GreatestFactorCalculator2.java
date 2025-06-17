// Create a program to print the greatest factor of a number beside itself using a loop. Hint => 1. Get an integer input and assign it to the number variable. As well as define the greatestFactor variable and assign it to 1 2. Create a variable counter and assign counter = number - 1;. Use the while loop till the counter is equal to 1. 3. Inside the loop, check if the number is perfectly divisible by the counter then assign the counter to greatestFactor variable and break the loop. 4. Display the greatestFactor variable outside the loop
import java.util.Scanner;
public class GreatestFactorCalculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer to find its greatest factor (besides itself): ");
        int number = input.nextInt();
        
        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        int greatestFactor = 1; 
        int counter = number - 1; 
        
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break; 
            }
            counter--; // Decrement
        }
        
        // Print the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
    }
}