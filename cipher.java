import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cipher {

    // Standard 36-character substitution key (letters + digits)
    private static final String KEY = "qwertyuiopasdfghjklzxcvbnm0123456789";

    // Method to perform substitution cipher
    public static String substitutionCipher(String text) {
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        Map<Character, Character> keyMap = new HashMap<>();

        // Map each character of the "alphabet + digits" to the corresponding character in the key
        for (int i = 0; i < characters.length(); i++) {
            keyMap.put(characters.charAt(i), KEY.charAt(i));
        }

        // Encrypt the message using the key
        StringBuilder result = new StringBuilder();
        for (char c : text.toLowerCase().toCharArray()) {
            result.append(keyMap.getOrDefault(c, c)); // Substitute or keep the original if non-alphabet or digit
        }

        return result.toString();
    }

    // Main method to get user input and display encrypted message
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the message
        System.out.print("Enter the message to encrypt: ");
        String text = scanner.nextLine();

        // Encrypt the message using the substitution cipher
        String encryptedText = substitutionCipher(text);
        System.out.println("Encrypted message: " + encryptedText);

        scanner.close();
    }
}
