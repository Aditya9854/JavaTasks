//Crating thread using Runnable interface
class UploadTask implements Runnable
{
    private String fileName;

    public UploadTask(String fileName)
    {
        this.fileName = fileName;
    }
    public void run()
    {
        System.out.println("Uploading "+fileName+" in thread : "+Thread.currentThread().getName());
        //logic for upload
    }
}
public class ThreadCreating 
{
    public static void main(String[] a)
    {
        Thread thread = new Thread(new UploadTask("pic.jpj"));
        thread.start();
    }
    
}
