import java.util.*;
public class missingnumber {
    public static void main(String[] args)
    {
        int arr[] = {3,1,2,5,7};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int min = arr[0];
        int max = arr[arr.length-1];
        int j=0;

        for(int i=min;i<=max;i++)
        {
            if(arr[j]==i)
            {
                j++;
            }
            else
            {
                System.out.print(i+" ");
            }

        }
    }
    
}
