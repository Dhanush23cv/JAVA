import java.util.*;
public class staff 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total number of users: ");
        int t = s.nextInt();
        System.out.println("Enter the number staff users: ");
        int st = s.nextInt();

        int nontst = st/3;
        System.out.println("Number of non teaching staff users ="+nontst);

        int stud = t-st-nontst;
        System.out.println("Total number of students = "+stud);
        s.close();
    }
    
}
