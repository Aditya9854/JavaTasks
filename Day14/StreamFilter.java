import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter 
{
    public static void main(String[]a)
    {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //using stream API to filtereven numbers
        List<Integer> evenNum = numbers.stream().filter(n -> n % 2 == 0)
                                       .collect(Collectors.toList());
        
        System.out.println("Original list : "+numbers);
        System.out.println("Even Numbers : "+evenNum);
    }    
}
