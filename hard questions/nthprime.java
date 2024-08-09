import java.util.*;
public class nthprime 
{
    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = inp.nextInt();

        int count =0;
        int number = 2;
        int nthprime = 0;

        while(count<n)
        {
            if(isPrime(number))
            {
                count++;
                nthprime = number;
            }
            number++;
        }
        System.out.println(n + "th prime number is "+ nthprime);

        count = 0;
        number = nthprime+1;
        System.out.println(n+" prime numbers after "+nthprime+" is: ");

        while(count<n)
        {
            if(isPrime(number))
            {
                System.out.println(number+" ");
                count++;
            }
            number++;
        }
        inp.close();
    }   
}
