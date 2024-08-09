import java.util.Scanner;
public class multip 
{
    public static void main(String[] args)
    {
        Scanner mul = new Scanner(System.in);
        System.out.print("Enter the number to get mutliplication table:");
        int n=mul.nextInt();
        System.out.print("Enter the number upto which you need the multiplication table: ");
        int l=mul.nextInt();
        for(int i=1;i<=l;i++)
        {
            System.out.println(n+ "X" +i+ "= " +n*i);
        }
        mul.close();
    }
}
