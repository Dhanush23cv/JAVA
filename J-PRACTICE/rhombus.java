import java.util.Scanner;
public class rhombus 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows (should be an odd number): ");
        int n = s.nextInt();

        int mid = n / 2;
        for (int i = 0; i <= mid; i++) 
        {
            for (int j = 0; j < mid - i; j++) 
            {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = mid - 1; i >= 0; i--) 
        {
            for (int j = 0; j < mid - i; j++) 
            {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        s.close();
    }
}
