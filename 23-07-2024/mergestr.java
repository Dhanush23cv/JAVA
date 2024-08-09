import java.util.*;
public class mergestr 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = s.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = s.nextLine();

        String res = str1+str2;
        System.out.print(res);

        s.close();
    }
    
}
