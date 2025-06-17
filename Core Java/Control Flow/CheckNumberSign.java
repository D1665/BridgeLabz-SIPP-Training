// Write a program to check whether a number is positive, negative, or zero. Hint => 1. Get integer input from the user and store it in the number variable. 2. If the number is positive, print positive. 3. If the number is negative, print negative. 4. If the number is zero, print zero.
import java.util.Scanner;
public class CheckNumberSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}