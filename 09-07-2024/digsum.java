import java.util.Scanner;
public class digsum
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = inp.nextInt();

        int sum = 0;

        while(n!=0)
        {
            int dig = n%10;
            sum = sum + dig;
            n=n/10;
        }
        System.out.println("Sum of the digits of the given number = "+sum);

        inp.close();
    } 
}
