package Day1_programming_elements;

public class calculateadditionsubmuldivide {
    
    public static void main(String[] args) {
        int a = 10; // First number
        int b = 5;  // Second number

        // Perform calculations
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        double division = (double) a / b; // Cast to double for accurate division

        // Print the results
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}
