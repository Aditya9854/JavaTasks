import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortUsingLambda 
{
    public static void main(String[] args) 
    {
        List<String> pLanguages = new ArrayList<>(Arrays.asList("java","python","c++","js","go","rust"));

        System.out.println("Original List : "+pLanguages);

        //Comparing two strings lexicographically
        pLanguages.sort((s1,s2) -> s1.compareTo(s2));

        System.out.println("After sorting : "+pLanguages);
    }    
}
