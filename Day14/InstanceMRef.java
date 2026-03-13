import java.util.Arrays;
import java.util.List;

class TextCleaner
{
    public String clean(String s)
    {
        return s.trim().toLowerCase();
    }
}
public class InstanceMRef 
{
    public static void main(String[]a)
    {
        List<String> Fruits = Arrays.asList("Apple  "," Oragnge "," Banana ");

        TextCleaner tc = new TextCleaner();

        Fruits.stream()
              .map(tc ::clean)                   //instance method reference
              .forEach(System.out::println);
    }    
}
