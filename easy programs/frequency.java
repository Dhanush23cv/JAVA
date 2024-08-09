import java.util.*;
public class frequency {
    public static void main(String[] args)
    {
        int arr[] = {1,2,8,3,2,2,2,5,1};
        int l = arr.length;

        Arrays.sort(arr);

        for(int i=0;i<l;i++)
        {
            int count=1;
            for(int j=i+1;j<l;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    arr[j]=-1;
                }
            }
            if(arr[i]!=-1)
            {
                System.out.println(arr[i]+"->"+count);
            }     
        }
    }
    
}
