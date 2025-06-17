//  Create a program to find the factors of a number taken as user input. Hint => 1. Get the input value for a variable named number. Check if the number entered is a positive integer. 2. Create a counter variable and run the while loop till the counter is less than the user input number. In each iteration of the loop, check if the number is perfectly divisible by the counter. If true, print the value of the counter.
import java.util.Scanner;
public class FactorsFinderWhileLoop {
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
        
        int counter = 1;
        
        while (counter < number) {
            if (number % counter == 0) {
                System.out.println(counter); 
            }
            counter++;
        }
    }
}