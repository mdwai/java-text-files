// Count number of words, lines, and blank spaces in one text file
import java.io.FileInputStream;
public class CountNumberofword
{
    public static void main(String[] args)
    {
        int c;
        int sentence = 0;
        int words = 0;
        try
        {
            FileInputStream fis1 = new FileInputStream("D:\\text_files\\my_text_1.txt");
            while ((c = fis1.read()) != -1)
            {
                char ch = (char) c;
                if (ch == ' ')
                {
                    words++;
                }
                if(ch=='.'||ch=='!'||ch=='?')
                {
                    sentence++;
                }
            }
            fis1.close();
            words++;
            System.out.println("Number of sentence   : " + sentence);
            System.out.println("Number of words   : " + words);
        }
        catch (Exception e)
        {
            System.out.println("Error " + e);
        }
    }
}
