import java.io.FileInputStream;
import java.io.IOException;

public class TWR 
{
    public static void main(String[] a) 
    {
        //declaring resource
        try(FileInputStream fis = new FileInputStream("note.txt"))                                                    
        {
            int data = fis.read();
            while (data != -1) 
            {
                System.out.println((char)data);
                data = fis.read();    
            }
        }
        catch(IOException e)
        {
            System.err.println("Error reading file "+e.getMessage());
        }    
        // Try with resources : No finally block needed br and fr are close automatically.    
    }    
}
