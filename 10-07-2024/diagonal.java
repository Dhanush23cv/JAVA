import java.util.*;
public class diagonal
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the rows and colums of the 1st matrices: ");
        int r1 = s.nextInt();
        int c1 = s.nextInt();

        int[][] mat1 = new int[10][10];

        System.out.println("Enter the 1st matrix: ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                mat1[i][j] = s.nextInt();
            }
        }

        System.out.println("The entered matrix is: ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("The diagonal elements of the given matrix is: ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                if(i==j)
                {
                    System.out.print(mat1[i][j]+" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        s.close();
    }   
}
