import java.util.Arrays;
import java.util.List;

public class ConvertList2
{
    public static void main(String[] a) 
    {
        List<String> names = Arrays.asList("ajay","arijit","karan","smith");
        
        //Printing directly without collecting to new list
        names.stream().map(String::toUpperCase)
                      .forEach(System.out::println);
        
        
    }    
}
