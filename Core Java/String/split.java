

public class split {
    public static void main(String[] args) {
        String str = "Hello,World,Java,Programming";
        // Split the string by comma
        String[] parts = str.split(",");
        
        // Print the parts
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
