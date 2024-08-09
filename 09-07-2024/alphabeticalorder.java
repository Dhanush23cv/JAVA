import java.util.Scanner;
public class alphabeticalorder
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n = s.nextInt();

        String arr[] = new String[n];
        System.out.println("Enter the strings: ");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+" string");
            arr[i] = str.nextLine();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i].charAt(0) > arr[j].charAt(0))
                {
                    String t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        str.close();
        s.close();
        
    }
    
}
