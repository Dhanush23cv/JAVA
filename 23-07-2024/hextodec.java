import java.util.*;
public class hextodec 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();

        double dec=0;
        int count = 0;
        while(num!=0)
        {
            int dig = num%10;
            dec = dig*(Math.pow(16,count));
            count++;
            num = num/10;
        }
        System.out.println(dec);
        s.close();
    }
    
}
