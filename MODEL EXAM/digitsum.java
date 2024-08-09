import java.util.*;
public class digitsum 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();

        int t = n;

        int sum =0;

        while(t!=0)
        {
            int dig = t%10;
            sum += dig;
            t = t/10;
        }

        System.out.println("The sum of digits of the given number "+n+ " is "+sum);
        s.close();
    }
    
}
