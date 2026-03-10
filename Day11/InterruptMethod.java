public class InterruptMethod 
{
    public static void main(String[] a)throws InterruptedException
    {
        Thread worker = new Thread(()->{
            while (true) 
            {
                if (Thread.interrupted()) 
                {
                    System.out.println("Worker : I've been interrupted stopping...");
                    break;    
                }    
                System.out.println("Worker : Still working...");
            }
        });
        worker.start();
        Thread.sleep(5);

        worker.interrupt();
    }    
}
