import java.util.*;
public class numtotext 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = s.nextInt();

        String text = numtext(n);
        System.out.println("The equivalent text for the given number is: "+text);
        s.close();
    }

    private static String numtext(int n)
    {
        if(n==0)
        {
            return "zero";
        }

        String[] t = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String t1 = "";

        while(n!=0)
        {
            int rem = n%10;
            t1 = t[rem]+" "+t1;
            n=n/10;
        }
        return t1.trim();
    }    
}
