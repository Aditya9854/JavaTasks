import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream 
{
    public static void main(String[] a) 
    {
        String data = "Written using fileInputStream.";
        
        try(FileOutputStream fos = new FileOutputStream("Note.txt"))
        {
            //convert string to byte
            byte[] bytes = data.getBytes();

            fos.write(bytes);
            System.out.println("Data successfilly written to the file.");
        }
        catch(IOException e)
        {
            System.out.println("Error while writting to file : "+e.getMessage());
        }
    }    
}
