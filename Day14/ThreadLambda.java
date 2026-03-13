public class ThreadLambda 
{
    public static void main(String[] args) 
    {
        Runnable syn1 = new Runnable(){

            public void run()
            {
                System.out.println("Thread running(old syntax)");
            } 
        };    
        //lambda expression
        Runnable newSyn = () -> System.out.println("Thread Running(lambda)");
        new Thread(newSyn).start();
        new Thread(syn1).start();
    } 
}
