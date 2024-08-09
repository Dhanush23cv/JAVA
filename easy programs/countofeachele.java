import java.util.*;
public class countofeachele {
    public static void main(String[] args)
    {
        int arr[] = {1,4,6,7,1,2,4,4,9,9,2,1,3,3,3};

        Arrays.sort(arr);
        int l = arr.length;

        for(int i=0;i<l;i++)
        {
            int count =1;
            for(int j=i+1;j<l;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
                else
                {
                    break;
                }
            }  
            System.out.println(arr[i]+" = "+count);
            i+=count-1;
        }
    }
    
}
