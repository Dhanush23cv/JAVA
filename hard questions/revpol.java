import java.util.Scanner;

public class revpol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = s.nextInt();

        int palindromeNumber = findPalindrome(n);
        System.out.println("The palindrome number is: " + palindromeNumber);

        s.close();
    }

    public static int reverse(int n) 
    {
        int rev = 0;
        while (n != 0) 
        {
            int dig = n % 10;
            rev = rev * 10 + dig;
            n = n / 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int n) 
    {
        return n == reverse(n);
    }

    public static int findPalindrome(int n) 
    {
        while (!isPalindrome(n)) 
        {
            int rev = reverse(n);
            System.out.println(n + " + " + rev + " = " + (n + rev));
            n = n + rev;
        }
        return n;
    }
}
