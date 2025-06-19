

public class findVowelsandConstant {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowelsCount = 0;
        int consonantsCount = 0;

        // Convert the string to lowercase to handle case insensitivity
        str = str.toLowerCase();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        // Print the counts of vowels and consonants
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
    }
}
