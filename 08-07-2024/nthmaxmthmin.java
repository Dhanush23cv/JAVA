import java.util.Scanner;
public class nthmaxmthmin 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }

        System.out.println("Sorted array: ");
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }

        System.out.println("Enter the u value to get the uth maximum");
        int u = scanner.nextInt();
        
        System.out.println("uth maxmimum element in the given set of elements is: "+arr[n-u]);

        System.out.println("Enter the m value to get the mth minimum");
        int m = scanner.nextInt();

        System.out.println("mth minimum element in the given set of elements is: "+arr[m-1]);

        scanner.close();
    }
    
}
