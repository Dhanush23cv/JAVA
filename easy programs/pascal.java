import java.util.*;
public class pascal {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int n = s.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
                if(j>i)
                {
                    System.out.print(" ");
                }
                else 
                {
                    System.out.print(fact(i)/(fact(i-j)*fact(j))+" ");
                }
            }
            System.out.println(" ");
        }
        s.close();
    }
    public static int fact(int n)
    {
        int fact = 1;
        for(int i=1;i<n;i++)
        {
            fact+=fact*i;
        }
        return fact;
    }
    
}
