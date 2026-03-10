
class myThread extends Thread
{
    public void run()
    {
        String str = "Thread starts running..";
        System.out.println(str);
    }
}
public class Thread1
{
    public static void main(String[] a) 
    {
        myThread t1 = new myThread();
        t1.start();
        
    }
}