import java.util.Arrays;
import java.util.List;

public class ForEachIterator 
{
    public static void main(String[] a) 
    {
        List<String> tech = Arrays.asList("java","spring","Microservices");    

        System.out.println("--------Using Lambda---------");
        tech.forEach(item -> System.out.println(item));

         System.out.println("--------Using Method Reference---------");
        tech.forEach(System.out::println);
    }    
}
