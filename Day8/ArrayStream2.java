import java.util.Arrays;

public class ArrayStream2 
{
    public static void main(String[]a)
    {
       double[] prices = {100.00,50.0,200.0};

       System.out.println("Prices after 10% Tax :");
       
       //use of map()
       Arrays.stream(prices)
             .map(p -> p * 1.10)
             .forEach(p -> System.out.printf("%.2f\n", p)); 
    }
    
}
