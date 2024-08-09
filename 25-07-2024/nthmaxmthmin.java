import java.util.*;
class maxmin
{
    int[] arr;
    public maxmin(int arr[])
    {
        this.arr = arr;
    }

    void sorted(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void max(int n)
    {
        System.out.println(arr[arr.length-n]);
    }
    void min(int m)
    {
        System.out.println(arr[m-1]);
    }
}
public class nthmaxmthmin 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int a = s.nextInt();

        int[] arr = new int[a];

        System.out.println("Enter the elements");
        for(int i=0;i<a;i++)
        {
            arr[i]=s.nextInt();
        }

        System.out.println("Enter the n value to get the nth max");
        int n = s.nextInt();
        System.out.println("Enter the m value to get the mth min");
        int m = s.nextInt();

        maxmin obj = new maxmin(arr);
        obj.sorted(arr);
        obj.max(n);
        obj.min(m);

        s.close();  
    }  
}
