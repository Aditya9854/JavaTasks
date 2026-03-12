class Exam
{
    synchronized void waitForPaper()
    {
        try
        {
            System.out.println("Student is waiting...");
            //waiting state
            wait();

            //After notify() thread resumes execution
            System.out.println("Student got the que paper.");

        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    synchronized void preparePaper()
    {
        System.out.println("Teacher prepared the paper");
        //Notify one waiting thread
        notify();
    }
}
//Student thread class
class Student extends Thread
{
    Exam exam;

    Student(Exam exam)
    {
        this.exam = exam;
    }
    public void run()
    {
        exam.waitForPaper();
    }
}
public class TestNotify 
{
    public static void main(String[] a) throws Exception
    {
        Exam exam = new Exam();
        
        //Student threaad
        Student s =new Student(exam);
        //teacher thread
        Thread teacher = new Thread(()->exam.preparePaper());

        s.start();
        Thread.sleep(2000);
        teacher.start(); //notifies the student

    }

}
