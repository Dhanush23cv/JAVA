import java.util.*;
public class transpose 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = s.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = s.nextInt();

        int[][] mat = new int[r][c];

        System.out.println("Enter the matrix: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=s.nextInt();
            }
        }
        System.out.println("The entered matrix is: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        int[][] trans = new int[c][r];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                trans[j][i]=mat[i][j];
            }
        }

        System.out.println("Transpose of the matrix is: ");
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
