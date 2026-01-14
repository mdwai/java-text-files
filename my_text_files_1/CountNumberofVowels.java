// Count number of vowels in one text file
import java.io.FileInputStream;
public class CountNumberofVowels
{
    public static void main(String[] args)
    {
        int c;
        int vowelCount = 0;
        try
        {
            FileInputStream fis1 = new FileInputStream("D:\\text_files\\my_text_1.txt");
            while ((c = fis1.read()) != -1)
            {
                char ch = (char) c;
                if (isVowel(ch))
                {
                    vowelCount++;
                }
            }
            fis1.close();
            System.out.println("Number of vowels: " + vowelCount);
        }
        catch (Exception e)
        {
            System.out.println("Error " + e);
        }
    }
    private static boolean isVowel(char ch)
    {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}