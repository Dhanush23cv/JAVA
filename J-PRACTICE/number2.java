import java.util.Scanner;
public class number2 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=s.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                if(i>j)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(n-j+1);
                }
            }
            System.out.println(" ");
        }
        s.close();
    }     
}
