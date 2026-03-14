import java.io.FileReader;
import java.io.IOException;

public class ReadWithFileReader 
{
    public static void main(String[] a) 
    {
        try(FileReader reader = new FileReader("data.txt"))
        {
            int character;

            System.out.println("Reading file content : ");

            while ((character = reader.read())!= -1) 
            {
                System.out.print((char)character);    
            }
        }
        catch(IOException e)
        {
            System.err.println("Could not read the file.");
            e.printStackTrace();
        }
    }    
}
