import java.util.*;
public class bonus
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the grade of the employee: ");
        String ch = s.nextLine();

        if(ch.equals("A"))
        {
            System.out.println("Enter the salary of the employee: ");
            int sal = s.nextInt();

            if(sal<10000)
            {
                System.out.println("Salary = "+sal);
                System.out.println("Bonus = "+(double)(sal*(0.07)));
                System.out.println("Total to be paid = "+(double)(sal+(sal*(0.07))));
            }
            else
            {
                System.out.println("Salary = "+sal);
                System.out.println("Bonus = "+(double)(sal*(0.05)));
                System.out.println("Total to be paid = "+(double)(sal+(sal*(0.05))));
            }        
        }
        else if(ch.equals("B"))
        {
            System.out.println("Enter the salary of the employee: ");
            int sal = s.nextInt();

            if(sal<10000)
            {
                System.out.println("Salary = "+sal);
                System.out.println("Bonus = "+(double)(sal*(0.12)));
                System.out.println("Total to be paid = "+(double)(sal+(sal*(0.12))));
            }
            else
            {
                System.out.println("Salary = "+sal);
                System.out.println("Bonus = "+(double)(sal*(0.1)));
                System.out.println("Total to be paid = "+(double)(sal+(sal*(0.1))));
            }        
        }
        s.close();
    }   
}
