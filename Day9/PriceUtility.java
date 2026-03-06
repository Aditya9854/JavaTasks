import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PriceUtility 
{
    public static void main(String[]a)
    {
        List<Double> prices = new ArrayList<>(Arrays.asList(99.9,12.23,45.6,65.43,11.3));

        //sort (accending)
        Collections.sort(prices);
        System.out.println("Cheapet first : "+prices);

        //reverse order
        Collections.reverse(prices);
        System.out.println("Expensive first : "+prices);
    }    
}
