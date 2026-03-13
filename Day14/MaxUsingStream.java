import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxUsingStream 
{
    public static void main(String[] a)
    {
        List<Integer> numbers = Arrays.asList(12,34,43,23,56,69,76,84,23);
        
        Optional<Integer> maxNum = numbers.stream()
                                         .max(Comparator.naturalOrder());

        if(maxNum.isPresent())
        {
            System.out.println("Maximum number is : "+maxNum.get());
        }
        else
        {
            System.out.println("List is empty.");
        }
    }    
}
