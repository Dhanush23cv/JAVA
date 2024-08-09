import java.util.Scanner;
public class days 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int d = scanner.nextInt();

        final int days_year = 365;
        final int days_month = 30;
        final int days_week = 7;

        int years = (d/days_year);
        int remdaysy = (d % days_year);

        int months = (remdaysy/days_month);
        int remdaysm = (remdaysy % days_month);

        int weeks = (remdaysm/days_week);
        int days = (remdaysm % days_week);

        System.out.println("Years = "+years);
        System.out.println("Months = "+months);
        System.out.println("Weeks = "+weeks);
        System.out.println("Days = "+days);

        scanner.close();
    }
    
}
