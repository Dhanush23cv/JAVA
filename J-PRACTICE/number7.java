import java.util.*;
public class number7
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();


        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(n-i+1+" ");
                }
            }
            System.out.println(" ");
        }
        s.close();
    }
    
}
