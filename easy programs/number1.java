import java.util.*;
public class number1 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i<j)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(i);
                }
            }
            System.out.println(" ");
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(i<j)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(i);
                }
            }
            System.out.println(" ");
        }
        s.close();
    }
}
