//StringBuffer : best for multithreading ,synchronized(make other threads to wait)thread safe
public class SafeLogger 
{
    public static void main(String[]a)
    {
        StringBuffer sharedLog = new StringBuffer("Server Log start:\n");

        //two diff threads hiting log at once

        Runnable task1 = ()->{
            for(int i = 0; i < 3; i++)
            {
                sharedLog.append("User A action\n");
            }
        };
        Runnable task2 = () ->{
               for(int i = 0; i<3; i++)
               {
                 sharedLog.append("User B action\n");
               }
        };

        task1.run();
        task2.run();
        System.out.print(sharedLog);
    }   

}
