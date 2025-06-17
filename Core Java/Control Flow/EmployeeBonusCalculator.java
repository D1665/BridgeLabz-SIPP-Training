// Create a program to find the bonus of employees based on their years of service. Hint => 1. Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years. 2. Take salary and year of service in the year as input. 3. Print the bonus amount.
import java.util.Scanner;
public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the employee's salary: ");
        double salary = input.nextDouble();
        
        System.out.print("Enter the years of service: ");
        int yearsOfService = input.nextInt();
        
        // Check if the years of service is more than 5
        if (yearsOfService > 5) {
            double bonus = salary * 0.05; // Calculate 5% bonus
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for employees with 5 or fewer years of service.");
        }
    }
}