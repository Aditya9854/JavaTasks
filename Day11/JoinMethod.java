//join() : allows one thread to wait until another thread completes its execution

public class JoinMethod 
{
    public static void main(String[] a) throws InterruptedException
    {
        Thread dbTask = new Thread(() ->{

            System.out.println("Fetching DB records...");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e){}
            System.out.println("DB data is ready.");
        });

        Thread apiTask = new Thread(()->{

            System.out.println("Fetching API data...");

            try
            {
                Thread.sleep(3000);
            }
            catch(InterruptedException e){}
            System.out.println("API data is ready.");
        });

        dbTask.start();
        apiTask.start();

        //main thred waits for both to finish
        dbTask.join();
        apiTask.join();

        System.out.println("All data collected...Generating report");
    }    
}
