import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class StreamCompare 
{
    public static void main(String[] a) 
    {
        String content = "This is simple text content.";
        
        try
        {
            //writing using Byte Stream
            try(FileOutputStream fos = new FileOutputStream("byteOp.bin"))
            {
                fos.write(content.getBytes());
            }

            //Writting using character Stream
            try(FileWriter fw = new FileWriter("charOp.txt"))
            {
                fw.write(content);
            }
             //Compare
             displayDetails("byteOp.bin");
             displayDetails("charOp.txt");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }    
    public static void displayDetails(String fileName)
    {
        File file = new File(fileName);

        System.out.println("File: "+fileName);
        System.out.println("size : "+file.length() +"bytes");
        System.out.println("Readable : "+file.canRead());
    }
}
