abstract class File
{
    protected String fileName;
    protected double sizeInMB;

    public File(String fileName, double sizeInMB)
    {
        this.fileName = fileName;
        this.sizeInMB = sizeInMB;
    }
    public void displayData()
    {
        System.out.println("File Name : "+this.fileName);
        System.out.println("File Size : "+this.sizeInMB);
    }
    //Abstract Method
    public abstract void open();

}
class PdfFile extends File
{
    public PdfFile(String fileName, double sizeInMB)
    {
        super(fileName, sizeInMB);
    }
    //overriding open method
    public void open()
    {
        System.out.println("Openning "+fileName+" in Adobe Reader");
    }
}
public class TestAbst 
{
    public static void main(String[]a)
    {
        PdfFile pObj = new PdfFile("Novel", 12.2);
        
        pObj.displayData();
        pObj.open();
    }   
}
