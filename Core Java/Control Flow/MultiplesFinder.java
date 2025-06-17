//  Create a program to find all the multiples of a number taken as user input below 100. Hint => 1. Get the input value for a variable named number. Check the number is a positive integer and less than 100. 2. Create a counter variable and assign counter = number - 1;. Use a while till the counter is > 1 3. Inside the loop, check if the counter perfectly divides the number. 4. If true, print the number and continue the loop.
import java.util.Scanner;
public class MultiplesFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();
        
        // Check if the number is a positive integer and less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
            return;
        }
        
        int counter = number - 1; // Initialize counter
        
        // Loop until counter is greater than 1
        while (counter > 1) {
            // Check if counter is a multiple of number
            if (number % counter == 0) {
                System.out.println("Multiple of " + number + ": " + counter);
            }
            counter--; // Decrement counter
        }
    }
}