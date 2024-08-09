import java.util.*;
public class skippingknumbers {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        int l = s.nextInt();
        int u = s.nextInt();

        int k = s.nextInt();

        if(l<u)
        {
            for(int i=l;i<=u;i+=(k+1))
            {
                System.out.println(i);
            }
        }
        else
        {
            System.out.println("Invalid");
        }
        s.close();
    }
    
}
