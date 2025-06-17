// Write a program the find the distance in yards and miles for the distance provided by user in feets
import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        
        // Convert feet to yards and miles
        double yards = distanceInFeet / 3; // 1 yard = 3 feet
        double miles = yards / 1760; // 1 mile = 1760 yards
        
        System.out.printf("The distance is %.2f yards and %.2f miles for the given %.2f feet%n", yards, miles, distanceInFeet);
    }
}