

public class outOfBoundindex {
    public static void main(String[] args) {
        String str = "Hello, World!";
        try {
            // Attempting to access an index that is out of bounds
            char ch = str.charAt(20); // This will throw an exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
