//Use of throws

import java.io.FileNotFoundException;
import java.io.FileReader;

class Filelib
{
    //throws: warns caller that this method might fail
    public void getReport(String path)throws FileNotFoundException
    {
        FileReader fr = new FileReader(path);
        System.out.println("File Found!");
    } 
    
}
public class TestThrows
{
    public static void main(String[] a)
    {
        Filelib fl = new Filelib();
        
        try
        {
            fl.getReport("data.txt");    
        }
        catch(FileNotFoundException e)
        {
            System.err.println("Couldn't find the file.");
        }
    }
}
