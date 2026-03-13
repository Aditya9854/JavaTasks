import java.util.HashMap;
import java.util.Map;

public class MapForEach 
{
    public static void main(String[]a)
    {
        Map<String,String> capCities = new HashMap<>();

        capCities.put("India", "New Delhi");
        capCities.put("USA", "Washington DC");
        capCities.put("Japan", "Tokyo");

        capCities.forEach((country,city)->{
            System.out.println("Country : "+country+" Capital : "+city);
        });
    }
}
