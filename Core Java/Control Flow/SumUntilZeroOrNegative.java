//find the sum until the user enters 0 or a negative number using while loop and break statement
import java.util.Scanner;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double total = 0.0;
        
        //loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double userInput = input.nextDouble();
            
            // Check if the user entered 0 or a negative number
            if (userInput <= 0) {
                break; // Exit
            }
            
            total += userInput;
        }
        System.out.println("The total sum is: " + total);
    }
}