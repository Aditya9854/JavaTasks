import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHash_Map 
{
    public static void main(String[] a) 
    {
        //Map<item,price>        
        Map<String,Double> cart = new LinkedHashMap<>();

        cart.put("Milk", 60.00);
        cart.put("Bread", 20.80);
        cart.put("Eggs", 6.50);
        cart.put("Milk", 65.00);//updates price but stays in same position

        System.out.println("-----Your Shopping Cart------");
        for(var entry : cart.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }    
}
