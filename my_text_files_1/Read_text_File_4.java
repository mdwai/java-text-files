package read_text_file;
import java.io.*;
public class Read_text_file_4
{
    public static void main(String[] args) throws Exception
    {
        // File path is passed as parameter
        File f = new File("D:\\text_files\\my_text_1.txt");
        // Double back-SLASH is to avoid compiler interpret words
        // like \test as \t (ie. as a escape sequence)
        BufferedReader br = new BufferedReader(new FileReader(f));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}
//readline returns the ascii value of the corresponding char
//readline returns is it true or false(null)
