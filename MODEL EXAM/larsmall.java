import java.util.*;
public class larsmall
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of numbers: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+" number: ");
            arr[i] = s.nextInt();
        }

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }

        System.out.println("After sorting the numbers are: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }

        System.out.println("The largest number entered = "+arr[n-1]);
        System.out.println("Smallest number entered = "+arr[0]);

        s.close();
    }
    
}
