import java.util.Scanner;
public class number1 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j>i)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(j+1);
                }
            }
            System.out.println("  ");
        }
        s.close();
    }
    
}
