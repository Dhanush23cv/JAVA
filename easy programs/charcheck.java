import java.util.*;
public class charcheck {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = s.nextLine();

        System.out.println("Enter the character to check: ");
        char c = s.nextLine().charAt(0);

        int index=-1;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==c)
            {
                index=i;
                break;
            }
        }

        if(index!=-1)
        {
            System.out.println("The character is present in the string "+str+" at index "+(index+1));
        }
        else
        {
            System.out.println("Character not found");
        }
        s.close();
    }
}
