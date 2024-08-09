import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();

        // Create a 2D array to store the values of Pascal's Triangle
        int[][] triangle = new int[n][n];

        // Fill the Pascal's Triangle
        for (int i = 0; i < n; i++) {
            // Set the first and last element in every row to 1
            triangle[i][0] = 1;
            triangle[i][i] = 1;
        }

        // Calculate the inner elements of Pascal's Triangle
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // Print Pascal's Triangle
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print the values in the triangle
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
        s.close();
    }
}
