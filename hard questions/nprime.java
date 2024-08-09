import java.util.*;
public class nprime 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of primes u want");
        int n = s.nextInt();

        int i=2,k=0;
        System.out.println("Prime numbers are");
        while(k<n)
        {
            int count =0;
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count < 2)
            {
                System.out.println(i);
                k++;
            }
            i++;
        }
        s.close();   
    }   
}
