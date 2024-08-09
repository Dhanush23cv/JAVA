import java.util.*;
public class matrixmul 
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

        int[][] mul = new int[10][10];
        if(c1==r2)
        {
            System.out.println("Valid matrices multiplication possible");

            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    for(int k=0;k<c1;k++)
                    {
                        mul[i][j] += mat1[i][k]*mat2[k][j];
                    }
                   
                }
            }
            
            System.out.println("Multiplication of two matrices is: ");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                     System.out.print(mul[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Enter the valid matrix(row of 1st matrix must equal to column 2nd matrix)");
        }
        s.close();
    }   
}
