import java.util.Map;
import java.util.TreeMap;

public class Tree_Map 
{
    public static void main(String[]a) 
    {
        //keys(Student names)will be sorted alphabetically
        TreeMap<String,Integer> grades = new TreeMap<>();  
        
        grades.put("Kiran", 50);
        grades.put("Shyam", 80);
        grades.put("Ajay", 95);
        grades.put("Dhiraj", 83);
        grades.put("Chitra", 93);

        System.out.println("------Alphabetical Student List-----");
        for(Map.Entry<String,Integer> entry : grades.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("\nStudents whose names starts with A to C :"+grades.subMap("A", "D"));

    }    
}
