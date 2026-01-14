package read_text_file;
import java.io.FileInputStream;
public class Read_Text_File_2_1
{
    public static void main(String a[])
    {
        byte b[]=new byte[180];
        try
        {
            FileInputStream fis=new FileInputStream("D:\\text_files\\my_text_1.txt");
            fis.read(b,0,180);
            System.out.println(b);
            String s=new String(b,0);
            System.out.println(s);
        }
        catch(Exception e)
        {
            System.out.println("error "+ e.toString());
        }
    }
}
