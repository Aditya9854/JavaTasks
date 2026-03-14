import java.io.File;
import java.io.IOException;

public class CreateFile
{
    public static void main(String[]a)
    {
        File file = new File("Note.txt");

        try
        {
            if(file.createNewFile())
            {
                System.out.println("File Created : "+file.getName());
            }
            else
            {
                System.out.println("File already exist.");
            }
        }
        catch(IOException e)
        {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}