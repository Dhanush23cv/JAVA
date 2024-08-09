import java.util.*;
public class palindrome {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:  ");
        int n = s.nextInt();

        int p;

        while(true)
        {
            p=n+reverse(n);
            System.out.println(n+" + "+reverse(n)+" = "+p);
            n=p;
            if(p==reverse(p))
            {
                System.out.println("Palindrome = "+p);
                break;
            } 
        }
        s.close();
    }
    public static int reverse(int n)
    {
        int rev = 0;
        while(n!=0)
        {
            int dig  = n%10;
            rev = rev*10+dig;
            n=n/10;
        }
        return rev;
    }
    
}
