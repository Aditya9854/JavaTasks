import java.util.Arrays;
import java.util.List;

class Format
{
    //static method
    public static String formatName(String name)
    {
        return "Member: "+name.toUpperCase();
    }
}
public class StaticMReference 
{
    public static void main(String[]a)
    {
        List<String> names = Arrays.asList("amit","vijay","hari");

        names.stream()
             .map(Format::formatName)                //static method ref
             .forEach(System.out::println);
    }    
}
