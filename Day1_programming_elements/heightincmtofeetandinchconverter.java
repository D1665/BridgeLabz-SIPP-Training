package Day1_programming_elements;

public class heightincmtofeetandinchconverter {
    
    public static void main(String[] args) {
        double heightInCm = 170.0; // Example height in centimeters

        // Conversion factors
        double cmToInches = 0.393701;
        double inchesToFeet = 12.0;

        // Convert height to inches
        double heightInInches = heightInCm * cmToInches;

        // Convert inches to feet and remaining inches
        int feet = (int) (heightInInches / inchesToFeet);
        int inches = (int) (heightInInches % inchesToFeet);

        // Print the result
        System.out.println(heightInCm + " cm is approximately " + feet + " feet and " + inches + " inches.");
    }
}
