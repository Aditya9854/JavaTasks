import java.io.FileWriter;
import java.io.IOException;

public class File_Writer 
{
    public static void main(String[] a) 
    {
        String content = "This file is created using FileWriter.";
        
        try(FileWriter writer = new FileWriter("data.txt"))
        {
            writer.write(content);
            writer.append("\nEnd of record.");

            System.out.println("Successfully wrote the file.");
        }
        catch(IOException e)
        {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }    
}
