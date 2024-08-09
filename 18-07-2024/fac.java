import java.util.*;

class factorial
{
    public void fact(int num)
    {
        if(num==0)
        {
            System.out.println(1);
        }

        int fact = 1;
        for(int i=1;i<=num;i++)
        {
            fact = fact *i;
        }
        System.out.println(fact);
    }
}

public class fac
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        factorial factorialnum = new factorial();
        factorialnum.fact(n);
        s.close();
    }
}