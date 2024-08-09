import java.util.*;
public class roman 
{
    public static int valueof(char s)
    {
        switch(s)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the roman number");
        String s = input.nextLine();
        int t=0;
        for (int i = 0; i < s.length(); i++) 
        {
            int current = valueof(s.charAt(i));
            if (i + 1 < s.length() && current < valueof(s.charAt(i + 1))) 
            {
                t -= current;
            } 
            else 
            {
                t += current;
            }
        }
        System.out.println("Numerical value = "+t);
        input.close();
    }
}
