import java.util.*;

public class Linked_List
{
    public static void main(String[]a)
    {
        LinkedList<String> history = new LinkedList<>();

        history.add("Typed 'Hello'");
        history.add("Changed font to bold");
        history.add("Deleted the last Sentence");

        String lastAction = history.removeFirst();

        System.out.println("Undone : "+lastAction);
        System.out.println("Remaining history : "+history);
    }
    
}
