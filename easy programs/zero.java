
public class zero {
    public static void main(String[] args)
    {
        int arr[] = {1,0,2,3,0,4,0,6};
        duplicate(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static void duplicate(int arr[])
    {
        int n = arr.length;
        int[] copy = new int[n];

        for(int i=0;i<n;i++)
        {
            copy[i] = arr[i];
        }

        int i=0;
        int j=0;

        while(i<n)
        {
            arr[i]=copy[j];
            if(copy[j]==0 && i+1<n)
            {
                i++;
                arr[i]=0;
            }
            i++;
            j++;

        }
    }
    
}
