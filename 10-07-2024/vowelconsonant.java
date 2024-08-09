import java.util.*;
public class vowelconsonant
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = s.nextLine();

        int l = str.length();

        int vow = 0;
        int cons = 0;

        str = str.toLowerCase();

        for(int i=0;i<l;i++)
        {
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vow++;
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                cons++;
            }
        }

        System.out.println("The number of vowels in a given string = "+vow);
        System.out.println("The number of consonants in a given string = "+cons);
        
        s.close();
    } 
}
