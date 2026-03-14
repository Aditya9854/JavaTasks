import java.io.File;

public class CreateDir 
{
    public static void main(String[] a) 
    {
        File directory = new File("main_Folder/subFolder");
        
        //check if exist or not
        if (!directory.exists()) 
        {
            //creating
            if (directory.mkdirs()) 
            {
                System.out.println("Directories created successfully.");
                System.out.println("path : "+directory.getAbsolutePath());    
            }
            else
            {
                System.out.println("Failed to create directories.");
            }
        }
        else
        {
            System.out.println("directory already exist.");
        }
    }    
}
