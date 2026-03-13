import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertList 
{
    public static void main(String[] a) 
    {
        List<String> names = Arrays.asList("ajay","arijit","karan","smith");
        
        //using stream api to transform the list
        List<String> upperNames = names.stream()
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());

        System.out.println("Original : "+names);
        System.out.println("Uppercase : "+upperNames);
    }    
}
