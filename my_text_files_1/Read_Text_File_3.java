// fetch content of two text files using a single object and display the contents
import java.io.FileInputStream;
import java.io.SequenceInputStream;
public class Read_Text_File_3
{
    public static void main(String[] args) {
        int c;
        try {
            FileInputStream fis1 = new FileInputStream("D:\\text_files\\my_text_1.txt");
            FileInputStream fis2 = new FileInputStream("D:\\text_files\\my_text_2.txt");

            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

            while ((c = sis.read()) != -1) {
                System.out.print((char) c);
            }

            sis.close();
            fis1.close();
            fis2.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
