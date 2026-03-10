class LogProcessor extends Thread
{
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Procesing log #"+ i);
            Thread.yield(); //pauses and gives another thread priority
        }
    }
}
public class YieldMethod 
{
    public static void main(String[]a)
    {
        new LogProcessor().start();
        new LogProcessor().start();
    }    
}
