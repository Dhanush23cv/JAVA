import java.util.Scanner;
public class palindrome 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = scanner.nextLine();

        String rev="";

        int l =s.length();

        for(int i=l-1;i>=0;i--)
        {
            rev = rev+s.charAt(i);
        }
        System.out.println("Reversed string= "+rev);

        if(s.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
        scanner.close();
    }  
}
