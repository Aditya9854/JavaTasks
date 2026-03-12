class Exam
{
    synchronized void getQuePaper()
    {
        try
        {
            System.out.println("Students are waiting for the question paper...");
            //waiting state
            wait();

            //After notify() thread resumes execution
            System.out.println("Student received the question paper.");

        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
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
        exam.getQuePaper();
    }
}
public class Wait 
{
    public static void main(String[] a) 
    {
        Exam exam = new Exam();
        
        Student s =new Student(exam);

        s.start();
    }

}
