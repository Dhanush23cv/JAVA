import java.util.*;
public class getdate {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the day: ");
        int day = s.nextInt();
        System.out.println("Enter the month");
        int month = s.nextInt();
        System.out.println("Enter the year: ");
        int year = s.nextInt();

        int d = year%100;
        int r = d/4; 

        int result = day+findmonth(month)+(d)+(r)+findyear(year);
        int fr = result%7;

        if(fr==0)
        {
            System.out.println("Saturday");
        }
        else if(fr==1)
        {
            System.out.println("Sunday");
        }
        else if(fr==2)
        {
            System.out.println("Monday");
        }
        else if(fr==3)
        {
            System.out.println("Tuesday");
        }
        else if(fr==4)
        {
            System.out.println("Wednesday");
        }
        else if(fr==5)
        {
            System.out.println("Thursday");
        }
        else
        {
            System.out.println("Friday");
        }
        s.close();
    }
    public static int findmonth(int month)
    {
        if(month==01 || month==10)
        {
            return 1;
        }
        else if(month==02 || month==03 || month==11)
        {
            return 4;
        }
        else if(month==04 || month==07)
        {
            return 0;
        }
        else if(month==9 || month==12)
        {
            return 6;
        }
        else if(month==05)
        {
            return 2;
        }
        else if(month==06)
        {
            return 5;
        }
        else if(month==8)
        {
            return 3;
        }
        return 0;
    }
    public static int findyear(int year)
    {
        int b = year/100;

        int c = b+1;

        if(c%4==0)
        {
            return 0;
        }
        else if(((c%4)-1)==0)
        {
            return 6;
        }
        else if(((c%4)-2)==0)
        {
            return 4;
        }
        else if(((c%4)-3)==0)
        {
            return 2;
        }
        return 0;
    }
}
