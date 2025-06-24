public class Circle {
    double radius;

    // Default Constructor
    public Circle() {
        this(1.0); // Chaining to parameterized constructor
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
}
