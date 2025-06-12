package Day1_programming_elements;

public class volumeofearth {
    
    public static void main(String[] args) {
        double radius = 6371.0; // Radius of the Earth in kilometers
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // Volume formula for a sphere

        // Print the result
        System.out.printf("The volume of the Earth is approximately %.2f cubic kilometers.%n", volume);
    }
}
