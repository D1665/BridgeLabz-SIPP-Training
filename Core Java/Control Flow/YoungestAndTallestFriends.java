// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights Hint => 1. Take user input for the age and height of the 3 friends and store it in a variable2. Find the smallest of the 3 ages to find the youngest friend and display it 3. Find the largest of the 3 heights to find the tallest friend and display it
import java.util.Scanner;
public class YoungestAndTallestFriends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input for ages
        System.out.print("Enter the age of Amar: ");
        int ageAmar = input.nextInt();
        
        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = input.nextInt();
        
        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = input.nextInt();
        
        // Input for heights
        System.out.print("Enter the height of Amar (in cm): ");
        int heightAmar = input.nextInt();
        
        System.out.print("Enter the height of Akbar (in cm): ");
        int heightAkbar = input.nextInt();
        
        System.out.print("Enter the height of Anthony (in cm): ");
        int heightAnthony = input.nextInt();
        
        // Find the youngest friend
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend;
        
        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }
        
        // Find the tallest friend
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend;
        
        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }
        
        // Display results
        System.out.println(youngestFriend + " is the youngest friend with age: " + youngestAge);
        System.out.println(tallestFriend + " is the tallest friend with height: " + tallestHeight + " cm");
    }
}