//  Write a program to find the sum of n natural numbers using for loop, compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. Hint => 1. Take the user input number and check whether it's a Natural number 2. If it's a natural number Compute using formulae as well as compute using for loop3. Compare the two results and print the result
import java.util.Scanner;
public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        
        // Check if the number is a natural number
        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
            return;
        }
        
        // Compute the sum using the formula
        int formulaSum = n * (n + 1) / 2;
        
        // Compute the sum using a for loop
        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i;
        }
        
        // Compare the results and print them
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using for loop: " + loopSum);
        
        if (formulaSum == loopSum) {
            System.out.println("Both computations are correct and equal to: " + formulaSum);
        } else {
            System.out.println("There is a discrepancy between the two computations.");
        }
    }
}