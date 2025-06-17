// Create a program to find the multiplication table of a number entered by the user from 6 to 9. Hint => 1. Take integer input and store it in the variable number 2. Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer to find its multiplication table from 6 to 9: ");
        int number = input.nextInt();
        
        // Check if the number is an integer
        if (number < 0) {
            System.out.println("Please enter a valid integer.");
            return;
        }
        
        // Loop from 6 to 9 to print the multiplication table
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}