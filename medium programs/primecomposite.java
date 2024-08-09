import java.util.*;
public class primecomposite {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number(Enter -1 to stop)");
        int pcount = 0;
        int ccount = 0;
        while(true)
        {
            int n = s.nextInt();
            if(n==-1)
            {
                break;
            }
            else if(prime(n))
            {
                pcount++;
            }
            else if(n>1)
            {
                ccount++;
            }
        }
        System.out.println("prime count = "+pcount);
        System.out.println("composite count = "+ccount);
        s.close();
    }
    public static boolean prime(int n)
    {
        
        if(n<=1)
        {
            return false;
            
        }
        else if(n%2!=0)
        {
            int count = 0;
            for(int i=2;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if(count<2)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
}
