import java.util.Scanner;
public class inc 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the element "+(i+1));
            array[i] = scanner.nextInt();
        }

        sort(array);

        System.out.println("sorted array");
        for(int i=0;i<n;i++)
        {
            System.out.println(array[i]+" ");
        }
        scanner.close();
    }

    private static void sort(int[] array)
    {
        int n= array.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp =array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    
}
