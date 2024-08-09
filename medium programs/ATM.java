import java.util.*;
public class ATM
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int denominator[] = new int[4];
        int numofnotes[] = new int[4];


        for(int i=0;i<4;i++)
        {
            System.out.println("Enter the "+(i+1)+" denomination: ");
            denominator[i] = s.nextInt();
            System.out.println("Enter the number of notes for "+(i+1)+" denomination: ");
            numofnotes[i] = s.nextInt();
        }

        int total=0;
        for(int i=0;i<4;i++)
        {
            total += denominator[i]*numofnotes[i];
        }
        System.out.println("Total Amount = "+total);
        s.close();

    }
}