import java.util.Scanner;
public class sum 
{
    public static void main(String[] args)
    {
        Scanner sum = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sum.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+i;
        }
        System.out.println("Sum of " +n+ " number is " +s);
        sum.close();
    }
}
