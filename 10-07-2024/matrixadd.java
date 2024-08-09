import java.util.*;
public class matrixadd
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

        System.out.println("Enter the rows and colums of the 2nd matrices: ");
        int r2 = s.nextInt();
        int c2 = s.nextInt();

        int[][] mat2 = new int[10][10];

        System.out.println("Enter the 2nd matrix: ");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                mat2[i][j] = s.nextInt();
            }
        }

        int[][] add = new int[10][10];
        if(r1 == r2 || c1 == c2)
        {
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    add[i][j] = mat1[i][j]+mat2[i][j];
                }
            }
            
            System.out.println("Addition of two matrices");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print(add[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("The rows and colums for both matrices should be equal");
        }
        s.close();
    }   
}
