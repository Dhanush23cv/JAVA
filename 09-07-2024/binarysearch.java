import java.util.Scanner;
public class binarysearch 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }

        System.out.println("Sorted array: ");
        for(int i=0;i<n-1;i++)//12 14 5 -3 1 16 17
        {
            for(int j=0;j<n-i-1;j++)//12 5 -3 1 14 16 17    5 -3 1 12 14 16 17   -3 1 5 12 14 16 17
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

        System.out.println("Enter the key element = ");
        int k = scanner.nextInt();

        int result = binsearch(arr,k);

        if(result==0)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at index "+result);
        }
        scanner.close();
    }

    public static int binsearch(int[] arr, int k)
    {
        int low = 0;
        int high = arr.length-1;

        while(low<=high)
        {
            int mid = (low+high)/2;

            if(arr[mid]==k)
            {
                return mid;
            }
            if(arr[mid]<k)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return 0;
    }
    
}
