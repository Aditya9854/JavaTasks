public class BlockedStateDemo 
{
    //creating method that only one thread can execute at a time
    public static synchronized void syncUpdate()
    {
        System.out.println(Thread.currentThread().getName() +" has aquired the lock.");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {e.printStackTrace();}
        System.out.println(Thread.currentThread().getName()+" is releasing the lock.");
    }
    public static void main(String[]a) throws InterruptedException
    {
        Thread t1 = new Thread(BlockedStateDemo :: syncUpdate,"Thread-A");
        Thread t2 = new Thread(BlockedStateDemo :: syncUpdate,"Thread-B");

        //Thread-A starts and takes the lock first
        t1.start();
        Thread.sleep(200);

        //Thread-B starts but will find method locked by thread-A
        t2.start();
        Thread.sleep(200);

        System.out.println("------Current Status---------");
        System.out.println(t1.getName()+" State: "+t1.getState()); //TIMED_WAITING(due to sleep)
        System.out.println(t2.getName()+" State: "+t2.getState());//BLOCKED
        System.out.println("--------------------------\n");
    }    
}
