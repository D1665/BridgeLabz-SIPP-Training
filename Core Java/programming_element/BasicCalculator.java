// Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division.
//  The program should ask for two numbers (floating point) and perform all the operations
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();
        
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = 0.0;
        
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Division by zero is not allowed.");
            return; // Exit the program if division by zero
        }
        
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f%n", number1, number2, addition, subtraction, multiplication, division);
    }
}