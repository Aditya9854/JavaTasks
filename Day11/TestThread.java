//Creating Thread by extending Thread class 
class CountThread extends Thread
{
    public void run()
    {
        for(int i = 3; i > 0; i--)
        {
            System.out.println("Counting down : "+i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
        }
    }
}
public class TestThread 
{
    public static void main(String[] a)
    {
        CountThread timer = new CountThread();
        timer.start();
    }
}
