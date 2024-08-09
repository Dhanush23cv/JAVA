import java.util.*;
public class countws
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = s.nextLine();

        String[] words = text.split("\\s+");
        int wordcount = words.length;

        String[] sentences = text.split("[.!?]\\s+");
        int sentencecount = sentences.length;

        System.out.println("Number of words = "+wordcount);
        System.out.println("Number of sentences = "+sentencecount);

        s.close();
    }
}