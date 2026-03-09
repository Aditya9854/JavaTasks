//IndexOutofBound Exception
import java.util.ArrayList;
import java.util.List;

public class UncheckedExcep2
{
    public static void main(String[] a)
    {
        List<String> task =  new ArrayList<>();
        task.add("Create file");
        task.add("Write Content");
        task.add("Submit File");

        int taskIndexRemove = 5;   //user enters wrong index number 

        try
        {
            task.remove(taskIndexRemove);
            System.out.println("Task Removed");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.err.println("Err:Task does not exist");
            System.out.println("Current task count : "+task.size());
        }
    }    
}
