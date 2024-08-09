import java.util.*;

public class perfectnumbers 
{
    public static int sum(int number)
    {
        int sum=0;
        while(number>0)
        {
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the lower range: ");
        int l = inp.nextInt();
        System.out.println("Enter the upper range: ");
        int u = inp.nextInt();

        List<Integer> perfectSquares = new ArrayList<>();

        for (int i = l; i*i <= u; i++) 
        {
            int perfect = i*i;
            if(perfect>=l && perfect<=u)
            {
                if(sum(perfect)<10)
                {
                    perfectSquares.add(perfect);
                }
            }
        }
        System.out.println(perfectSquares);
        inp.close();
    }
}
