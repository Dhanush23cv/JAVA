import java.util.*;
public class arraymerge {
    public static void main(String[] agrs)
    {
        Scanner s = new Scanner(System.in);

        int arr1[] = {1,3,4,5};
        int arr2[] = {2,6,7,8};
        
        int l1= arr1.length;
        int l2= arr2.length;

        int l3= l1+l2;

        int arr3[] = new int[l3];
        merge(arr1,arr2,l1,l2,arr3);

        System.out.println("Merged array: ");
        for(int i=0;i<l3;i++)
        {
            System.out.print(arr3[i]+" ");
        }
        s.close();
    }
    public static void merge(int arr1[], int arr2[], int l1, int l2, int arr3[])
    {
        int i=0;
        int j=0;
        int k=0;

        while(i<l1)
        {
            arr3[k++] = arr1[i++];
        }
        while(j<l2)
        {
            arr3[k++] = arr2[j++];
        }

        Arrays.sort(arr3);
    }   
}
