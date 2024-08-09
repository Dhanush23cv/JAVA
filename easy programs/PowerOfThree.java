import java.util.Scanner;

public class PowerOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is a power of three
        boolean isPowerOfThree = isPowerOfThree(number);

        // Print the result
        System.out.println(isPowerOfThree);

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is a power of three
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        // Check if the number can be divided by 3 until it reaches 1
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
