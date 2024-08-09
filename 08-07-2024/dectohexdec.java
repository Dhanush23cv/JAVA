import java.util.Scanner;
public class dectohexdec 
{
    public static void main(String[] args)
    {
        Scanner dectohex = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int dec= dectohex.nextInt();
        String hexadecimal = hexdec(dec);
        System.out.println("Hexadecimal number for the given number is: "+hexadecimal);
        dectohex.close();
    }

    public static String hexdec(int d)
    {
        if(d==0)
        {
            return "0";
        }

        String hexdigits = "0123456789ABCDEF";
        String hex = " ";

        while(d!=0)
        {
            int rem = d%16;
            hex=hexdigits.charAt(rem)+hex;
            d=d/16;
        }
        return hex;
    }
}
