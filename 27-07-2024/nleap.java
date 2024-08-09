import java.util.*;

public class nleap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the lower range: ");
        int l = s.nextInt();
        System.out.println("Enter the upper range: ");
        int u = s.nextInt();

        System.out.println("Enter the number of leap years u want: ");
        int n = s.nextInt();

        int count = 0;

        for(int year=l;year<=u && count<n ;year++)
        {
            if(checkleap(year))
            {
                System.out.println(year);
                count++;
            }
        }

        if(count<n)
        {
            System.out.println("There are less than "+n+" leap years in the given range");
        }

        s.close();
    }
    public static boolean checkleap(int year)
    {
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
