import java.util.*;
public class zeroone 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+" element: ");
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

        System.out.println("Resultant array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        s.close();
    }
    
}
