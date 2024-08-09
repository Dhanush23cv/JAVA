import java.util.*;
public class vowconst 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the input to check the vow/cons: ");
        String ch = s.nextLine();

        ch = ch.toLowerCase();

        if(ch.charAt(0)=='a' || ch.charAt(0)=='e' ||ch.charAt(0)=='i' || ch.charAt(0)=='o' || ch.charAt(0)=='u')
        {
            System.out.println(ch+ " is a vowel");
        }
        else if(ch.charAt(0)>='a' && ch.charAt(0)<='z')
        {
            System.out.println(ch+ " is consonant");
        }
        else
        {
            System.out.println("Enter the valid input:(a-z)");
        }
        s.close();
    }   
}
