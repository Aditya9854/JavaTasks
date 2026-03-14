import java.io.File;

public class FileData 
{
    public static void main(String[] a) 
    {
        File file = new File("Note.txt");

    if(file.exists())
    {
        System.out.println("-----File Info-----");

        System.out.println("File Name : "+file.getName());
        System.out.println("File Path : "+file.getAbsolutePath());

        //size
        long bytes = file.length();
        System.out.println("Size : "+bytes+ "bytes");

        //permissions
        System.out.println("------Permissions------");
        System.out.println("Readable : "+ (file.canWrite()));
        System.out.println("writable : "+ (file.canRead()));
        System.out.println("Executable : "+ (file.canExecute()));

    }
    else
    {
        System.out.println("The Specified file does not exist.");
    }    
    }
}
