//  Create a program to print odd and even numbers between 1 to the number entered by the user. Hint => 1. Get an integer input from the user, assign it to a variable number and check for Natural Number 2. Using a for loop, iterate from 1 to the number 3. In each iteration of the loop, print the number as odd or even number
import java.util.Scanner;
public class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        
        // Check if the number is a natural number
        if (number < 1) {
            System.out.println("Please enter a natural number greater than 0.");
            return;
        }
        
        // Iterate from 1 to the number
        for (int i = 1; i <= number; i++) {
            // Check if the number is even or odd
            if (i % 2 == 0) {
                System.out.println(i + " is an even number.");
            } else {
                System.out.println(i + " is an odd number.");
            }
        }
    }
}