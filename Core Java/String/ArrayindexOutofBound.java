

public class ArrayindexOutofBound {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            // Attempting to access an index that is out of bounds
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
