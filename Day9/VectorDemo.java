import java.util.*;

public class VectorDemo 
{
    public static void main(String[]a)
    {
        Vector<String> printQueue = new Vector<>();

        printQueue.add("Report.pdf");
        printQueue.add("Employee_list.pdf");
        printQueue.add("Budget.pdf");

        System.out.println("First job in Queue : "+printQueue.firstElement());
        System.out.println("Current Capacity : "+printQueue.capacity());

        printQueue.removeElementAt(0);

        System.out.println("Remaining jobs : "+printQueue);
    }
    
}
