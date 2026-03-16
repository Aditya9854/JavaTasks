import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadSafeSingleton
{
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton()
    {
        System.out.println("Instance created by "+Thread.currentThread().getName());
    }

    public static ThreadSafeSingleton getInstance()
    {
        if (instance == null) 
        {
            synchronized (ThreadSafeSingleton.class)
            {
                if (instance == null) 
                {
                    instance = new ThreadSafeSingleton();   
                }
            }    
        }
        return instance;
    }

    public void processData(String threadName)
    {
        System.out.println("Thread "+threadName+" is using singleton instance: "+this.hashCode());
    }
}
public class SingletonTSafe 
{
    public static void main(String[]a)
    {
        //create thread pool with 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        //10 diff tasks req the singleton at same time
        for(int i = 1; i <= 10; i++)
        {
            final int taskId = i;
            executor.submit(() -> {
                ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
                singleton.processData("Task -"+taskId);
            });
        }
        executor.shutdown();
    }    
}
