
public class unique {
    public static void main(String[] args)
    {
        String s = "abcb";
        int l =s.length();

        char[] charArray = new char[l];

        for(int i=0;i<l;i++)
        {
            charArray[i] = s.charAt(i);
        }

        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(charArray[i]==charArray[j])
                {
                    charArray[j]='$';
                    charArray[i]='$';
                }   
            }
            if(charArray[i]!='$')
            {
                System.out.println(charArray[i]);
            }
        }
        
    }
    
}
