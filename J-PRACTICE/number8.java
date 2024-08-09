import java.util.*;
public class number8 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<i)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(n-j+1+" ");
                }
            }
            for(int j=n;j>i;j--)
            {
                System.out.print(n-j+2+" ");
            }
            System.out.println(" ");
        }      
        s.close();
    }
    
}
