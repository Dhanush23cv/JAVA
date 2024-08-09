import java.util.*;
class numofdays
{
    int days;

    public numofdays(int days)
    {
        this.days = days;
    }

    void numofyears()
    {
        int years = days/365;
        int rem = days%365;
        System.out.println("YEARS = "+years);
        int months = rem/30;
        int mrem = rem%30;
        System.out.println("MONTHS = "+months);
        int weeks = mrem/7;
        System.out.println("WEEKS = "+weeks);
        int day = mrem%7;
        System.out.println("DAYS = "+day);
        
    }
}
public class days 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int n = s.nextInt();

        numofdays obj = new numofdays(n);

        obj.numofyears();

        s.close();

    }
    
}
