// Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.

import java.util.Scanner;
public class VotingEligibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input value
        System.out.print("Enter the person's age: ");
        int age = input.nextInt();
        
        // Check if the person is 18 or older
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}