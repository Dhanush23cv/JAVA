import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        // String to store special characters
        String specialCharacters = "";
        int specialCharacterCount = 0;

        // Loop through each character in the input
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharacters += ch;
                specialCharacterCount++;
            }
        }

        // Print the special characters
        System.out.println("Special Characters: " + specialCharacters);
        
        // Print the count of special characters
        System.out.println("Number of Special Characters: " + specialCharacterCount);

        scanner.close();
    }
}
