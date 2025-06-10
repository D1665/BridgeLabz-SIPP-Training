public class area {
    public static void main(String[] args) {
        double r = 5.0; // Example length
       
        double area = calculateArea(r);
        System.out.println("The area of the circle is: " + area);
    }

    public static double calculateArea(double r) {
        return 3.14*r*r;
    }
}
