import java.util.Scanner;
public class Dectobin
{
    public static void main(String[] args)
    {
        Scanner dec = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int decimal = dec.nextInt();

        String binary = " ";

        if(decimal==0)
        {
            binary="0";
        }
        else
        {
            while(decimal>0)
            {
                int rem = decimal%2;
                binary = rem+binary;
                decimal = decimal/2;
            }
        }
        System.out.println(binary);
        dec.close();
    }
}