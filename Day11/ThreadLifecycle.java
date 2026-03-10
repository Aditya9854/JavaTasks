public class ThreadLifecycle
{
    public static void main(String[] a)throws InterruptedException
    {
       Thread worker = new Thread(() -> {

            try
            {
                Thread.sleep(1000);

            }
            catch(InterruptedException e)
            {e.printStackTrace();}
       });
       
       System.out.println("1.State after creation : "+worker.getState()); //New

       worker.start();
       System.out.println("2.State after Start() : "+worker.getState());  //RUNNABLE

       Thread.sleep(200);
       System.out.println("3.State during sleep() : "+worker.getState()); //TIMED_WAITING

       worker.join();
       System.out.println("4.State after completion : "+worker.getState()); //TERMINATED

    }    
}
