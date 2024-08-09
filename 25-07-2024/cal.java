import java.util.*;
class calculator
{
    int a;
    int b;
    int c;
    public calculator(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void addition()
    {
        c = a+b;
        System.out.println(c);
    }
    public void subtraction()
    {
        c = a-b;
        System.out.println(c);
    }
    public void multiplication()
    {
        c = a*b;
        System.out.println(c);
    }
    public void division()
    {
        c = a/b;
        System.out.println(c);
    }
    public void modulus()
    {
        c = a%b;
        System.out.println(c);
    }
}
public class cal 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = s.nextInt();
        System.out.println("Enter the second number");
        int b = s.nextInt();
       
        System.out.println("Enter the choice(1.Addition/2.Subtraction/3.Multiplication/4.Division/5.Modulus)");
        String ch=s.next();

        calculator cal = new calculator(a,b);

        switch(ch)
        {
            case "1": cal.addition(); break;
            case "2": cal.subtraction(); break;
            case "3": cal.multiplication(); break;
            case "4": cal.division(); break;
            case "5": cal.modulus(); break;
        }
        s.close();
    }
}
