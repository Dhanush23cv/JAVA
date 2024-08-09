import java.util.*;
public class nthodd {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the n to get the nth odd number");
        int n = s.nextInt();

        int count = 0;
        int number =1;
        int nthodd = 0;

        while(count<n)
        {
            if(isodd(number))
            {
                count++;
                nthodd=number;
            }
            number++;
        }
        System.out.println(n+"th odd number is "+nthodd);

        System.out.println(n+"odd numbers after"+n+"th odd number is: ");

        count=0;
        number = nthodd+1;
        while(count<n)
        {
            if(isodd(number))
            {
                System.out.println(number);
                count++;
            }
            number++;
        }
        s.close();

    }
    public static boolean isodd(int n)
    {
        if(n%2==0)
        {
            return false;
        }
        return true;
    }
    
}
