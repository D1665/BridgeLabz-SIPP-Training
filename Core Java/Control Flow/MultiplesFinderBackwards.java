//  Create a program to find all the multiple of a number taken as user input below 100. Hint => 1. Get the input value for a variable named number. Check the number is a positive integer and less than 100. 2. Use a for loop backwards: from i = 100 to i = 1. 3. Inside the loop, check if i perfectly divide the number. 4. If true, print the number and continue the loop.
import java.util.Scanner;
public class MultiplesFinderBackwards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();
        
        // Check if the number is a positive integer and less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
            return;
        }
        
        // Loop backwards from 100 to 1
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of number
            if (i % number == 0) {
                System.out.println("Multiple of " + number + ": " + i);
            }
        }
    }
}