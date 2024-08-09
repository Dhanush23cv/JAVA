import java.util.*;
public class permutations
{
    public static void swap(char[] arr, int i, int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void permutate(char[] arr, int l, int r)
    {
        if(l==r)
        {
            System.out.println(String.valueOf(arr));
        }
        else
        {
            for(int i=l;i<=r;i++)
            {
                swap(arr,l,i);
                permutate(arr,l+1,r);
                swap(arr,l,i);
            }
        }
    }

    public static void main(String[] args)
    {
        String str = "1234";
        char[] charArray = str.toCharArray();
        int n = charArray.length;
        permutate(charArray , 0, n-1);
    }
}