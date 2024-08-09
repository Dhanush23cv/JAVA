import java.util.*;
public class sechigh 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
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
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+ " ");
        }

        System.out.println("The second highest element is "+arr[n-2]);
        s.close();
    }
    
}
