import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExcep
{
    public static void main(String[] a)
    {
        try
        {
            FileInputStream file = new FileInputStream("data.txt");
            System.out.println("File opened Successfully..");    
        }
        catch(FileNotFoundException e)
        {
            //this block will run only if file is missing
            System.err.println("Error :File not found..");
        }
        finally
        {
            System.out.println("Execution Finished..");
        }
    }
}