// CP - Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch.

import java.util.Scanner;
public class CountdownRocketLaunch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //input value for the countdown.
        System.out.print("Enter a number to start the countdown: ");
        int counter = input.nextInt();
        
        //check if the counter is greater than or equal to 1
        while (counter >= 1) {
            //print the value of the counter and decrement the counter.
            System.out.println("Countdown: " + counter);
            counter--;
        }
        
    }
}