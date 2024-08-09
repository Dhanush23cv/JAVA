import java.util.Scanner;
public class prime 
{
    public static void main(String[] args)
    {
        Scanner prime = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=prime.nextInt();

        if (n==1)
        {
            System.out.print("Not prime"); 
        }
        if(n==2)
        {
            System.out.print("Prime");
        }
        else if(n%2!=0)
        {
            int count;
            count=0;
            for(int i=2;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if(count<2)
            {
                System.out.print("Prime");
            }
            else
            {
                System.out.print("Not prime");
            }
        }
        else
        {
            System.out.print("Not Prime");
        }
        prime.close();
    }  
}
