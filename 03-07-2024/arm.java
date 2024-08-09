import java.util.Scanner;
public class arm 
{
    public static void main(String[] argc)
    {
        Scanner armstrong = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int n = armstrong.nextInt();
        int dig, sum = 0;
        int count = 0;
        int number = n;
        while (number > 0)
        {
            count++;
            number /= 10;
        }
        number = n;
        while (number > 0)
        {
            dig = number % 10;
            sum += Math.pow(dig, count);
            number /= 10;
        }
        if (n == sum)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
        armstrong.close();
    }
}
