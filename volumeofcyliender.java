public class volumeofcyliender {
    public static void main(String[] args) {
        double radius = 5.0; // Example radius
        double height = 10.0; // Example height
        
        double volume = calculateVolume(radius, height);
        System.out.println("The volume of the cylinder is: " + volume);
    }

    public static double calculateVolume(double r, double h) {
        return 3.14 * r * r * h;
    }
}
