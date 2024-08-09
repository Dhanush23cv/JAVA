
public class banned
{
    public static void main(String[] args)
    {
        String str = "Ram hit a ball, the hit ball flew far after it was hit";

        String str1 = str.toLowerCase();

        String[] words = str1.split("\\s+");

        String banned = "hit";

        String result = "";

        int count =0;

        String[] nonbannedwords = new String[words.length];

        for(String word : words)
        {
            word = word.replaceAll("[^a-zA-Z]","");

            if(!word.equals(banned)&& !word.isEmpty())
            {
                result += word +" ";

                nonbannedwords[count++] = word;
            }

        }
        result = result.trim();
        System.out.println("RESULTING STRING : "+result);

        System.out.println("WORD OCCURENCES: ");
        for(int i=0;i<count;i++)
        {
            String word = nonbannedwords[i];
            if(word!=null)
            {
                int occurences = 0;
                for(int j=0;j<count;j++)
                {
                    if(word.equals(nonbannedwords[j]))
                    {
                        occurences++;
                    }
                }

                System.out.println(word+ ":" +occurences);
                for(int j=0;j<count;j++)
                {
                    if(word.equals(nonbannedwords[j]))
                    {
                        nonbannedwords[j] = null;
                    }
                }
            }
        }
    }
}