import java.util.*;
public class parallelogram 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");   
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        s.close();
    }
    
}
