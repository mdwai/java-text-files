package read_text_file;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
public class main
{
    public static void main(String a[])
    {
        int c;
        try
        {
            FileInputStream fis1=new FileInputStream("D:\\text_files\\my_text_1.txt");
            FileInputStream fis2=new FileInputStream("D:\\text_files\\my_text_2.txt");
            SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
            while((c=sis.read())!=-1)
                System.out.print(c+" ");
        }
        catch(Exception e)
        {
            System.out.println("Error "+e.toString());
        }
    }
}
