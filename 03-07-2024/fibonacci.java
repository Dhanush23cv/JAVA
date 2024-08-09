import java.util.Scanner;
public class fibonacci 
{
    public static void main(String[] args)
    {
        Scanner fib = new Scanner(System.in);
        int n=fib.nextInt();
        int a=0, b=1, c=0;
        System.out.print("Fibonacci series: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        fib.close();
    }
}
