import java.util.*;
public class arraysquare
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the lower range: ");
        int n = s.nextInt();

        System.out.println("Enter the upper range: ");
        int m = s.nextInt();

        if(n>m)
        {
            System.out.println("error! lower range greater than upper range");
        }
        else
        {
            int[][] arr = new int[m-n+1][2];

            for(int i=0;i<arr.length;i++)
            {
                int number = n+i;
                arr[i][0] = number;
                arr[i][1] = number*number;
            }

            System.out.println("The resultant array is: ");

            System.out.print("[");
            for(int i=0;i<arr.length;i++)
            {
                System.out.print("("+ arr[i][0] + "," + arr[i][1] + ") ,");
            }
            System.out.print("]");
        }
        s.close();
    }

}