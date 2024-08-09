import java.util.Scanner;
public class leap 
{
    public static void main(String[] args)
    {
        Scanner year = new Scanner(System.in);
        System.out.println("Enter the year to check: ");
        int y = year.nextInt();

        if(y%4==0)
        {
            if(y%100==0)
            {
                if(y%400==0)
                {
                    System.out.print("Leap year");
                }
                else
                {
                    System.out.print("Not Leap year");
                }
            }
            else
            {
                System.out.print("Leap year");
            }
        }
        else
        {
            System.out.print("Not Leap year");
        }
        year.close();
    }
}
