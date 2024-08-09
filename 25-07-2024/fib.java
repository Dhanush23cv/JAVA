import java.util.*;
class fibonacciSeries
{
    public void fibonacci(int num)
    {
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci series: ");
        int[] arr = new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]= a;
            int c = a+b;
            a=b;
            b=c;
        }
        for(int i=0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Even terms of the series:");
        int res =0;
        for(int i=1;i<num;i+=2)
        {
            
            System.out.print(arr[i]+" ");
            res += arr[i];
        }
        System.out.println();
        System.out.println("sum of even terms = "+res);
    } 
    
}
public class fib 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = s.nextInt();

        fibonacciSeries fib = new fibonacciSeries();
        fib.fibonacci(n);
        s.close();
    }
}
