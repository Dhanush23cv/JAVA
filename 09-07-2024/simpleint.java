import java.util.Scanner;
public class simpleint 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the principle amount: ");
        double p = scan.nextDouble();

        System.out.println("Enter the time period: ");
        double t = scan.nextDouble();

        System.out.println("Is the person senior citizen(y/n): ");
        String op = scan.next();

        if(op.equals("y"))
        {
            System.out.println("The person is a senior citizen");
            double simple_interest = (p*t*(0.2))/100;
            System.out.println("Simple Interest = "+simple_interest);
        }
        else if(op.equals("n"))
        {
            System.out.println("The person is not a senior citizen");
            double simple_interest = (p*t*(0.1))/100;
            System.out.println("Simple Interest = "+simple_interest);
        }
        else
        {
            System.out.println("-----ENTER THE VALID OPTION-----");
        }
        scan.close();
    } 
}
