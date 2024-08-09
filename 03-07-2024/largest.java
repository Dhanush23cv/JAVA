import java.util.Scanner;
public class largest 
{
    public static void main(String[] args)
    {
        Scanner large = new Scanner(System.in);
        System.out.println("Enter the three numbers to compare: ");
        int a = large.nextInt();
        int b = large.nextInt();
        int c = large.nextInt();

        int largest;
        largest = a;
        if (b > largest)
        {
            largest = b;
        }
        if (c > largest)
        {
            largest = c;
        }

        System.out.print("Greatest number is " + largest);
        large.close();
    }
}
