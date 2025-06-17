//  Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
import java.util.Scanner;   
public class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input values for month and day
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        
        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt();
        
        // Check if the date falls within the Spring season
        boolean isSpringSeason = (month == 3 && day >= 20) ||  (month == 4) ||  (month == 5) || (month == 6 && day <= 20);
        
        if (isSpringSeason) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}