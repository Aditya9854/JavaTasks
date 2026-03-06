import java.util.*;

public class Array_List
{
    public static void main(String[]a)
    {
        List<String> todoList = new ArrayList<>();

        //Add elements
        todoList.add("Buy Books");
        todoList.add("Create notes");
        todoList.add("Memories Notes");
        todoList.add("Prepare for exam");

        //update an element
        todoList.set(1, "Write Notes");

        //Accessing by index
        System.out.println("Top Priority :"+todoList.get(0));

        //Remove Element 
        todoList.remove(2);

        System.out.println("Current Task : "+todoList);
    }
}