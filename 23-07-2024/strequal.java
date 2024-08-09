import java.util.*;
public class strequal 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str = s.nextLine();

        System.out.println("Enter the second string");
        String str2 = s.nextLine();

        if(str.equals(str2))
        {
            System.out.println("The strings are equal");
        }
        else
        {
            System.out.println("The strings are not equal");
        }
        s.close();
    }    
}
