import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile 
{
    public static void main(String[] args) 
    {
        try(FileInputStream fis = new FileInputStream("Note.txt"))
        {
            int byteData;

            System.out.println("File Content : ");
            while ((byteData = fis.read())!=-1)      //read byte by byte until end of file(-1)
            {
                System.out.print((char)byteData);   
            }
        }    
        catch(IOException e)
        {
            System.err.println("Could not read the file : "+e.getMessage());
        }
    }    
}
