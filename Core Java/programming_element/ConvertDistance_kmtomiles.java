// Create a program to convert distance in kilometers to miles.
import java.util.Scanner;
public class ConvertDistance_kmtomiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        
        double conversionFactor = 1.6;
        double miles = km / conversionFactor;
        
        System.out.printf("The total miles is %.2f mile for the given %.2f km%n", miles, km);
    }
}