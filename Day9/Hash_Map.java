import java.util.HashMap;
import java.util.Map;

public class Hash_Map 
{
    public static void main(String[] a) 
    {
        //map<Product,quantity>
        Map<String,Integer> inventory = new HashMap<>();
        
        //adding items put()
        inventory.put("laptop-001", 50);
        inventory.put("Phone-x", 122);
        inventory.put("Tablet", 30);

        //Update
        inventory.put("laptop-001", 40);

        //retriving value get()
        String SrcPr = "Phone-x";

        if (inventory.containsKey(SrcPr)) 
        {
            System.out.println("Stock for "+SrcPr+": "+inventory.get(SrcPr));    
        }
        //Iterating through the inventory
        System.out.println("-----Full Inventory-----");
        for(Map.Entry<String,Integer> entry : inventory.entrySet())
        {
            System.out.println("Product :"+entry.getKey()+"| Quality: "+entry.getValue());
        }
    }    
}
