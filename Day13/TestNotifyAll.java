class Result
{
    synchronized void waitforResult()
    {
        try
        {
            System.out.println(Thread.currentThread().getName()+" is waiting for result...");
            wait();
            System.out.println(Thread.currentThread().getName()+" received the result");
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    synchronized void publishResult()
    {
        System.out.println("Teacher published the reult.");
        notifyAll(); //wakes up all the waiting threads
    }
}
class Student extends Thread
{
    Result result;
    
    Student(Result result,String name)
    {
        super(name); //set thread name
        this.result = result;
    }

    public void run()
    {
        result.waitforResult();
    }
}
class Teacher extends Thread
{
    Result result;

    Teacher( Result result)
    {
        this.result = result;
    }
    public void run()
    {
        result.publishResult();
    }
}
public class TestNotifyAll 
{
    public static void main(String[] a) throws Exception
    {
        Result result =  new Result();

        //student threads
        Student s1 = new Student(result, "Std-1");
        Student s2 = new Student(result, "Std-2");
        Student s3 = new Student(result, "Std-3");

        s1.start();
        s2.start();
        s3.start();

        Thread.sleep(2000);

        Teacher t = new Teacher(result);
        t.start();
    }    
}
