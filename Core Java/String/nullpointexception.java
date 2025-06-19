

public class nullpointexception {
    public static void main(String[] args) {
        String str = null; // Initializing a string variable to null
        try {
            System.out.println(str.length()); // Attempting to access the length of a null string
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }
}
