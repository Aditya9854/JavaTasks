import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy 
{
    public static void main(String[] a) 
    {
        String sourcePath = "Note.txt";
        String destPath = "copyNote.txt";

        try(FileInputStream in = new FileInputStream(sourcePath);
             FileOutputStream out = new FileOutputStream(destPath))
        {
            //buffer array
            byte[]buffer = new byte[8192];
            int bytesRead;

            while ((bytesRead = in.read(buffer))!= -1) 
            {
                out.write(buffer,0,bytesRead);    
            }

            System.out.println("File Copied Successfully!");
        }
        catch(IOException e)
        {
            System.err.println("Error during copy: "+e.getMessage());
        }
    }    
}
