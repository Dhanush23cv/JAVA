
import java.util.Scanner;
public class lcmgcd
{
    public static int gcd(int a, int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public static int lcm(int a, int b)
    {
        return a*b/gcd(a,b);
    }

    public static void main(String[] args)
    {
        Scanner gcdlcm = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1=gcdlcm.nextInt();
        System.out.println("Enter the second number: ");
        int n2=gcdlcm.nextInt();

        int res1=gcd(n1,n2);
        int res2=lcm(n1,n2);

        System.out.println("GCD of "+n1+" and "+n2+" is = "+res1);
        System.out.println("LCM of "+n1+" and "+n2+" is = "+res2);
        gcdlcm.close();
    }
}
