import java.util.Scanner;
public class linear
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Element"+(i+1));
            array[i]=scanner.nextInt();
        }

        System.out.println("Enter the element to search");
        int key = scanner.nextInt();

        int index = linearsearch(array,key);

        if(index==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at index "+index);
        }

        scanner.close();
    }

    public static int linearsearch(int[] array, int k)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==k) 
            {
                return i;
            }
        }
        return -1;

    }
}
