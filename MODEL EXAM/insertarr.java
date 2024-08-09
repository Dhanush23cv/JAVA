import java.util.Scanner;

public class insertarr 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter the " + (i + 1) + " element:");
            arr[i] = s.nextInt();
        }

        System.out.println("The given array is:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Enter the position where you want to insert the element: ");
        int pos = s.nextInt();

        if (pos < 1 || pos > n + 1) 
        {
            System.out.println("Invalid position! Position should be between 1 and " + (n + 1));
        } 
        else 
        {
            System.out.print("Enter the element you want to insert: ");
            int k = s.nextInt();

            int[] newArr = new int[n + 1];

            for (int i = 0; i < n + 1; i++) 
            {
                if (i < pos - 1) 
                {
                    newArr[i] = arr[i];
                } 
                else if (i == pos - 1) 
                {
                    newArr[i] = k;
                } 
                else 
                {
                    newArr[i] = arr[i - 1];
                }
            }

            System.out.println("The new array is:");
            for (int i = 0; i < n + 1; i++) 
            {
                System.out.print(newArr[i] + " ");
            }
        }
        s.close();
    }
}
