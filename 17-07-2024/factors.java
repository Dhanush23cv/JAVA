import java.util.*;
public class factors 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();

        int count =0;
        System.out.println("The factors of "+n+" are: ");
        int[] arr = new int[100];
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                arr[count]=i;
                count++;
                System.out.println(i+" ");
            }
        }
        System.out.println("The number of factors of the given number = "+count);
        System.out.println("Enter the value of m to get the mth factor");
        int m = s.nextInt();
        
        if(m>0 && m<=count)
        {
            System.out.println(arr[m-1]);
        }
        else
        {
            System.out.println("m value is out of bounds! enter the valid input");
        }

        s.close();
    }
    
}
