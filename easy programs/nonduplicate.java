import java.util.*;
public class nonduplicate {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the "+n+" elements:");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter "+(i+1)+" element:");
            arr[i] = s.nextInt();
        }

        System.out.println("Non-Duplicate elements are: ");

        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println(arr[i]);
            }
        }
        s.close();  
  }    
}
