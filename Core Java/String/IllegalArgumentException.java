

public class IllegalArgumentException {
    public static void main(String[] args) {
        String str = "Hello, World!";
        try {
            if (str.length() < 5) {
                throw new java.lang.IllegalArgumentException("String length must be at least 5 characters.");
            }
            System.out.println("String is valid: " + str);
        } catch (java.lang.IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        }
    }
}
