// Write a program that takes your height in centimeters and converts it into feet and inches
import java.util.Scanner;
public class ConvertHeight_cmtofeetandInches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = input.nextDouble();
        
        double cmToInches = 2.54;
        double inchesInFoot = 12.0;
        
        double heightInInches = heightInCm / cmToInches;
        
        int feet = (int) (heightInInches / inchesInFoot);
        double remainingInches = heightInInches % inchesInFoot;
        
        System.out.printf("Your height in cm is %.2f while in feet is %d and inches is %.2f%n", heightInCm, feet, remainingInches);
    }
}