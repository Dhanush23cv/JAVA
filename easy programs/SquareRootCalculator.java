import java.util.Scanner;

public class SquareRootCalculator {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // Check if the number is a perfect square
        if (number < 0) 
        {
            System.out.println("The number is negative. Square root of negative numbers is not defined in real numbers.");
        } 
        else if (number == 0) 
        {
            // Special case for 0
            System.out.println("Square Root: 0, 0");
        } 
        else 
        {
            int sqrt = (int) Math.sqrt(number);
            if (sqrt * sqrt == number) 
            {
                // Print both positive and negative square roots
                System.out.println("Square Root: " + sqrt + ", " + (-sqrt));
            } 
            else 
            {
                System.out.println("The number is not a perfect square.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
