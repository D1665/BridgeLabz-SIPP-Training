// Write a Program to check if the given number is a prime number or not Hint => 1. A number that can be divided exactly only by itself and 1 are Prime Numbers, 2. Prime Numbers checks are done for numbers greater than 1 3. Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 4. Use the isPrime boolean variable to store the result and finally display the result
import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it is prime: ");
        int number = input.nextInt();
        
        // Check if the number is greater than 1
        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
            return;
        }
        
        boolean isPrime = true;
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}